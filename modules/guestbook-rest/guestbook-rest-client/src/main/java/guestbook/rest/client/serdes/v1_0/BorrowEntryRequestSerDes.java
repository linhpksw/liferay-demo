package guestbook.rest.client.serdes.v1_0;

import guestbook.rest.client.dto.v1_0.BorrowEntryRequest;
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
public class BorrowEntryRequestSerDes {

	public static BorrowEntryRequest toDTO(String json) {
		BorrowEntryRequestJSONParser borrowEntryRequestJSONParser =
			new BorrowEntryRequestJSONParser();

		return borrowEntryRequestJSONParser.parseToDTO(json);
	}

	public static BorrowEntryRequest[] toDTOs(String json) {
		BorrowEntryRequestJSONParser borrowEntryRequestJSONParser =
			new BorrowEntryRequestJSONParser();

		return borrowEntryRequestJSONParser.parseToDTOs(json);
	}

	public static String toJSON(BorrowEntryRequest borrowEntryRequest) {
		if (borrowEntryRequest == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");

		if (borrowEntryRequest.getBookId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"bookId\": ");

			sb.append(borrowEntryRequest.getBookId());
		}

		if (borrowEntryRequest.getExpectedReturnDate() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"expectedReturnDate\": ");

			sb.append("\"");

			sb.append(
				liferayToJSONDateFormat.format(
					borrowEntryRequest.getExpectedReturnDate()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		BorrowEntryRequestJSONParser borrowEntryRequestJSONParser =
			new BorrowEntryRequestJSONParser();

		return borrowEntryRequestJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(
		BorrowEntryRequest borrowEntryRequest) {

		if (borrowEntryRequest == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");

		if (borrowEntryRequest.getBookId() == null) {
			map.put("bookId", null);
		}
		else {
			map.put("bookId", String.valueOf(borrowEntryRequest.getBookId()));
		}

		if (borrowEntryRequest.getExpectedReturnDate() == null) {
			map.put("expectedReturnDate", null);
		}
		else {
			map.put(
				"expectedReturnDate",
				liferayToJSONDateFormat.format(
					borrowEntryRequest.getExpectedReturnDate()));
		}

		return map;
	}

	public static class BorrowEntryRequestJSONParser
		extends BaseJSONParser<BorrowEntryRequest> {

		@Override
		protected BorrowEntryRequest createDTO() {
			return new BorrowEntryRequest();
		}

		@Override
		protected BorrowEntryRequest[] createDTOArray(int size) {
			return new BorrowEntryRequest[size];
		}

		@Override
		protected void setField(
			BorrowEntryRequest borrowEntryRequest, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "bookId")) {
				if (jsonParserFieldValue != null) {
					borrowEntryRequest.setBookId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "expectedReturnDate")) {

				if (jsonParserFieldValue != null) {
					borrowEntryRequest.setExpectedReturnDate(
						toDate((String)jsonParserFieldValue));
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