package guestbook.rest.client.serdes.v1_0;

import guestbook.rest.client.dto.v1_0.ReturnBookRequest;
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
public class ReturnBookRequestSerDes {

	public static ReturnBookRequest toDTO(String json) {
		ReturnBookRequestJSONParser returnBookRequestJSONParser =
			new ReturnBookRequestJSONParser();

		return returnBookRequestJSONParser.parseToDTO(json);
	}

	public static ReturnBookRequest[] toDTOs(String json) {
		ReturnBookRequestJSONParser returnBookRequestJSONParser =
			new ReturnBookRequestJSONParser();

		return returnBookRequestJSONParser.parseToDTOs(json);
	}

	public static String toJSON(ReturnBookRequest returnBookRequest) {
		if (returnBookRequest == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (returnBookRequest.getBookId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"bookId\": ");

			sb.append(returnBookRequest.getBookId());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		ReturnBookRequestJSONParser returnBookRequestJSONParser =
			new ReturnBookRequestJSONParser();

		return returnBookRequestJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(
		ReturnBookRequest returnBookRequest) {

		if (returnBookRequest == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (returnBookRequest.getBookId() == null) {
			map.put("bookId", null);
		}
		else {
			map.put("bookId", String.valueOf(returnBookRequest.getBookId()));
		}

		return map;
	}

	public static class ReturnBookRequestJSONParser
		extends BaseJSONParser<ReturnBookRequest> {

		@Override
		protected ReturnBookRequest createDTO() {
			return new ReturnBookRequest();
		}

		@Override
		protected ReturnBookRequest[] createDTOArray(int size) {
			return new ReturnBookRequest[size];
		}

		@Override
		protected void setField(
			ReturnBookRequest returnBookRequest, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "bookId")) {
				if (jsonParserFieldValue != null) {
					returnBookRequest.setBookId(
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