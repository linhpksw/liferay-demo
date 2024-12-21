package guestbook.rest.client.serdes.v1_0;

import guestbook.rest.client.dto.v1_0.BorrowEntry;
import guestbook.rest.client.json.BaseJSONParser;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

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
public class BorrowEntrySerDes {

	public static BorrowEntry toDTO(String json) {
		BorrowEntryJSONParser borrowEntryJSONParser =
			new BorrowEntryJSONParser();

		return borrowEntryJSONParser.parseToDTO(json);
	}

	public static BorrowEntry[] toDTOs(String json) {
		BorrowEntryJSONParser borrowEntryJSONParser =
			new BorrowEntryJSONParser();

		return borrowEntryJSONParser.parseToDTOs(json);
	}

	public static String toJSON(BorrowEntry borrowEntry) {
		if (borrowEntry == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");

		if (borrowEntry.getActualReturnDate() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"actualReturnDate\": ");

			sb.append("\"");

			sb.append(
				liferayToJSONDateFormat.format(
					borrowEntry.getActualReturnDate()));

			sb.append("\"");
		}

		if (borrowEntry.getBookId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"bookId\": ");

			sb.append(borrowEntry.getBookId());
		}

		if (borrowEntry.getBorrowDate() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"borrowDate\": ");

			sb.append("\"");

			sb.append(
				liferayToJSONDateFormat.format(borrowEntry.getBorrowDate()));

			sb.append("\"");
		}

		if (borrowEntry.getEntryId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"entryId\": ");

			sb.append(borrowEntry.getEntryId());
		}

		if (borrowEntry.getExpectedReturnDate() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"expectedReturnDate\": ");

			sb.append("\"");

			sb.append(
				liferayToJSONDateFormat.format(
					borrowEntry.getExpectedReturnDate()));

			sb.append("\"");
		}

		if (borrowEntry.getStatus() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"status\": ");

			sb.append("\"");

			sb.append(_escape(borrowEntry.getStatus()));

			sb.append("\"");
		}

		if (borrowEntry.getUserId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"userId\": ");

			sb.append(borrowEntry.getUserId());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		BorrowEntryJSONParser borrowEntryJSONParser =
			new BorrowEntryJSONParser();

		return borrowEntryJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(BorrowEntry borrowEntry) {
		if (borrowEntry == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");

		if (borrowEntry.getActualReturnDate() == null) {
			map.put("actualReturnDate", null);
		}
		else {
			map.put(
				"actualReturnDate",
				liferayToJSONDateFormat.format(
					borrowEntry.getActualReturnDate()));
		}

		if (borrowEntry.getBookId() == null) {
			map.put("bookId", null);
		}
		else {
			map.put("bookId", String.valueOf(borrowEntry.getBookId()));
		}

		if (borrowEntry.getBorrowDate() == null) {
			map.put("borrowDate", null);
		}
		else {
			map.put(
				"borrowDate",
				liferayToJSONDateFormat.format(borrowEntry.getBorrowDate()));
		}

		if (borrowEntry.getEntryId() == null) {
			map.put("entryId", null);
		}
		else {
			map.put("entryId", String.valueOf(borrowEntry.getEntryId()));
		}

		if (borrowEntry.getExpectedReturnDate() == null) {
			map.put("expectedReturnDate", null);
		}
		else {
			map.put(
				"expectedReturnDate",
				liferayToJSONDateFormat.format(
					borrowEntry.getExpectedReturnDate()));
		}

		if (borrowEntry.getStatus() == null) {
			map.put("status", null);
		}
		else {
			map.put("status", String.valueOf(borrowEntry.getStatus()));
		}

		if (borrowEntry.getUserId() == null) {
			map.put("userId", null);
		}
		else {
			map.put("userId", String.valueOf(borrowEntry.getUserId()));
		}

		return map;
	}

	public static class BorrowEntryJSONParser
		extends BaseJSONParser<BorrowEntry> {

		@Override
		protected BorrowEntry createDTO() {
			return new BorrowEntry();
		}

		@Override
		protected BorrowEntry[] createDTOArray(int size) {
			return new BorrowEntry[size];
		}

		@Override
		protected void setField(
			BorrowEntry borrowEntry, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "actualReturnDate")) {
				if (jsonParserFieldValue != null) {
					borrowEntry.setActualReturnDate(
						toDate((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "bookId")) {
				if (jsonParserFieldValue != null) {
					borrowEntry.setBookId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "borrowDate")) {
				if (jsonParserFieldValue != null) {
					borrowEntry.setBorrowDate(
						toDate((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "entryId")) {
				if (jsonParserFieldValue != null) {
					borrowEntry.setEntryId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "expectedReturnDate")) {

				if (jsonParserFieldValue != null) {
					borrowEntry.setExpectedReturnDate(
						toDate((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "status")) {
				if (jsonParserFieldValue != null) {
					borrowEntry.setStatus((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "userId")) {
				if (jsonParserFieldValue != null) {
					borrowEntry.setUserId(
						Long.valueOf((String)jsonParserFieldValue));
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