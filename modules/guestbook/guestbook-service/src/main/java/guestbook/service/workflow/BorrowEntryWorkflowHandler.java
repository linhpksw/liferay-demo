package guestbook.service.workflow;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.ResourceActions;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.workflow.BaseWorkflowHandler;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandler;
import guestbook.model.BorrowEntry;
import guestbook.service.BorrowEntryLocalService;
import guestbook.service.persistence.BorrowEntryPersistence;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.Serializable;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

@Component(
        immediate = true,
        service = WorkflowHandler.class
)
public class BorrowEntryWorkflowHandler extends BaseWorkflowHandler<BorrowEntry> {
    private BorrowEntryLocalService _borrowEntryLocalService;
    private ResourceActions _resourceActions;
    @Reference
    private BorrowEntryPersistence borrowEntryPersistence;

    @Override
    public String getClassName() {
        return BorrowEntry.class.getName();
    }

    @Override
    public String getType(Locale locale) {
        // Return the model resource name (used in workflow UI)
        return _resourceActions.getModelResource(locale, getClassName());
    }

    @Override
    public BorrowEntry updateStatus(
            int status, Map<String, Serializable> workflowContext)
            throws PortalException {

        long userId = GetterUtil.getLong(
                (String) workflowContext.get(WorkflowConstants.CONTEXT_USER_ID));
        long entryId = GetterUtil.getLong(
                (String) workflowContext.get(WorkflowConstants.CONTEXT_ENTRY_CLASS_PK));
        ServiceContext serviceContext = (ServiceContext) workflowContext.get("serviceContext");

        // Update BorrowEntry status based on workflow decision
        BorrowEntry borrowEntry = _borrowEntryLocalService.updateStatus(
                userId, entryId, status, serviceContext);

        if (status == WorkflowConstants.STATUS_APPROVED) {
            handleApprovedLogic(borrowEntry, serviceContext);
        } else if (status == WorkflowConstants.STATUS_DENIED) {
            handleRejectedLogic(borrowEntry, serviceContext);
        }

        return borrowEntry;
    }

    /**
     * Handle any post-processing logic after the borrow request is approved.
     * For example:
     * - Notify the user that their book borrow request is approved
     * - Update the borrowEntry to mark it as currently borrowed
     */
    private void handleApprovedLogic(BorrowEntry borrowEntry, ServiceContext serviceContext) {
        // Example: Set expectedReturnDate to 14 days from now
        Date expectedReturnDate = new Date(System.currentTimeMillis() + (14L * 24 * 60 * 60 * 1000));
        borrowEntry.setExpectedReturnDate(expectedReturnDate);
        borrowEntry.setModifiedDate(new Date());
        borrowEntryPersistence.update(borrowEntry);

        // Notify the user via email or user notification
        sendNotification(
                borrowEntry.getUserId(),
                "Your borrow request for book ID " + borrowEntry.getBookId() + " has been approved!"
        );

        System.out.println("Borrow request approved for Entry ID: " + borrowEntry.getEntryId());
    }

    /**
     * Handle any post-processing logic after the borrow request is rejected.
     * For example:
     * - Notify the user that their request was denied
     * - Possibly log the reason for rejection
     */
    private void handleRejectedLogic(BorrowEntry borrowEntry, ServiceContext serviceContext) {
        // Notify the user
        sendNotification(
                borrowEntry.getUserId(),
                "Your borrow request for book ID " + borrowEntry.getBookId() + " has been rejected."
        );

        // Optionally mark this entry as not borrowed, or leave it as is, depending on your business logic.
        // The status is already set to rejected. You might want to reset dates or fields if needed.
        borrowEntry.setExpectedReturnDate(null);
        borrowEntry.setActualReturnDate(null);
        borrowEntry.setModifiedDate(new Date());
        borrowEntryPersistence.update(borrowEntry);

        System.out.println("Borrow request rejected for Entry ID: " + borrowEntry.getEntryId());
    }

    /**
     * Example method to send a notification. Replace with your actual notification logic,
     * such as using `UserNotificationEventLocalService` or sending an email.
     */
    private void sendNotification(long userId, String message) {
        // Implement custom email or user notification send logic here
        System.out.println("Notification to userId " + userId + ": " + message);
    }

    @Reference(unbind = "-")
    protected void setBorrowEntryLocalService(
            BorrowEntryLocalService borrowEntryLocalService) {

        _borrowEntryLocalService = borrowEntryLocalService;
    }

    @Reference(unbind = "-")
    protected void setResourceActions(ResourceActions resourceActions) {
        _resourceActions = resourceActions;
    }
}
