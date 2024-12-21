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

import guestbook.exception.NoSuchGuestbookEntryException;

import guestbook.model.GuestbookEntry;

import guestbook.service.GuestbookEntryLocalServiceUtil;
import guestbook.service.persistence.GuestbookEntryPersistence;
import guestbook.service.persistence.GuestbookEntryUtil;

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
public class GuestbookEntryPersistenceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(
				Propagation.REQUIRED, "guestbook.service"));

	@Before
	public void setUp() {
		_persistence = GuestbookEntryUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<GuestbookEntry> iterator = _guestbookEntries.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		GuestbookEntry guestbookEntry = _persistence.create(pk);

		Assert.assertNotNull(guestbookEntry);

		Assert.assertEquals(guestbookEntry.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		GuestbookEntry newGuestbookEntry = addGuestbookEntry();

		_persistence.remove(newGuestbookEntry);

		GuestbookEntry existingGuestbookEntry = _persistence.fetchByPrimaryKey(
			newGuestbookEntry.getPrimaryKey());

		Assert.assertNull(existingGuestbookEntry);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addGuestbookEntry();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		GuestbookEntry newGuestbookEntry = _persistence.create(pk);

		newGuestbookEntry.setMvccVersion(RandomTestUtil.nextLong());

		newGuestbookEntry.setUuid(RandomTestUtil.randomString());

		newGuestbookEntry.setName(RandomTestUtil.randomString());

		newGuestbookEntry.setEmail(RandomTestUtil.randomString());

		newGuestbookEntry.setMessage(RandomTestUtil.randomString());

		newGuestbookEntry.setGuestbookId(RandomTestUtil.nextLong());

		newGuestbookEntry.setGroupId(RandomTestUtil.nextLong());

		newGuestbookEntry.setCompanyId(RandomTestUtil.nextLong());

		newGuestbookEntry.setUserId(RandomTestUtil.nextLong());

		newGuestbookEntry.setUserName(RandomTestUtil.randomString());

		newGuestbookEntry.setCreateDate(RandomTestUtil.nextDate());

		newGuestbookEntry.setModifiedDate(RandomTestUtil.nextDate());

		newGuestbookEntry.setStatus(RandomTestUtil.nextInt());

		newGuestbookEntry.setStatusByUserId(RandomTestUtil.nextLong());

		newGuestbookEntry.setStatusByUserName(RandomTestUtil.randomString());

		newGuestbookEntry.setStatusDate(RandomTestUtil.nextDate());

		_guestbookEntries.add(_persistence.update(newGuestbookEntry));

		GuestbookEntry existingGuestbookEntry = _persistence.findByPrimaryKey(
			newGuestbookEntry.getPrimaryKey());

		Assert.assertEquals(
			existingGuestbookEntry.getMvccVersion(),
			newGuestbookEntry.getMvccVersion());
		Assert.assertEquals(
			existingGuestbookEntry.getUuid(), newGuestbookEntry.getUuid());
		Assert.assertEquals(
			existingGuestbookEntry.getEntryId(),
			newGuestbookEntry.getEntryId());
		Assert.assertEquals(
			existingGuestbookEntry.getName(), newGuestbookEntry.getName());
		Assert.assertEquals(
			existingGuestbookEntry.getEmail(), newGuestbookEntry.getEmail());
		Assert.assertEquals(
			existingGuestbookEntry.getMessage(),
			newGuestbookEntry.getMessage());
		Assert.assertEquals(
			existingGuestbookEntry.getGuestbookId(),
			newGuestbookEntry.getGuestbookId());
		Assert.assertEquals(
			existingGuestbookEntry.getGroupId(),
			newGuestbookEntry.getGroupId());
		Assert.assertEquals(
			existingGuestbookEntry.getCompanyId(),
			newGuestbookEntry.getCompanyId());
		Assert.assertEquals(
			existingGuestbookEntry.getUserId(), newGuestbookEntry.getUserId());
		Assert.assertEquals(
			existingGuestbookEntry.getUserName(),
			newGuestbookEntry.getUserName());
		Assert.assertEquals(
			Time.getShortTimestamp(existingGuestbookEntry.getCreateDate()),
			Time.getShortTimestamp(newGuestbookEntry.getCreateDate()));
		Assert.assertEquals(
			Time.getShortTimestamp(existingGuestbookEntry.getModifiedDate()),
			Time.getShortTimestamp(newGuestbookEntry.getModifiedDate()));
		Assert.assertEquals(
			existingGuestbookEntry.getStatus(), newGuestbookEntry.getStatus());
		Assert.assertEquals(
			existingGuestbookEntry.getStatusByUserId(),
			newGuestbookEntry.getStatusByUserId());
		Assert.assertEquals(
			existingGuestbookEntry.getStatusByUserName(),
			newGuestbookEntry.getStatusByUserName());
		Assert.assertEquals(
			Time.getShortTimestamp(existingGuestbookEntry.getStatusDate()),
			Time.getShortTimestamp(newGuestbookEntry.getStatusDate()));
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
	public void testCountByG_G() throws Exception {
		_persistence.countByG_G(
			RandomTestUtil.nextLong(), RandomTestUtil.nextLong());

		_persistence.countByG_G(0L, 0L);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		GuestbookEntry newGuestbookEntry = addGuestbookEntry();

		GuestbookEntry existingGuestbookEntry = _persistence.findByPrimaryKey(
			newGuestbookEntry.getPrimaryKey());

		Assert.assertEquals(existingGuestbookEntry, newGuestbookEntry);
	}

	@Test(expected = NoSuchGuestbookEntryException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<GuestbookEntry> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GB_GuestbookEntry", "mvccVersion", true, "uuid", true, "entryId",
			true, "name", true, "email", true, "message", true, "guestbookId",
			true, "groupId", true, "companyId", true, "userId", true,
			"userName", true, "createDate", true, "modifiedDate", true,
			"status", true, "statusByUserId", true, "statusByUserName", true,
			"statusDate", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		GuestbookEntry newGuestbookEntry = addGuestbookEntry();

		GuestbookEntry existingGuestbookEntry = _persistence.fetchByPrimaryKey(
			newGuestbookEntry.getPrimaryKey());

		Assert.assertEquals(existingGuestbookEntry, newGuestbookEntry);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		GuestbookEntry missingGuestbookEntry = _persistence.fetchByPrimaryKey(
			pk);

		Assert.assertNull(missingGuestbookEntry);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		GuestbookEntry newGuestbookEntry1 = addGuestbookEntry();
		GuestbookEntry newGuestbookEntry2 = addGuestbookEntry();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newGuestbookEntry1.getPrimaryKey());
		primaryKeys.add(newGuestbookEntry2.getPrimaryKey());

		Map<Serializable, GuestbookEntry> guestbookEntries =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, guestbookEntries.size());
		Assert.assertEquals(
			newGuestbookEntry1,
			guestbookEntries.get(newGuestbookEntry1.getPrimaryKey()));
		Assert.assertEquals(
			newGuestbookEntry2,
			guestbookEntries.get(newGuestbookEntry2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, GuestbookEntry> guestbookEntries =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(guestbookEntries.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		GuestbookEntry newGuestbookEntry = addGuestbookEntry();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newGuestbookEntry.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, GuestbookEntry> guestbookEntries =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, guestbookEntries.size());
		Assert.assertEquals(
			newGuestbookEntry,
			guestbookEntries.get(newGuestbookEntry.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, GuestbookEntry> guestbookEntries =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(guestbookEntries.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		GuestbookEntry newGuestbookEntry = addGuestbookEntry();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newGuestbookEntry.getPrimaryKey());

		Map<Serializable, GuestbookEntry> guestbookEntries =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, guestbookEntries.size());
		Assert.assertEquals(
			newGuestbookEntry,
			guestbookEntries.get(newGuestbookEntry.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			GuestbookEntryLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<GuestbookEntry>() {

				@Override
				public void performAction(GuestbookEntry guestbookEntry) {
					Assert.assertNotNull(guestbookEntry);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		GuestbookEntry newGuestbookEntry = addGuestbookEntry();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			GuestbookEntry.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"entryId", newGuestbookEntry.getEntryId()));

		List<GuestbookEntry> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		GuestbookEntry existingGuestbookEntry = result.get(0);

		Assert.assertEquals(existingGuestbookEntry, newGuestbookEntry);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			GuestbookEntry.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("entryId", RandomTestUtil.nextLong()));

		List<GuestbookEntry> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		GuestbookEntry newGuestbookEntry = addGuestbookEntry();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			GuestbookEntry.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("entryId"));

		Object newEntryId = newGuestbookEntry.getEntryId();

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
			GuestbookEntry.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("entryId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"entryId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testResetOriginalValues() throws Exception {
		GuestbookEntry newGuestbookEntry = addGuestbookEntry();

		_persistence.clearCache();

		_assertOriginalValues(
			_persistence.findByPrimaryKey(newGuestbookEntry.getPrimaryKey()));
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

		GuestbookEntry newGuestbookEntry = addGuestbookEntry();

		if (clearSession) {
			Session session = _persistence.openSession();

			session.flush();

			session.clear();
		}

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			GuestbookEntry.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"entryId", newGuestbookEntry.getEntryId()));

		List<GuestbookEntry> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		_assertOriginalValues(result.get(0));
	}

	private void _assertOriginalValues(GuestbookEntry guestbookEntry) {
		Assert.assertEquals(
			guestbookEntry.getUuid(),
			ReflectionTestUtil.invoke(
				guestbookEntry, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "uuid_"));
		Assert.assertEquals(
			Long.valueOf(guestbookEntry.getGroupId()),
			ReflectionTestUtil.<Long>invoke(
				guestbookEntry, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "groupId"));
	}

	protected GuestbookEntry addGuestbookEntry() throws Exception {
		long pk = RandomTestUtil.nextLong();

		GuestbookEntry guestbookEntry = _persistence.create(pk);

		guestbookEntry.setMvccVersion(RandomTestUtil.nextLong());

		guestbookEntry.setUuid(RandomTestUtil.randomString());

		guestbookEntry.setName(RandomTestUtil.randomString());

		guestbookEntry.setEmail(RandomTestUtil.randomString());

		guestbookEntry.setMessage(RandomTestUtil.randomString());

		guestbookEntry.setGuestbookId(RandomTestUtil.nextLong());

		guestbookEntry.setGroupId(RandomTestUtil.nextLong());

		guestbookEntry.setCompanyId(RandomTestUtil.nextLong());

		guestbookEntry.setUserId(RandomTestUtil.nextLong());

		guestbookEntry.setUserName(RandomTestUtil.randomString());

		guestbookEntry.setCreateDate(RandomTestUtil.nextDate());

		guestbookEntry.setModifiedDate(RandomTestUtil.nextDate());

		guestbookEntry.setStatus(RandomTestUtil.nextInt());

		guestbookEntry.setStatusByUserId(RandomTestUtil.nextLong());

		guestbookEntry.setStatusByUserName(RandomTestUtil.randomString());

		guestbookEntry.setStatusDate(RandomTestUtil.nextDate());

		_guestbookEntries.add(_persistence.update(guestbookEntry));

		return guestbookEntry;
	}

	private List<GuestbookEntry> _guestbookEntries =
		new ArrayList<GuestbookEntry>();
	private GuestbookEntryPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}