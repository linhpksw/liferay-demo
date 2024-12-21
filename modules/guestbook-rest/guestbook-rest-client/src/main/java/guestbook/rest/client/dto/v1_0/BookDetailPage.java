package guestbook.rest.client.dto.v1_0;

import guestbook.rest.client.dto.v1_0.BookDetail;
import guestbook.rest.client.function.UnsafeSupplier;
import guestbook.rest.client.serdes.v1_0.BookDetailPageSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author linhp
 * @generated
 */
@Generated("")
public class BookDetailPage implements Cloneable, Serializable {

	public static BookDetailPage toDTO(String json) {
		return BookDetailPageSerDes.toDTO(json);
	}

	public BookDetail[] getBookDetails() {
		return bookDetails;
	}

	public void setBookDetails(BookDetail[] bookDetails) {
		this.bookDetails = bookDetails;
	}

	public void setBookDetails(
		UnsafeSupplier<BookDetail[], Exception> bookDetailsUnsafeSupplier) {

		try {
			bookDetails = bookDetailsUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected BookDetail[] bookDetails;

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public void setCurrentPage(
		UnsafeSupplier<Integer, Exception> currentPageUnsafeSupplier) {

		try {
			currentPage = currentPageUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer currentPage;

	public Integer getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(Integer totalItems) {
		this.totalItems = totalItems;
	}

	public void setTotalItems(
		UnsafeSupplier<Integer, Exception> totalItemsUnsafeSupplier) {

		try {
			totalItems = totalItemsUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer totalItems;

	public Integer getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public void setTotalPages(
		UnsafeSupplier<Integer, Exception> totalPagesUnsafeSupplier) {

		try {
			totalPages = totalPagesUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer totalPages;

	@Override
	public BookDetailPage clone() throws CloneNotSupportedException {
		return (BookDetailPage)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof BookDetailPage)) {
			return false;
		}

		BookDetailPage bookDetailPage = (BookDetailPage)object;

		return Objects.equals(toString(), bookDetailPage.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return BookDetailPageSerDes.toJSON(this);
	}

}