/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package guestbook.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link BorrowEntryLocalService}.
 *
 * @author linhpksw
 * @see BorrowEntryLocalService
 * @generated
 */
public class BorrowEntryLocalServiceWrapper
	implements BorrowEntryLocalService,
			   ServiceWrapper<BorrowEntryLocalService> {

	public BorrowEntryLocalServiceWrapper() {
		this(null);
	}

	public BorrowEntryLocalServiceWrapper(
		BorrowEntryLocalService borrowEntryLocalService) {

		_borrowEntryLocalService = borrowEntryLocalService;
	}

	/**
	 * Adds the borrow entry to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BorrowEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param borrowEntry the borrow entry
	 * @return the borrow entry that was added
	 */
	@Override
	public guestbook.model.BorrowEntry addBorrowEntry(
		guestbook.model.BorrowEntry borrowEntry) {

		return _borrowEntryLocalService.addBorrowEntry(borrowEntry);
	}

	@Override
	public guestbook.model.BorrowEntry addBorrowEntry(
			long userId, long bookId, java.util.Date borrowDate,
			java.util.Date expectedReturnDate,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _borrowEntryLocalService.addBorrowEntry(
			userId, bookId, borrowDate, expectedReturnDate, serviceContext);
	}

	/**
	 * Creates a new borrow entry with the primary key. Does not add the borrow entry to the database.
	 *
	 * @param entryId the primary key for the new borrow entry
	 * @return the new borrow entry
	 */
	@Override
	public guestbook.model.BorrowEntry createBorrowEntry(long entryId) {
		return _borrowEntryLocalService.createBorrowEntry(entryId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _borrowEntryLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the borrow entry from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BorrowEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param borrowEntry the borrow entry
	 * @return the borrow entry that was removed
	 */
	@Override
	public guestbook.model.BorrowEntry deleteBorrowEntry(
		guestbook.model.BorrowEntry borrowEntry) {

		return _borrowEntryLocalService.deleteBorrowEntry(borrowEntry);
	}

	/**
	 * Deletes the borrow entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BorrowEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param entryId the primary key of the borrow entry
	 * @return the borrow entry that was removed
	 * @throws PortalException if a borrow entry with the primary key could not be found
	 */
	@Override
	public guestbook.model.BorrowEntry deleteBorrowEntry(long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _borrowEntryLocalService.deleteBorrowEntry(entryId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _borrowEntryLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _borrowEntryLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _borrowEntryLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _borrowEntryLocalService.dynamicQuery();
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

		return _borrowEntryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>guestbook.model.impl.BorrowEntryModelImpl</code>.
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

		return _borrowEntryLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>guestbook.model.impl.BorrowEntryModelImpl</code>.
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

		return _borrowEntryLocalService.dynamicQuery(
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

		return _borrowEntryLocalService.dynamicQueryCount(dynamicQuery);
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

		return _borrowEntryLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public guestbook.model.BorrowEntry fetchBorrowEntry(long entryId) {
		return _borrowEntryLocalService.fetchBorrowEntry(entryId);
	}

	/**
	 * Returns the borrow entry matching the UUID and group.
	 *
	 * @param uuid the borrow entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching borrow entry, or <code>null</code> if a matching borrow entry could not be found
	 */
	@Override
	public guestbook.model.BorrowEntry fetchBorrowEntryByUuidAndGroupId(
		String uuid, long groupId) {

		return _borrowEntryLocalService.fetchBorrowEntryByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _borrowEntryLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns a range of all the borrow entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>guestbook.model.impl.BorrowEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of borrow entries
	 * @param end the upper bound of the range of borrow entries (not inclusive)
	 * @return the range of borrow entries
	 */
	@Override
	public java.util.List<guestbook.model.BorrowEntry> getBorrowEntries(
		int start, int end) {

		return _borrowEntryLocalService.getBorrowEntries(start, end);
	}

	@Override
	public java.util.List<guestbook.model.BorrowEntry> getBorrowEntries(
		long groupId) {

		return _borrowEntryLocalService.getBorrowEntries(groupId);
	}

	/**
	 * Returns all the borrow entries matching the UUID and company.
	 *
	 * @param uuid the UUID of the borrow entries
	 * @param companyId the primary key of the company
	 * @return the matching borrow entries, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<guestbook.model.BorrowEntry>
		getBorrowEntriesByUuidAndCompanyId(String uuid, long companyId) {

		return _borrowEntryLocalService.getBorrowEntriesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of borrow entries matching the UUID and company.
	 *
	 * @param uuid the UUID of the borrow entries
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of borrow entries
	 * @param end the upper bound of the range of borrow entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching borrow entries, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<guestbook.model.BorrowEntry>
		getBorrowEntriesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<guestbook.model.BorrowEntry> orderByComparator) {

		return _borrowEntryLocalService.getBorrowEntriesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of borrow entries.
	 *
	 * @return the number of borrow entries
	 */
	@Override
	public int getBorrowEntriesCount() {
		return _borrowEntryLocalService.getBorrowEntriesCount();
	}

	/**
	 * Returns the borrow entry with the primary key.
	 *
	 * @param entryId the primary key of the borrow entry
	 * @return the borrow entry
	 * @throws PortalException if a borrow entry with the primary key could not be found
	 */
	@Override
	public guestbook.model.BorrowEntry getBorrowEntry(long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _borrowEntryLocalService.getBorrowEntry(entryId);
	}

	/**
	 * Returns the borrow entry matching the UUID and group.
	 *
	 * @param uuid the borrow entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching borrow entry
	 * @throws PortalException if a matching borrow entry could not be found
	 */
	@Override
	public guestbook.model.BorrowEntry getBorrowEntryByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _borrowEntryLocalService.getBorrowEntryByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _borrowEntryLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _borrowEntryLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _borrowEntryLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _borrowEntryLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public guestbook.model.BorrowEntry returnBook(
			long entryId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _borrowEntryLocalService.returnBook(entryId, serviceContext);
	}

	@Override
	public guestbook.model.BorrowEntry returnBookByBookId(
			long bookId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _borrowEntryLocalService.returnBookByBookId(
			bookId, serviceContext);
	}

	/**
	 * Updates the borrow entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BorrowEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param borrowEntry the borrow entry
	 * @return the borrow entry that was updated
	 */
	@Override
	public guestbook.model.BorrowEntry updateBorrowEntry(
		guestbook.model.BorrowEntry borrowEntry) {

		return _borrowEntryLocalService.updateBorrowEntry(borrowEntry);
	}

	@Override
	public guestbook.model.BorrowEntry updateStatus(
			long userId, long entryId, int status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _borrowEntryLocalService.updateStatus(
			userId, entryId, status, serviceContext);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _borrowEntryLocalService.getBasePersistence();
	}

	@Override
	public BorrowEntryLocalService getWrappedService() {
		return _borrowEntryLocalService;
	}

	@Override
	public void setWrappedService(
		BorrowEntryLocalService borrowEntryLocalService) {

		_borrowEntryLocalService = borrowEntryLocalService;
	}

	private BorrowEntryLocalService _borrowEntryLocalService;

}