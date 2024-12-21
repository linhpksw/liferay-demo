package guestbook.rest.internal.resource.v1_0;

import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.ResourceActionLocalService;
import com.liferay.portal.kernel.service.ResourcePermissionLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.odata.entity.EntityModel;
import com.liferay.portal.odata.filter.ExpressionConvert;
import com.liferay.portal.odata.filter.FilterParser;
import com.liferay.portal.odata.filter.FilterParserProvider;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.batch.engine.VulcanBatchEngineTaskItemDelegate;
import com.liferay.portal.vulcan.batch.engine.resource.VulcanBatchEngineImportTaskResource;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;
import com.liferay.portal.vulcan.resource.EntityModelResource;
import com.liferay.portal.vulcan.util.ActionUtil;
import com.liferay.portal.vulcan.util.TransformUtil;
import guestbook.rest.dto.v1_0.BookDetail;
import guestbook.rest.dto.v1_0.BookDetailPage;
import guestbook.rest.resource.v1_0.BookDetailResource;

import javax.annotation.Generated;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.io.Serializable;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * @author linhp
 * @generated
 */
@Generated("")
@javax.ws.rs.Path("/v1.0")
public abstract class BaseBookDetailResourceImpl
        implements BookDetailResource, EntityModelResource,
        VulcanBatchEngineTaskItemDelegate<BookDetail> {

    private static final com.liferay.portal.kernel.log.Log _log =
            LogFactoryUtil.getLog(BaseBookDetailResourceImpl.class);
    protected AcceptLanguage contextAcceptLanguage;
    protected com.liferay.portal.kernel.model.Company contextCompany;
    protected HttpServletRequest contextHttpServletRequest;
    protected HttpServletResponse contextHttpServletResponse;
    protected Object contextScopeChecker;
    protected UriInfo contextUriInfo;
    protected com.liferay.portal.kernel.model.User contextUser;
    protected ExpressionConvert<Filter> expressionConvert;
    protected FilterParserProvider filterParserProvider;
    protected GroupLocalService groupLocalService;
    protected ResourceActionLocalService resourceActionLocalService;
    protected ResourcePermissionLocalService resourcePermissionLocalService;
    protected RoleLocalService roleLocalService;
    protected VulcanBatchEngineImportTaskResource
            vulcanBatchEngineImportTaskResource;

    /**
     * Invoke this method with the command line:
     * <p>
     * curl -X 'GET' 'http://localhost:8080/o/guestbook-rest/v1.0/bookdetails'  -u 'test@liferay.com:test'
     */
    @io.swagger.v3.oas.annotations.Parameters(
            value = {
                    @io.swagger.v3.oas.annotations.Parameter(
                            in = io.swagger.v3.oas.annotations.enums.ParameterIn.QUERY,
                            name = "keywords"
                    ),
                    @io.swagger.v3.oas.annotations.Parameter(
                            in = io.swagger.v3.oas.annotations.enums.ParameterIn.QUERY,
                            name = "orderByCol"
                    ),
                    @io.swagger.v3.oas.annotations.Parameter(
                            in = io.swagger.v3.oas.annotations.enums.ParameterIn.QUERY,
                            name = "orderByType"
                    ),
                    @io.swagger.v3.oas.annotations.Parameter(
                            in = io.swagger.v3.oas.annotations.enums.ParameterIn.QUERY,
                            name = "page"
                    ),
                    @io.swagger.v3.oas.annotations.Parameter(
                            in = io.swagger.v3.oas.annotations.enums.ParameterIn.QUERY,
                            name = "pageSize"
                    )
            }
    )
    @io.swagger.v3.oas.annotations.tags.Tags(
            value = {@io.swagger.v3.oas.annotations.tags.Tag(name = "BookDetail")}
    )
    @javax.ws.rs.GET
    @javax.ws.rs.Path("/bookdetails")
    @javax.ws.rs.Produces({"application/json", "application/xml"})
    @Override
    public BookDetailPage getBookDetails(
            @io.swagger.v3.oas.annotations.Parameter(hidden = true)
            @javax.ws.rs.QueryParam("keywords")
            String keywords,
            @io.swagger.v3.oas.annotations.Parameter(hidden = true)
            @javax.ws.rs.QueryParam("orderByCol")
            String orderByCol,
            @io.swagger.v3.oas.annotations.Parameter(hidden = true)
            @javax.ws.rs.QueryParam("orderByType")
            String orderByType,
            @javax.ws.rs.core.Context Pagination pagination)
            throws Exception {

        return new BookDetailPage();
    }

    /**
     * Invoke this method with the command line:
     * <p>
     * curl -X 'POST' 'http://localhost:8080/o/guestbook-rest/v1.0/bookdetails' -d $'{"author": ___, "description": ___, "id": ___, "isbn": ___, "title": ___}' --header 'Content-Type: application/json' -u 'test@liferay.com:test'
     */
    @io.swagger.v3.oas.annotations.tags.Tags(
            value = {@io.swagger.v3.oas.annotations.tags.Tag(name = "BookDetail")}
    )
    @javax.ws.rs.Consumes({"application/json", "application/xml"})
    @javax.ws.rs.Path("/bookdetails")
    @javax.ws.rs.POST
    @javax.ws.rs.Produces({"application/json", "application/xml"})
    @Override
    public BookDetail addBookDetail(BookDetail bookDetail) throws Exception {
        return new BookDetail();
    }

    /**
     * Invoke this method with the command line:
     * <p>
     * curl -X 'DELETE' 'http://localhost:8080/o/guestbook-rest/v1.0/bookdetails/{bookId}'  -u 'test@liferay.com:test'
     */
    @io.swagger.v3.oas.annotations.Parameters(
            value = {
                    @io.swagger.v3.oas.annotations.Parameter(
                            in = io.swagger.v3.oas.annotations.enums.ParameterIn.PATH,
                            name = "bookId"
                    )
            }
    )
    @io.swagger.v3.oas.annotations.tags.Tags(
            value = {@io.swagger.v3.oas.annotations.tags.Tag(name = "BookDetail")}
    )
    @javax.ws.rs.DELETE
    @javax.ws.rs.Path("/bookdetails/{bookId}")
    @Override
    public Response deleteBookDetail(
            @io.swagger.v3.oas.annotations.Parameter(hidden = true)
            @javax.validation.constraints.NotNull
            @javax.ws.rs.PathParam("bookId")
            Long bookId)
            throws Exception {

        Response.ResponseBuilder responseBuilder = Response.ok();

        return responseBuilder.build();
    }

    /**
     * Invoke this method with the command line:
     * <p>
     * curl -X 'DELETE' 'http://localhost:8080/o/guestbook-rest/v1.0/bookdetails/{bookId}/batch'  -u 'test@liferay.com:test'
     */
    @io.swagger.v3.oas.annotations.Parameters(
            value = {
                    @io.swagger.v3.oas.annotations.Parameter(
                            in = io.swagger.v3.oas.annotations.enums.ParameterIn.PATH,
                            name = "bookId"
                    ),
                    @io.swagger.v3.oas.annotations.Parameter(
                            in = io.swagger.v3.oas.annotations.enums.ParameterIn.QUERY,
                            name = "callbackURL"
                    )
            }
    )
    @io.swagger.v3.oas.annotations.tags.Tags(
            value = {@io.swagger.v3.oas.annotations.tags.Tag(name = "BookDetail")}
    )
    @javax.ws.rs.Consumes("application/json")
    @javax.ws.rs.DELETE
    @javax.ws.rs.Path("/bookdetails/{bookId}/batch")
    @javax.ws.rs.Produces("application/json")
    @Override
    public Response deleteBookDetailBatch(
            @io.swagger.v3.oas.annotations.Parameter(hidden = true)
            @javax.validation.constraints.NotNull
            @javax.ws.rs.PathParam("bookId")
            Long bookId,
            @io.swagger.v3.oas.annotations.Parameter(hidden = true)
            @javax.ws.rs.QueryParam("callbackURL")
            String callbackURL,
            Object object)
            throws Exception {

        vulcanBatchEngineImportTaskResource.setContextAcceptLanguage(
                contextAcceptLanguage);
        vulcanBatchEngineImportTaskResource.setContextCompany(contextCompany);
        vulcanBatchEngineImportTaskResource.setContextHttpServletRequest(
                contextHttpServletRequest);
        vulcanBatchEngineImportTaskResource.setContextUriInfo(contextUriInfo);
        vulcanBatchEngineImportTaskResource.setContextUser(contextUser);

        Response.ResponseBuilder responseBuilder = Response.accepted();

        return responseBuilder.entity(
                vulcanBatchEngineImportTaskResource.deleteImportTask(
                        BookDetail.class.getName(), callbackURL, object)
        ).build();
    }

    /**
     * Invoke this method with the command line:
     * <p>
     * curl -X 'PUT' 'http://localhost:8080/o/guestbook-rest/v1.0/bookdetails/{bookId}' -d $'{"author": ___, "description": ___, "id": ___, "isbn": ___, "title": ___}' --header 'Content-Type: application/json' -u 'test@liferay.com:test'
     */
    @io.swagger.v3.oas.annotations.Parameters(
            value = {
                    @io.swagger.v3.oas.annotations.Parameter(
                            in = io.swagger.v3.oas.annotations.enums.ParameterIn.PATH,
                            name = "bookId"
                    )
            }
    )
    @io.swagger.v3.oas.annotations.tags.Tags(
            value = {@io.swagger.v3.oas.annotations.tags.Tag(name = "BookDetail")}
    )
    @javax.ws.rs.Consumes({"application/json", "application/xml"})
    @javax.ws.rs.Path("/bookdetails/{bookId}")
    @javax.ws.rs.Produces({"application/json", "application/xml"})
    @javax.ws.rs.PUT
    @Override
    public BookDetail updateBookDetail(
            @io.swagger.v3.oas.annotations.Parameter(hidden = true)
            @javax.validation.constraints.NotNull
            @javax.ws.rs.PathParam("bookId")
            Long bookId,
            BookDetail bookDetail)
            throws Exception {

        return new BookDetail();
    }

    @Override
    @SuppressWarnings("PMD.UnusedLocalVariable")
    public void create(
            java.util.Collection<BookDetail> bookDetails,
            Map<String, Serializable> parameters)
            throws Exception {
    }

    @Override
    public void delete(
            java.util.Collection<BookDetail> bookDetails,
            Map<String, Serializable> parameters)
            throws Exception {

        for (BookDetail bookDetail : bookDetails) {
            deleteBookDetail(bookDetail.getId());
        }
    }

    @Override
    public EntityModel getEntityModel(Map<String, List<String>> multivaluedMap)
            throws Exception {

        return getEntityModel(
                new MultivaluedHashMap<String, Object>(multivaluedMap));
    }

    @Override
    public EntityModel getEntityModel(MultivaluedMap multivaluedMap)
            throws Exception {

        return null;
    }

    @Override
    public Page<BookDetail> read(
            Filter filter, Pagination pagination, Sort[] sorts,
            Map<String, Serializable> parameters, String search)
            throws Exception {

        return null;
    }

    @Override
    public void setLanguageId(String languageId) {
        this.contextAcceptLanguage = new AcceptLanguage() {

            @Override
            public List<Locale> getLocales() {
                return null;
            }

            @Override
            public String getPreferredLanguageId() {
                return languageId;
            }

            @Override
            public Locale getPreferredLocale() {
                return LocaleUtil.fromLanguageId(languageId);
            }

        };
    }

    @Override
    public void update(
            java.util.Collection<BookDetail> bookDetails,
            Map<String, Serializable> parameters)
            throws Exception {
    }

    public void setContextAcceptLanguage(AcceptLanguage contextAcceptLanguage) {
        this.contextAcceptLanguage = contextAcceptLanguage;
    }

    public void setContextCompany(
            com.liferay.portal.kernel.model.Company contextCompany) {

        this.contextCompany = contextCompany;
    }

    public void setContextHttpServletRequest(
            HttpServletRequest contextHttpServletRequest) {

        this.contextHttpServletRequest = contextHttpServletRequest;
    }

    public void setContextHttpServletResponse(
            HttpServletResponse contextHttpServletResponse) {

        this.contextHttpServletResponse = contextHttpServletResponse;
    }

    public void setContextUriInfo(UriInfo contextUriInfo) {
        this.contextUriInfo = contextUriInfo;
    }

    public void setContextUser(
            com.liferay.portal.kernel.model.User contextUser) {

        this.contextUser = contextUser;
    }

    public void setExpressionConvert(
            ExpressionConvert<Filter> expressionConvert) {

        this.expressionConvert = expressionConvert;
    }

    public void setFilterParserProvider(
            FilterParserProvider filterParserProvider) {

        this.filterParserProvider = filterParserProvider;
    }

    public void setGroupLocalService(GroupLocalService groupLocalService) {
        this.groupLocalService = groupLocalService;
    }

    public void setResourceActionLocalService(
            ResourceActionLocalService resourceActionLocalService) {

        this.resourceActionLocalService = resourceActionLocalService;
    }

    public void setResourcePermissionLocalService(
            ResourcePermissionLocalService resourcePermissionLocalService) {

        this.resourcePermissionLocalService = resourcePermissionLocalService;
    }

    public void setRoleLocalService(RoleLocalService roleLocalService) {
        this.roleLocalService = roleLocalService;
    }

    @Override
    public Filter toFilter(
            String filterString, Map<String, List<String>> multivaluedMap) {

        try {
            EntityModel entityModel = getEntityModel(multivaluedMap);

            FilterParser filterParser = filterParserProvider.provide(
                    entityModel);

            com.liferay.portal.odata.filter.Filter oDataFilter =
                    new com.liferay.portal.odata.filter.Filter(
                            filterParser.parse(filterString));

            return expressionConvert.convert(
                    oDataFilter.getExpression(),
                    contextAcceptLanguage.getPreferredLocale(), entityModel);
        } catch (Exception exception) {
            _log.error("Invalid filter " + filterString, exception);
        }

        return null;
    }

    protected Map<String, String> addAction(
            String actionName, GroupedModel groupedModel, String methodName) {

        return ActionUtil.addAction(
                actionName, getClass(), groupedModel, methodName,
                contextScopeChecker, contextUriInfo);
    }

    protected Map<String, String> addAction(
            String actionName, Long id, String methodName, Long ownerId,
            String permissionName, Long siteId) {

        return ActionUtil.addAction(
                actionName, getClass(), id, methodName, contextScopeChecker,
                ownerId, permissionName, siteId, contextUriInfo);
    }

    protected Map<String, String> addAction(
            String actionName, Long id, String methodName,
            ModelResourcePermission modelResourcePermission) {

        return ActionUtil.addAction(
                actionName, getClass(), id, methodName, contextScopeChecker,
                modelResourcePermission, contextUriInfo);
    }

    protected Map<String, String> addAction(
            String actionName, String methodName, String permissionName,
            Long siteId) {

        return addAction(
                actionName, siteId, methodName, null, permissionName, siteId);
    }

    protected <T, R> List<R> transform(
            java.util.Collection<T> collection,
            UnsafeFunction<T, R, Exception> unsafeFunction) {

        return TransformUtil.transform(collection, unsafeFunction);
    }

    protected <T, R> R[] transform(
            T[] array, UnsafeFunction<T, R, Exception> unsafeFunction,
            Class<R> clazz) {

        return TransformUtil.transform(array, unsafeFunction, clazz);
    }

    protected <T, R> R[] transformToArray(
            java.util.Collection<T> collection,
            UnsafeFunction<T, R, Exception> unsafeFunction, Class<R> clazz) {

        return TransformUtil.transformToArray(
                collection, unsafeFunction, clazz);
    }

    protected <T, R> List<R> transformToList(
            T[] array, UnsafeFunction<T, R, Exception> unsafeFunction) {

        return TransformUtil.transformToList(array, unsafeFunction);
    }

}
