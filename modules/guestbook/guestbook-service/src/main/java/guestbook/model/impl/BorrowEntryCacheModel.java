/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package guestbook.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.MVCCModel;

import guestbook.model.BorrowEntry;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing BorrowEntry in entity cache.
 *
 * @author linhpksw
 * @generated
 */
public class BorrowEntryCacheModel
	implements CacheModel<BorrowEntry>, Externalizable, MVCCModel {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof BorrowEntryCacheModel)) {
			return false;
		}

		BorrowEntryCacheModel borrowEntryCacheModel =
			(BorrowEntryCacheModel)object;

		if ((entryId == borrowEntryCacheModel.entryId) &&
			(mvccVersion == borrowEntryCacheModel.mvccVersion)) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		int hashCode = HashUtil.hash(0, entryId);

		return HashUtil.hash(hashCode, mvccVersion);
	}

	@Override
	public long getMvccVersion() {
		return mvccVersion;
	}

	@Override
	public void setMvccVersion(long mvccVersion) {
		this.mvccVersion = mvccVersion;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{mvccVersion=");
		sb.append(mvccVersion);
		sb.append(", uuid=");
		sb.append(uuid);
		sb.append(", entryId=");
		sb.append(entryId);
		sb.append(", bookId=");
		sb.append(bookId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", borrowDate=");
		sb.append(borrowDate);
		sb.append(", expectedReturnDate=");
		sb.append(expectedReturnDate);
		sb.append(", actualReturnDate=");
		sb.append(actualReturnDate);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public BorrowEntry toEntityModel() {
		BorrowEntryImpl borrowEntryImpl = new BorrowEntryImpl();

		borrowEntryImpl.setMvccVersion(mvccVersion);

		if (uuid == null) {
			borrowEntryImpl.setUuid("");
		}
		else {
			borrowEntryImpl.setUuid(uuid);
		}

		borrowEntryImpl.setEntryId(entryId);
		borrowEntryImpl.setBookId(bookId);
		borrowEntryImpl.setUserId(userId);

		if (userName == null) {
			borrowEntryImpl.setUserName("");
		}
		else {
			borrowEntryImpl.setUserName(userName);
		}

		if (borrowDate == Long.MIN_VALUE) {
			borrowEntryImpl.setBorrowDate(null);
		}
		else {
			borrowEntryImpl.setBorrowDate(new Date(borrowDate));
		}

		if (expectedReturnDate == Long.MIN_VALUE) {
			borrowEntryImpl.setExpectedReturnDate(null);
		}
		else {
			borrowEntryImpl.setExpectedReturnDate(new Date(expectedReturnDate));
		}

		if (actualReturnDate == Long.MIN_VALUE) {
			borrowEntryImpl.setActualReturnDate(null);
		}
		else {
			borrowEntryImpl.setActualReturnDate(new Date(actualReturnDate));
		}

		borrowEntryImpl.setGroupId(groupId);
		borrowEntryImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			borrowEntryImpl.setCreateDate(null);
		}
		else {
			borrowEntryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			borrowEntryImpl.setModifiedDate(null);
		}
		else {
			borrowEntryImpl.setModifiedDate(new Date(modifiedDate));
		}

		borrowEntryImpl.setStatus(status);
		borrowEntryImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			borrowEntryImpl.setStatusByUserName("");
		}
		else {
			borrowEntryImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			borrowEntryImpl.setStatusDate(null);
		}
		else {
			borrowEntryImpl.setStatusDate(new Date(statusDate));
		}

		borrowEntryImpl.resetOriginalValues();

		return borrowEntryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		mvccVersion = objectInput.readLong();
		uuid = objectInput.readUTF();

		entryId = objectInput.readLong();

		bookId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		borrowDate = objectInput.readLong();
		expectedReturnDate = objectInput.readLong();
		actualReturnDate = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(mvccVersion);

		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(entryId);

		objectOutput.writeLong(bookId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(borrowDate);
		objectOutput.writeLong(expectedReturnDate);
		objectOutput.writeLong(actualReturnDate);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);
	}

	public long mvccVersion;
	public String uuid;
	public long entryId;
	public long bookId;
	public long userId;
	public String userName;
	public long borrowDate;
	public long expectedReturnDate;
	public long actualReturnDate;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;

}