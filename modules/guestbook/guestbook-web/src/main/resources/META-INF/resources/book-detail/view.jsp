<%@ page import="com.liferay.portal.kernel.model.User" %>
<%@ page import="com.liferay.portal.kernel.service.UserLocalServiceUtil" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.workflow.WorkflowConstants" %>
<%@ page import="guestbook.model.BookDetail" %>
<%@ page import="guestbook.model.BorrowEntry" %>
<%@ page import="java.util.List" %>
<%@ include file="../init.jsp" %>

<liferay-ui:success key="bookAdded" message="book-added"/>

<%
    //    ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
    
    // Get user roles
    boolean isAdmin = themeDisplay.getPermissionChecker().isOmniadmin();
    boolean isUser = themeDisplay.getPermissionChecker().isSignedIn();
    boolean isGuest = !isUser;
    
    // Retrieve the book details from the render request
    List<BookDetail> bookDetails = (List<BookDetail>) request.getAttribute("bookDetails");
    List<BorrowEntry> borrowEntries = (List<BorrowEntry>) request.getAttribute("borrowEntries");
    boolean hasBooks = (bookDetails != null && !bookDetails.isEmpty());
%>

<div class="container">
    <div class="book-detail-view">
        <!-- Add New Book Button -->
        <h1>Book Details</h1>
        
        <div class="action-buttons">
            <portlet:actionURL name="searchBooks" var="searchURL"/>
            <!-- Search Form -->
            <form method="post" action="<%= searchURL %>" class="search-form">
                <input type="text" name="<portlet:namespace />keywords" placeholder="Search books..."
                       value="<%= ParamUtil.getString(request, "keywords", "") %>"/>
                
                <button type="submit">Search</button>
            </form>
            
            <% if (isAdmin) { %>
            <!-- Add New Book Button (Admins Only) -->
            <portlet:renderURL var="addBookURL">
                <portlet:param name="mvcPath" value="/book-detail/add.jsp"/>
            </portlet:renderURL>
            <button onclick="location.href='<%= addBookURL %>';">Add New Book</button>
            <% } %>
        </div>
        
        <!-- Liferay Search Container -->
        <liferay-ui:search-container total='<%= (Integer) request.getAttribute("total") %>'>
            <liferay-ui:search-container-results results="<%= bookDetails %>"/>
            
            <liferay-ui:search-container-row
                    className="guestbook.model.BookDetail" modelVar="book">
                
                <liferay-ui:search-container-column-text property="bookId" orderable="true"/>
                <liferay-ui:search-container-column-text property="title" orderable="true"/>
                <liferay-ui:search-container-column-text property="author" orderable="true"/>
                <liferay-ui:search-container-column-text property="isbn" orderable="true"/>
                <liferay-ui:search-container-column-text property="description" orderable="true"/>
                
                <%
                    final long currentBookId = book.getBookId();
                    // Retrieve the most recent BorrowEntry by bookId and status
                    BorrowEntry borrowEntry = borrowEntries.stream()
                            .filter(entry -> entry.getBookId() == currentBookId)
                            .min((e1, e2) -> e2.getModifiedDate().compareTo(e1.getModifiedDate()))
                            .orElse(null);
                    
                    // Determine the status based on BorrowEntry
                    String statusText = "Available";
                    String borrowedBy = "Not Borrowed";
                    User borrowUser = null;
                    
                    if (borrowEntry != null) {
                        int entryStatus = borrowEntry.getStatus();
                        borrowUser = UserLocalServiceUtil.getUser(borrowEntry.getUserId());
                        
                        // Evaluate workflow statuses
                        if (entryStatus == WorkflowConstants.STATUS_PENDING ||
                                entryStatus == WorkflowConstants.STATUS_DRAFT) {
                            statusText = "Pending Approval";
                            borrowedBy = "Waiting Review by " + borrowUser.getFullName();
                        } else if (entryStatus == WorkflowConstants.STATUS_APPROVED) {
                            statusText = "Borrowed";
                            borrowedBy = "Borrowed by " + borrowUser.getFullName();
                        } else if (entryStatus == WorkflowConstants.STATUS_DENIED) {
                            statusText = "Available";
                            borrowedBy = "Not Borrowed";
                        } else if (entryStatus == WorkflowConstants.STATUS_EXPIRED) {
                            statusText = "Available";
                            borrowedBy = "Not Borrowed";
                        }
                    }
                %>
                
                
                <!-- Display the corrected status -->
                <liferay-ui:search-container-column-text
                        name="status"
                        value="<%= statusText %>"
                        orderable="true"/>
                
                <!-- Display the user in the requested format -->
                <liferay-ui:search-container-column-text name="Detail">
                    <%= borrowedBy %>
                </liferay-ui:search-container-column-text>
                
                <liferay-ui:search-container-column-jsp align="center" path="/book-detail/actions.jsp"/>
            </liferay-ui:search-container-row>
            
            <liferay-ui:search-iterator/>
        </liferay-ui:search-container>
    </div>
</div>
