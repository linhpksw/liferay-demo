package guestbook.rest.client.dto.v1_0;

import guestbook.rest.client.function.UnsafeSupplier;
import guestbook.rest.client.serdes.v1_0.ReturnBookRequestSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author linhp
 * @generated
 */
@Generated("")
public class ReturnBookRequest implements Cloneable, Serializable {

	public static ReturnBookRequest toDTO(String json) {
		return ReturnBookRequestSerDes.toDTO(json);
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

	@Override
	public ReturnBookRequest clone() throws CloneNotSupportedException {
		return (ReturnBookRequest)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ReturnBookRequest)) {
			return false;
		}

		ReturnBookRequest returnBookRequest = (ReturnBookRequest)object;

		return Objects.equals(toString(), returnBookRequest.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return ReturnBookRequestSerDes.toJSON(this);
	}

}