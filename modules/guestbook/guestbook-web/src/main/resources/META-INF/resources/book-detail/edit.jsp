<%@ page import="com.liferay.portal.kernel.exception.PortalException" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="guestbook.model.BookDetail" %>
<%@ page import="guestbook.service.BookDetailLocalServiceUtil" %>
<%@ page import="java.lang.RuntimeException" %>
<%@ include file="../init.jsp" %>

<%
    long bookId = ParamUtil.getLong(renderRequest, "bookId");
    BookDetail bookDetail = null;
    try {
        bookDetail = BookDetailLocalServiceUtil.getBookDetail(bookId);
    } catch (PortalException e) {
        throw new RuntimeException(e);
    }
%>

<div class="container">
    <div class="book-detail-edit">
        <h1>Edit Book Details</h1>
        <portlet:actionURL name="editBookDetail" var="bookActionURL"/>
        <form action="<%= bookActionURL %>" method="post">
            <input type="hidden" name="<portlet:namespace />bookId" value="<%= bookDetail.getBookId() %>"/>
            
            <label for="title">Title</label>
            <input type="text" name="<portlet:namespace />title" id="title" value="<%= bookDetail.getTitle() %>"
                   required/>
            
            <label for="author">Author</label>
            <input type="text" name="<portlet:namespace />author" id="author" value="<%= bookDetail.getAuthor() %>"
                   required/>
            
            <label for="isbn">ISBN</label>
            <input type="text" name="<portlet:namespace />isbn" id="isbn" value="<%= bookDetail.getIsbn() %>" required/>
            
            <label for="description">Description</label>
            <textarea name="<portlet:namespace />description" id="description"
                      rows="4"><%= bookDetail.getDescription() %></textarea>
            
            <button type="submit">Save</button>
            <button type="button" onclick="history.back()">Cancel</button>
        </form>
    </div>
</div>
