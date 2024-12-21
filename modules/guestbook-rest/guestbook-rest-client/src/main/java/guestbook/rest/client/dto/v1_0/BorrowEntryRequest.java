package guestbook.rest.client.dto.v1_0;

import guestbook.rest.client.function.UnsafeSupplier;
import guestbook.rest.client.serdes.v1_0.BorrowEntryRequestSerDes;

import java.io.Serializable;

import java.util.Date;
import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author linhp
 * @generated
 */
@Generated("")
public class BorrowEntryRequest implements Cloneable, Serializable {

	public static BorrowEntryRequest toDTO(String json) {
		return BorrowEntryRequestSerDes.toDTO(json);
	}

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

	@Override
	public BorrowEntryRequest clone() throws CloneNotSupportedException {
		return (BorrowEntryRequest)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof BorrowEntryRequest)) {
			return false;
		}

		BorrowEntryRequest borrowEntryRequest = (BorrowEntryRequest)object;

		return Objects.equals(toString(), borrowEntryRequest.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return BorrowEntryRequestSerDes.toJSON(this);
	}

}