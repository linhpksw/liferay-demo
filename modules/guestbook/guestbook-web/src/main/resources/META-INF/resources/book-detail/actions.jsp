<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.liferay.portal.kernel.workflow.WorkflowConstants" %>
<%@ page import="guestbook.model.BookDetail" %>
<%@ page import="guestbook.model.BorrowEntry" %>
<%@ page import="java.util.List" %>
<%@include file="../init.jsp" %>

<%
    // Retrieve the ResultRow and BookDetail object
    ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    BookDetail book = (BookDetail) row.getObject();
    
    // Role-based authorization
    boolean isAdmin = themeDisplay.getPermissionChecker().isOmniadmin();
    boolean isUser = themeDisplay.getPermissionChecker().isSignedIn() && !isAdmin;
    long userId = themeDisplay.getUserId();
    
    // Fetch BorrowEntry for the current book
    List<BorrowEntry> borrowEntries = (List<BorrowEntry>) request.getAttribute("borrowEntries");
    BorrowEntry borrowEntry = borrowEntries.stream()
            .filter(entry -> entry.getBookId() == book.getBookId())
            .min((e1, e2) -> e2.getModifiedDate().compareTo(e1.getModifiedDate()))
            .orElse(null);
    
    int borrowEntryStatus = (borrowEntry != null) ? borrowEntry.getStatus() : -1;
    long borrowEntryUserId = (borrowEntry != null) ? borrowEntry.getUserId() : -1;
    
    // Determine if the user can return the book
    boolean canReturn = (borrowEntryStatus == WorkflowConstants.STATUS_APPROVED) &&
            (borrowEntryUserId == userId);
    
    boolean canBorrow = borrowEntryStatus == -1
            || borrowEntryStatus == WorkflowConstants.STATUS_EXPIRED
            || borrowEntryStatus == WorkflowConstants.STATUS_DENIED;
%>

<liferay-ui:icon-menu>
    <% if (isAdmin) { %>
    <!-- Edit Action -->
    <portlet:renderURL var="editURL">
        <portlet:param name="bookId" value="<%= String.valueOf(book.getBookId()) %>"/>
        <portlet:param name="mvcPath" value="/book-detail/edit.jsp"/>
    </portlet:renderURL>
    <liferay-ui:icon image="edit" message="Edit" url="<%= editURL %>"/>
    
    <!-- Delete Action -->
    <portlet:actionURL name="deleteBookDetail" var="deleteURL">
        <portlet:param name="bookId" value="<%= String.valueOf(book.getBookId()) %>"/>
    </portlet:actionURL>
    <liferay-ui:icon-delete url="<%= deleteURL %>"/>
    <% } %>
    
    <% if (isUser) { %>
    
    <% if (canBorrow) { %>
    <!-- Borrow Action -->
    <portlet:actionURL name="borrowBook" var="borrowURL">
        <portlet:param name="bookId" value="<%= String.valueOf(book.getBookId()) %>"/>
    </portlet:actionURL>
    <liferay-ui:icon image="add" message="Borrow" url="<%= borrowURL %>"/>
    <% } %>
    
    <% if (canReturn) { %>
    <!-- Return Action -->
    <portlet:actionURL name="returnBook" var="returnURL">
        <portlet:param name="bookId" value="<%= String.valueOf(book.getBookId()) %>"/>
        <portlet:param name="entryId" value="<%= String.valueOf(borrowEntry.getEntryId()) %>"/>
    </portlet:actionURL>
    <liferay-ui:icon image="check" message="Return" url="<%= returnURL %>"/>
    <% } %>
    
    <% } %>
</liferay-ui:icon-menu>
