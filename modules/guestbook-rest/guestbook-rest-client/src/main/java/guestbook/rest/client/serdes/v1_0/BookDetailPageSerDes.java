package guestbook.rest.client.serdes.v1_0;

import guestbook.rest.client.dto.v1_0.BookDetail;
import guestbook.rest.client.dto.v1_0.BookDetailPage;
import guestbook.rest.client.json.BaseJSONParser;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author linhp
 * @generated
 */
@Generated("")
public class BookDetailPageSerDes {

	public static BookDetailPage toDTO(String json) {
		BookDetailPageJSONParser bookDetailPageJSONParser =
			new BookDetailPageJSONParser();

		return bookDetailPageJSONParser.parseToDTO(json);
	}

	public static BookDetailPage[] toDTOs(String json) {
		BookDetailPageJSONParser bookDetailPageJSONParser =
			new BookDetailPageJSONParser();

		return bookDetailPageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(BookDetailPage bookDetailPage) {
		if (bookDetailPage == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (bookDetailPage.getBookDetails() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"bookDetails\": ");

			sb.append("[");

			for (int i = 0; i < bookDetailPage.getBookDetails().length; i++) {
				sb.append(String.valueOf(bookDetailPage.getBookDetails()[i]));

				if ((i + 1) < bookDetailPage.getBookDetails().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (bookDetailPage.getCurrentPage() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"currentPage\": ");

			sb.append(bookDetailPage.getCurrentPage());
		}

		if (bookDetailPage.getTotalItems() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalItems\": ");

			sb.append(bookDetailPage.getTotalItems());
		}

		if (bookDetailPage.getTotalPages() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalPages\": ");

			sb.append(bookDetailPage.getTotalPages());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		BookDetailPageJSONParser bookDetailPageJSONParser =
			new BookDetailPageJSONParser();

		return bookDetailPageJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(BookDetailPage bookDetailPage) {
		if (bookDetailPage == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (bookDetailPage.getBookDetails() == null) {
			map.put("bookDetails", null);
		}
		else {
			map.put(
				"bookDetails", String.valueOf(bookDetailPage.getBookDetails()));
		}

		if (bookDetailPage.getCurrentPage() == null) {
			map.put("currentPage", null);
		}
		else {
			map.put(
				"currentPage", String.valueOf(bookDetailPage.getCurrentPage()));
		}

		if (bookDetailPage.getTotalItems() == null) {
			map.put("totalItems", null);
		}
		else {
			map.put(
				"totalItems", String.valueOf(bookDetailPage.getTotalItems()));
		}

		if (bookDetailPage.getTotalPages() == null) {
			map.put("totalPages", null);
		}
		else {
			map.put(
				"totalPages", String.valueOf(bookDetailPage.getTotalPages()));
		}

		return map;
	}

	public static class BookDetailPageJSONParser
		extends BaseJSONParser<BookDetailPage> {

		@Override
		protected BookDetailPage createDTO() {
			return new BookDetailPage();
		}

		@Override
		protected BookDetailPage[] createDTOArray(int size) {
			return new BookDetailPage[size];
		}

		@Override
		protected void setField(
			BookDetailPage bookDetailPage, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "bookDetails")) {
				if (jsonParserFieldValue != null) {
					bookDetailPage.setBookDetails(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> BookDetailSerDes.toDTO((String)object)
						).toArray(
							size -> new BookDetail[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "currentPage")) {
				if (jsonParserFieldValue != null) {
					bookDetailPage.setCurrentPage(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalItems")) {
				if (jsonParserFieldValue != null) {
					bookDetailPage.setTotalItems(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalPages")) {
				if (jsonParserFieldValue != null) {
					bookDetailPage.setTotalPages(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
		}

	}

	private static String _escape(Object object) {
		String string = String.valueOf(object);

		for (String[] strings : BaseJSONParser.JSON_ESCAPE_STRINGS) {
			string = string.replace(strings[0], strings[1]);
		}

		return string;
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
			sb.append(entry.getKey());
			sb.append("\": ");

			Object value = entry.getValue();

			Class<?> valueClass = value.getClass();

			if (value instanceof Map) {
				sb.append(_toJSON((Map)value));
			}
			else if (valueClass.isArray()) {
				Object[] values = (Object[])value;

				sb.append("[");

				for (int i = 0; i < values.length; i++) {
					sb.append("\"");
					sb.append(_escape(values[i]));
					sb.append("\"");

					if ((i + 1) < values.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(entry.getValue()));
				sb.append("\"");
			}
			else {
				sb.append(String.valueOf(entry.getValue()));
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

}