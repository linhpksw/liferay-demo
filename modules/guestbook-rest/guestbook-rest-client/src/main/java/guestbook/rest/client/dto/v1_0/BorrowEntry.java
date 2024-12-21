package guestbook.rest.client.dto.v1_0;

import guestbook.rest.client.function.UnsafeSupplier;
import guestbook.rest.client.serdes.v1_0.BorrowEntrySerDes;

import java.io.Serializable;

import java.util.Date;
import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author linhp
 * @generated
 */
@Generated("")
public class BorrowEntry implements Cloneable, Serializable {

	public static BorrowEntry toDTO(String json) {
		return BorrowEntrySerDes.toDTO(json);
	}

	public Date getActualReturnDate() {
		return actualReturnDate;
	}

	public void setActualReturnDate(Date actualReturnDate) {
		this.actualReturnDate = actualReturnDate;
	}

	public void setActualReturnDate(
		UnsafeSupplier<Date, Exception> actualReturnDateUnsafeSupplier) {

		try {
			actualReturnDate = actualReturnDateUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Date actualReturnDate;

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public void setBookId(
		UnsafeSupplier<Long, Exception> bookIdUnsafeSupplier) {

		try {
			bookId = bookIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long bookId;

	public Date getBorrowDate() {
		return borrowDate;
	}

	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
	}

	public void setBorrowDate(
		UnsafeSupplier<Date, Exception> borrowDateUnsafeSupplier) {

		try {
			borrowDate = borrowDateUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Date borrowDate;

	public Long getEntryId() {
		return entryId;
	}

	public void setEntryId(Long entryId) {
		this.entryId = entryId;
	}

	public void setEntryId(
		UnsafeSupplier<Long, Exception> entryIdUnsafeSupplier) {

		try {
			entryId = entryIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long entryId;

	public Date getExpectedReturnDate() {
		return expectedReturnDate;
	}

	public void setExpectedReturnDate(Date expectedReturnDate) {
		this.expectedReturnDate = expectedReturnDate;
	}

	public void setExpectedReturnDate(
		UnsafeSupplier<Date, Exception> expectedReturnDateUnsafeSupplier) {

		try {
			expectedReturnDate = expectedReturnDateUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Date expectedReturnDate;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setStatus(
		UnsafeSupplier<String, Exception> statusUnsafeSupplier) {

		try {
			status = statusUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String status;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void setUserId(
		UnsafeSupplier<Long, Exception> userIdUnsafeSupplier) {

		try {
			userId = userIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long userId;

	@Override
	public BorrowEntry clone() throws CloneNotSupportedException {
		return (BorrowEntry)super.clone();
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

		return Objects.equals(toString(), borrowEntry.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return BorrowEntrySerDes.toJSON(this);
	}

}