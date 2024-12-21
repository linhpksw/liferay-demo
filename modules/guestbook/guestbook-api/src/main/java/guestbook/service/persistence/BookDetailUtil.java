/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package guestbook.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import guestbook.model.BookDetail;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the book detail service. This utility wraps <code>guestbook.service.persistence.impl.BookDetailPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author linhpksw
 * @see BookDetailPersistence
 * @generated
 */
public class BookDetailUtil {

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
	public static void clearCache(BookDetail bookDetail) {
		getPersistence().clearCache(bookDetail);
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
	public static Map<Serializable, BookDetail> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<BookDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<BookDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<BookDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<BookDetail> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static BookDetail update(BookDetail bookDetail) {
		return getPersistence().update(bookDetail);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static BookDetail update(
		BookDetail bookDetail, ServiceContext serviceContext) {

		return getPersistence().update(bookDetail, serviceContext);
	}

	/**
	 * Returns all the book details where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching book details
	 */
	public static List<BookDetail> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<BookDetail> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<BookDetail> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<BookDetail> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<BookDetail> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<BookDetail> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first book detail in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching book detail
	 * @throws NoSuchBookDetailException if a matching book detail could not be found
	 */
	public static BookDetail findByUuid_First(
			String uuid, OrderByComparator<BookDetail> orderByComparator)
		throws guestbook.exception.NoSuchBookDetailException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first book detail in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching book detail, or <code>null</code> if a matching book detail could not be found
	 */
	public static BookDetail fetchByUuid_First(
		String uuid, OrderByComparator<BookDetail> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last book detail in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching book detail
	 * @throws NoSuchBookDetailException if a matching book detail could not be found
	 */
	public static BookDetail findByUuid_Last(
			String uuid, OrderByComparator<BookDetail> orderByComparator)
		throws guestbook.exception.NoSuchBookDetailException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last book detail in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching book detail, or <code>null</code> if a matching book detail could not be found
	 */
	public static BookDetail fetchByUuid_Last(
		String uuid, OrderByComparator<BookDetail> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the book details before and after the current book detail in the ordered set where uuid = &#63;.
	 *
	 * @param bookId the primary key of the current book detail
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next book detail
	 * @throws NoSuchBookDetailException if a book detail with the primary key could not be found
	 */
	public static BookDetail[] findByUuid_PrevAndNext(
			long bookId, String uuid,
			OrderByComparator<BookDetail> orderByComparator)
		throws guestbook.exception.NoSuchBookDetailException {

		return getPersistence().findByUuid_PrevAndNext(
			bookId, uuid, orderByComparator);
	}

	/**
	 * Removes all the book details where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of book details where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching book details
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the book detail where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchBookDetailException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching book detail
	 * @throws NoSuchBookDetailException if a matching book detail could not be found
	 */
	public static BookDetail findByUUID_G(String uuid, long groupId)
		throws guestbook.exception.NoSuchBookDetailException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the book detail where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching book detail, or <code>null</code> if a matching book detail could not be found
	 */
	public static BookDetail fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the book detail where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching book detail, or <code>null</code> if a matching book detail could not be found
	 */
	public static BookDetail fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the book detail where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the book detail that was removed
	 */
	public static BookDetail removeByUUID_G(String uuid, long groupId)
		throws guestbook.exception.NoSuchBookDetailException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of book details where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching book details
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the book details where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching book details
	 */
	public static List<BookDetail> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<BookDetail> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<BookDetail> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<BookDetail> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<BookDetail> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<BookDetail> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first book detail in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching book detail
	 * @throws NoSuchBookDetailException if a matching book detail could not be found
	 */
	public static BookDetail findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<BookDetail> orderByComparator)
		throws guestbook.exception.NoSuchBookDetailException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first book detail in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching book detail, or <code>null</code> if a matching book detail could not be found
	 */
	public static BookDetail fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<BookDetail> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last book detail in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching book detail
	 * @throws NoSuchBookDetailException if a matching book detail could not be found
	 */
	public static BookDetail findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<BookDetail> orderByComparator)
		throws guestbook.exception.NoSuchBookDetailException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last book detail in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching book detail, or <code>null</code> if a matching book detail could not be found
	 */
	public static BookDetail fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<BookDetail> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

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
	public static BookDetail[] findByUuid_C_PrevAndNext(
			long bookId, String uuid, long companyId,
			OrderByComparator<BookDetail> orderByComparator)
		throws guestbook.exception.NoSuchBookDetailException {

		return getPersistence().findByUuid_C_PrevAndNext(
			bookId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the book details where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of book details where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching book details
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the book details where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching book details
	 */
	public static List<BookDetail> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

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
	public static List<BookDetail> findByGroupId(
		long groupId, int start, int end) {

		return getPersistence().findByGroupId(groupId, start, end);
	}

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
	public static List<BookDetail> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<BookDetail> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

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
	public static List<BookDetail> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<BookDetail> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first book detail in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching book detail
	 * @throws NoSuchBookDetailException if a matching book detail could not be found
	 */
	public static BookDetail findByGroupId_First(
			long groupId, OrderByComparator<BookDetail> orderByComparator)
		throws guestbook.exception.NoSuchBookDetailException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first book detail in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching book detail, or <code>null</code> if a matching book detail could not be found
	 */
	public static BookDetail fetchByGroupId_First(
		long groupId, OrderByComparator<BookDetail> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last book detail in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching book detail
	 * @throws NoSuchBookDetailException if a matching book detail could not be found
	 */
	public static BookDetail findByGroupId_Last(
			long groupId, OrderByComparator<BookDetail> orderByComparator)
		throws guestbook.exception.NoSuchBookDetailException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last book detail in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching book detail, or <code>null</code> if a matching book detail could not be found
	 */
	public static BookDetail fetchByGroupId_Last(
		long groupId, OrderByComparator<BookDetail> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the book details before and after the current book detail in the ordered set where groupId = &#63;.
	 *
	 * @param bookId the primary key of the current book detail
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next book detail
	 * @throws NoSuchBookDetailException if a book detail with the primary key could not be found
	 */
	public static BookDetail[] findByGroupId_PrevAndNext(
			long bookId, long groupId,
			OrderByComparator<BookDetail> orderByComparator)
		throws guestbook.exception.NoSuchBookDetailException {

		return getPersistence().findByGroupId_PrevAndNext(
			bookId, groupId, orderByComparator);
	}

	/**
	 * Removes all the book details where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of book details where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching book details
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Returns all the book details where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching book details
	 */
	public static List<BookDetail> findByStatus(int status) {
		return getPersistence().findByStatus(status);
	}

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
	public static List<BookDetail> findByStatus(
		int status, int start, int end) {

		return getPersistence().findByStatus(status, start, end);
	}

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
	public static List<BookDetail> findByStatus(
		int status, int start, int end,
		OrderByComparator<BookDetail> orderByComparator) {

		return getPersistence().findByStatus(
			status, start, end, orderByComparator);
	}

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
	public static List<BookDetail> findByStatus(
		int status, int start, int end,
		OrderByComparator<BookDetail> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByStatus(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first book detail in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching book detail
	 * @throws NoSuchBookDetailException if a matching book detail could not be found
	 */
	public static BookDetail findByStatus_First(
			int status, OrderByComparator<BookDetail> orderByComparator)
		throws guestbook.exception.NoSuchBookDetailException {

		return getPersistence().findByStatus_First(status, orderByComparator);
	}

	/**
	 * Returns the first book detail in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching book detail, or <code>null</code> if a matching book detail could not be found
	 */
	public static BookDetail fetchByStatus_First(
		int status, OrderByComparator<BookDetail> orderByComparator) {

		return getPersistence().fetchByStatus_First(status, orderByComparator);
	}

	/**
	 * Returns the last book detail in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching book detail
	 * @throws NoSuchBookDetailException if a matching book detail could not be found
	 */
	public static BookDetail findByStatus_Last(
			int status, OrderByComparator<BookDetail> orderByComparator)
		throws guestbook.exception.NoSuchBookDetailException {

		return getPersistence().findByStatus_Last(status, orderByComparator);
	}

	/**
	 * Returns the last book detail in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching book detail, or <code>null</code> if a matching book detail could not be found
	 */
	public static BookDetail fetchByStatus_Last(
		int status, OrderByComparator<BookDetail> orderByComparator) {

		return getPersistence().fetchByStatus_Last(status, orderByComparator);
	}

	/**
	 * Returns the book details before and after the current book detail in the ordered set where status = &#63;.
	 *
	 * @param bookId the primary key of the current book detail
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next book detail
	 * @throws NoSuchBookDetailException if a book detail with the primary key could not be found
	 */
	public static BookDetail[] findByStatus_PrevAndNext(
			long bookId, int status,
			OrderByComparator<BookDetail> orderByComparator)
		throws guestbook.exception.NoSuchBookDetailException {

		return getPersistence().findByStatus_PrevAndNext(
			bookId, status, orderByComparator);
	}

	/**
	 * Removes all the book details where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeByStatus(int status) {
		getPersistence().removeByStatus(status);
	}

	/**
	 * Returns the number of book details where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching book details
	 */
	public static int countByStatus(int status) {
		return getPersistence().countByStatus(status);
	}

	/**
	 * Caches the book detail in the entity cache if it is enabled.
	 *
	 * @param bookDetail the book detail
	 */
	public static void cacheResult(BookDetail bookDetail) {
		getPersistence().cacheResult(bookDetail);
	}

	/**
	 * Caches the book details in the entity cache if it is enabled.
	 *
	 * @param bookDetails the book details
	 */
	public static void cacheResult(List<BookDetail> bookDetails) {
		getPersistence().cacheResult(bookDetails);
	}

	/**
	 * Creates a new book detail with the primary key. Does not add the book detail to the database.
	 *
	 * @param bookId the primary key for the new book detail
	 * @return the new book detail
	 */
	public static BookDetail create(long bookId) {
		return getPersistence().create(bookId);
	}

	/**
	 * Removes the book detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bookId the primary key of the book detail
	 * @return the book detail that was removed
	 * @throws NoSuchBookDetailException if a book detail with the primary key could not be found
	 */
	public static BookDetail remove(long bookId)
		throws guestbook.exception.NoSuchBookDetailException {

		return getPersistence().remove(bookId);
	}

	public static BookDetail updateImpl(BookDetail bookDetail) {
		return getPersistence().updateImpl(bookDetail);
	}

	/**
	 * Returns the book detail with the primary key or throws a <code>NoSuchBookDetailException</code> if it could not be found.
	 *
	 * @param bookId the primary key of the book detail
	 * @return the book detail
	 * @throws NoSuchBookDetailException if a book detail with the primary key could not be found
	 */
	public static BookDetail findByPrimaryKey(long bookId)
		throws guestbook.exception.NoSuchBookDetailException {

		return getPersistence().findByPrimaryKey(bookId);
	}

	/**
	 * Returns the book detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bookId the primary key of the book detail
	 * @return the book detail, or <code>null</code> if a book detail with the primary key could not be found
	 */
	public static BookDetail fetchByPrimaryKey(long bookId) {
		return getPersistence().fetchByPrimaryKey(bookId);
	}

	/**
	 * Returns all the book details.
	 *
	 * @return the book details
	 */
	public static List<BookDetail> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<BookDetail> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<BookDetail> findAll(
		int start, int end, OrderByComparator<BookDetail> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<BookDetail> findAll(
		int start, int end, OrderByComparator<BookDetail> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the book details from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of book details.
	 *
	 * @return the number of book details
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static BookDetailPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(BookDetailPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile BookDetailPersistence _persistence;

}