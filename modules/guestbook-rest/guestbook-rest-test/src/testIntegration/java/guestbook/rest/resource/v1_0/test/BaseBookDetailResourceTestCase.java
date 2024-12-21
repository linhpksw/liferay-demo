package guestbook.rest.resource.v1_0.test;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;

import com.liferay.petra.reflect.ReflectionUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.service.CompanyLocalServiceUtil;
import com.liferay.portal.kernel.test.util.GroupTestUtil;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.odata.entity.EntityField;
import com.liferay.portal.odata.entity.EntityModel;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.vulcan.resource.EntityModelResource;

import guestbook.rest.client.dto.v1_0.BookDetail;
import guestbook.rest.client.dto.v1_0.BookDetailPage;
import guestbook.rest.client.http.HttpInvoker;
import guestbook.rest.client.pagination.Page;
import guestbook.rest.client.resource.v1_0.BookDetailResource;
import guestbook.rest.client.serdes.v1_0.BookDetailSerDes;

import java.lang.reflect.InvocationTargetException;

import java.text.DateFormat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.Generated;

import javax.ws.rs.core.MultivaluedHashMap;

import org.apache.commons.beanutils.BeanUtilsBean;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

/**
 * @author linhp
 * @generated
 */
@Generated("")
public abstract class BaseBookDetailResourceTestCase {

	@ClassRule
	@Rule
	public static final LiferayIntegrationTestRule liferayIntegrationTestRule =
		new LiferayIntegrationTestRule();

	@BeforeClass
	public static void setUpClass() throws Exception {
		_dateFormat = DateFormatFactoryUtil.getSimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");
	}

	@Before
	public void setUp() throws Exception {
		irrelevantGroup = GroupTestUtil.addGroup();
		testGroup = GroupTestUtil.addGroup();

		testCompany = CompanyLocalServiceUtil.getCompany(
			testGroup.getCompanyId());

		_bookDetailResource.setContextCompany(testCompany);

		BookDetailResource.Builder builder = BookDetailResource.builder();

		bookDetailResource = builder.authentication(
			"test@liferay.com", "test"
		).locale(
			LocaleUtil.getDefault()
		).build();
	}

	@After
	public void tearDown() throws Exception {
		GroupTestUtil.deleteGroup(irrelevantGroup);
		GroupTestUtil.deleteGroup(testGroup);
	}

	@Test
	public void testClientSerDesToDTO() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper() {
			{
				configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
				configure(
					SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
				enable(SerializationFeature.INDENT_OUTPUT);
				setDateFormat(new ISO8601DateFormat());
				setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
				setSerializationInclusion(JsonInclude.Include.NON_NULL);
				setVisibility(
					PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
				setVisibility(
					PropertyAccessor.GETTER, JsonAutoDetect.Visibility.NONE);
			}
		};

		BookDetail bookDetail1 = randomBookDetail();

		String json = objectMapper.writeValueAsString(bookDetail1);

		BookDetail bookDetail2 = BookDetailSerDes.toDTO(json);

		Assert.assertTrue(equals(bookDetail1, bookDetail2));
	}

	@Test
	public void testClientSerDesToJSON() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper() {
			{
				configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
				configure(
					SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
				setDateFormat(new ISO8601DateFormat());
				setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
				setSerializationInclusion(JsonInclude.Include.NON_NULL);
				setVisibility(
					PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
				setVisibility(
					PropertyAccessor.GETTER, JsonAutoDetect.Visibility.NONE);
			}
		};

		BookDetail bookDetail = randomBookDetail();

		String json1 = objectMapper.writeValueAsString(bookDetail);
		String json2 = BookDetailSerDes.toJSON(bookDetail);

		Assert.assertEquals(
			objectMapper.readTree(json1), objectMapper.readTree(json2));
	}

	@Test
	public void testEscapeRegexInStringFields() throws Exception {
		String regex = "^[0-9]+(\\.[0-9]{1,2})\"?";

		BookDetail bookDetail = randomBookDetail();

		bookDetail.setAuthor(regex);
		bookDetail.setDescription(regex);
		bookDetail.setIsbn(regex);
		bookDetail.setTitle(regex);

		String json = BookDetailSerDes.toJSON(bookDetail);

		Assert.assertFalse(json.contains(regex));

		bookDetail = BookDetailSerDes.toDTO(json);

		Assert.assertEquals(regex, bookDetail.getAuthor());
		Assert.assertEquals(regex, bookDetail.getDescription());
		Assert.assertEquals(regex, bookDetail.getIsbn());
		Assert.assertEquals(regex, bookDetail.getTitle());
	}

	@Test
	public void testAddBookDetail() throws Exception {
		BookDetail randomBookDetail = randomBookDetail();

		BookDetail postBookDetail = testAddBookDetail_addBookDetail(
			randomBookDetail);

		assertEquals(randomBookDetail, postBookDetail);
		assertValid(postBookDetail);
	}

	protected BookDetail testAddBookDetail_addBookDetail(BookDetail bookDetail)
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testDeleteBookDetail() throws Exception {
		@SuppressWarnings("PMD.UnusedLocalVariable")
		BookDetail bookDetail = testDeleteBookDetail_addBookDetail();

		assertHttpResponseStatusCode(
			204, bookDetailResource.deleteBookDetailHttpResponse(null));
	}

	protected BookDetail testDeleteBookDetail_addBookDetail() throws Exception {
		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testGraphQLDeleteBookDetail() throws Exception {
		BookDetail bookDetail = testGraphQLBookDetail_addBookDetail();

		Assert.assertTrue(
			JSONUtil.getValueAsBoolean(
				invokeGraphQLMutation(
					new GraphQLField(
						"deleteBookDetail",
						new HashMap<String, Object>() {
							{
								put();
							}
						})),
				"JSONObject/data", "Object/deleteBookDetail"));
	}

	@Test
	public void testUpdateBookDetail() throws Exception {
		BookDetail postBookDetail = testUpdateBookDetail_addBookDetail();

		BookDetail randomBookDetail = randomBookDetail();

		BookDetail putBookDetail = bookDetailResource.updateBookDetail(
			null, randomBookDetail);

		assertEquals(randomBookDetail, putBookDetail);
		assertValid(putBookDetail);

		BookDetail getBookDetail = bookDetailResource.updateBookDetail();

		assertEquals(randomBookDetail, getBookDetail);
		assertValid(getBookDetail);
	}

	protected BookDetail testUpdateBookDetail_addBookDetail() throws Exception {
		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testGetBookDetails() throws Exception {
		BookDetail postBookDetail = testGetBookDetail_addBookDetail();

		BookDetailPage postBookDetailPage =
			testGetBookDetails_addBookDetailPage(
				postBookDetail.getId(), randomBookDetailPage());

		BookDetailPage getBookDetailPage = bookDetailResource.getBookDetails(
			postBookDetail.getId());

		assertEquals(postBookDetailPage, getBookDetailPage);
		assertValid(getBookDetailPage);
	}

	protected BookDetailPage testGetBookDetails_addBookDetailPage(
			long bookDetailId, BookDetailPage bookDetailPage)
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	protected BookDetail testGraphQLBookDetail_addBookDetail()
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	protected void assertContains(
		BookDetail bookDetail, List<BookDetail> bookDetails) {

		boolean contains = false;

		for (BookDetail item : bookDetails) {
			if (equals(bookDetail, item)) {
				contains = true;

				break;
			}
		}

		Assert.assertTrue(
			bookDetails + " does not contain " + bookDetail, contains);
	}

	protected void assertHttpResponseStatusCode(
		int expectedHttpResponseStatusCode,
		HttpInvoker.HttpResponse actualHttpResponse) {

		Assert.assertEquals(
			expectedHttpResponseStatusCode, actualHttpResponse.getStatusCode());
	}

	protected void assertEquals(
		BookDetail bookDetail1, BookDetail bookDetail2) {

		Assert.assertTrue(
			bookDetail1 + " does not equal " + bookDetail2,
			equals(bookDetail1, bookDetail2));
	}

	protected void assertEquals(
		List<BookDetail> bookDetails1, List<BookDetail> bookDetails2) {

		Assert.assertEquals(bookDetails1.size(), bookDetails2.size());

		for (int i = 0; i < bookDetails1.size(); i++) {
			BookDetail bookDetail1 = bookDetails1.get(i);
			BookDetail bookDetail2 = bookDetails2.get(i);

			assertEquals(bookDetail1, bookDetail2);
		}
	}

	protected void assertEquals(
		BookDetailPage bookDetailPage1, BookDetailPage bookDetailPage2) {

		Assert.assertTrue(
			bookDetailPage1 + " does not equal " + bookDetailPage2,
			equals(bookDetailPage1, bookDetailPage2));
	}

	protected void assertEqualsIgnoringOrder(
		List<BookDetail> bookDetails1, List<BookDetail> bookDetails2) {

		Assert.assertEquals(bookDetails1.size(), bookDetails2.size());

		for (BookDetail bookDetail1 : bookDetails1) {
			boolean contains = false;

			for (BookDetail bookDetail2 : bookDetails2) {
				if (equals(bookDetail1, bookDetail2)) {
					contains = true;

					break;
				}
			}

			Assert.assertTrue(
				bookDetails2 + " does not contain " + bookDetail1, contains);
		}
	}

	protected void assertValid(BookDetail bookDetail) throws Exception {
		boolean valid = true;

		if (bookDetail.getId() == null) {
			valid = false;
		}

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("author", additionalAssertFieldName)) {
				if (bookDetail.getAuthor() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("description", additionalAssertFieldName)) {
				if (bookDetail.getDescription() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("isbn", additionalAssertFieldName)) {
				if (bookDetail.getIsbn() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("title", additionalAssertFieldName)) {
				if (bookDetail.getTitle() == null) {
					valid = false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		Assert.assertTrue(valid);
	}

	protected void assertValid(Page<BookDetail> page) {
		boolean valid = false;

		java.util.Collection<BookDetail> bookDetails = page.getItems();

		int size = bookDetails.size();

		if ((page.getLastPage() > 0) && (page.getPage() > 0) &&
			(page.getPageSize() > 0) && (page.getTotalCount() > 0) &&
			(size > 0)) {

			valid = true;
		}

		Assert.assertTrue(valid);
	}

	protected void assertValid(BookDetailPage bookDetailPage) {
		boolean valid = true;

		for (String additionalAssertFieldName :
				getAdditionalBookDetailPageAssertFieldNames()) {

			if (Objects.equals("bookDetails", additionalAssertFieldName)) {
				if (bookDetailPage.getBookDetails() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("currentPage", additionalAssertFieldName)) {
				if (bookDetailPage.getCurrentPage() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("totalItems", additionalAssertFieldName)) {
				if (bookDetailPage.getTotalItems() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("totalPages", additionalAssertFieldName)) {
				if (bookDetailPage.getTotalPages() == null) {
					valid = false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		Assert.assertTrue(valid);
	}

	protected String[] getAdditionalAssertFieldNames() {
		return new String[0];
	}

	protected String[] getAdditionalBookDetailPageAssertFieldNames() {
		return new String[0];
	}

	protected List<GraphQLField> getGraphQLFields() throws Exception {
		List<GraphQLField> graphQLFields = new ArrayList<>();

		for (java.lang.reflect.Field field :
				getDeclaredFields(guestbook.rest.dto.v1_0.BookDetail.class)) {

			if (!ArrayUtil.contains(
					getAdditionalAssertFieldNames(), field.getName())) {

				continue;
			}

			graphQLFields.addAll(getGraphQLFields(field));
		}

		return graphQLFields;
	}

	protected List<GraphQLField> getGraphQLFields(
			java.lang.reflect.Field... fields)
		throws Exception {

		List<GraphQLField> graphQLFields = new ArrayList<>();

		for (java.lang.reflect.Field field : fields) {
			com.liferay.portal.vulcan.graphql.annotation.GraphQLField
				vulcanGraphQLField = field.getAnnotation(
					com.liferay.portal.vulcan.graphql.annotation.GraphQLField.
						class);

			if (vulcanGraphQLField != null) {
				Class<?> clazz = field.getType();

				if (clazz.isArray()) {
					clazz = clazz.getComponentType();
				}

				List<GraphQLField> childrenGraphQLFields = getGraphQLFields(
					getDeclaredFields(clazz));

				graphQLFields.add(
					new GraphQLField(field.getName(), childrenGraphQLFields));
			}
		}

		return graphQLFields;
	}

	protected String[] getIgnoredEntityFieldNames() {
		return new String[0];
	}

	protected boolean equals(BookDetail bookDetail1, BookDetail bookDetail2) {
		if (bookDetail1 == bookDetail2) {
			return true;
		}

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("author", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						bookDetail1.getAuthor(), bookDetail2.getAuthor())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("description", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						bookDetail1.getDescription(),
						bookDetail2.getDescription())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("id", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						bookDetail1.getId(), bookDetail2.getId())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("isbn", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						bookDetail1.getIsbn(), bookDetail2.getIsbn())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("title", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						bookDetail1.getTitle(), bookDetail2.getTitle())) {

					return false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		return true;
	}

	protected boolean equals(
		Map<String, Object> map1, Map<String, Object> map2) {

		if (Objects.equals(map1.keySet(), map2.keySet())) {
			for (Map.Entry<String, Object> entry : map1.entrySet()) {
				if (entry.getValue() instanceof Map) {
					if (!equals(
							(Map)entry.getValue(),
							(Map)map2.get(entry.getKey()))) {

						return false;
					}
				}
				else if (!Objects.deepEquals(
							entry.getValue(), map2.get(entry.getKey()))) {

					return false;
				}
			}

			return true;
		}

		return false;
	}

	protected boolean equals(
		BookDetailPage bookDetailPage1, BookDetailPage bookDetailPage2) {

		if (bookDetailPage1 == bookDetailPage2) {
			return true;
		}

		for (String additionalAssertFieldName :
				getAdditionalBookDetailPageAssertFieldNames()) {

			if (Objects.equals("bookDetails", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						bookDetailPage1.getBookDetails(),
						bookDetailPage2.getBookDetails())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("currentPage", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						bookDetailPage1.getCurrentPage(),
						bookDetailPage2.getCurrentPage())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("totalItems", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						bookDetailPage1.getTotalItems(),
						bookDetailPage2.getTotalItems())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("totalPages", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						bookDetailPage1.getTotalPages(),
						bookDetailPage2.getTotalPages())) {

					return false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		return true;
	}

	protected java.lang.reflect.Field[] getDeclaredFields(Class clazz)
		throws Exception {

		Stream<java.lang.reflect.Field> stream = Stream.of(
			ReflectionUtil.getDeclaredFields(clazz));

		return stream.filter(
			field -> !field.isSynthetic()
		).toArray(
			java.lang.reflect.Field[]::new
		);
	}

	protected java.util.Collection<EntityField> getEntityFields()
		throws Exception {

		if (!(_bookDetailResource instanceof EntityModelResource)) {
			throw new UnsupportedOperationException(
				"Resource is not an instance of EntityModelResource");
		}

		EntityModelResource entityModelResource =
			(EntityModelResource)_bookDetailResource;

		EntityModel entityModel = entityModelResource.getEntityModel(
			new MultivaluedHashMap());

		Map<String, EntityField> entityFieldsMap =
			entityModel.getEntityFieldsMap();

		return entityFieldsMap.values();
	}

	protected List<EntityField> getEntityFields(EntityField.Type type)
		throws Exception {

		java.util.Collection<EntityField> entityFields = getEntityFields();

		Stream<EntityField> stream = entityFields.stream();

		return stream.filter(
			entityField ->
				Objects.equals(entityField.getType(), type) &&
				!ArrayUtil.contains(
					getIgnoredEntityFieldNames(), entityField.getName())
		).collect(
			Collectors.toList()
		);
	}

	protected String getFilterString(
		EntityField entityField, String operator, BookDetail bookDetail) {

		StringBundler sb = new StringBundler();

		String entityFieldName = entityField.getName();

		sb.append(entityFieldName);

		sb.append(" ");
		sb.append(operator);
		sb.append(" ");

		if (entityFieldName.equals("author")) {
			sb.append("'");
			sb.append(String.valueOf(bookDetail.getAuthor()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("description")) {
			sb.append("'");
			sb.append(String.valueOf(bookDetail.getDescription()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("id")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("isbn")) {
			sb.append("'");
			sb.append(String.valueOf(bookDetail.getIsbn()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("title")) {
			sb.append("'");
			sb.append(String.valueOf(bookDetail.getTitle()));
			sb.append("'");

			return sb.toString();
		}

		throw new IllegalArgumentException(
			"Invalid entity field " + entityFieldName);
	}

	protected String invoke(String query) throws Exception {
		HttpInvoker httpInvoker = HttpInvoker.newHttpInvoker();

		httpInvoker.body(
			JSONUtil.put(
				"query", query
			).toString(),
			"application/json");
		httpInvoker.httpMethod(HttpInvoker.HttpMethod.POST);
		httpInvoker.path("http://localhost:8080/o/graphql");
		httpInvoker.userNameAndPassword("test@liferay.com:test");

		HttpInvoker.HttpResponse httpResponse = httpInvoker.invoke();

		return httpResponse.getContent();
	}

	protected JSONObject invokeGraphQLMutation(GraphQLField graphQLField)
		throws Exception {

		GraphQLField mutationGraphQLField = new GraphQLField(
			"mutation", graphQLField);

		return JSONFactoryUtil.createJSONObject(
			invoke(mutationGraphQLField.toString()));
	}

	protected JSONObject invokeGraphQLQuery(GraphQLField graphQLField)
		throws Exception {

		GraphQLField queryGraphQLField = new GraphQLField(
			"query", graphQLField);

		return JSONFactoryUtil.createJSONObject(
			invoke(queryGraphQLField.toString()));
	}

	protected BookDetail randomBookDetail() throws Exception {
		return new BookDetail() {
			{
				author = StringUtil.toLowerCase(RandomTestUtil.randomString());
				description = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				id = RandomTestUtil.randomLong();
				isbn = StringUtil.toLowerCase(RandomTestUtil.randomString());
				title = StringUtil.toLowerCase(RandomTestUtil.randomString());
			}
		};
	}

	protected BookDetail randomIrrelevantBookDetail() throws Exception {
		BookDetail randomIrrelevantBookDetail = randomBookDetail();

		return randomIrrelevantBookDetail;
	}

	protected BookDetail randomPatchBookDetail() throws Exception {
		return randomBookDetail();
	}

	protected BookDetailPage randomBookDetailPage() throws Exception {
		return new BookDetailPage() {
			{
				currentPage = RandomTestUtil.randomInteger();
				totalItems = RandomTestUtil.randomInteger();
				totalPages = RandomTestUtil.randomInteger();
			}
		};
	}

	protected BookDetailResource bookDetailResource;
	protected Group irrelevantGroup;
	protected Company testCompany;
	protected Group testGroup;

	protected class GraphQLField {

		public GraphQLField(String key, GraphQLField... graphQLFields) {
			this(key, new HashMap<>(), graphQLFields);
		}

		public GraphQLField(String key, List<GraphQLField> graphQLFields) {
			this(key, new HashMap<>(), graphQLFields);
		}

		public GraphQLField(
			String key, Map<String, Object> parameterMap,
			GraphQLField... graphQLFields) {

			_key = key;
			_parameterMap = parameterMap;
			_graphQLFields = Arrays.asList(graphQLFields);
		}

		public GraphQLField(
			String key, Map<String, Object> parameterMap,
			List<GraphQLField> graphQLFields) {

			_key = key;
			_parameterMap = parameterMap;
			_graphQLFields = graphQLFields;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder(_key);

			if (!_parameterMap.isEmpty()) {
				sb.append("(");

				for (Map.Entry<String, Object> entry :
						_parameterMap.entrySet()) {

					sb.append(entry.getKey());
					sb.append(": ");
					sb.append(entry.getValue());
					sb.append(", ");
				}

				sb.setLength(sb.length() - 2);

				sb.append(")");
			}

			if (!_graphQLFields.isEmpty()) {
				sb.append("{");

				for (GraphQLField graphQLField : _graphQLFields) {
					sb.append(graphQLField.toString());
					sb.append(", ");
				}

				sb.setLength(sb.length() - 2);

				sb.append("}");
			}

			return sb.toString();
		}

		private final List<GraphQLField> _graphQLFields;
		private final String _key;
		private final Map<String, Object> _parameterMap;

	}

	private static final com.liferay.portal.kernel.log.Log _log =
		LogFactoryUtil.getLog(BaseBookDetailResourceTestCase.class);

	private static BeanUtilsBean _beanUtilsBean = new BeanUtilsBean() {

		@Override
		public void copyProperty(Object bean, String name, Object value)
			throws IllegalAccessException, InvocationTargetException {

			if (value != null) {
				super.copyProperty(bean, name, value);
			}
		}

	};
	private static DateFormat _dateFormat;

	@Inject
	private guestbook.rest.resource.v1_0.BookDetailResource _bookDetailResource;

}