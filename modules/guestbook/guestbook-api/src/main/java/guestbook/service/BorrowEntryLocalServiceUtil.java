/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package guestbook.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import guestbook.model.BorrowEntry;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for BorrowEntry. This utility wraps
 * <code>guestbook.service.impl.BorrowEntryLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author linhpksw
 * @see BorrowEntryLocalService
 * @generated
 */
public class BorrowEntryLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>guestbook.service.impl.BorrowEntryLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static BorrowEntry addBorrowEntry(BorrowEntry borrowEntry) {
		return getService().addBorrowEntry(borrowEntry);
	}

	public static BorrowEntry addBorrowEntry(
			long userId, long bookId, java.util.Date borrowDate,
			java.util.Date expectedReturnDate,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addBorrowEntry(
			userId, bookId, borrowDate, expectedReturnDate, serviceContext);
	}

	/**
	 * Creates a new borrow entry with the primary key. Does not add the borrow entry to the database.
	 *
	 * @param entryId the primary key for the new borrow entry
	 * @return the new borrow entry
	 */
	public static BorrowEntry createBorrowEntry(long entryId) {
		return getService().createBorrowEntry(entryId);
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
	 * Deletes the borrow entry from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BorrowEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param borrowEntry the borrow entry
	 * @return the borrow entry that was removed
	 */
	public static BorrowEntry deleteBorrowEntry(BorrowEntry borrowEntry) {
		return getService().deleteBorrowEntry(borrowEntry);
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
	public static BorrowEntry deleteBorrowEntry(long entryId)
		throws PortalException {

		return getService().deleteBorrowEntry(entryId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>guestbook.model.impl.BorrowEntryModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>guestbook.model.impl.BorrowEntryModelImpl</code>.
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

	public static BorrowEntry fetchBorrowEntry(long entryId) {
		return getService().fetchBorrowEntry(entryId);
	}

	/**
	 * Returns the borrow entry matching the UUID and group.
	 *
	 * @param uuid the borrow entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching borrow entry, or <code>null</code> if a matching borrow entry could not be found
	 */
	public static BorrowEntry fetchBorrowEntryByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchBorrowEntryByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
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
	public static List<BorrowEntry> getBorrowEntries(int start, int end) {
		return getService().getBorrowEntries(start, end);
	}

	public static List<BorrowEntry> getBorrowEntries(long groupId) {
		return getService().getBorrowEntries(groupId);
	}

	/**
	 * Returns all the borrow entries matching the UUID and company.
	 *
	 * @param uuid the UUID of the borrow entries
	 * @param companyId the primary key of the company
	 * @return the matching borrow entries, or an empty list if no matches were found
	 */
	public static List<BorrowEntry> getBorrowEntriesByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getBorrowEntriesByUuidAndCompanyId(uuid, companyId);
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
	public static List<BorrowEntry> getBorrowEntriesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<BorrowEntry> orderByComparator) {

		return getService().getBorrowEntriesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of borrow entries.
	 *
	 * @return the number of borrow entries
	 */
	public static int getBorrowEntriesCount() {
		return getService().getBorrowEntriesCount();
	}

	/**
	 * Returns the borrow entry with the primary key.
	 *
	 * @param entryId the primary key of the borrow entry
	 * @return the borrow entry
	 * @throws PortalException if a borrow entry with the primary key could not be found
	 */
	public static BorrowEntry getBorrowEntry(long entryId)
		throws PortalException {

		return getService().getBorrowEntry(entryId);
	}

	/**
	 * Returns the borrow entry matching the UUID and group.
	 *
	 * @param uuid the borrow entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching borrow entry
	 * @throws PortalException if a matching borrow entry could not be found
	 */
	public static BorrowEntry getBorrowEntryByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getBorrowEntryByUuidAndGroupId(uuid, groupId);
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

	public static BorrowEntry returnBook(
			long entryId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().returnBook(entryId, serviceContext);
	}

	public static BorrowEntry returnBookByBookId(
			long bookId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().returnBookByBookId(bookId, serviceContext);
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
	public static BorrowEntry updateBorrowEntry(BorrowEntry borrowEntry) {
		return getService().updateBorrowEntry(borrowEntry);
	}

	public static BorrowEntry updateStatus(
			long userId, long entryId, int status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updateStatus(
			userId, entryId, status, serviceContext);
	}

	public static BorrowEntryLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<BorrowEntryLocalService> _serviceSnapshot =
		new Snapshot<>(
			BorrowEntryLocalServiceUtil.class, BorrowEntryLocalService.class);

}