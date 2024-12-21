/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package guestbook.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.orm.Disjunction;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;
import guestbook.exception.BookDetailTitleException;
import guestbook.model.BookDetail;
import guestbook.service.base.BookDetailLocalServiceBaseImpl;
import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;

/**
 * @author linhpksw
 */
@Component(
        property = "model.class.name=guestbook.model.BookDetail",
        service = AopService.class
)
public class BookDetailLocalServiceImpl extends BookDetailLocalServiceBaseImpl {
    public BookDetail addBookDetail(
            long userId, String title, String author, String description, String isbn,
            int status, ServiceContext serviceContext) throws PortalException {

        long groupId = serviceContext.getScopeGroupId();
        User user = userLocalService.getUserById(userId);
        Date now = new Date();

        validate(title);

        long bookId = counterLocalService.increment();

        BookDetail bookDetail = bookDetailPersistence.create(bookId);

        bookDetail.setUuid(serviceContext.getUuid());
        bookDetail.setUserId(userId);
        bookDetail.setGroupId(groupId);
        bookDetail.setCompanyId(user.getCompanyId());
        bookDetail.setUserName(user.getFullName());
        bookDetail.setCreateDate(serviceContext.getCreateDate(now));
        bookDetail.setModifiedDate(serviceContext.getModifiedDate(now));
        bookDetail.setTitle(title);
        bookDetail.setAuthor(author);
        bookDetail.setDescription(description);
        bookDetail.setIsbn(isbn);
        bookDetail.setStatus(status);
        bookDetail.setExpandoBridgeAttributes(serviceContext);

        bookDetailPersistence.update(bookDetail);
        return bookDetail;
    }

    public BookDetail updateBookDetail(
            long userId, long bookId, String title, String author,
            String description, String isbn, int status,
            ServiceContext serviceContext) throws PortalException {

        Date now = new Date();
        validate(title);

        BookDetail bookDetail = getBookDetail(bookId);
        User user = userLocalService.getUser(userId);

        bookDetail.setUserId(userId);
        bookDetail.setUserName(user.getFullName());
        bookDetail.setModifiedDate(serviceContext.getModifiedDate(now));
        bookDetail.setTitle(title);
        bookDetail.setAuthor(author);
        bookDetail.setDescription(description);
        bookDetail.setIsbn(isbn);
        bookDetail.setStatus(status);
        bookDetail.setExpandoBridgeAttributes(serviceContext);

        bookDetailPersistence.update(bookDetail);

        return bookDetail;
    }


    public BookDetail deleteBookDetail(long bookId, ServiceContext serviceContext)
            throws PortalException, SystemException {

        BookDetail bookDetail = getBookDetail(bookId);

        bookDetail = deleteBookDetail(bookDetail);

        return bookDetail;
    }

    public List<BookDetail> getBookDetails(long groupId, int start, int end, OrderByComparator<BookDetail> obc) {
        return bookDetailPersistence.findByGroupId(groupId, start, end, obc);
    }

    public List<BookDetail> searchBookDetailsByKeywords(String keywords, int start, int end, OrderByComparator<BookDetail> obc) {
        DynamicQuery query = DynamicQueryFactoryUtil.forClass(BookDetail.class, getClassLoader());
        if (!keywords.isEmpty()) {
            // Create a disjunction for multiple column searches
            Disjunction disjunction = RestrictionsFactoryUtil.disjunction();
            disjunction.add(RestrictionsFactoryUtil.ilike("title", "%" + keywords + "%"));
            disjunction.add(RestrictionsFactoryUtil.ilike("author", "%" + keywords + "%"));
            disjunction.add(RestrictionsFactoryUtil.ilike("isbn", "%" + keywords + "%"));

            query.add(disjunction);
        }
        return dynamicQuery(query, start, end, obc);
    }


    public int getBookDetailsCount(long groupId) {
        return bookDetailPersistence.countByGroupId(groupId);
    }

    public int getBookDetailsCountByKeywords(String keywords) {
        DynamicQuery query = DynamicQueryFactoryUtil.forClass(BookDetail.class, getClassLoader());
        if (!keywords.isEmpty()) {
            Disjunction disjunction = RestrictionsFactoryUtil.disjunction();
            disjunction.add(RestrictionsFactoryUtil.ilike("title", "%" + keywords + "%"));
            disjunction.add(RestrictionsFactoryUtil.ilike("author", "%" + keywords + "%"));
            disjunction.add(RestrictionsFactoryUtil.ilike("isbn", "%" + keywords + "%"));
        }
        return (int) dynamicQueryCount(query);
    }

    protected void validate(String title) throws PortalException {
        if (Validator.isNull(title)) {
            throw new BookDetailTitleException();
        }
    }
}
