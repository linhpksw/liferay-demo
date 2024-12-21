/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package guestbook.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link BookDetailLocalService}.
 *
 * @author linhpksw
 * @see BookDetailLocalService
 * @generated
 */
public class BookDetailLocalServiceWrapper
	implements BookDetailLocalService, ServiceWrapper<BookDetailLocalService> {

	public BookDetailLocalServiceWrapper() {
		this(null);
	}

	public BookDetailLocalServiceWrapper(
		BookDetailLocalService bookDetailLocalService) {

		_bookDetailLocalService = bookDetailLocalService;
	}

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
	@Override
	public guestbook.model.BookDetail addBookDetail(
		guestbook.model.BookDetail bookDetail) {

		return _bookDetailLocalService.addBookDetail(bookDetail);
	}

	@Override
	public guestbook.model.BookDetail addBookDetail(
			long userId, String title, String author, String description,
			String isbn, int status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bookDetailLocalService.addBookDetail(
			userId, title, author, description, isbn, status, serviceContext);
	}

	/**
	 * Creates a new book detail with the primary key. Does not add the book detail to the database.
	 *
	 * @param bookId the primary key for the new book detail
	 * @return the new book detail
	 */
	@Override
	public guestbook.model.BookDetail createBookDetail(long bookId) {
		return _bookDetailLocalService.createBookDetail(bookId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bookDetailLocalService.createPersistedModel(primaryKeyObj);
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
	@Override
	public guestbook.model.BookDetail deleteBookDetail(
		guestbook.model.BookDetail bookDetail) {

		return _bookDetailLocalService.deleteBookDetail(bookDetail);
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
	@Override
	public guestbook.model.BookDetail deleteBookDetail(long bookId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bookDetailLocalService.deleteBookDetail(bookId);
	}

	@Override
	public guestbook.model.BookDetail deleteBookDetail(
			long bookId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _bookDetailLocalService.deleteBookDetail(bookId, serviceContext);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bookDetailLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _bookDetailLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _bookDetailLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _bookDetailLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _bookDetailLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _bookDetailLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _bookDetailLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _bookDetailLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _bookDetailLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public guestbook.model.BookDetail fetchBookDetail(long bookId) {
		return _bookDetailLocalService.fetchBookDetail(bookId);
	}

	/**
	 * Returns the book detail matching the UUID and group.
	 *
	 * @param uuid the book detail's UUID
	 * @param groupId the primary key of the group
	 * @return the matching book detail, or <code>null</code> if a matching book detail could not be found
	 */
	@Override
	public guestbook.model.BookDetail fetchBookDetailByUuidAndGroupId(
		String uuid, long groupId) {

		return _bookDetailLocalService.fetchBookDetailByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _bookDetailLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the book detail with the primary key.
	 *
	 * @param bookId the primary key of the book detail
	 * @return the book detail
	 * @throws PortalException if a book detail with the primary key could not be found
	 */
	@Override
	public guestbook.model.BookDetail getBookDetail(long bookId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bookDetailLocalService.getBookDetail(bookId);
	}

	/**
	 * Returns the book detail matching the UUID and group.
	 *
	 * @param uuid the book detail's UUID
	 * @param groupId the primary key of the group
	 * @return the matching book detail
	 * @throws PortalException if a matching book detail could not be found
	 */
	@Override
	public guestbook.model.BookDetail getBookDetailByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bookDetailLocalService.getBookDetailByUuidAndGroupId(
			uuid, groupId);
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
	@Override
	public java.util.List<guestbook.model.BookDetail> getBookDetails(
		int start, int end) {

		return _bookDetailLocalService.getBookDetails(start, end);
	}

	@Override
	public java.util.List<guestbook.model.BookDetail> getBookDetails(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<guestbook.model.BookDetail> obc) {

		return _bookDetailLocalService.getBookDetails(groupId, start, end, obc);
	}

	/**
	 * Returns all the book details matching the UUID and company.
	 *
	 * @param uuid the UUID of the book details
	 * @param companyId the primary key of the company
	 * @return the matching book details, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<guestbook.model.BookDetail>
		getBookDetailsByUuidAndCompanyId(String uuid, long companyId) {

		return _bookDetailLocalService.getBookDetailsByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List<guestbook.model.BookDetail>
		getBookDetailsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<guestbook.model.BookDetail> orderByComparator) {

		return _bookDetailLocalService.getBookDetailsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of book details.
	 *
	 * @return the number of book details
	 */
	@Override
	public int getBookDetailsCount() {
		return _bookDetailLocalService.getBookDetailsCount();
	}

	@Override
	public int getBookDetailsCount(long groupId) {
		return _bookDetailLocalService.getBookDetailsCount(groupId);
	}

	@Override
	public int getBookDetailsCountByKeywords(String keywords) {
		return _bookDetailLocalService.getBookDetailsCountByKeywords(keywords);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _bookDetailLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _bookDetailLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _bookDetailLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bookDetailLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public java.util.List<guestbook.model.BookDetail>
		searchBookDetailsByKeywords(
			String keywords, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<guestbook.model.BookDetail> obc) {

		return _bookDetailLocalService.searchBookDetailsByKeywords(
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
	@Override
	public guestbook.model.BookDetail updateBookDetail(
		guestbook.model.BookDetail bookDetail) {

		return _bookDetailLocalService.updateBookDetail(bookDetail);
	}

	@Override
	public guestbook.model.BookDetail updateBookDetail(
			long userId, long bookId, String title, String author,
			String description, String isbn, int status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bookDetailLocalService.updateBookDetail(
			userId, bookId, title, author, description, isbn, status,
			serviceContext);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _bookDetailLocalService.getBasePersistence();
	}

	@Override
	public BookDetailLocalService getWrappedService() {
		return _bookDetailLocalService;
	}

	@Override
	public void setWrappedService(
		BookDetailLocalService bookDetailLocalService) {

		_bookDetailLocalService = bookDetailLocalService;
	}

	private BookDetailLocalService _bookDetailLocalService;

}