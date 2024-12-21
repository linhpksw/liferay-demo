package guestbook.rest.internal.graphql.mutation.v1_0;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;

import guestbook.rest.dto.v1_0.BookDetail;
import guestbook.rest.dto.v1_0.BorrowEntry;
import guestbook.rest.dto.v1_0.BorrowEntryRequest;
import guestbook.rest.dto.v1_0.ReturnBookRequest;
import guestbook.rest.resource.v1_0.BookDetailResource;
import guestbook.rest.resource.v1_0.BorrowEntryResource;

import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author linhp
 * @generated
 */
@Generated("")
public class Mutation {

	public static void setBookDetailResourceComponentServiceObjects(
		ComponentServiceObjects<BookDetailResource>
			bookDetailResourceComponentServiceObjects) {

		_bookDetailResourceComponentServiceObjects =
			bookDetailResourceComponentServiceObjects;
	}

	public static void setBorrowEntryResourceComponentServiceObjects(
		ComponentServiceObjects<BorrowEntryResource>
			borrowEntryResourceComponentServiceObjects) {

		_borrowEntryResourceComponentServiceObjects =
			borrowEntryResourceComponentServiceObjects;
	}

	@GraphQLField
	public BookDetail addBookDetail(
			@GraphQLName("bookDetail") BookDetail bookDetail)
		throws Exception {

		return _applyComponentServiceObjects(
			_bookDetailResourceComponentServiceObjects,
			this::_populateResourceContext,
			bookDetailResource -> bookDetailResource.addBookDetail(bookDetail));
	}

	@GraphQLField
	public Response deleteBookDetail(@GraphQLName("bookId") Long bookId)
		throws Exception {

		return _applyComponentServiceObjects(
			_bookDetailResourceComponentServiceObjects,
			this::_populateResourceContext,
			bookDetailResource -> bookDetailResource.deleteBookDetail(bookId));
	}

	@GraphQLField
	public Response deleteBookDetailBatch(
			@GraphQLName("bookId") Long bookId,
			@GraphQLName("callbackURL") String callbackURL,
			@GraphQLName("object") Object object)
		throws Exception {

		return _applyComponentServiceObjects(
			_bookDetailResourceComponentServiceObjects,
			this::_populateResourceContext,
			bookDetailResource -> bookDetailResource.deleteBookDetailBatch(
				bookId, callbackURL, object));
	}

	@GraphQLField
	public BookDetail updateBookDetail(
			@GraphQLName("bookId") Long bookId,
			@GraphQLName("bookDetail") BookDetail bookDetail)
		throws Exception {

		return _applyComponentServiceObjects(
			_bookDetailResourceComponentServiceObjects,
			this::_populateResourceContext,
			bookDetailResource -> bookDetailResource.updateBookDetail(
				bookId, bookDetail));
	}

	@GraphQLField(
		description = "Allows a user to borrow a book. It starts a workflow process."
	)
	public BorrowEntry borrowBook(
			@GraphQLName("borrowEntryRequest") BorrowEntryRequest
				borrowEntryRequest)
		throws Exception {

		return _applyComponentServiceObjects(
			_borrowEntryResourceComponentServiceObjects,
			this::_populateResourceContext,
			borrowEntryResource -> borrowEntryResource.borrowBook(
				borrowEntryRequest));
	}

	@GraphQLField
	public BorrowEntry returnBook(
			@GraphQLName("returnBookRequest") ReturnBookRequest
				returnBookRequest)
		throws Exception {

		return _applyComponentServiceObjects(
			_borrowEntryResourceComponentServiceObjects,
			this::_populateResourceContext,
			borrowEntryResource -> borrowEntryResource.returnBook(
				returnBookRequest));
	}

	private <T, R, E1 extends Throwable, E2 extends Throwable> R
			_applyComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeFunction<T, R, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			return unsafeFunction.apply(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private <T, E1 extends Throwable, E2 extends Throwable> void
			_applyVoidComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeConsumer<T, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			unsafeFunction.accept(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private void _populateResourceContext(BookDetailResource bookDetailResource)
		throws Exception {

		bookDetailResource.setContextAcceptLanguage(_acceptLanguage);
		bookDetailResource.setContextCompany(_company);
		bookDetailResource.setContextHttpServletRequest(_httpServletRequest);
		bookDetailResource.setContextHttpServletResponse(_httpServletResponse);
		bookDetailResource.setContextUriInfo(_uriInfo);
		bookDetailResource.setContextUser(_user);
		bookDetailResource.setGroupLocalService(_groupLocalService);
		bookDetailResource.setRoleLocalService(_roleLocalService);
	}

	private void _populateResourceContext(
			BorrowEntryResource borrowEntryResource)
		throws Exception {

		borrowEntryResource.setContextAcceptLanguage(_acceptLanguage);
		borrowEntryResource.setContextCompany(_company);
		borrowEntryResource.setContextHttpServletRequest(_httpServletRequest);
		borrowEntryResource.setContextHttpServletResponse(_httpServletResponse);
		borrowEntryResource.setContextUriInfo(_uriInfo);
		borrowEntryResource.setContextUser(_user);
		borrowEntryResource.setGroupLocalService(_groupLocalService);
		borrowEntryResource.setRoleLocalService(_roleLocalService);
	}

	private static ComponentServiceObjects<BookDetailResource>
		_bookDetailResourceComponentServiceObjects;
	private static ComponentServiceObjects<BorrowEntryResource>
		_borrowEntryResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private com.liferay.portal.kernel.model.Company _company;
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;

}