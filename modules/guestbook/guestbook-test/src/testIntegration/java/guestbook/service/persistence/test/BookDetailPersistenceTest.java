/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package guestbook.service.persistence.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.test.ReflectionTestUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.util.IntegerWrapper;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.kernel.util.Time;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.test.rule.PersistenceTestRule;
import com.liferay.portal.test.rule.TransactionalTestRule;

import guestbook.exception.NoSuchBookDetailException;

import guestbook.model.BookDetail;

import guestbook.service.BookDetailLocalServiceUtil;
import guestbook.service.persistence.BookDetailPersistence;
import guestbook.service.persistence.BookDetailUtil;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @generated
 */
@RunWith(Arquillian.class)
public class BookDetailPersistenceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(
				Propagation.REQUIRED, "guestbook.service"));

	@Before
	public void setUp() {
		_persistence = BookDetailUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<BookDetail> iterator = _bookDetails.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		BookDetail bookDetail = _persistence.create(pk);

		Assert.assertNotNull(bookDetail);

		Assert.assertEquals(bookDetail.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		BookDetail newBookDetail = addBookDetail();

		_persistence.remove(newBookDetail);

		BookDetail existingBookDetail = _persistence.fetchByPrimaryKey(
			newBookDetail.getPrimaryKey());

		Assert.assertNull(existingBookDetail);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addBookDetail();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		BookDetail newBookDetail = _persistence.create(pk);

		newBookDetail.setMvccVersion(RandomTestUtil.nextLong());

		newBookDetail.setUuid(RandomTestUtil.randomString());

		newBookDetail.setTitle(RandomTestUtil.randomString());

		newBookDetail.setAuthor(RandomTestUtil.randomString());

		newBookDetail.setDescription(RandomTestUtil.randomString());

		newBookDetail.setIsbn(RandomTestUtil.randomString());

		newBookDetail.setStatus(RandomTestUtil.nextInt());

		newBookDetail.setGroupId(RandomTestUtil.nextLong());

		newBookDetail.setCompanyId(RandomTestUtil.nextLong());

		newBookDetail.setUserId(RandomTestUtil.nextLong());

		newBookDetail.setUserName(RandomTestUtil.randomString());

		newBookDetail.setCreateDate(RandomTestUtil.nextDate());

		newBookDetail.setModifiedDate(RandomTestUtil.nextDate());

		_bookDetails.add(_persistence.update(newBookDetail));

		BookDetail existingBookDetail = _persistence.findByPrimaryKey(
			newBookDetail.getPrimaryKey());

		Assert.assertEquals(
			existingBookDetail.getMvccVersion(),
			newBookDetail.getMvccVersion());
		Assert.assertEquals(
			existingBookDetail.getUuid(), newBookDetail.getUuid());
		Assert.assertEquals(
			existingBookDetail.getBookId(), newBookDetail.getBookId());
		Assert.assertEquals(
			existingBookDetail.getTitle(), newBookDetail.getTitle());
		Assert.assertEquals(
			existingBookDetail.getAuthor(), newBookDetail.getAuthor());
		Assert.assertEquals(
			existingBookDetail.getDescription(),
			newBookDetail.getDescription());
		Assert.assertEquals(
			existingBookDetail.getIsbn(), newBookDetail.getIsbn());
		Assert.assertEquals(
			existingBookDetail.getStatus(), newBookDetail.getStatus());
		Assert.assertEquals(
			existingBookDetail.getGroupId(), newBookDetail.getGroupId());
		Assert.assertEquals(
			existingBookDetail.getCompanyId(), newBookDetail.getCompanyId());
		Assert.assertEquals(
			existingBookDetail.getUserId(), newBookDetail.getUserId());
		Assert.assertEquals(
			existingBookDetail.getUserName(), newBookDetail.getUserName());
		Assert.assertEquals(
			Time.getShortTimestamp(existingBookDetail.getCreateDate()),
			Time.getShortTimestamp(newBookDetail.getCreateDate()));
		Assert.assertEquals(
			Time.getShortTimestamp(existingBookDetail.getModifiedDate()),
			Time.getShortTimestamp(newBookDetail.getModifiedDate()));
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid("");

		_persistence.countByUuid("null");

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testCountByUUID_G() throws Exception {
		_persistence.countByUUID_G("", RandomTestUtil.nextLong());

		_persistence.countByUUID_G("null", 0L);

		_persistence.countByUUID_G((String)null, 0L);
	}

	@Test
	public void testCountByUuid_C() throws Exception {
		_persistence.countByUuid_C("", RandomTestUtil.nextLong());

		_persistence.countByUuid_C("null", 0L);

		_persistence.countByUuid_C((String)null, 0L);
	}

	@Test
	public void testCountByGroupId() throws Exception {
		_persistence.countByGroupId(RandomTestUtil.nextLong());

		_persistence.countByGroupId(0L);
	}

	@Test
	public void testCountByStatus() throws Exception {
		_persistence.countByStatus(RandomTestUtil.nextInt());

		_persistence.countByStatus(0);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		BookDetail newBookDetail = addBookDetail();

		BookDetail existingBookDetail = _persistence.findByPrimaryKey(
			newBookDetail.getPrimaryKey());

		Assert.assertEquals(existingBookDetail, newBookDetail);
	}

	@Test(expected = NoSuchBookDetailException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<BookDetail> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GB_BookDetail", "mvccVersion", true, "uuid", true, "bookId", true,
			"title", true, "author", true, "description", true, "isbn", true,
			"status", true, "groupId", true, "companyId", true, "userId", true,
			"userName", true, "createDate", true, "modifiedDate", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		BookDetail newBookDetail = addBookDetail();

		BookDetail existingBookDetail = _persistence.fetchByPrimaryKey(
			newBookDetail.getPrimaryKey());

		Assert.assertEquals(existingBookDetail, newBookDetail);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		BookDetail missingBookDetail = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingBookDetail);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		BookDetail newBookDetail1 = addBookDetail();
		BookDetail newBookDetail2 = addBookDetail();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newBookDetail1.getPrimaryKey());
		primaryKeys.add(newBookDetail2.getPrimaryKey());

		Map<Serializable, BookDetail> bookDetails =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, bookDetails.size());
		Assert.assertEquals(
			newBookDetail1, bookDetails.get(newBookDetail1.getPrimaryKey()));
		Assert.assertEquals(
			newBookDetail2, bookDetails.get(newBookDetail2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, BookDetail> bookDetails =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(bookDetails.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		BookDetail newBookDetail = addBookDetail();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newBookDetail.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, BookDetail> bookDetails =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, bookDetails.size());
		Assert.assertEquals(
			newBookDetail, bookDetails.get(newBookDetail.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, BookDetail> bookDetails =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(bookDetails.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		BookDetail newBookDetail = addBookDetail();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newBookDetail.getPrimaryKey());

		Map<Serializable, BookDetail> bookDetails =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, bookDetails.size());
		Assert.assertEquals(
			newBookDetail, bookDetails.get(newBookDetail.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			BookDetailLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<BookDetail>() {

				@Override
				public void performAction(BookDetail bookDetail) {
					Assert.assertNotNull(bookDetail);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		BookDetail newBookDetail = addBookDetail();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			BookDetail.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("bookId", newBookDetail.getBookId()));

		List<BookDetail> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		BookDetail existingBookDetail = result.get(0);

		Assert.assertEquals(existingBookDetail, newBookDetail);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			BookDetail.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("bookId", RandomTestUtil.nextLong()));

		List<BookDetail> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		BookDetail newBookDetail = addBookDetail();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			BookDetail.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("bookId"));

		Object newBookId = newBookDetail.getBookId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in("bookId", new Object[] {newBookId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingBookId = result.get(0);

		Assert.assertEquals(existingBookId, newBookId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			BookDetail.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("bookId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"bookId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testResetOriginalValues() throws Exception {
		BookDetail newBookDetail = addBookDetail();

		_persistence.clearCache();

		_assertOriginalValues(
			_persistence.findByPrimaryKey(newBookDetail.getPrimaryKey()));
	}

	@Test
	public void testResetOriginalValuesWithDynamicQueryLoadFromDatabase()
		throws Exception {

		_testResetOriginalValuesWithDynamicQuery(true);
	}

	@Test
	public void testResetOriginalValuesWithDynamicQueryLoadFromSession()
		throws Exception {

		_testResetOriginalValuesWithDynamicQuery(false);
	}

	private void _testResetOriginalValuesWithDynamicQuery(boolean clearSession)
		throws Exception {

		BookDetail newBookDetail = addBookDetail();

		if (clearSession) {
			Session session = _persistence.openSession();

			session.flush();

			session.clear();
		}

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			BookDetail.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("bookId", newBookDetail.getBookId()));

		List<BookDetail> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		_assertOriginalValues(result.get(0));
	}

	private void _assertOriginalValues(BookDetail bookDetail) {
		Assert.assertEquals(
			bookDetail.getUuid(),
			ReflectionTestUtil.invoke(
				bookDetail, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "uuid_"));
		Assert.assertEquals(
			Long.valueOf(bookDetail.getGroupId()),
			ReflectionTestUtil.<Long>invoke(
				bookDetail, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "groupId"));
	}

	protected BookDetail addBookDetail() throws Exception {
		long pk = RandomTestUtil.nextLong();

		BookDetail bookDetail = _persistence.create(pk);

		bookDetail.setMvccVersion(RandomTestUtil.nextLong());

		bookDetail.setUuid(RandomTestUtil.randomString());

		bookDetail.setTitle(RandomTestUtil.randomString());

		bookDetail.setAuthor(RandomTestUtil.randomString());

		bookDetail.setDescription(RandomTestUtil.randomString());

		bookDetail.setIsbn(RandomTestUtil.randomString());

		bookDetail.setStatus(RandomTestUtil.nextInt());

		bookDetail.setGroupId(RandomTestUtil.nextLong());

		bookDetail.setCompanyId(RandomTestUtil.nextLong());

		bookDetail.setUserId(RandomTestUtil.nextLong());

		bookDetail.setUserName(RandomTestUtil.randomString());

		bookDetail.setCreateDate(RandomTestUtil.nextDate());

		bookDetail.setModifiedDate(RandomTestUtil.nextDate());

		_bookDetails.add(_persistence.update(bookDetail));

		return bookDetail;
	}

	private List<BookDetail> _bookDetails = new ArrayList<BookDetail>();
	private BookDetailPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}