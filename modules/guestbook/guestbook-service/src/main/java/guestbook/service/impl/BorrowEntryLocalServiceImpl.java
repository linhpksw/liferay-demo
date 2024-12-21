/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package guestbook.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandlerRegistryUtil;
import guestbook.model.BookDetail;
import guestbook.model.BorrowEntry;
import guestbook.service.base.BorrowEntryLocalServiceBaseImpl;
import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;

/**
 * @author linhpksw
 */
@Component(
        property = "model.class.name=guestbook.model.BorrowEntry",
        service = AopService.class
)
public class BorrowEntryLocalServiceImpl
        extends BorrowEntryLocalServiceBaseImpl {

    public List<BorrowEntry> getBorrowEntries(long groupId) {
        return borrowEntryPersistence.findByGroupId(groupId);
    }

    @Indexable(type = IndexableType.REINDEX)
    @Override
    public BorrowEntry addBorrowEntry(
            long userId, long bookId, Date borrowDate, Date expectedReturnDate,
            ServiceContext serviceContext)
            throws PortalException {

        // Check for an existing BorrowEntry with STATUS_EXPIRED
        List<BorrowEntry> borrowEntries = borrowEntryPersistence.findByB_S(bookId, WorkflowConstants.STATUS_EXPIRED);

        BorrowEntry borrowEntry = null;

        if (!borrowEntries.isEmpty()) {
            borrowEntry = borrowEntries.get(0);
        }

        // Fetch the user who is borrowing the book
        User user = userLocalService.getUser(userId);
        Date now = new Date();

        if (borrowEntry == null) {
            // Create a new entry if none exists
            long entryId = counterLocalService.increment();
            borrowEntry = borrowEntryPersistence.create(entryId);

            borrowEntry.setGroupId(serviceContext.getScopeGroupId());
            borrowEntry.setCompanyId(serviceContext.getCompanyId());
            borrowEntry.setCreateDate(serviceContext.getCreateDate(now));
        }

        // Update borrow entry fields
        borrowEntry.setUserId(userId);
        borrowEntry.setUserName(user.getFullName());
        borrowEntry.setBookId(bookId);
        borrowEntry.setBorrowDate(borrowDate);
        borrowEntry.setExpectedReturnDate(expectedReturnDate);
        borrowEntry.setModifiedDate(serviceContext.getModifiedDate(now));


        // Set workflow fields
        borrowEntry.setStatus(WorkflowConstants.STATUS_DRAFT);
        borrowEntry.setStatusByUserId(userId);
        borrowEntry.setStatusByUserName(user.getFullName());
        borrowEntry.setStatusDate(serviceContext.getModifiedDate(now));

        // Persist the BorrowEntry in the database
        borrowEntry = borrowEntryPersistence.update(borrowEntry);

        // Introduce the entry to the workflow framework
        WorkflowHandlerRegistryUtil.startWorkflowInstance(
                borrowEntry.getCompanyId(),
                borrowEntry.getGroupId(),
                borrowEntry.getUserId(),
                BorrowEntry.class.getName(),
                borrowEntry.getPrimaryKey(),
                borrowEntry,
                serviceContext
        );

        return borrowEntry;
    }

    @Override
    public BorrowEntry updateStatus(
            long userId, long entryId, int status, ServiceContext serviceContext)
            throws PortalException {

        // Get the user who updated the status
        User user = userLocalService.getUser(userId);

        // Fetch the BorrowEntry from the database
        BorrowEntry borrowEntry = borrowEntryPersistence.findByPrimaryKey(entryId);

        // Update workflow fields
        borrowEntry.setStatus(status);
        borrowEntry.setStatusByUserId(userId);
        borrowEntry.setStatusByUserName(user.getFullName());
        borrowEntry.setStatusDate(new Date());

        // Persist the updated BorrowEntry
        borrowEntry = borrowEntryPersistence.update(borrowEntry);

        return borrowEntry;
    }

    @Override
    public BorrowEntry returnBook(long entryId, ServiceContext serviceContext) throws PortalException {
        BorrowEntry borrowEntry = borrowEntryPersistence.findByPrimaryKey(entryId);

        // Update the status to indicate the book is returned (but not pending review)
        borrowEntry.setStatus(WorkflowConstants.STATUS_EXPIRED); // Ready for borrowing again
        borrowEntry.setStatusByUserId(serviceContext.getUserId());
        borrowEntry.setStatusByUserName(userLocalService.getUser(serviceContext.getUserId()).getFullName());
        borrowEntry.setStatusDate(new Date());

        borrowEntryPersistence.update(borrowEntry);

        // Optionally, update the associated BookDetail to make it available again
        BookDetail bookDetail = bookDetailPersistence.findByPrimaryKey(borrowEntry.getBookId());
        bookDetail.setStatus(WorkflowConstants.STATUS_APPROVED); // Available for borrowing
        bookDetailPersistence.update(bookDetail);

        return borrowEntry;
    }

    @Override
    public BorrowEntry returnBookByBookId(long bookId, ServiceContext serviceContext) throws PortalException {
        // Fetch the active BorrowEntry by bookId and status "APPROVED"
        List<BorrowEntry> borrowEntries = borrowEntryPersistence.findByB_S(bookId, WorkflowConstants.STATUS_APPROVED);

        if (borrowEntries.isEmpty()) {
            throw new PortalException("No active BorrowEntry found for the specified book.");
        }

        BorrowEntry borrowEntry = borrowEntries.get(0); // Assuming only one active borrow entry per book

        // Ensure the user returning the book is the one who borrowed it
        long userId = serviceContext.getUserId();
        if (borrowEntry.getUserId() != userId) {
            throw new PortalException("You are not authorized to return this book.");
        }

        // Call the existing returnBook method
        return returnBook(borrowEntry.getEntryId(), serviceContext);
    }

//    @Override
//    public BorrowEntry deleteBorrowEntry(long entryId) throws PortalException {
//        BorrowEntry borrowEntry = borrowEntryPersistence.findByPrimaryKey(entryId);
//
//        // Clean up workflow instances
//        workflowInstanceLinkLocalService.deleteWorkflowInstanceLinks(
//                borrowEntry.getCompanyId(),
//                borrowEntry.getGroupId(),
//                BorrowEntry.class.getName(),
//                borrowEntry.getEntryId()
//        );
//
//        // Delete the BorrowEntry
//        borrowEntryPersistence.remove(entryId);
//
//        return borrowEntry;
//    }

}
