/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package guestbook.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import guestbook.exception.NoSuchBorrowEntryException;

import guestbook.model.BorrowEntry;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the borrow entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author linhpksw
 * @see BorrowEntryUtil
 * @generated
 */
@ProviderType
public interface BorrowEntryPersistence extends BasePersistence<BorrowEntry> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BorrowEntryUtil} to access the borrow entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the borrow entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching borrow entries
	 */
	public java.util.List<BorrowEntry> findByUuid(String uuid);

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
	public java.util.List<BorrowEntry> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<BorrowEntry> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
			orderByComparator);

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
	public java.util.List<BorrowEntry> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first borrow entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching borrow entry
	 * @throws NoSuchBorrowEntryException if a matching borrow entry could not be found
	 */
	public BorrowEntry findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
				orderByComparator)
		throws NoSuchBorrowEntryException;

	/**
	 * Returns the first borrow entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching borrow entry, or <code>null</code> if a matching borrow entry could not be found
	 */
	public BorrowEntry fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
			orderByComparator);

	/**
	 * Returns the last borrow entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching borrow entry
	 * @throws NoSuchBorrowEntryException if a matching borrow entry could not be found
	 */
	public BorrowEntry findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
				orderByComparator)
		throws NoSuchBorrowEntryException;

	/**
	 * Returns the last borrow entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching borrow entry, or <code>null</code> if a matching borrow entry could not be found
	 */
	public BorrowEntry fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
			orderByComparator);

	/**
	 * Returns the borrow entries before and after the current borrow entry in the ordered set where uuid = &#63;.
	 *
	 * @param entryId the primary key of the current borrow entry
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next borrow entry
	 * @throws NoSuchBorrowEntryException if a borrow entry with the primary key could not be found
	 */
	public BorrowEntry[] findByUuid_PrevAndNext(
			long entryId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
				orderByComparator)
		throws NoSuchBorrowEntryException;

	/**
	 * Removes all the borrow entries where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of borrow entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching borrow entries
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the borrow entry where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchBorrowEntryException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching borrow entry
	 * @throws NoSuchBorrowEntryException if a matching borrow entry could not be found
	 */
	public BorrowEntry findByUUID_G(String uuid, long groupId)
		throws NoSuchBorrowEntryException;

	/**
	 * Returns the borrow entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching borrow entry, or <code>null</code> if a matching borrow entry could not be found
	 */
	public BorrowEntry fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the borrow entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching borrow entry, or <code>null</code> if a matching borrow entry could not be found
	 */
	public BorrowEntry fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the borrow entry where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the borrow entry that was removed
	 */
	public BorrowEntry removeByUUID_G(String uuid, long groupId)
		throws NoSuchBorrowEntryException;

	/**
	 * Returns the number of borrow entries where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching borrow entries
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the borrow entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching borrow entries
	 */
	public java.util.List<BorrowEntry> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<BorrowEntry> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<BorrowEntry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
			orderByComparator);

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
	public java.util.List<BorrowEntry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first borrow entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching borrow entry
	 * @throws NoSuchBorrowEntryException if a matching borrow entry could not be found
	 */
	public BorrowEntry findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
				orderByComparator)
		throws NoSuchBorrowEntryException;

	/**
	 * Returns the first borrow entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching borrow entry, or <code>null</code> if a matching borrow entry could not be found
	 */
	public BorrowEntry fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
			orderByComparator);

	/**
	 * Returns the last borrow entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching borrow entry
	 * @throws NoSuchBorrowEntryException if a matching borrow entry could not be found
	 */
	public BorrowEntry findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
				orderByComparator)
		throws NoSuchBorrowEntryException;

	/**
	 * Returns the last borrow entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching borrow entry, or <code>null</code> if a matching borrow entry could not be found
	 */
	public BorrowEntry fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
			orderByComparator);

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
	public BorrowEntry[] findByUuid_C_PrevAndNext(
			long entryId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
				orderByComparator)
		throws NoSuchBorrowEntryException;

	/**
	 * Removes all the borrow entries where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of borrow entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching borrow entries
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the borrow entries where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching borrow entries
	 */
	public java.util.List<BorrowEntry> findByG_S(long groupId, int status);

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
	public java.util.List<BorrowEntry> findByG_S(
		long groupId, int status, int start, int end);

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
	public java.util.List<BorrowEntry> findByG_S(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
			orderByComparator);

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
	public java.util.List<BorrowEntry> findByG_S(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first borrow entry in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching borrow entry
	 * @throws NoSuchBorrowEntryException if a matching borrow entry could not be found
	 */
	public BorrowEntry findByG_S_First(
			long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
				orderByComparator)
		throws NoSuchBorrowEntryException;

	/**
	 * Returns the first borrow entry in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching borrow entry, or <code>null</code> if a matching borrow entry could not be found
	 */
	public BorrowEntry fetchByG_S_First(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
			orderByComparator);

	/**
	 * Returns the last borrow entry in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching borrow entry
	 * @throws NoSuchBorrowEntryException if a matching borrow entry could not be found
	 */
	public BorrowEntry findByG_S_Last(
			long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
				orderByComparator)
		throws NoSuchBorrowEntryException;

	/**
	 * Returns the last borrow entry in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching borrow entry, or <code>null</code> if a matching borrow entry could not be found
	 */
	public BorrowEntry fetchByG_S_Last(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
			orderByComparator);

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
	public BorrowEntry[] findByG_S_PrevAndNext(
			long entryId, long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
				orderByComparator)
		throws NoSuchBorrowEntryException;

	/**
	 * Removes all the borrow entries where groupId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 */
	public void removeByG_S(long groupId, int status);

	/**
	 * Returns the number of borrow entries where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching borrow entries
	 */
	public int countByG_S(long groupId, int status);

	/**
	 * Returns all the borrow entries where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching borrow entries
	 */
	public java.util.List<BorrowEntry> findByGroupId(long groupId);

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
	public java.util.List<BorrowEntry> findByGroupId(
		long groupId, int start, int end);

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
	public java.util.List<BorrowEntry> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
			orderByComparator);

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
	public java.util.List<BorrowEntry> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first borrow entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching borrow entry
	 * @throws NoSuchBorrowEntryException if a matching borrow entry could not be found
	 */
	public BorrowEntry findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
				orderByComparator)
		throws NoSuchBorrowEntryException;

	/**
	 * Returns the first borrow entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching borrow entry, or <code>null</code> if a matching borrow entry could not be found
	 */
	public BorrowEntry fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
			orderByComparator);

	/**
	 * Returns the last borrow entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching borrow entry
	 * @throws NoSuchBorrowEntryException if a matching borrow entry could not be found
	 */
	public BorrowEntry findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
				orderByComparator)
		throws NoSuchBorrowEntryException;

	/**
	 * Returns the last borrow entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching borrow entry, or <code>null</code> if a matching borrow entry could not be found
	 */
	public BorrowEntry fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
			orderByComparator);

	/**
	 * Returns the borrow entries before and after the current borrow entry in the ordered set where groupId = &#63;.
	 *
	 * @param entryId the primary key of the current borrow entry
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next borrow entry
	 * @throws NoSuchBorrowEntryException if a borrow entry with the primary key could not be found
	 */
	public BorrowEntry[] findByGroupId_PrevAndNext(
			long entryId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
				orderByComparator)
		throws NoSuchBorrowEntryException;

	/**
	 * Removes all the borrow entries where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of borrow entries where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching borrow entries
	 */
	public int countByGroupId(long groupId);

	/**
	 * Returns all the borrow entries where bookId = &#63; and status = &#63;.
	 *
	 * @param bookId the book ID
	 * @param status the status
	 * @return the matching borrow entries
	 */
	public java.util.List<BorrowEntry> findByB_S(long bookId, int status);

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
	public java.util.List<BorrowEntry> findByB_S(
		long bookId, int status, int start, int end);

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
	public java.util.List<BorrowEntry> findByB_S(
		long bookId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
			orderByComparator);

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
	public java.util.List<BorrowEntry> findByB_S(
		long bookId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first borrow entry in the ordered set where bookId = &#63; and status = &#63;.
	 *
	 * @param bookId the book ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching borrow entry
	 * @throws NoSuchBorrowEntryException if a matching borrow entry could not be found
	 */
	public BorrowEntry findByB_S_First(
			long bookId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
				orderByComparator)
		throws NoSuchBorrowEntryException;

	/**
	 * Returns the first borrow entry in the ordered set where bookId = &#63; and status = &#63;.
	 *
	 * @param bookId the book ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching borrow entry, or <code>null</code> if a matching borrow entry could not be found
	 */
	public BorrowEntry fetchByB_S_First(
		long bookId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
			orderByComparator);

	/**
	 * Returns the last borrow entry in the ordered set where bookId = &#63; and status = &#63;.
	 *
	 * @param bookId the book ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching borrow entry
	 * @throws NoSuchBorrowEntryException if a matching borrow entry could not be found
	 */
	public BorrowEntry findByB_S_Last(
			long bookId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
				orderByComparator)
		throws NoSuchBorrowEntryException;

	/**
	 * Returns the last borrow entry in the ordered set where bookId = &#63; and status = &#63;.
	 *
	 * @param bookId the book ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching borrow entry, or <code>null</code> if a matching borrow entry could not be found
	 */
	public BorrowEntry fetchByB_S_Last(
		long bookId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
			orderByComparator);

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
	public BorrowEntry[] findByB_S_PrevAndNext(
			long entryId, long bookId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
				orderByComparator)
		throws NoSuchBorrowEntryException;

	/**
	 * Removes all the borrow entries where bookId = &#63; and status = &#63; from the database.
	 *
	 * @param bookId the book ID
	 * @param status the status
	 */
	public void removeByB_S(long bookId, int status);

	/**
	 * Returns the number of borrow entries where bookId = &#63; and status = &#63;.
	 *
	 * @param bookId the book ID
	 * @param status the status
	 * @return the number of matching borrow entries
	 */
	public int countByB_S(long bookId, int status);

	/**
	 * Caches the borrow entry in the entity cache if it is enabled.
	 *
	 * @param borrowEntry the borrow entry
	 */
	public void cacheResult(BorrowEntry borrowEntry);

	/**
	 * Caches the borrow entries in the entity cache if it is enabled.
	 *
	 * @param borrowEntries the borrow entries
	 */
	public void cacheResult(java.util.List<BorrowEntry> borrowEntries);

	/**
	 * Creates a new borrow entry with the primary key. Does not add the borrow entry to the database.
	 *
	 * @param entryId the primary key for the new borrow entry
	 * @return the new borrow entry
	 */
	public BorrowEntry create(long entryId);

	/**
	 * Removes the borrow entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param entryId the primary key of the borrow entry
	 * @return the borrow entry that was removed
	 * @throws NoSuchBorrowEntryException if a borrow entry with the primary key could not be found
	 */
	public BorrowEntry remove(long entryId) throws NoSuchBorrowEntryException;

	public BorrowEntry updateImpl(BorrowEntry borrowEntry);

	/**
	 * Returns the borrow entry with the primary key or throws a <code>NoSuchBorrowEntryException</code> if it could not be found.
	 *
	 * @param entryId the primary key of the borrow entry
	 * @return the borrow entry
	 * @throws NoSuchBorrowEntryException if a borrow entry with the primary key could not be found
	 */
	public BorrowEntry findByPrimaryKey(long entryId)
		throws NoSuchBorrowEntryException;

	/**
	 * Returns the borrow entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param entryId the primary key of the borrow entry
	 * @return the borrow entry, or <code>null</code> if a borrow entry with the primary key could not be found
	 */
	public BorrowEntry fetchByPrimaryKey(long entryId);

	/**
	 * Returns all the borrow entries.
	 *
	 * @return the borrow entries
	 */
	public java.util.List<BorrowEntry> findAll();

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
	public java.util.List<BorrowEntry> findAll(int start, int end);

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
	public java.util.List<BorrowEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
			orderByComparator);

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
	public java.util.List<BorrowEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BorrowEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the borrow entries from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of borrow entries.
	 *
	 * @return the number of borrow entries
	 */
	public int countAll();

}