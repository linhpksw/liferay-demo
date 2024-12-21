package guestbook.web.portlet;

import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import guestbook.model.BookDetail;
import guestbook.model.BorrowEntry;
import guestbook.service.BookDetailLocalService;
import guestbook.service.BorrowEntryLocalService;
import guestbook.web.constants.BookDetailPortletKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.*;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component(
        property = {
                "com.liferay.portlet.display-category=category.social",
                "com.liferay.portlet.header-portlet-css=/css/main.css",
                "com.liferay.portlet.instanceable=false",
                "com.liferay.portlet.scopeable=true",
                "javax.portlet.display-name=BookDetail",
                "javax.portlet.init-param.template-path=/",
                "javax.portlet.init-param.view-template=/book-detail/view.jsp",
                "javax.portlet.name=" + BookDetailPortletKeys.BOOKDETAIL,
                "javax.portlet.resource-bundle=content.Language",
                "javax.portlet.security-role-ref=power-user,user"
        },
        service = Portlet.class
)

public class BookDetailPortlet extends MVCPortlet {
    @Reference
    private BookDetailLocalService _bookDetailLocalService;

    @Reference
    private BorrowEntryLocalService _borrowEntryLocalService;

    public void addBookDetail(ActionRequest request, ActionResponse response) throws PortalException {
        ServiceContext serviceContext = ServiceContextFactory.getInstance(BookDetail.class.getName(), request);

        String title = ParamUtil.getString(request, "title");
        String author = ParamUtil.getString(request, "author");
        String description = ParamUtil.getString(request, "description");
        String isbn = ParamUtil.getString(request, "isbn");
        int status = ParamUtil.getInteger(request, "status");

        try {
            _bookDetailLocalService.addBookDetail(
                    serviceContext.getUserId(), title, author, description, isbn, 0, serviceContext);

            // Set render parameters to return to the view page
            response.setRenderParameter("mvcPath", "/book-detail/view.jsp");

            SessionMessages.add(request, "bookAdded");
        } catch (Exception e) {
            Logger.getLogger(BookDetailPortlet.class.getName()).log(Level.SEVERE, null, e);
            SessionErrors.add(request, e.getClass().getName());

            PortalUtil.copyRequestParameters(request, response);
            response.setRenderParameter("mvcPath", "/book-detail/add.jsp");
        }
    }

    public void editBookDetail(ActionRequest request, ActionResponse response) throws PortalException, PortletException {
        ServiceContext serviceContext = ServiceContextFactory.getInstance(BookDetail.class.getName(), request);

        String title = ParamUtil.getString(request, "title");
        String author = ParamUtil.getString(request, "author");
        String description = ParamUtil.getString(request, "description");
        String isbn = ParamUtil.getString(request, "isbn");
        int status = ParamUtil.getInteger(request, "status");
        long bookId = ParamUtil.getLong(request, "bookId");

        try {
            // Update the book
            _bookDetailLocalService.updateBookDetail(
                    serviceContext.getUserId(), bookId, title, author, description, isbn, 0, serviceContext);

            // Set render parameters to return to the view page
            response.setRenderParameter("mvcPath", "/book-detail/view.jsp");

            SessionMessages.add(request, "bookUpdated");
        } catch (Exception e) {
            Logger.getLogger(BookDetailPortlet.class.getName()).log(Level.SEVERE, null, e);
            SessionErrors.add(request, e.getClass().getName());

            PortalUtil.copyRequestParameters(request, response);
            response.setRenderParameter("mvcPath", "/book-detail/edit.jsp");
        }
    }

    public void deleteBookDetail(ActionRequest request, ActionResponse response) throws PortalException {
        long bookId = ParamUtil.getLong(request, "bookId");

        try {
            _bookDetailLocalService.deleteBookDetail(bookId, ServiceContextFactory.getInstance(BookDetail.class.getName(), request));
            SessionMessages.add(request, "bookDeleted");

        } catch (Exception e) {
            Logger.getLogger(BookDetailPortlet.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void searchBooks(ActionRequest request, ActionResponse response) throws PortletException, IOException {
        String keywords = ParamUtil.getString(request, "keywords");
        String orderByCol = ParamUtil.getString(request, "orderByCol", "title");
        String orderByType = ParamUtil.getString(request, "orderByType", "asc");

        // Pass these parameters to the render phase
        response.setRenderParameter("keywords", keywords);
        response.setRenderParameter("orderByCol", orderByCol);
        response.setRenderParameter("orderByType", orderByType);
    }

    @ProcessAction(name = "borrowBook")
    public void borrowBook(ActionRequest actionRequest, ActionResponse actionResponse)
            throws PortalException {

        long bookId = ParamUtil.getLong(actionRequest, "bookId");
        long userId = PortalUtil.getUserId(actionRequest);

        // Logic for borrowing the book
        ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);

        _borrowEntryLocalService.addBorrowEntry(userId, bookId, new Date(), null, serviceContext);

        // Add success message
        SessionMessages.add(actionRequest, "bookBorrowed");

        // Redirect back to view
        actionResponse.setRenderParameter("mvcPath", "/book-detail/view.jsp");
    }

    @ProcessAction(name = "returnBook")
    public void returnBook(ActionRequest actionRequest, ActionResponse actionResponse)
            throws PortalException {

        long bookId = ParamUtil.getLong(actionRequest, "bookId");
        long entryId = ParamUtil.getLong(actionRequest, "entryId");
        long userId = PortalUtil.getUserId(actionRequest);

        // Logic for returning the book
        ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);

        // Retrieve the BorrowEntry and ensure it belongs to the user
        BorrowEntry borrowEntry = _borrowEntryLocalService.getBorrowEntry(entryId);
        if (borrowEntry.getUserId() != userId) {
            throw new PortalException("You are not authorized to return this book.");
        }

        // Update the BorrowEntry to mark it as returned
        _borrowEntryLocalService.returnBook(entryId, serviceContext);

        // Add success message
        SessionMessages.add(actionRequest, "bookReturned");

        // Redirect back to view
        actionResponse.setRenderParameter("mvcPath", "/book-detail/view.jsp");
    }

    @Override
    public void render(RenderRequest renderRequest, RenderResponse renderResponse)
            throws PortletException, IOException {
        try {
            String keywords = ParamUtil.getString(renderRequest, "keywords");
            String orderByCol = ParamUtil.getString(renderRequest, "orderByCol", "title");
            String orderByType = ParamUtil.getString(renderRequest, "orderByType", "asc");

            OrderByComparator<BookDetail> obc = OrderByComparatorFactoryUtil.create(
                    "BookDetail", orderByCol, "asc".equalsIgnoreCase(orderByType));

            int cur = ParamUtil.getInteger(renderRequest, SearchContainer.DEFAULT_CUR_PARAM, SearchContainer.DEFAULT_CUR);
            int delta = ParamUtil.getInteger(renderRequest, SearchContainer.DEFAULT_DELTA_PARAM, SearchContainer.DEFAULT_DELTA);

            int start = (cur - 1) * delta;
            int end = start + delta;

            List<BookDetail> bookDetails;
            int total;

            if (!keywords.isEmpty()) {
                bookDetails = _bookDetailLocalService.searchBookDetailsByKeywords(keywords, start, end, obc);
                total = _bookDetailLocalService.getBookDetailsCountByKeywords(keywords);
            } else {
                long groupId = PortalUtil.getScopeGroupId(renderRequest);
                bookDetails = _bookDetailLocalService.getBookDetails(groupId, start, end, obc);
                total = _bookDetailLocalService.getBookDetailsCount(groupId);
            }

            // Fetch all BorrowEntry records for the current group
            long groupId = PortalUtil.getScopeGroupId(renderRequest);
            List<BorrowEntry> borrowEntries = _borrowEntryLocalService.getBorrowEntries(groupId);

            renderRequest.setAttribute("bookDetails", bookDetails);
            renderRequest.setAttribute("borrowEntries", borrowEntries);
            renderRequest.setAttribute("total", total);
            renderRequest.setAttribute("keywords", keywords);
            renderRequest.setAttribute("orderByCol", orderByCol);
            renderRequest.setAttribute("orderByType", orderByType);
        } catch (Exception e) {
            Logger.getLogger(BookDetailPortlet.class.getName()).log(Level.SEVERE, "Error retrieving book details", e);
            renderRequest.setAttribute("errorMessage", "Unable to load book details.");
        }

        super.render(renderRequest, renderResponse);
    }
}
