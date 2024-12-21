<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ include file="../init.jsp" %>

<div class="container">
    <div class="book-detail-add">
        <h1>Add New Book</h1>
        <portlet:actionURL name="addBookDetail" var="bookActionURL"/>
        <form action="<%= bookActionURL %>" method="post">
            <label for="title">Title</label>
            <input type="text"
                   name="<portlet:namespace />title"
                   id="title"
                   value="<%= ParamUtil.getString(renderRequest, "title", "") %>"
                   required/>
            
            
            <label for="author">Author</label>
            <input type="text"
                   name="<portlet:namespace />author"
                   id="author"
                   value="<%= ParamUtil.getString(renderRequest, "author", "") %>"
                   required/>
            
            <label for="isbn">ISBN</label>
            <input type="text"
                   name="<portlet:namespace />isbn"
                   id="isbn"
                   value="<%= ParamUtil.getString(renderRequest, "isbn", "") %>"
                   required/>
            
            <label for="description">Description</label>
            <textarea name="<portlet:namespace />description"
                      id="description"
                      rows="4"><%= ParamUtil.getString(renderRequest, "description", "") %></textarea>
            
            <button type="submit">Add Book</button>
            <button type="button" onclick="history.back()">Cancel</button>
        </form>
    </div>
</div>
