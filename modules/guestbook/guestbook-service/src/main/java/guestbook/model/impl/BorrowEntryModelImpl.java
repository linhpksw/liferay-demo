/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package guestbook.model.impl;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

import guestbook.model.BorrowEntry;
import guestbook.model.BorrowEntryModel;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.sql.Blob;
import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the BorrowEntry service. Represents a row in the &quot;GB_BorrowEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>BorrowEntryModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BorrowEntryImpl}.
 * </p>
 *
 * @author linhpksw
 * @see BorrowEntryImpl
 * @generated
 */
@JSON(strict = true)
public class BorrowEntryModelImpl
	extends BaseModelImpl<BorrowEntry> implements BorrowEntryModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a borrow entry model instance should use the <code>BorrowEntry</code> interface instead.
	 */
	public static final String TABLE_NAME = "GB_BorrowEntry";

	public static final Object[][] TABLE_COLUMNS = {
		{"mvccVersion", Types.BIGINT}, {"uuid_", Types.VARCHAR},
		{"entryId", Types.BIGINT}, {"bookId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"borrowDate", Types.TIMESTAMP},
		{"expectedReturnDate", Types.TIMESTAMP},
		{"actualReturnDate", Types.TIMESTAMP}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"status", Types.INTEGER},
		{"statusByUserId", Types.BIGINT}, {"statusByUserName", Types.VARCHAR},
		{"statusDate", Types.TIMESTAMP}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("mvccVersion", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("entryId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("bookId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("borrowDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("expectedReturnDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("actualReturnDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("status", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("statusByUserId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("statusByUserName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("statusDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE =
		"create table GB_BorrowEntry (mvccVersion LONG default 0 not null,uuid_ VARCHAR(75) null,entryId LONG not null primary key,bookId LONG,userId LONG,userName VARCHAR(75) null,borrowDate DATE null,expectedReturnDate DATE null,actualReturnDate DATE null,groupId LONG,companyId LONG,createDate DATE null,modifiedDate DATE null,status INTEGER,statusByUserId LONG,statusByUserName VARCHAR(75) null,statusDate DATE null)";

	public static final String TABLE_SQL_DROP = "drop table GB_BorrowEntry";

	public static final String ORDER_BY_JPQL =
		" ORDER BY borrowEntry.entryId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY GB_BorrowEntry.entryId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long BOOKID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long COMPANYID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long GROUPID_COLUMN_BITMASK = 4L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long STATUS_COLUMN_BITMASK = 8L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 16L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long ENTRYID_COLUMN_BITMASK = 32L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	public BorrowEntryModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _entryId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEntryId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _entryId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return BorrowEntry.class;
	}

	@Override
	public String getModelClassName() {
		return BorrowEntry.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<BorrowEntry, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<BorrowEntry, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<BorrowEntry, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((BorrowEntry)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<BorrowEntry, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<BorrowEntry, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(BorrowEntry)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<BorrowEntry, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<BorrowEntry, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<BorrowEntry, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<BorrowEntry, Object>>
				attributeGetterFunctions =
					new LinkedHashMap<String, Function<BorrowEntry, Object>>();

			attributeGetterFunctions.put(
				"mvccVersion", BorrowEntry::getMvccVersion);
			attributeGetterFunctions.put("uuid", BorrowEntry::getUuid);
			attributeGetterFunctions.put("entryId", BorrowEntry::getEntryId);
			attributeGetterFunctions.put("bookId", BorrowEntry::getBookId);
			attributeGetterFunctions.put("userId", BorrowEntry::getUserId);
			attributeGetterFunctions.put("userName", BorrowEntry::getUserName);
			attributeGetterFunctions.put(
				"borrowDate", BorrowEntry::getBorrowDate);
			attributeGetterFunctions.put(
				"expectedReturnDate", BorrowEntry::getExpectedReturnDate);
			attributeGetterFunctions.put(
				"actualReturnDate", BorrowEntry::getActualReturnDate);
			attributeGetterFunctions.put("groupId", BorrowEntry::getGroupId);
			attributeGetterFunctions.put(
				"companyId", BorrowEntry::getCompanyId);
			attributeGetterFunctions.put(
				"createDate", BorrowEntry::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", BorrowEntry::getModifiedDate);
			attributeGetterFunctions.put("status", BorrowEntry::getStatus);
			attributeGetterFunctions.put(
				"statusByUserId", BorrowEntry::getStatusByUserId);
			attributeGetterFunctions.put(
				"statusByUserName", BorrowEntry::getStatusByUserName);
			attributeGetterFunctions.put(
				"statusDate", BorrowEntry::getStatusDate);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map<String, BiConsumer<BorrowEntry, Object>>
			_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<BorrowEntry, ?>> attributeSetterBiConsumers =
				new LinkedHashMap<String, BiConsumer<BorrowEntry, ?>>();

			attributeSetterBiConsumers.put(
				"mvccVersion",
				(BiConsumer<BorrowEntry, Long>)BorrowEntry::setMvccVersion);
			attributeSetterBiConsumers.put(
				"uuid", (BiConsumer<BorrowEntry, String>)BorrowEntry::setUuid);
			attributeSetterBiConsumers.put(
				"entryId",
				(BiConsumer<BorrowEntry, Long>)BorrowEntry::setEntryId);
			attributeSetterBiConsumers.put(
				"bookId",
				(BiConsumer<BorrowEntry, Long>)BorrowEntry::setBookId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<BorrowEntry, Long>)BorrowEntry::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<BorrowEntry, String>)BorrowEntry::setUserName);
			attributeSetterBiConsumers.put(
				"borrowDate",
				(BiConsumer<BorrowEntry, Date>)BorrowEntry::setBorrowDate);
			attributeSetterBiConsumers.put(
				"expectedReturnDate",
				(BiConsumer<BorrowEntry, Date>)
					BorrowEntry::setExpectedReturnDate);
			attributeSetterBiConsumers.put(
				"actualReturnDate",
				(BiConsumer<BorrowEntry, Date>)
					BorrowEntry::setActualReturnDate);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<BorrowEntry, Long>)BorrowEntry::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<BorrowEntry, Long>)BorrowEntry::setCompanyId);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<BorrowEntry, Date>)BorrowEntry::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<BorrowEntry, Date>)BorrowEntry::setModifiedDate);
			attributeSetterBiConsumers.put(
				"status",
				(BiConsumer<BorrowEntry, Integer>)BorrowEntry::setStatus);
			attributeSetterBiConsumers.put(
				"statusByUserId",
				(BiConsumer<BorrowEntry, Long>)BorrowEntry::setStatusByUserId);
			attributeSetterBiConsumers.put(
				"statusByUserName",
				(BiConsumer<BorrowEntry, String>)
					BorrowEntry::setStatusByUserName);
			attributeSetterBiConsumers.put(
				"statusDate",
				(BiConsumer<BorrowEntry, Date>)BorrowEntry::setStatusDate);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getMvccVersion() {
		return _mvccVersion;
	}

	@Override
	public void setMvccVersion(long mvccVersion) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_mvccVersion = mvccVersion;
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_uuid = uuid;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalUuid() {
		return getColumnOriginalValue("uuid_");
	}

	@JSON
	@Override
	public long getEntryId() {
		return _entryId;
	}

	@Override
	public void setEntryId(long entryId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_entryId = entryId;
	}

	@JSON
	@Override
	public long getBookId() {
		return _bookId;
	}

	@Override
	public void setBookId(long bookId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_bookId = bookId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalBookId() {
		return GetterUtil.getLong(this.<Long>getColumnOriginalValue("bookId"));
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userName = userName;
	}

	@JSON
	@Override
	public Date getBorrowDate() {
		return _borrowDate;
	}

	@Override
	public void setBorrowDate(Date borrowDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_borrowDate = borrowDate;
	}

	@JSON
	@Override
	public Date getExpectedReturnDate() {
		return _expectedReturnDate;
	}

	@Override
	public void setExpectedReturnDate(Date expectedReturnDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_expectedReturnDate = expectedReturnDate;
	}

	@JSON
	@Override
	public Date getActualReturnDate() {
		return _actualReturnDate;
	}

	@Override
	public void setActualReturnDate(Date actualReturnDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_actualReturnDate = actualReturnDate;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_groupId = groupId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalGroupId() {
		return GetterUtil.getLong(this.<Long>getColumnOriginalValue("groupId"));
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_companyId = companyId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalCompanyId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("companyId"));
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_status = status;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public int getOriginalStatus() {
		return GetterUtil.getInteger(
			this.<Integer>getColumnOriginalValue("status"));
	}

	@JSON
	@Override
	public long getStatusByUserId() {
		return _statusByUserId;
	}

	@Override
	public void setStatusByUserId(long statusByUserId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_statusByUserId = statusByUserId;
	}

	@Override
	public String getStatusByUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getStatusByUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
	}

	@JSON
	@Override
	public String getStatusByUserName() {
		if (_statusByUserName == null) {
			return "";
		}
		else {
			return _statusByUserName;
		}
	}

	@Override
	public void setStatusByUserName(String statusByUserName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_statusByUserName = statusByUserName;
	}

	@JSON
	@Override
	public Date getStatusDate() {
		return _statusDate;
	}

	@Override
	public void setStatusDate(Date statusDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_statusDate = statusDate;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(BorrowEntry.class.getName()));
	}

	@Override
	public boolean isApproved() {
		if (getStatus() == WorkflowConstants.STATUS_APPROVED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isDenied() {
		if (getStatus() == WorkflowConstants.STATUS_DENIED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isDraft() {
		if (getStatus() == WorkflowConstants.STATUS_DRAFT) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isExpired() {
		if (getStatus() == WorkflowConstants.STATUS_EXPIRED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isInactive() {
		if (getStatus() == WorkflowConstants.STATUS_INACTIVE) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isIncomplete() {
		if (getStatus() == WorkflowConstants.STATUS_INCOMPLETE) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isPending() {
		if (getStatus() == WorkflowConstants.STATUS_PENDING) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isScheduled() {
		if (getStatus() == WorkflowConstants.STATUS_SCHEDULED) {
			return true;
		}
		else {
			return false;
		}
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (!Objects.equals(
					entry.getValue(), getColumnValue(entry.getKey()))) {

				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), BorrowEntry.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public BorrowEntry toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, BorrowEntry>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		BorrowEntryImpl borrowEntryImpl = new BorrowEntryImpl();

		borrowEntryImpl.setMvccVersion(getMvccVersion());
		borrowEntryImpl.setUuid(getUuid());
		borrowEntryImpl.setEntryId(getEntryId());
		borrowEntryImpl.setBookId(getBookId());
		borrowEntryImpl.setUserId(getUserId());
		borrowEntryImpl.setUserName(getUserName());
		borrowEntryImpl.setBorrowDate(getBorrowDate());
		borrowEntryImpl.setExpectedReturnDate(getExpectedReturnDate());
		borrowEntryImpl.setActualReturnDate(getActualReturnDate());
		borrowEntryImpl.setGroupId(getGroupId());
		borrowEntryImpl.setCompanyId(getCompanyId());
		borrowEntryImpl.setCreateDate(getCreateDate());
		borrowEntryImpl.setModifiedDate(getModifiedDate());
		borrowEntryImpl.setStatus(getStatus());
		borrowEntryImpl.setStatusByUserId(getStatusByUserId());
		borrowEntryImpl.setStatusByUserName(getStatusByUserName());
		borrowEntryImpl.setStatusDate(getStatusDate());

		borrowEntryImpl.resetOriginalValues();

		return borrowEntryImpl;
	}

	@Override
	public BorrowEntry cloneWithOriginalValues() {
		BorrowEntryImpl borrowEntryImpl = new BorrowEntryImpl();

		borrowEntryImpl.setMvccVersion(
			this.<Long>getColumnOriginalValue("mvccVersion"));
		borrowEntryImpl.setUuid(this.<String>getColumnOriginalValue("uuid_"));
		borrowEntryImpl.setEntryId(
			this.<Long>getColumnOriginalValue("entryId"));
		borrowEntryImpl.setBookId(this.<Long>getColumnOriginalValue("bookId"));
		borrowEntryImpl.setUserId(this.<Long>getColumnOriginalValue("userId"));
		borrowEntryImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		borrowEntryImpl.setBorrowDate(
			this.<Date>getColumnOriginalValue("borrowDate"));
		borrowEntryImpl.setExpectedReturnDate(
			this.<Date>getColumnOriginalValue("expectedReturnDate"));
		borrowEntryImpl.setActualReturnDate(
			this.<Date>getColumnOriginalValue("actualReturnDate"));
		borrowEntryImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		borrowEntryImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		borrowEntryImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		borrowEntryImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		borrowEntryImpl.setStatus(
			this.<Integer>getColumnOriginalValue("status"));
		borrowEntryImpl.setStatusByUserId(
			this.<Long>getColumnOriginalValue("statusByUserId"));
		borrowEntryImpl.setStatusByUserName(
			this.<String>getColumnOriginalValue("statusByUserName"));
		borrowEntryImpl.setStatusDate(
			this.<Date>getColumnOriginalValue("statusDate"));

		return borrowEntryImpl;
	}

	@Override
	public int compareTo(BorrowEntry borrowEntry) {
		long primaryKey = borrowEntry.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof BorrowEntry)) {
			return false;
		}

		BorrowEntry borrowEntry = (BorrowEntry)object;

		long primaryKey = borrowEntry.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_setModifiedDate = false;

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<BorrowEntry> toCacheModel() {
		BorrowEntryCacheModel borrowEntryCacheModel =
			new BorrowEntryCacheModel();

		borrowEntryCacheModel.mvccVersion = getMvccVersion();

		borrowEntryCacheModel.uuid = getUuid();

		String uuid = borrowEntryCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			borrowEntryCacheModel.uuid = null;
		}

		borrowEntryCacheModel.entryId = getEntryId();

		borrowEntryCacheModel.bookId = getBookId();

		borrowEntryCacheModel.userId = getUserId();

		borrowEntryCacheModel.userName = getUserName();

		String userName = borrowEntryCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			borrowEntryCacheModel.userName = null;
		}

		Date borrowDate = getBorrowDate();

		if (borrowDate != null) {
			borrowEntryCacheModel.borrowDate = borrowDate.getTime();
		}
		else {
			borrowEntryCacheModel.borrowDate = Long.MIN_VALUE;
		}

		Date expectedReturnDate = getExpectedReturnDate();

		if (expectedReturnDate != null) {
			borrowEntryCacheModel.expectedReturnDate =
				expectedReturnDate.getTime();
		}
		else {
			borrowEntryCacheModel.expectedReturnDate = Long.MIN_VALUE;
		}

		Date actualReturnDate = getActualReturnDate();

		if (actualReturnDate != null) {
			borrowEntryCacheModel.actualReturnDate = actualReturnDate.getTime();
		}
		else {
			borrowEntryCacheModel.actualReturnDate = Long.MIN_VALUE;
		}

		borrowEntryCacheModel.groupId = getGroupId();

		borrowEntryCacheModel.companyId = getCompanyId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			borrowEntryCacheModel.createDate = createDate.getTime();
		}
		else {
			borrowEntryCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			borrowEntryCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			borrowEntryCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		borrowEntryCacheModel.status = getStatus();

		borrowEntryCacheModel.statusByUserId = getStatusByUserId();

		borrowEntryCacheModel.statusByUserName = getStatusByUserName();

		String statusByUserName = borrowEntryCacheModel.statusByUserName;

		if ((statusByUserName != null) && (statusByUserName.length() == 0)) {
			borrowEntryCacheModel.statusByUserName = null;
		}

		Date statusDate = getStatusDate();

		if (statusDate != null) {
			borrowEntryCacheModel.statusDate = statusDate.getTime();
		}
		else {
			borrowEntryCacheModel.statusDate = Long.MIN_VALUE;
		}

		return borrowEntryCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<BorrowEntry, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<BorrowEntry, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<BorrowEntry, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((BorrowEntry)this);

			if (value == null) {
				sb.append("null");
			}
			else if (value instanceof Blob || value instanceof Date ||
					 value instanceof Map || value instanceof String) {

				sb.append(
					"\"" + StringUtil.replace(value.toString(), "\"", "'") +
						"\"");
			}
			else {
				sb.append(value);
			}

			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, BorrowEntry>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					BorrowEntry.class, ModelWrapper.class);

	}

	private long _mvccVersion;
	private String _uuid;
	private long _entryId;
	private long _bookId;
	private long _userId;
	private String _userName;
	private Date _borrowDate;
	private Date _expectedReturnDate;
	private Date _actualReturnDate;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserName;
	private Date _statusDate;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<BorrowEntry, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((BorrowEntry)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("mvccVersion", _mvccVersion);
		_columnOriginalValues.put("uuid_", _uuid);
		_columnOriginalValues.put("entryId", _entryId);
		_columnOriginalValues.put("bookId", _bookId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("borrowDate", _borrowDate);
		_columnOriginalValues.put("expectedReturnDate", _expectedReturnDate);
		_columnOriginalValues.put("actualReturnDate", _actualReturnDate);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("status", _status);
		_columnOriginalValues.put("statusByUserId", _statusByUserId);
		_columnOriginalValues.put("statusByUserName", _statusByUserName);
		_columnOriginalValues.put("statusDate", _statusDate);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("uuid_", "uuid");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("mvccVersion", 1L);

		columnBitmasks.put("uuid_", 2L);

		columnBitmasks.put("entryId", 4L);

		columnBitmasks.put("bookId", 8L);

		columnBitmasks.put("userId", 16L);

		columnBitmasks.put("userName", 32L);

		columnBitmasks.put("borrowDate", 64L);

		columnBitmasks.put("expectedReturnDate", 128L);

		columnBitmasks.put("actualReturnDate", 256L);

		columnBitmasks.put("groupId", 512L);

		columnBitmasks.put("companyId", 1024L);

		columnBitmasks.put("createDate", 2048L);

		columnBitmasks.put("modifiedDate", 4096L);

		columnBitmasks.put("status", 8192L);

		columnBitmasks.put("statusByUserId", 16384L);

		columnBitmasks.put("statusByUserName", 32768L);

		columnBitmasks.put("statusDate", 65536L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private BorrowEntry _escapedModel;

}