package guestbook.rest.client.serdes.v1_0;

import guestbook.rest.client.dto.v1_0.BookDetail;
import guestbook.rest.client.json.BaseJSONParser;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Generated;

/**
 * @author linhp
 * @generated
 */
@Generated("")
public class BookDetailSerDes {

	public static BookDetail toDTO(String json) {
		BookDetailJSONParser bookDetailJSONParser = new BookDetailJSONParser();

		return bookDetailJSONParser.parseToDTO(json);
	}

	public static BookDetail[] toDTOs(String json) {
		BookDetailJSONParser bookDetailJSONParser = new BookDetailJSONParser();

		return bookDetailJSONParser.parseToDTOs(json);
	}

	public static String toJSON(BookDetail bookDetail) {
		if (bookDetail == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (bookDetail.getAuthor() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"author\": ");

			sb.append("\"");

			sb.append(_escape(bookDetail.getAuthor()));

			sb.append("\"");
		}

		if (bookDetail.getDescription() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"description\": ");

			sb.append("\"");

			sb.append(_escape(bookDetail.getDescription()));

			sb.append("\"");
		}

		if (bookDetail.getId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(bookDetail.getId());
		}

		if (bookDetail.getIsbn() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"isbn\": ");

			sb.append("\"");

			sb.append(_escape(bookDetail.getIsbn()));

			sb.append("\"");
		}

		if (bookDetail.getTitle() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"title\": ");

			sb.append("\"");

			sb.append(_escape(bookDetail.getTitle()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		BookDetailJSONParser bookDetailJSONParser = new BookDetailJSONParser();

		return bookDetailJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(BookDetail bookDetail) {
		if (bookDetail == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (bookDetail.getAuthor() == null) {
			map.put("author", null);
		}
		else {
			map.put("author", String.valueOf(bookDetail.getAuthor()));
		}

		if (bookDetail.getDescription() == null) {
			map.put("description", null);
		}
		else {
			map.put("description", String.valueOf(bookDetail.getDescription()));
		}

		if (bookDetail.getId() == null) {
			map.put("id", null);
		}
		else {
			map.put("id", String.valueOf(bookDetail.getId()));
		}

		if (bookDetail.getIsbn() == null) {
			map.put("isbn", null);
		}
		else {
			map.put("isbn", String.valueOf(bookDetail.getIsbn()));
		}

		if (bookDetail.getTitle() == null) {
			map.put("title", null);
		}
		else {
			map.put("title", String.valueOf(bookDetail.getTitle()));
		}

		return map;
	}

	public static class BookDetailJSONParser
		extends BaseJSONParser<BookDetail> {

		@Override
		protected BookDetail createDTO() {
			return new BookDetail();
		}

		@Override
		protected BookDetail[] createDTOArray(int size) {
			return new BookDetail[size];
		}

		@Override
		protected void setField(
			BookDetail bookDetail, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "author")) {
				if (jsonParserFieldValue != null) {
					bookDetail.setAuthor((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "description")) {
				if (jsonParserFieldValue != null) {
					bookDetail.setDescription((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "id")) {
				if (jsonParserFieldValue != null) {
					bookDetail.setId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "isbn")) {
				if (jsonParserFieldValue != null) {
					bookDetail.setIsbn((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "title")) {
				if (jsonParserFieldValue != null) {
					bookDetail.setTitle((String)jsonParserFieldValue);
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