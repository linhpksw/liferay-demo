/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package guestbook.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import guestbook.model.BookDetail;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for BookDetail. This utility wraps
 * <code>guestbook.service.impl.BookDetailLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author linhpksw
 * @see BookDetailLocalService
 * @generated
 */
public class BookDetailLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>guestbook.service.impl.BookDetailLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the book detail to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BookDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bookDetail the book detail
	 * @return the book detail that was added
	 */
	public static BookDetail addBookDetail(BookDetail bookDetail) {
		return getService().addBookDetail(bookDetail);
	}

	public static BookDetail addBookDetail(
			long userId, String title, String author, String description,
			String isbn, int status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addBookDetail(
			userId, title, author, description, isbn, status, serviceContext);
	}

	/**
	 * Creates a new book detail with the primary key. Does not add the book detail to the database.
	 *
	 * @param bookId the primary key for the new book detail
	 * @return the new book detail
	 */
	public static BookDetail createBookDetail(long bookId) {
		return getService().createBookDetail(bookId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the book detail from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BookDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bookDetail the book detail
	 * @return the book detail that was removed
	 */
	public static BookDetail deleteBookDetail(BookDetail bookDetail) {
		return getService().deleteBookDetail(bookDetail);
	}

	/**
	 * Deletes the book detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BookDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bookId the primary key of the book detail
	 * @return the book detail that was removed
	 * @throws PortalException if a book detail with the primary key could not be found
	 */
	public static BookDetail deleteBookDetail(long bookId)
		throws PortalException {

		return getService().deleteBookDetail(bookId);
	}

	public static BookDetail deleteBookDetail(
			long bookId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException, SystemException {

		return getService().deleteBookDetail(bookId, serviceContext);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>guestbook.model.impl.BookDetailModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>guestbook.model.impl.BookDetailModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static BookDetail fetchBookDetail(long bookId) {
		return getService().fetchBookDetail(bookId);
	}

	/**
	 * Returns the book detail matching the UUID and group.
	 *
	 * @param uuid the book detail's UUID
	 * @param groupId the primary key of the group
	 * @return the matching book detail, or <code>null</code> if a matching book detail could not be found
	 */
	public static BookDetail fetchBookDetailByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchBookDetailByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the book detail with the primary key.
	 *
	 * @param bookId the primary key of the book detail
	 * @return the book detail
	 * @throws PortalException if a book detail with the primary key could not be found
	 */
	public static BookDetail getBookDetail(long bookId) throws PortalException {
		return getService().getBookDetail(bookId);
	}

	/**
	 * Returns the book detail matching the UUID and group.
	 *
	 * @param uuid the book detail's UUID
	 * @param groupId the primary key of the group
	 * @return the matching book detail
	 * @throws PortalException if a matching book detail could not be found
	 */
	public static BookDetail getBookDetailByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getBookDetailByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the book details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>guestbook.model.impl.BookDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of book details
	 * @param end the upper bound of the range of book details (not inclusive)
	 * @return the range of book details
	 */
	public static List<BookDetail> getBookDetails(int start, int end) {
		return getService().getBookDetails(start, end);
	}

	public static List<BookDetail> getBookDetails(
		long groupId, int start, int end, OrderByComparator<BookDetail> obc) {

		return getService().getBookDetails(groupId, start, end, obc);
	}

	/**
	 * Returns all the book details matching the UUID and company.
	 *
	 * @param uuid the UUID of the book details
	 * @param companyId the primary key of the company
	 * @return the matching book details, or an empty list if no matches were found
	 */
	public static List<BookDetail> getBookDetailsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getBookDetailsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of book details matching the UUID and company.
	 *
	 * @param uuid the UUID of the book details
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of book details
	 * @param end the upper bound of the range of book details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching book details, or an empty list if no matches were found
	 */
	public static List<BookDetail> getBookDetailsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<BookDetail> orderByComparator) {

		return getService().getBookDetailsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of book details.
	 *
	 * @return the number of book details
	 */
	public static int getBookDetailsCount() {
		return getService().getBookDetailsCount();
	}

	public static int getBookDetailsCount(long groupId) {
		return getService().getBookDetailsCount(groupId);
	}

	public static int getBookDetailsCountByKeywords(String keywords) {
		return getService().getBookDetailsCountByKeywords(keywords);
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	public static List<BookDetail> searchBookDetailsByKeywords(
		String keywords, int start, int end,
		OrderByComparator<BookDetail> obc) {

		return getService().searchBookDetailsByKeywords(
			keywords, start, end, obc);
	}

	/**
	 * Updates the book detail in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BookDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bookDetail the book detail
	 * @return the book detail that was updated
	 */
	public static BookDetail updateBookDetail(BookDetail bookDetail) {
		return getService().updateBookDetail(bookDetail);
	}

	public static BookDetail updateBookDetail(
			long userId, long bookId, String title, String author,
			String description, String isbn, int status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updateBookDetail(
			userId, bookId, title, author, description, isbn, status,
			serviceContext);
	}

	public static BookDetailLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<BookDetailLocalService> _serviceSnapshot =
		new Snapshot<>(
			BookDetailLocalServiceUtil.class, BookDetailLocalService.class);

}