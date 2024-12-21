/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package guestbook.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import guestbook.model.BorrowEntry;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the borrow entry service. This utility wraps <code>guestbook.service.persistence.impl.BorrowEntryPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author linhpksw
 * @see BorrowEntryPersistence
 * @generated
 */
public class BorrowEntryUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(BorrowEntry borrowEntry) {
		getPersistence().clearCache(borrowEntry);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, BorrowEntry> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<BorrowEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<BorrowEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<BorrowEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<BorrowEntry> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static BorrowEntry update(BorrowEntry borrowEntry) {
		return getPersistence().update(borrowEntry);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static BorrowEntry update(
		BorrowEntry borrowEntry, ServiceContext serviceContext) {

		return getPersistence().update(borrowEntry, serviceContext);
	}

	/**
	 * Returns all the borrow entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching borrow entries
	 */
	public static List<BorrowEntry> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the borrow entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BorrowEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of borrow entries
	 * @param end the upper bound of the range of borrow entries (not inclusive)
	 * @return the range of matching borrow entries
	 */
	public static List<BorrowEntry> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the borrow entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BorrowEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of borrow entries
	 * @param end the upper bound of the range of borrow entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching borrow entries
	 */
	public static List<BorrowEntry> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<BorrowEntry> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the borrow entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BorrowEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of borrow entries
	 * @param end the upper bound of the range of borrow entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching borrow entries
	 */
	public static List<BorrowEntry> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<BorrowEntry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first borrow entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching borrow entry
	 * @throws NoSuchBorrowEntryException if a matching borrow entry could not be found
	 */
	public static BorrowEntry findByUuid_First(
			String uuid, OrderByComparator<BorrowEntry> orderByComparator)
		throws guestbook.exception.NoSuchBorrowEntryException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first borrow entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching borrow entry, or <code>null</code> if a matching borrow entry could not be found
	 */
	public static BorrowEntry fetchByUuid_First(
		String uuid, OrderByComparator<BorrowEntry> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last borrow entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching borrow entry
	 * @throws NoSuchBorrowEntryException if a matching borrow entry could not be found
	 */
	public static BorrowEntry findByUuid_Last(
			String uuid, OrderByComparator<BorrowEntry> orderByComparator)
		throws guestbook.exception.NoSuchBorrowEntryException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last borrow entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching borrow entry, or <code>null</code> if a matching borrow entry could not be found
	 */
	public static BorrowEntry fetchByUuid_Last(
		String uuid, OrderByComparator<BorrowEntry> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the borrow entries before and after the current borrow entry in the ordered set where uuid = &#63;.
	 *
	 * @param entryId the primary key of the current borrow entry
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next borrow entry
	 * @throws NoSuchBorrowEntryException if a borrow entry with the primary key could not be found
	 */
	public static BorrowEntry[] findByUuid_PrevAndNext(
			long entryId, String uuid,
			OrderByComparator<BorrowEntry> orderByComparator)
		throws guestbook.exception.NoSuchBorrowEntryException {

		return getPersistence().findByUuid_PrevAndNext(
			entryId, uuid, orderByComparator);
	}

	/**
	 * Removes all the borrow entries where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of borrow entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching borrow entries
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the borrow entry where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchBorrowEntryException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching borrow entry
	 * @throws NoSuchBorrowEntryException if a matching borrow entry could not be found
	 */
	public static BorrowEntry findByUUID_G(String uuid, long groupId)
		throws guestbook.exception.NoSuchBorrowEntryException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the borrow entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching borrow entry, or <code>null</code> if a matching borrow entry could not be found
	 */
	public static BorrowEntry fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the borrow entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching borrow entry, or <code>null</code> if a matching borrow entry could not be found
	 */
	public static BorrowEntry fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the borrow entry where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the borrow entry that was removed
	 */
	public static BorrowEntry removeByUUID_G(String uuid, long groupId)
		throws guestbook.exception.NoSuchBorrowEntryException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of borrow entries where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching borrow entries
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the borrow entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching borrow entries
	 */
	public static List<BorrowEntry> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the borrow entries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BorrowEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of borrow entries
	 * @param end the upper bound of the range of borrow entries (not inclusive)
	 * @return the range of matching borrow entries
	 */
	public static List<BorrowEntry> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the borrow entries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BorrowEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of borrow entries
	 * @param end the upper bound of the range of borrow entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching borrow entries
	 */
	public static List<BorrowEntry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<BorrowEntry> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the borrow entries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BorrowEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of borrow entries
	 * @param end the upper bound of the range of borrow entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching borrow entries
	 */
	public static List<BorrowEntry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<BorrowEntry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first borrow entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching borrow entry
	 * @throws NoSuchBorrowEntryException if a matching borrow entry could not be found
	 */
	public static BorrowEntry findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<BorrowEntry> orderByComparator)
		throws guestbook.exception.NoSuchBorrowEntryException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first borrow entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching borrow entry, or <code>null</code> if a matching borrow entry could not be found
	 */
	public static BorrowEntry fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<BorrowEntry> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last borrow entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching borrow entry
	 * @throws NoSuchBorrowEntryException if a matching borrow entry could not be found
	 */
	public static BorrowEntry findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<BorrowEntry> orderByComparator)
		throws guestbook.exception.NoSuchBorrowEntryException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last borrow entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching borrow entry, or <code>null</code> if a matching borrow entry could not be found
	 */
	public static BorrowEntry fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<BorrowEntry> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the borrow entries before and after the current borrow entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param entryId the primary key of the current borrow entry
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next borrow entry
	 * @throws NoSuchBorrowEntryException if a borrow entry with the primary key could not be found
	 */
	public static BorrowEntry[] findByUuid_C_PrevAndNext(
			long entryId, String uuid, long companyId,
			OrderByComparator<BorrowEntry> orderByComparator)
		throws guestbook.exception.NoSuchBorrowEntryException {

		return getPersistence().findByUuid_C_PrevAndNext(
			entryId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the borrow entries where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of borrow entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching borrow entries
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the borrow entries where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching borrow entries
	 */
	public static List<BorrowEntry> findByG_S(long groupId, int status) {
		return getPersistence().findByG_S(groupId, status);
	}

	/**
	 * Returns a range of all the borrow entries where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BorrowEntryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of borrow entries
	 * @param end the upper bound of the range of borrow entries (not inclusive)
	 * @return the range of matching borrow entries
	 */
	public static List<BorrowEntry> findByG_S(
		long groupId, int status, int start, int end) {

		return getPersistence().findByG_S(groupId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the borrow entries where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BorrowEntryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of borrow entries
	 * @param end the upper bound of the range of borrow entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching borrow entries
	 */
	public static List<BorrowEntry> findByG_S(
		long groupId, int status, int start, int end,
		OrderByComparator<BorrowEntry> orderByComparator) {

		return getPersistence().findByG_S(
			groupId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the borrow entries where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BorrowEntryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of borrow entries
	 * @param end the upper bound of the range of borrow entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching borrow entries
	 */
	public static List<BorrowEntry> findByG_S(
		long groupId, int status, int start, int end,
		OrderByComparator<BorrowEntry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_S(
			groupId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first borrow entry in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching borrow entry
	 * @throws NoSuchBorrowEntryException if a matching borrow entry could not be found
	 */
	public static BorrowEntry findByG_S_First(
			long groupId, int status,
			OrderByComparator<BorrowEntry> orderByComparator)
		throws guestbook.exception.NoSuchBorrowEntryException {

		return getPersistence().findByG_S_First(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the first borrow entry in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching borrow entry, or <code>null</code> if a matching borrow entry could not be found
	 */
	public static BorrowEntry fetchByG_S_First(
		long groupId, int status,
		OrderByComparator<BorrowEntry> orderByComparator) {

		return getPersistence().fetchByG_S_First(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the last borrow entry in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching borrow entry
	 * @throws NoSuchBorrowEntryException if a matching borrow entry could not be found
	 */
	public static BorrowEntry findByG_S_Last(
			long groupId, int status,
			OrderByComparator<BorrowEntry> orderByComparator)
		throws guestbook.exception.NoSuchBorrowEntryException {

		return getPersistence().findByG_S_Last(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the last borrow entry in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching borrow entry, or <code>null</code> if a matching borrow entry could not be found
	 */
	public static BorrowEntry fetchByG_S_Last(
		long groupId, int status,
		OrderByComparator<BorrowEntry> orderByComparator) {

		return getPersistence().fetchByG_S_Last(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the borrow entries before and after the current borrow entry in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param entryId the primary key of the current borrow entry
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next borrow entry
	 * @throws NoSuchBorrowEntryException if a borrow entry with the primary key could not be found
	 */
	public static BorrowEntry[] findByG_S_PrevAndNext(
			long entryId, long groupId, int status,
			OrderByComparator<BorrowEntry> orderByComparator)
		throws guestbook.exception.NoSuchBorrowEntryException {

		return getPersistence().findByG_S_PrevAndNext(
			entryId, groupId, status, orderByComparator);
	}

	/**
	 * Removes all the borrow entries where groupId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 */
	public static void removeByG_S(long groupId, int status) {
		getPersistence().removeByG_S(groupId, status);
	}

	/**
	 * Returns the number of borrow entries where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching borrow entries
	 */
	public static int countByG_S(long groupId, int status) {
		return getPersistence().countByG_S(groupId, status);
	}

	/**
	 * Returns all the borrow entries where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching borrow entries
	 */
	public static List<BorrowEntry> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	 * Returns a range of all the borrow entries where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BorrowEntryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of borrow entries
	 * @param end the upper bound of the range of borrow entries (not inclusive)
	 * @return the range of matching borrow entries
	 */
	public static List<BorrowEntry> findByGroupId(
		long groupId, int start, int end) {

		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the borrow entries where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BorrowEntryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of borrow entries
	 * @param end the upper bound of the range of borrow entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching borrow entries
	 */
	public static List<BorrowEntry> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<BorrowEntry> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the borrow entries where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BorrowEntryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of borrow entries
	 * @param end the upper bound of the range of borrow entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching borrow entries
	 */
	public static List<BorrowEntry> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<BorrowEntry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first borrow entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching borrow entry
	 * @throws NoSuchBorrowEntryException if a matching borrow entry could not be found
	 */
	public static BorrowEntry findByGroupId_First(
			long groupId, OrderByComparator<BorrowEntry> orderByComparator)
		throws guestbook.exception.NoSuchBorrowEntryException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first borrow entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching borrow entry, or <code>null</code> if a matching borrow entry could not be found
	 */
	public static BorrowEntry fetchByGroupId_First(
		long groupId, OrderByComparator<BorrowEntry> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last borrow entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching borrow entry
	 * @throws NoSuchBorrowEntryException if a matching borrow entry could not be found
	 */
	public static BorrowEntry findByGroupId_Last(
			long groupId, OrderByComparator<BorrowEntry> orderByComparator)
		throws guestbook.exception.NoSuchBorrowEntryException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last borrow entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching borrow entry, or <code>null</code> if a matching borrow entry could not be found
	 */
	public static BorrowEntry fetchByGroupId_Last(
		long groupId, OrderByComparator<BorrowEntry> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the borrow entries before and after the current borrow entry in the ordered set where groupId = &#63;.
	 *
	 * @param entryId the primary key of the current borrow entry
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next borrow entry
	 * @throws NoSuchBorrowEntryException if a borrow entry with the primary key could not be found
	 */
	public static BorrowEntry[] findByGroupId_PrevAndNext(
			long entryId, long groupId,
			OrderByComparator<BorrowEntry> orderByComparator)
		throws guestbook.exception.NoSuchBorrowEntryException {

		return getPersistence().findByGroupId_PrevAndNext(
			entryId, groupId, orderByComparator);
	}

	/**
	 * Removes all the borrow entries where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of borrow entries where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching borrow entries
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Returns all the borrow entries where bookId = &#63; and status = &#63;.
	 *
	 * @param bookId the book ID
	 * @param status the status
	 * @return the matching borrow entries
	 */
	public static List<BorrowEntry> findByB_S(long bookId, int status) {
		return getPersistence().findByB_S(bookId, status);
	}

	/**
	 * Returns a range of all the borrow entries where bookId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BorrowEntryModelImpl</code>.
	 * </p>
	 *
	 * @param bookId the book ID
	 * @param status the status
	 * @param start the lower bound of the range of borrow entries
	 * @param end the upper bound of the range of borrow entries (not inclusive)
	 * @return the range of matching borrow entries
	 */
	public static List<BorrowEntry> findByB_S(
		long bookId, int status, int start, int end) {

		return getPersistence().findByB_S(bookId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the borrow entries where bookId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BorrowEntryModelImpl</code>.
	 * </p>
	 *
	 * @param bookId the book ID
	 * @param status the status
	 * @param start the lower bound of the range of borrow entries
	 * @param end the upper bound of the range of borrow entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching borrow entries
	 */
	public static List<BorrowEntry> findByB_S(
		long bookId, int status, int start, int end,
		OrderByComparator<BorrowEntry> orderByComparator) {

		return getPersistence().findByB_S(
			bookId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the borrow entries where bookId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BorrowEntryModelImpl</code>.
	 * </p>
	 *
	 * @param bookId the book ID
	 * @param status the status
	 * @param start the lower bound of the range of borrow entries
	 * @param end the upper bound of the range of borrow entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching borrow entries
	 */
	public static List<BorrowEntry> findByB_S(
		long bookId, int status, int start, int end,
		OrderByComparator<BorrowEntry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByB_S(
			bookId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first borrow entry in the ordered set where bookId = &#63; and status = &#63;.
	 *
	 * @param bookId the book ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching borrow entry
	 * @throws NoSuchBorrowEntryException if a matching borrow entry could not be found
	 */
	public static BorrowEntry findByB_S_First(
			long bookId, int status,
			OrderByComparator<BorrowEntry> orderByComparator)
		throws guestbook.exception.NoSuchBorrowEntryException {

		return getPersistence().findByB_S_First(
			bookId, status, orderByComparator);
	}

	/**
	 * Returns the first borrow entry in the ordered set where bookId = &#63; and status = &#63;.
	 *
	 * @param bookId the book ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching borrow entry, or <code>null</code> if a matching borrow entry could not be found
	 */
	public static BorrowEntry fetchByB_S_First(
		long bookId, int status,
		OrderByComparator<BorrowEntry> orderByComparator) {

		return getPersistence().fetchByB_S_First(
			bookId, status, orderByComparator);
	}

	/**
	 * Returns the last borrow entry in the ordered set where bookId = &#63; and status = &#63;.
	 *
	 * @param bookId the book ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching borrow entry
	 * @throws NoSuchBorrowEntryException if a matching borrow entry could not be found
	 */
	public static BorrowEntry findByB_S_Last(
			long bookId, int status,
			OrderByComparator<BorrowEntry> orderByComparator)
		throws guestbook.exception.NoSuchBorrowEntryException {

		return getPersistence().findByB_S_Last(
			bookId, status, orderByComparator);
	}

	/**
	 * Returns the last borrow entry in the ordered set where bookId = &#63; and status = &#63;.
	 *
	 * @param bookId the book ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching borrow entry, or <code>null</code> if a matching borrow entry could not be found
	 */
	public static BorrowEntry fetchByB_S_Last(
		long bookId, int status,
		OrderByComparator<BorrowEntry> orderByComparator) {

		return getPersistence().fetchByB_S_Last(
			bookId, status, orderByComparator);
	}

	/**
	 * Returns the borrow entries before and after the current borrow entry in the ordered set where bookId = &#63; and status = &#63;.
	 *
	 * @param entryId the primary key of the current borrow entry
	 * @param bookId the book ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next borrow entry
	 * @throws NoSuchBorrowEntryException if a borrow entry with the primary key could not be found
	 */
	public static BorrowEntry[] findByB_S_PrevAndNext(
			long entryId, long bookId, int status,
			OrderByComparator<BorrowEntry> orderByComparator)
		throws guestbook.exception.NoSuchBorrowEntryException {

		return getPersistence().findByB_S_PrevAndNext(
			entryId, bookId, status, orderByComparator);
	}

	/**
	 * Removes all the borrow entries where bookId = &#63; and status = &#63; from the database.
	 *
	 * @param bookId the book ID
	 * @param status the status
	 */
	public static void removeByB_S(long bookId, int status) {
		getPersistence().removeByB_S(bookId, status);
	}

	/**
	 * Returns the number of borrow entries where bookId = &#63; and status = &#63;.
	 *
	 * @param bookId the book ID
	 * @param status the status
	 * @return the number of matching borrow entries
	 */
	public static int countByB_S(long bookId, int status) {
		return getPersistence().countByB_S(bookId, status);
	}

	/**
	 * Caches the borrow entry in the entity cache if it is enabled.
	 *
	 * @param borrowEntry the borrow entry
	 */
	public static void cacheResult(BorrowEntry borrowEntry) {
		getPersistence().cacheResult(borrowEntry);
	}

	/**
	 * Caches the borrow entries in the entity cache if it is enabled.
	 *
	 * @param borrowEntries the borrow entries
	 */
	public static void cacheResult(List<BorrowEntry> borrowEntries) {
		getPersistence().cacheResult(borrowEntries);
	}

	/**
	 * Creates a new borrow entry with the primary key. Does not add the borrow entry to the database.
	 *
	 * @param entryId the primary key for the new borrow entry
	 * @return the new borrow entry
	 */
	public static BorrowEntry create(long entryId) {
		return getPersistence().create(entryId);
	}

	/**
	 * Removes the borrow entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param entryId the primary key of the borrow entry
	 * @return the borrow entry that was removed
	 * @throws NoSuchBorrowEntryException if a borrow entry with the primary key could not be found
	 */
	public static BorrowEntry remove(long entryId)
		throws guestbook.exception.NoSuchBorrowEntryException {

		return getPersistence().remove(entryId);
	}

	public static BorrowEntry updateImpl(BorrowEntry borrowEntry) {
		return getPersistence().updateImpl(borrowEntry);
	}

	/**
	 * Returns the borrow entry with the primary key or throws a <code>NoSuchBorrowEntryException</code> if it could not be found.
	 *
	 * @param entryId the primary key of the borrow entry
	 * @return the borrow entry
	 * @throws NoSuchBorrowEntryException if a borrow entry with the primary key could not be found
	 */
	public static BorrowEntry findByPrimaryKey(long entryId)
		throws guestbook.exception.NoSuchBorrowEntryException {

		return getPersistence().findByPrimaryKey(entryId);
	}

	/**
	 * Returns the borrow entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param entryId the primary key of the borrow entry
	 * @return the borrow entry, or <code>null</code> if a borrow entry with the primary key could not be found
	 */
	public static BorrowEntry fetchByPrimaryKey(long entryId) {
		return getPersistence().fetchByPrimaryKey(entryId);
	}

	/**
	 * Returns all the borrow entries.
	 *
	 * @return the borrow entries
	 */
	public static List<BorrowEntry> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the borrow entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BorrowEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of borrow entries
	 * @param end the upper bound of the range of borrow entries (not inclusive)
	 * @return the range of borrow entries
	 */
	public static List<BorrowEntry> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the borrow entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BorrowEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of borrow entries
	 * @param end the upper bound of the range of borrow entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of borrow entries
	 */
	public static List<BorrowEntry> findAll(
		int start, int end, OrderByComparator<BorrowEntry> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the borrow entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BorrowEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of borrow entries
	 * @param end the upper bound of the range of borrow entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of borrow entries
	 */
	public static List<BorrowEntry> findAll(
		int start, int end, OrderByComparator<BorrowEntry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the borrow entries from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of borrow entries.
	 *
	 * @return the number of borrow entries
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static BorrowEntryPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(BorrowEntryPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile BorrowEntryPersistence _persistence;

}