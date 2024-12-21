package guestbook.rest.dto.v1_0;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.liferay.petra.function.UnsafeSupplier;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.util.ObjectMapperUtil;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.annotation.Generated;

import javax.validation.Valid;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author linhp
 * @generated
 */
@Generated("")
@GraphQLName("BookDetailPage")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "BookDetailPage")
public class BookDetailPage implements Serializable {

	public static BookDetailPage toDTO(String json) {
		return ObjectMapperUtil.readValue(BookDetailPage.class, json);
	}

	public static BookDetailPage unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(BookDetailPage.class, json);
	}

	@Schema
	@Valid
	public BookDetail[] getBookDetails() {
		return bookDetails;
	}

	public void setBookDetails(BookDetail[] bookDetails) {
		this.bookDetails = bookDetails;
	}

	@JsonIgnore
	public void setBookDetails(
		UnsafeSupplier<BookDetail[], Exception> bookDetailsUnsafeSupplier) {

		try {
			bookDetails = bookDetailsUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected BookDetail[] bookDetails;

	@Schema
	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	@JsonIgnore
	public void setCurrentPage(
		UnsafeSupplier<Integer, Exception> currentPageUnsafeSupplier) {

		try {
			currentPage = currentPageUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Integer currentPage;

	@Schema
	public Integer getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(Integer totalItems) {
		this.totalItems = totalItems;
	}

	@JsonIgnore
	public void setTotalItems(
		UnsafeSupplier<Integer, Exception> totalItemsUnsafeSupplier) {

		try {
			totalItems = totalItemsUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Integer totalItems;

	@Schema
	public Integer getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	@JsonIgnore
	public void setTotalPages(
		UnsafeSupplier<Integer, Exception> totalPagesUnsafeSupplier) {

		try {
			totalPages = totalPagesUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Integer totalPages;

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
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (bookDetails != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"bookDetails\": ");

			sb.append("[");

			for (int i = 0; i < bookDetails.length; i++) {
				sb.append(String.valueOf(bookDetails[i]));

				if ((i + 1) < bookDetails.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (currentPage != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"currentPage\": ");

			sb.append(currentPage);
		}

		if (totalItems != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalItems\": ");

			sb.append(totalItems);
		}

		if (totalPages != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalPages\": ");

			sb.append(totalPages);
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "guestbook.rest.dto.v1_0.BookDetailPage",
		name = "x-class-name"
	)
	public String xClassName;

	private static String _escape(Object object) {
		return StringUtil.replace(
			String.valueOf(object), _JSON_ESCAPE_STRINGS[0],
			_JSON_ESCAPE_STRINGS[1]);
	}

	private static boolean _isArray(Object value) {
		if (value == null) {
			return false;
		}

		Class<?> clazz = value.getClass();

		return clazz.isArray();
	}

	private static String _toJSON(Map<String, ?> map) {
		StringBuilder sb = new StringBuilder("{");

		@SuppressWarnings("unchecked")
		Set set = map.entrySet();

		@SuppressWarnings("unchecked")
		Iterator<Map.Entry<String, ?>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, ?> entry = iterator.next();

			sb.append("\"");
			sb.append(_escape(entry.getKey()));
			sb.append("\": ");

			Object value = entry.getValue();

			if (_isArray(value)) {
				sb.append("[");

				Object[] valueArray = (Object[])value;

				for (int i = 0; i < valueArray.length; i++) {
					if (valueArray[i] instanceof String) {
						sb.append("\"");
						sb.append(valueArray[i]);
						sb.append("\"");
					}
					else {
						sb.append(valueArray[i]);
					}

					if ((i + 1) < valueArray.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof Map) {
				sb.append(_toJSON((Map<String, ?>)value));
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(value));
				sb.append("\"");
			}
			else {
				sb.append(value);
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

	private static final String[][] _JSON_ESCAPE_STRINGS = {
		{"\\", "\"", "\b", "\f", "\n", "\r", "\t"},
		{"\\\\", "\\\"", "\\b", "\\f", "\\n", "\\r", "\\t"}
	};

}