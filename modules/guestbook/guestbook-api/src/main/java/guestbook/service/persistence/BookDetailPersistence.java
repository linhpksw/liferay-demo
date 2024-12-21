/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package guestbook.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import guestbook.exception.NoSuchBookDetailException;

import guestbook.model.BookDetail;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the book detail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author linhpksw
 * @see BookDetailUtil
 * @generated
 */
@ProviderType
public interface BookDetailPersistence extends BasePersistence<BookDetail> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BookDetailUtil} to access the book detail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the book details where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching book details
	 */
	public java.util.List<BookDetail> findByUuid(String uuid);

	/**
	 * Returns a range of all the book details where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BookDetailModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of book details
	 * @param end the upper bound of the range of book details (not inclusive)
	 * @return the range of matching book details
	 */
	public java.util.List<BookDetail> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the book details where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BookDetailModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of book details
	 * @param end the upper bound of the range of book details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching book details
	 */
	public java.util.List<BookDetail> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BookDetail>
			orderByComparator);

	/**
	 * Returns an ordered range of all the book details where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BookDetailModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of book details
	 * @param end the upper bound of the range of book details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching book details
	 */
	public java.util.List<BookDetail> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BookDetail>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first book detail in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching book detail
	 * @throws NoSuchBookDetailException if a matching book detail could not be found
	 */
	public BookDetail findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<BookDetail>
				orderByComparator)
		throws NoSuchBookDetailException;

	/**
	 * Returns the first book detail in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching book detail, or <code>null</code> if a matching book detail could not be found
	 */
	public BookDetail fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<BookDetail>
			orderByComparator);

	/**
	 * Returns the last book detail in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching book detail
	 * @throws NoSuchBookDetailException if a matching book detail could not be found
	 */
	public BookDetail findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<BookDetail>
				orderByComparator)
		throws NoSuchBookDetailException;

	/**
	 * Returns the last book detail in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching book detail, or <code>null</code> if a matching book detail could not be found
	 */
	public BookDetail fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<BookDetail>
			orderByComparator);

	/**
	 * Returns the book details before and after the current book detail in the ordered set where uuid = &#63;.
	 *
	 * @param bookId the primary key of the current book detail
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next book detail
	 * @throws NoSuchBookDetailException if a book detail with the primary key could not be found
	 */
	public BookDetail[] findByUuid_PrevAndNext(
			long bookId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<BookDetail>
				orderByComparator)
		throws NoSuchBookDetailException;

	/**
	 * Removes all the book details where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of book details where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching book details
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the book detail where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchBookDetailException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching book detail
	 * @throws NoSuchBookDetailException if a matching book detail could not be found
	 */
	public BookDetail findByUUID_G(String uuid, long groupId)
		throws NoSuchBookDetailException;

	/**
	 * Returns the book detail where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching book detail, or <code>null</code> if a matching book detail could not be found
	 */
	public BookDetail fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the book detail where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching book detail, or <code>null</code> if a matching book detail could not be found
	 */
	public BookDetail fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the book detail where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the book detail that was removed
	 */
	public BookDetail removeByUUID_G(String uuid, long groupId)
		throws NoSuchBookDetailException;

	/**
	 * Returns the number of book details where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching book details
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the book details where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching book details
	 */
	public java.util.List<BookDetail> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the book details where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BookDetailModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of book details
	 * @param end the upper bound of the range of book details (not inclusive)
	 * @return the range of matching book details
	 */
	public java.util.List<BookDetail> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the book details where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BookDetailModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of book details
	 * @param end the upper bound of the range of book details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching book details
	 */
	public java.util.List<BookDetail> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BookDetail>
			orderByComparator);

	/**
	 * Returns an ordered range of all the book details where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BookDetailModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of book details
	 * @param end the upper bound of the range of book details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching book details
	 */
	public java.util.List<BookDetail> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BookDetail>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first book detail in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching book detail
	 * @throws NoSuchBookDetailException if a matching book detail could not be found
	 */
	public BookDetail findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<BookDetail>
				orderByComparator)
		throws NoSuchBookDetailException;

	/**
	 * Returns the first book detail in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching book detail, or <code>null</code> if a matching book detail could not be found
	 */
	public BookDetail fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<BookDetail>
			orderByComparator);

	/**
	 * Returns the last book detail in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching book detail
	 * @throws NoSuchBookDetailException if a matching book detail could not be found
	 */
	public BookDetail findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<BookDetail>
				orderByComparator)
		throws NoSuchBookDetailException;

	/**
	 * Returns the last book detail in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching book detail, or <code>null</code> if a matching book detail could not be found
	 */
	public BookDetail fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<BookDetail>
			orderByComparator);

	/**
	 * Returns the book details before and after the current book detail in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param bookId the primary key of the current book detail
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next book detail
	 * @throws NoSuchBookDetailException if a book detail with the primary key could not be found
	 */
	public BookDetail[] findByUuid_C_PrevAndNext(
			long bookId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<BookDetail>
				orderByComparator)
		throws NoSuchBookDetailException;

	/**
	 * Removes all the book details where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of book details where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching book details
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the book details where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching book details
	 */
	public java.util.List<BookDetail> findByGroupId(long groupId);

	/**
	 * Returns a range of all the book details where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BookDetailModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of book details
	 * @param end the upper bound of the range of book details (not inclusive)
	 * @return the range of matching book details
	 */
	public java.util.List<BookDetail> findByGroupId(
		long groupId, int start, int end);

	/**
	 * Returns an ordered range of all the book details where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BookDetailModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of book details
	 * @param end the upper bound of the range of book details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching book details
	 */
	public java.util.List<BookDetail> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BookDetail>
			orderByComparator);

	/**
	 * Returns an ordered range of all the book details where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BookDetailModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of book details
	 * @param end the upper bound of the range of book details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching book details
	 */
	public java.util.List<BookDetail> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BookDetail>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first book detail in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching book detail
	 * @throws NoSuchBookDetailException if a matching book detail could not be found
	 */
	public BookDetail findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<BookDetail>
				orderByComparator)
		throws NoSuchBookDetailException;

	/**
	 * Returns the first book detail in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching book detail, or <code>null</code> if a matching book detail could not be found
	 */
	public BookDetail fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<BookDetail>
			orderByComparator);

	/**
	 * Returns the last book detail in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching book detail
	 * @throws NoSuchBookDetailException if a matching book detail could not be found
	 */
	public BookDetail findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<BookDetail>
				orderByComparator)
		throws NoSuchBookDetailException;

	/**
	 * Returns the last book detail in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching book detail, or <code>null</code> if a matching book detail could not be found
	 */
	public BookDetail fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<BookDetail>
			orderByComparator);

	/**
	 * Returns the book details before and after the current book detail in the ordered set where groupId = &#63;.
	 *
	 * @param bookId the primary key of the current book detail
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next book detail
	 * @throws NoSuchBookDetailException if a book detail with the primary key could not be found
	 */
	public BookDetail[] findByGroupId_PrevAndNext(
			long bookId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<BookDetail>
				orderByComparator)
		throws NoSuchBookDetailException;

	/**
	 * Removes all the book details where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of book details where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching book details
	 */
	public int countByGroupId(long groupId);

	/**
	 * Returns all the book details where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching book details
	 */
	public java.util.List<BookDetail> findByStatus(int status);

	/**
	 * Returns a range of all the book details where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BookDetailModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of book details
	 * @param end the upper bound of the range of book details (not inclusive)
	 * @return the range of matching book details
	 */
	public java.util.List<BookDetail> findByStatus(
		int status, int start, int end);

	/**
	 * Returns an ordered range of all the book details where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BookDetailModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of book details
	 * @param end the upper bound of the range of book details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching book details
	 */
	public java.util.List<BookDetail> findByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BookDetail>
			orderByComparator);

	/**
	 * Returns an ordered range of all the book details where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BookDetailModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of book details
	 * @param end the upper bound of the range of book details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching book details
	 */
	public java.util.List<BookDetail> findByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BookDetail>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first book detail in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching book detail
	 * @throws NoSuchBookDetailException if a matching book detail could not be found
	 */
	public BookDetail findByStatus_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<BookDetail>
				orderByComparator)
		throws NoSuchBookDetailException;

	/**
	 * Returns the first book detail in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching book detail, or <code>null</code> if a matching book detail could not be found
	 */
	public BookDetail fetchByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<BookDetail>
			orderByComparator);

	/**
	 * Returns the last book detail in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching book detail
	 * @throws NoSuchBookDetailException if a matching book detail could not be found
	 */
	public BookDetail findByStatus_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<BookDetail>
				orderByComparator)
		throws NoSuchBookDetailException;

	/**
	 * Returns the last book detail in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching book detail, or <code>null</code> if a matching book detail could not be found
	 */
	public BookDetail fetchByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<BookDetail>
			orderByComparator);

	/**
	 * Returns the book details before and after the current book detail in the ordered set where status = &#63;.
	 *
	 * @param bookId the primary key of the current book detail
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next book detail
	 * @throws NoSuchBookDetailException if a book detail with the primary key could not be found
	 */
	public BookDetail[] findByStatus_PrevAndNext(
			long bookId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BookDetail>
				orderByComparator)
		throws NoSuchBookDetailException;

	/**
	 * Removes all the book details where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeByStatus(int status);

	/**
	 * Returns the number of book details where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching book details
	 */
	public int countByStatus(int status);

	/**
	 * Caches the book detail in the entity cache if it is enabled.
	 *
	 * @param bookDetail the book detail
	 */
	public void cacheResult(BookDetail bookDetail);

	/**
	 * Caches the book details in the entity cache if it is enabled.
	 *
	 * @param bookDetails the book details
	 */
	public void cacheResult(java.util.List<BookDetail> bookDetails);

	/**
	 * Creates a new book detail with the primary key. Does not add the book detail to the database.
	 *
	 * @param bookId the primary key for the new book detail
	 * @return the new book detail
	 */
	public BookDetail create(long bookId);

	/**
	 * Removes the book detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bookId the primary key of the book detail
	 * @return the book detail that was removed
	 * @throws NoSuchBookDetailException if a book detail with the primary key could not be found
	 */
	public BookDetail remove(long bookId) throws NoSuchBookDetailException;

	public BookDetail updateImpl(BookDetail bookDetail);

	/**
	 * Returns the book detail with the primary key or throws a <code>NoSuchBookDetailException</code> if it could not be found.
	 *
	 * @param bookId the primary key of the book detail
	 * @return the book detail
	 * @throws NoSuchBookDetailException if a book detail with the primary key could not be found
	 */
	public BookDetail findByPrimaryKey(long bookId)
		throws NoSuchBookDetailException;

	/**
	 * Returns the book detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bookId the primary key of the book detail
	 * @return the book detail, or <code>null</code> if a book detail with the primary key could not be found
	 */
	public BookDetail fetchByPrimaryKey(long bookId);

	/**
	 * Returns all the book details.
	 *
	 * @return the book details
	 */
	public java.util.List<BookDetail> findAll();

	/**
	 * Returns a range of all the book details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BookDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of book details
	 * @param end the upper bound of the range of book details (not inclusive)
	 * @return the range of book details
	 */
	public java.util.List<BookDetail> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the book details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BookDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of book details
	 * @param end the upper bound of the range of book details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of book details
	 */
	public java.util.List<BookDetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BookDetail>
			orderByComparator);

	/**
	 * Returns an ordered range of all the book details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BookDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of book details
	 * @param end the upper bound of the range of book details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of book details
	 */
	public java.util.List<BookDetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BookDetail>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the book details from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of book details.
	 *
	 * @return the number of book details
	 */
	public int countAll();

}