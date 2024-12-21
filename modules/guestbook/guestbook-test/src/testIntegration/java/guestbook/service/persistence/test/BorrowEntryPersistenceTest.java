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

import guestbook.exception.NoSuchBorrowEntryException;

import guestbook.model.BorrowEntry;

import guestbook.service.BorrowEntryLocalServiceUtil;
import guestbook.service.persistence.BorrowEntryPersistence;
import guestbook.service.persistence.BorrowEntryUtil;

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
public class BorrowEntryPersistenceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(
				Propagation.REQUIRED, "guestbook.service"));

	@Before
	public void setUp() {
		_persistence = BorrowEntryUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<BorrowEntry> iterator = _borrowEntries.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		BorrowEntry borrowEntry = _persistence.create(pk);

		Assert.assertNotNull(borrowEntry);

		Assert.assertEquals(borrowEntry.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		BorrowEntry newBorrowEntry = addBorrowEntry();

		_persistence.remove(newBorrowEntry);

		BorrowEntry existingBorrowEntry = _persistence.fetchByPrimaryKey(
			newBorrowEntry.getPrimaryKey());

		Assert.assertNull(existingBorrowEntry);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addBorrowEntry();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		BorrowEntry newBorrowEntry = _persistence.create(pk);

		newBorrowEntry.setMvccVersion(RandomTestUtil.nextLong());

		newBorrowEntry.setUuid(RandomTestUtil.randomString());

		newBorrowEntry.setBookId(RandomTestUtil.nextLong());

		newBorrowEntry.setUserId(RandomTestUtil.nextLong());

		newBorrowEntry.setUserName(RandomTestUtil.randomString());

		newBorrowEntry.setBorrowDate(RandomTestUtil.nextDate());

		newBorrowEntry.setExpectedReturnDate(RandomTestUtil.nextDate());

		newBorrowEntry.setActualReturnDate(RandomTestUtil.nextDate());

		newBorrowEntry.setGroupId(RandomTestUtil.nextLong());

		newBorrowEntry.setCompanyId(RandomTestUtil.nextLong());

		newBorrowEntry.setCreateDate(RandomTestUtil.nextDate());

		newBorrowEntry.setModifiedDate(RandomTestUtil.nextDate());

		newBorrowEntry.setStatus(RandomTestUtil.nextInt());

		newBorrowEntry.setStatusByUserId(RandomTestUtil.nextLong());

		newBorrowEntry.setStatusByUserName(RandomTestUtil.randomString());

		newBorrowEntry.setStatusDate(RandomTestUtil.nextDate());

		_borrowEntries.add(_persistence.update(newBorrowEntry));

		BorrowEntry existingBorrowEntry = _persistence.findByPrimaryKey(
			newBorrowEntry.getPrimaryKey());

		Assert.assertEquals(
			existingBorrowEntry.getMvccVersion(),
			newBorrowEntry.getMvccVersion());
		Assert.assertEquals(
			existingBorrowEntry.getUuid(), newBorrowEntry.getUuid());
		Assert.assertEquals(
			existingBorrowEntry.getEntryId(), newBorrowEntry.getEntryId());
		Assert.assertEquals(
			existingBorrowEntry.getBookId(), newBorrowEntry.getBookId());
		Assert.assertEquals(
			existingBorrowEntry.getUserId(), newBorrowEntry.getUserId());
		Assert.assertEquals(
			existingBorrowEntry.getUserName(), newBorrowEntry.getUserName());
		Assert.assertEquals(
			Time.getShortTimestamp(existingBorrowEntry.getBorrowDate()),
			Time.getShortTimestamp(newBorrowEntry.getBorrowDate()));
		Assert.assertEquals(
			Time.getShortTimestamp(existingBorrowEntry.getExpectedReturnDate()),
			Time.getShortTimestamp(newBorrowEntry.getExpectedReturnDate()));
		Assert.assertEquals(
			Time.getShortTimestamp(existingBorrowEntry.getActualReturnDate()),
			Time.getShortTimestamp(newBorrowEntry.getActualReturnDate()));
		Assert.assertEquals(
			existingBorrowEntry.getGroupId(), newBorrowEntry.getGroupId());
		Assert.assertEquals(
			existingBorrowEntry.getCompanyId(), newBorrowEntry.getCompanyId());
		Assert.assertEquals(
			Time.getShortTimestamp(existingBorrowEntry.getCreateDate()),
			Time.getShortTimestamp(newBorrowEntry.getCreateDate()));
		Assert.assertEquals(
			Time.getShortTimestamp(existingBorrowEntry.getModifiedDate()),
			Time.getShortTimestamp(newBorrowEntry.getModifiedDate()));
		Assert.assertEquals(
			existingBorrowEntry.getStatus(), newBorrowEntry.getStatus());
		Assert.assertEquals(
			existingBorrowEntry.getStatusByUserId(),
			newBorrowEntry.getStatusByUserId());
		Assert.assertEquals(
			existingBorrowEntry.getStatusByUserName(),
			newBorrowEntry.getStatusByUserName());
		Assert.assertEquals(
			Time.getShortTimestamp(existingBorrowEntry.getStatusDate()),
			Time.getShortTimestamp(newBorrowEntry.getStatusDate()));
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
	public void testCountByG_S() throws Exception {
		_persistence.countByG_S(
			RandomTestUtil.nextLong(), RandomTestUtil.nextInt());

		_persistence.countByG_S(0L, 0);
	}

	@Test
	public void testCountByGroupId() throws Exception {
		_persistence.countByGroupId(RandomTestUtil.nextLong());

		_persistence.countByGroupId(0L);
	}

	@Test
	public void testCountByB_S() throws Exception {
		_persistence.countByB_S(
			RandomTestUtil.nextLong(), RandomTestUtil.nextInt());

		_persistence.countByB_S(0L, 0);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		BorrowEntry newBorrowEntry = addBorrowEntry();

		BorrowEntry existingBorrowEntry = _persistence.findByPrimaryKey(
			newBorrowEntry.getPrimaryKey());

		Assert.assertEquals(existingBorrowEntry, newBorrowEntry);
	}

	@Test(expected = NoSuchBorrowEntryException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<BorrowEntry> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GB_BorrowEntry", "mvccVersion", true, "uuid", true, "entryId",
			true, "bookId", true, "userId", true, "userName", true,
			"borrowDate", true, "expectedReturnDate", true, "actualReturnDate",
			true, "groupId", true, "companyId", true, "createDate", true,
			"modifiedDate", true, "status", true, "statusByUserId", true,
			"statusByUserName", true, "statusDate", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		BorrowEntry newBorrowEntry = addBorrowEntry();

		BorrowEntry existingBorrowEntry = _persistence.fetchByPrimaryKey(
			newBorrowEntry.getPrimaryKey());

		Assert.assertEquals(existingBorrowEntry, newBorrowEntry);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		BorrowEntry missingBorrowEntry = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingBorrowEntry);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		BorrowEntry newBorrowEntry1 = addBorrowEntry();
		BorrowEntry newBorrowEntry2 = addBorrowEntry();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newBorrowEntry1.getPrimaryKey());
		primaryKeys.add(newBorrowEntry2.getPrimaryKey());

		Map<Serializable, BorrowEntry> borrowEntries =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, borrowEntries.size());
		Assert.assertEquals(
			newBorrowEntry1,
			borrowEntries.get(newBorrowEntry1.getPrimaryKey()));
		Assert.assertEquals(
			newBorrowEntry2,
			borrowEntries.get(newBorrowEntry2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, BorrowEntry> borrowEntries =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(borrowEntries.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		BorrowEntry newBorrowEntry = addBorrowEntry();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newBorrowEntry.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, BorrowEntry> borrowEntries =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, borrowEntries.size());
		Assert.assertEquals(
			newBorrowEntry, borrowEntries.get(newBorrowEntry.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, BorrowEntry> borrowEntries =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(borrowEntries.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		BorrowEntry newBorrowEntry = addBorrowEntry();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newBorrowEntry.getPrimaryKey());

		Map<Serializable, BorrowEntry> borrowEntries =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, borrowEntries.size());
		Assert.assertEquals(
			newBorrowEntry, borrowEntries.get(newBorrowEntry.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			BorrowEntryLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<BorrowEntry>() {

				@Override
				public void performAction(BorrowEntry borrowEntry) {
					Assert.assertNotNull(borrowEntry);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		BorrowEntry newBorrowEntry = addBorrowEntry();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			BorrowEntry.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("entryId", newBorrowEntry.getEntryId()));

		List<BorrowEntry> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		BorrowEntry existingBorrowEntry = result.get(0);

		Assert.assertEquals(existingBorrowEntry, newBorrowEntry);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			BorrowEntry.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("entryId", RandomTestUtil.nextLong()));

		List<BorrowEntry> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		BorrowEntry newBorrowEntry = addBorrowEntry();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			BorrowEntry.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("entryId"));

		Object newEntryId = newBorrowEntry.getEntryId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in("entryId", new Object[] {newEntryId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingEntryId = result.get(0);

		Assert.assertEquals(existingEntryId, newEntryId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			BorrowEntry.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("entryId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"entryId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testResetOriginalValues() throws Exception {
		BorrowEntry newBorrowEntry = addBorrowEntry();

		_persistence.clearCache();

		_assertOriginalValues(
			_persistence.findByPrimaryKey(newBorrowEntry.getPrimaryKey()));
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

		BorrowEntry newBorrowEntry = addBorrowEntry();

		if (clearSession) {
			Session session = _persistence.openSession();

			session.flush();

			session.clear();
		}

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			BorrowEntry.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("entryId", newBorrowEntry.getEntryId()));

		List<BorrowEntry> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		_assertOriginalValues(result.get(0));
	}

	private void _assertOriginalValues(BorrowEntry borrowEntry) {
		Assert.assertEquals(
			borrowEntry.getUuid(),
			ReflectionTestUtil.invoke(
				borrowEntry, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "uuid_"));
		Assert.assertEquals(
			Long.valueOf(borrowEntry.getGroupId()),
			ReflectionTestUtil.<Long>invoke(
				borrowEntry, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "groupId"));
	}

	protected BorrowEntry addBorrowEntry() throws Exception {
		long pk = RandomTestUtil.nextLong();

		BorrowEntry borrowEntry = _persistence.create(pk);

		borrowEntry.setMvccVersion(RandomTestUtil.nextLong());

		borrowEntry.setUuid(RandomTestUtil.randomString());

		borrowEntry.setBookId(RandomTestUtil.nextLong());

		borrowEntry.setUserId(RandomTestUtil.nextLong());

		borrowEntry.setUserName(RandomTestUtil.randomString());

		borrowEntry.setBorrowDate(RandomTestUtil.nextDate());

		borrowEntry.setExpectedReturnDate(RandomTestUtil.nextDate());

		borrowEntry.setActualReturnDate(RandomTestUtil.nextDate());

		borrowEntry.setGroupId(RandomTestUtil.nextLong());

		borrowEntry.setCompanyId(RandomTestUtil.nextLong());

		borrowEntry.setCreateDate(RandomTestUtil.nextDate());

		borrowEntry.setModifiedDate(RandomTestUtil.nextDate());

		borrowEntry.setStatus(RandomTestUtil.nextInt());

		borrowEntry.setStatusByUserId(RandomTestUtil.nextLong());

		borrowEntry.setStatusByUserName(RandomTestUtil.randomString());

		borrowEntry.setStatusDate(RandomTestUtil.nextDate());

		_borrowEntries.add(_persistence.update(borrowEntry));

		return borrowEntry;
	}

	private List<BorrowEntry> _borrowEntries = new ArrayList<BorrowEntry>();
	private BorrowEntryPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}