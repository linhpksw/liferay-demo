/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package guestbook.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.MVCCModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.model.WorkflowedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the BorrowEntry service. Represents a row in the &quot;GB_BorrowEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>guestbook.model.impl.BorrowEntryModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>guestbook.model.impl.BorrowEntryImpl</code>.
 * </p>
 *
 * @author linhpksw
 * @see BorrowEntry
 * @generated
 */
@ProviderType
public interface BorrowEntryModel
	extends BaseModel<BorrowEntry>, GroupedModel, MVCCModel, ShardedModel,
			StagedAuditedModel, WorkflowedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a borrow entry model instance should use the {@link BorrowEntry} interface instead.
	 */

	/**
	 * Returns the primary key of this borrow entry.
	 *
	 * @return the primary key of this borrow entry
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this borrow entry.
	 *
	 * @param primaryKey the primary key of this borrow entry
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the mvcc version of this borrow entry.
	 *
	 * @return the mvcc version of this borrow entry
	 */
	@Override
	public long getMvccVersion();

	/**
	 * Sets the mvcc version of this borrow entry.
	 *
	 * @param mvccVersion the mvcc version of this borrow entry
	 */
	@Override
	public void setMvccVersion(long mvccVersion);

	/**
	 * Returns the uuid of this borrow entry.
	 *
	 * @return the uuid of this borrow entry
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this borrow entry.
	 *
	 * @param uuid the uuid of this borrow entry
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the entry ID of this borrow entry.
	 *
	 * @return the entry ID of this borrow entry
	 */
	public long getEntryId();

	/**
	 * Sets the entry ID of this borrow entry.
	 *
	 * @param entryId the entry ID of this borrow entry
	 */
	public void setEntryId(long entryId);

	/**
	 * Returns the book ID of this borrow entry.
	 *
	 * @return the book ID of this borrow entry
	 */
	public long getBookId();

	/**
	 * Sets the book ID of this borrow entry.
	 *
	 * @param bookId the book ID of this borrow entry
	 */
	public void setBookId(long bookId);

	/**
	 * Returns the user ID of this borrow entry.
	 *
	 * @return the user ID of this borrow entry
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this borrow entry.
	 *
	 * @param userId the user ID of this borrow entry
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this borrow entry.
	 *
	 * @return the user uuid of this borrow entry
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this borrow entry.
	 *
	 * @param userUuid the user uuid of this borrow entry
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this borrow entry.
	 *
	 * @return the user name of this borrow entry
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this borrow entry.
	 *
	 * @param userName the user name of this borrow entry
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the borrow date of this borrow entry.
	 *
	 * @return the borrow date of this borrow entry
	 */
	public Date getBorrowDate();

	/**
	 * Sets the borrow date of this borrow entry.
	 *
	 * @param borrowDate the borrow date of this borrow entry
	 */
	public void setBorrowDate(Date borrowDate);

	/**
	 * Returns the expected return date of this borrow entry.
	 *
	 * @return the expected return date of this borrow entry
	 */
	public Date getExpectedReturnDate();

	/**
	 * Sets the expected return date of this borrow entry.
	 *
	 * @param expectedReturnDate the expected return date of this borrow entry
	 */
	public void setExpectedReturnDate(Date expectedReturnDate);

	/**
	 * Returns the actual return date of this borrow entry.
	 *
	 * @return the actual return date of this borrow entry
	 */
	public Date getActualReturnDate();

	/**
	 * Sets the actual return date of this borrow entry.
	 *
	 * @param actualReturnDate the actual return date of this borrow entry
	 */
	public void setActualReturnDate(Date actualReturnDate);

	/**
	 * Returns the group ID of this borrow entry.
	 *
	 * @return the group ID of this borrow entry
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this borrow entry.
	 *
	 * @param groupId the group ID of this borrow entry
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this borrow entry.
	 *
	 * @return the company ID of this borrow entry
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this borrow entry.
	 *
	 * @param companyId the company ID of this borrow entry
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the create date of this borrow entry.
	 *
	 * @return the create date of this borrow entry
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this borrow entry.
	 *
	 * @param createDate the create date of this borrow entry
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this borrow entry.
	 *
	 * @return the modified date of this borrow entry
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this borrow entry.
	 *
	 * @param modifiedDate the modified date of this borrow entry
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the status of this borrow entry.
	 *
	 * @return the status of this borrow entry
	 */
	@Override
	public int getStatus();

	/**
	 * Sets the status of this borrow entry.
	 *
	 * @param status the status of this borrow entry
	 */
	@Override
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this borrow entry.
	 *
	 * @return the status by user ID of this borrow entry
	 */
	@Override
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this borrow entry.
	 *
	 * @param statusByUserId the status by user ID of this borrow entry
	 */
	@Override
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this borrow entry.
	 *
	 * @return the status by user uuid of this borrow entry
	 */
	@Override
	public String getStatusByUserUuid();

	/**
	 * Sets the status by user uuid of this borrow entry.
	 *
	 * @param statusByUserUuid the status by user uuid of this borrow entry
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this borrow entry.
	 *
	 * @return the status by user name of this borrow entry
	 */
	@AutoEscape
	@Override
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this borrow entry.
	 *
	 * @param statusByUserName the status by user name of this borrow entry
	 */
	@Override
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this borrow entry.
	 *
	 * @return the status date of this borrow entry
	 */
	@Override
	public Date getStatusDate();

	/**
	 * Sets the status date of this borrow entry.
	 *
	 * @param statusDate the status date of this borrow entry
	 */
	@Override
	public void setStatusDate(Date statusDate);

	/**
	 * Returns <code>true</code> if this borrow entry is approved.
	 *
	 * @return <code>true</code> if this borrow entry is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this borrow entry is denied.
	 *
	 * @return <code>true</code> if this borrow entry is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this borrow entry is a draft.
	 *
	 * @return <code>true</code> if this borrow entry is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this borrow entry is expired.
	 *
	 * @return <code>true</code> if this borrow entry is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this borrow entry is inactive.
	 *
	 * @return <code>true</code> if this borrow entry is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this borrow entry is incomplete.
	 *
	 * @return <code>true</code> if this borrow entry is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this borrow entry is pending.
	 *
	 * @return <code>true</code> if this borrow entry is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this borrow entry is scheduled.
	 *
	 * @return <code>true</code> if this borrow entry is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled();

	@Override
	public BorrowEntry cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}