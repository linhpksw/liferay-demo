/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package guestbook.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.MVCCModel;

import guestbook.model.BookDetail;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing BookDetail in entity cache.
 *
 * @author linhpksw
 * @generated
 */
public class BookDetailCacheModel
	implements CacheModel<BookDetail>, Externalizable, MVCCModel {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof BookDetailCacheModel)) {
			return false;
		}

		BookDetailCacheModel bookDetailCacheModel =
			(BookDetailCacheModel)object;

		if ((bookId == bookDetailCacheModel.bookId) &&
			(mvccVersion == bookDetailCacheModel.mvccVersion)) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		int hashCode = HashUtil.hash(0, bookId);

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
		StringBundler sb = new StringBundler(29);

		sb.append("{mvccVersion=");
		sb.append(mvccVersion);
		sb.append(", uuid=");
		sb.append(uuid);
		sb.append(", bookId=");
		sb.append(bookId);
		sb.append(", title=");
		sb.append(title);
		sb.append(", author=");
		sb.append(author);
		sb.append(", description=");
		sb.append(description);
		sb.append(", isbn=");
		sb.append(isbn);
		sb.append(", status=");
		sb.append(status);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public BookDetail toEntityModel() {
		BookDetailImpl bookDetailImpl = new BookDetailImpl();

		bookDetailImpl.setMvccVersion(mvccVersion);

		if (uuid == null) {
			bookDetailImpl.setUuid("");
		}
		else {
			bookDetailImpl.setUuid(uuid);
		}

		bookDetailImpl.setBookId(bookId);

		if (title == null) {
			bookDetailImpl.setTitle("");
		}
		else {
			bookDetailImpl.setTitle(title);
		}

		if (author == null) {
			bookDetailImpl.setAuthor("");
		}
		else {
			bookDetailImpl.setAuthor(author);
		}

		if (description == null) {
			bookDetailImpl.setDescription("");
		}
		else {
			bookDetailImpl.setDescription(description);
		}

		if (isbn == null) {
			bookDetailImpl.setIsbn("");
		}
		else {
			bookDetailImpl.setIsbn(isbn);
		}

		bookDetailImpl.setStatus(status);
		bookDetailImpl.setGroupId(groupId);
		bookDetailImpl.setCompanyId(companyId);
		bookDetailImpl.setUserId(userId);

		if (userName == null) {
			bookDetailImpl.setUserName("");
		}
		else {
			bookDetailImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			bookDetailImpl.setCreateDate(null);
		}
		else {
			bookDetailImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			bookDetailImpl.setModifiedDate(null);
		}
		else {
			bookDetailImpl.setModifiedDate(new Date(modifiedDate));
		}

		bookDetailImpl.resetOriginalValues();

		return bookDetailImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		mvccVersion = objectInput.readLong();
		uuid = objectInput.readUTF();

		bookId = objectInput.readLong();
		title = objectInput.readUTF();
		author = objectInput.readUTF();
		description = objectInput.readUTF();
		isbn = objectInput.readUTF();

		status = objectInput.readInt();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
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

		objectOutput.writeLong(bookId);

		if (title == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (author == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(author);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (isbn == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(isbn);
		}

		objectOutput.writeInt(status);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public long mvccVersion;
	public String uuid;
	public long bookId;
	public String title;
	public String author;
	public String description;
	public String isbn;
	public int status;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;

}