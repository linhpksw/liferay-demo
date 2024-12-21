/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package guestbook.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link BorrowEntry}.
 * </p>
 *
 * @author linhpksw
 * @see BorrowEntry
 * @generated
 */
public class BorrowEntryWrapper
	extends BaseModelWrapper<BorrowEntry>
	implements BorrowEntry, ModelWrapper<BorrowEntry> {

	public BorrowEntryWrapper(BorrowEntry borrowEntry) {
		super(borrowEntry);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("mvccVersion", getMvccVersion());
		attributes.put("uuid", getUuid());
		attributes.put("entryId", getEntryId());
		attributes.put("bookId", getBookId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("borrowDate", getBorrowDate());
		attributes.put("expectedReturnDate", getExpectedReturnDate());
		attributes.put("actualReturnDate", getActualReturnDate());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long mvccVersion = (Long)attributes.get("mvccVersion");

		if (mvccVersion != null) {
			setMvccVersion(mvccVersion);
		}

		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long entryId = (Long)attributes.get("entryId");

		if (entryId != null) {
			setEntryId(entryId);
		}

		Long bookId = (Long)attributes.get("bookId");

		if (bookId != null) {
			setBookId(bookId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date borrowDate = (Date)attributes.get("borrowDate");

		if (borrowDate != null) {
			setBorrowDate(borrowDate);
		}

		Date expectedReturnDate = (Date)attributes.get("expectedReturnDate");

		if (expectedReturnDate != null) {
			setExpectedReturnDate(expectedReturnDate);
		}

		Date actualReturnDate = (Date)attributes.get("actualReturnDate");

		if (actualReturnDate != null) {
			setActualReturnDate(actualReturnDate);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}
	}

	@Override
	public BorrowEntry cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the actual return date of this borrow entry.
	 *
	 * @return the actual return date of this borrow entry
	 */
	@Override
	public Date getActualReturnDate() {
		return model.getActualReturnDate();
	}

	/**
	 * Returns the book ID of this borrow entry.
	 *
	 * @return the book ID of this borrow entry
	 */
	@Override
	public long getBookId() {
		return model.getBookId();
	}

	/**
	 * Returns the borrow date of this borrow entry.
	 *
	 * @return the borrow date of this borrow entry
	 */
	@Override
	public Date getBorrowDate() {
		return model.getBorrowDate();
	}

	/**
	 * Returns the company ID of this borrow entry.
	 *
	 * @return the company ID of this borrow entry
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this borrow entry.
	 *
	 * @return the create date of this borrow entry
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the entry ID of this borrow entry.
	 *
	 * @return the entry ID of this borrow entry
	 */
	@Override
	public long getEntryId() {
		return model.getEntryId();
	}

	/**
	 * Returns the expected return date of this borrow entry.
	 *
	 * @return the expected return date of this borrow entry
	 */
	@Override
	public Date getExpectedReturnDate() {
		return model.getExpectedReturnDate();
	}

	/**
	 * Returns the group ID of this borrow entry.
	 *
	 * @return the group ID of this borrow entry
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this borrow entry.
	 *
	 * @return the modified date of this borrow entry
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the mvcc version of this borrow entry.
	 *
	 * @return the mvcc version of this borrow entry
	 */
	@Override
	public long getMvccVersion() {
		return model.getMvccVersion();
	}

	/**
	 * Returns the primary key of this borrow entry.
	 *
	 * @return the primary key of this borrow entry
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this borrow entry.
	 *
	 * @return the status of this borrow entry
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status by user ID of this borrow entry.
	 *
	 * @return the status by user ID of this borrow entry
	 */
	@Override
	public long getStatusByUserId() {
		return model.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this borrow entry.
	 *
	 * @return the status by user name of this borrow entry
	 */
	@Override
	public String getStatusByUserName() {
		return model.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this borrow entry.
	 *
	 * @return the status by user uuid of this borrow entry
	 */
	@Override
	public String getStatusByUserUuid() {
		return model.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this borrow entry.
	 *
	 * @return the status date of this borrow entry
	 */
	@Override
	public Date getStatusDate() {
		return model.getStatusDate();
	}

	/**
	 * Returns the user ID of this borrow entry.
	 *
	 * @return the user ID of this borrow entry
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this borrow entry.
	 *
	 * @return the user name of this borrow entry
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this borrow entry.
	 *
	 * @return the user uuid of this borrow entry
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this borrow entry.
	 *
	 * @return the uuid of this borrow entry
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this borrow entry is approved.
	 *
	 * @return <code>true</code> if this borrow entry is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return model.isApproved();
	}

	/**
	 * Returns <code>true</code> if this borrow entry is denied.
	 *
	 * @return <code>true</code> if this borrow entry is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return model.isDenied();
	}

	/**
	 * Returns <code>true</code> if this borrow entry is a draft.
	 *
	 * @return <code>true</code> if this borrow entry is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return model.isDraft();
	}

	/**
	 * Returns <code>true</code> if this borrow entry is expired.
	 *
	 * @return <code>true</code> if this borrow entry is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return model.isExpired();
	}

	/**
	 * Returns <code>true</code> if this borrow entry is inactive.
	 *
	 * @return <code>true</code> if this borrow entry is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return model.isInactive();
	}

	/**
	 * Returns <code>true</code> if this borrow entry is incomplete.
	 *
	 * @return <code>true</code> if this borrow entry is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return model.isIncomplete();
	}

	/**
	 * Returns <code>true</code> if this borrow entry is pending.
	 *
	 * @return <code>true</code> if this borrow entry is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return model.isPending();
	}

	/**
	 * Returns <code>true</code> if this borrow entry is scheduled.
	 *
	 * @return <code>true</code> if this borrow entry is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled() {
		return model.isScheduled();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the actual return date of this borrow entry.
	 *
	 * @param actualReturnDate the actual return date of this borrow entry
	 */
	@Override
	public void setActualReturnDate(Date actualReturnDate) {
		model.setActualReturnDate(actualReturnDate);
	}

	/**
	 * Sets the book ID of this borrow entry.
	 *
	 * @param bookId the book ID of this borrow entry
	 */
	@Override
	public void setBookId(long bookId) {
		model.setBookId(bookId);
	}

	/**
	 * Sets the borrow date of this borrow entry.
	 *
	 * @param borrowDate the borrow date of this borrow entry
	 */
	@Override
	public void setBorrowDate(Date borrowDate) {
		model.setBorrowDate(borrowDate);
	}

	/**
	 * Sets the company ID of this borrow entry.
	 *
	 * @param companyId the company ID of this borrow entry
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this borrow entry.
	 *
	 * @param createDate the create date of this borrow entry
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the entry ID of this borrow entry.
	 *
	 * @param entryId the entry ID of this borrow entry
	 */
	@Override
	public void setEntryId(long entryId) {
		model.setEntryId(entryId);
	}

	/**
	 * Sets the expected return date of this borrow entry.
	 *
	 * @param expectedReturnDate the expected return date of this borrow entry
	 */
	@Override
	public void setExpectedReturnDate(Date expectedReturnDate) {
		model.setExpectedReturnDate(expectedReturnDate);
	}

	/**
	 * Sets the group ID of this borrow entry.
	 *
	 * @param groupId the group ID of this borrow entry
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this borrow entry.
	 *
	 * @param modifiedDate the modified date of this borrow entry
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the mvcc version of this borrow entry.
	 *
	 * @param mvccVersion the mvcc version of this borrow entry
	 */
	@Override
	public void setMvccVersion(long mvccVersion) {
		model.setMvccVersion(mvccVersion);
	}

	/**
	 * Sets the primary key of this borrow entry.
	 *
	 * @param primaryKey the primary key of this borrow entry
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this borrow entry.
	 *
	 * @param status the status of this borrow entry
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this borrow entry.
	 *
	 * @param statusByUserId the status by user ID of this borrow entry
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		model.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this borrow entry.
	 *
	 * @param statusByUserName the status by user name of this borrow entry
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		model.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this borrow entry.
	 *
	 * @param statusByUserUuid the status by user uuid of this borrow entry
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		model.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this borrow entry.
	 *
	 * @param statusDate the status date of this borrow entry
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		model.setStatusDate(statusDate);
	}

	/**
	 * Sets the user ID of this borrow entry.
	 *
	 * @param userId the user ID of this borrow entry
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this borrow entry.
	 *
	 * @param userName the user name of this borrow entry
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this borrow entry.
	 *
	 * @param userUuid the user uuid of this borrow entry
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this borrow entry.
	 *
	 * @param uuid the uuid of this borrow entry
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected BorrowEntryWrapper wrap(BorrowEntry borrowEntry) {
		return new BorrowEntryWrapper(borrowEntry);
	}

}