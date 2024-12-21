package guestbook.rest.internal.graphql.query.v1_0;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;
import guestbook.rest.dto.v1_0.BookDetail;
import guestbook.rest.resource.v1_0.BookDetailResource;
import org.osgi.service.component.ComponentServiceObjects;

import javax.annotation.Generated;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.UriInfo;
import java.util.Map;
import java.util.function.BiFunction;

/**
 * @author linhp
 * @generated
 */
@Generated("")
public class Query {

    private static ComponentServiceObjects<BookDetailResource>
            _bookDetailResourceComponentServiceObjects;
    private AcceptLanguage _acceptLanguage;
    private com.liferay.portal.kernel.model.Company _company;
    private BiFunction<Object, String, Filter> _filterBiFunction;
    private GroupLocalService _groupLocalService;
    private HttpServletRequest _httpServletRequest;
    private HttpServletResponse _httpServletResponse;
    private RoleLocalService _roleLocalService;
    private BiFunction<Object, String, Sort[]> _sortsBiFunction;
    private UriInfo _uriInfo;
    private com.liferay.portal.kernel.model.User _user;

    public static void setBookDetailResourceComponentServiceObjects(
            ComponentServiceObjects<BookDetailResource>
                    bookDetailResourceComponentServiceObjects) {

        _bookDetailResourceComponentServiceObjects =
                bookDetailResourceComponentServiceObjects;
    }

    /**
     * Invoke this method with the command line:
     * <p>
     * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {bookDetails(keywords: ___, orderByCol: ___, orderByType: ___, page: ___, pageSize: ___){bookDetails, totalItems, currentPage, totalPages}}"}' -u 'test@liferay.com:test'
     */
    @GraphQLField
    public guestbook.rest.dto.v1_0.BookDetailPage bookDetails(
            @GraphQLName("keywords") String keywords,
            @GraphQLName("orderByCol") String orderByCol,
            @GraphQLName("orderByType") String orderByType,
            @GraphQLName("pageSize") int pageSize,
            @GraphQLName("page") int page)
            throws Exception {

        return _applyComponentServiceObjects(
                _bookDetailResourceComponentServiceObjects,
                this::_populateResourceContext,
                bookDetailResource -> {
                    try {
                        return bookDetailResource.getBookDetails(
                                keywords, orderByCol, orderByType,
                                Pagination.of(page, pageSize));
                    } catch (Exception e) {
                        throw new RuntimeException();
                    }
                });
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
        } finally {
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

    @GraphQLName("BookDetailPage")
    public class BookDetailPage {

        @GraphQLField
        protected Map<String, Map> actions;
        @GraphQLField
        protected java.util.Collection<BookDetail> items;
        @GraphQLField
        protected long lastPage;
        @GraphQLField
        protected long page;
        @GraphQLField
        protected long pageSize;
        @GraphQLField
        protected long totalCount;

        public BookDetailPage(Page bookDetailPage) {
            actions = bookDetailPage.getActions();

            items = bookDetailPage.getItems();
            lastPage = bookDetailPage.getLastPage();
            page = bookDetailPage.getPage();
            pageSize = bookDetailPage.getPageSize();
            totalCount = bookDetailPage.getTotalCount();
        }

    }

}
