package guestbook.rest.internal.resource.v1_0;

import com.liferay.petra.function.UnsafeBiConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.vulcan.pagination.Pagination;
import guestbook.rest.dto.v1_0.BookDetail;
import guestbook.rest.dto.v1_0.BookDetailPage;
import guestbook.rest.resource.v1_0.BookDetailResource;
import guestbook.service.BookDetailLocalService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import javax.ws.rs.core.Response;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * @author linhp
 */
@Component(
        properties = "OSGI-INF/liferay/rest/v1_0/book-detail.properties",
        scope = ServiceScope.PROTOTYPE, service = BookDetailResource.class
)
public class BookDetailResourceImpl extends BaseBookDetailResourceImpl {
    @Reference
    private BookDetailLocalService _bookDetailLocalService;

    @Override
    public void setContextBatchUnsafeBiConsumer(UnsafeBiConsumer<Collection<BookDetail>, UnsafeFunction<BookDetail, BookDetail, Exception>, Exception> contextBatchUnsafeBiConsumer) {

    }

    @Override
    public BookDetailPage getBookDetails(String keywords, String orderByCol, String orderByType, Pagination pagination) {
        ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
        long groupId = serviceContext.getScopeGroupId();
        int totalItems;
        List<guestbook.model.BookDetail> bookDetails;

        // Determine ordering
        boolean ascending = "asc".equalsIgnoreCase(orderByType);
        OrderByComparator<guestbook.model.BookDetail> orderByComparator = OrderByComparatorFactoryUtil.create(
                "BookDetail", orderByCol, ascending);

        // Apply search and pagination
        if (keywords != null && !keywords.isEmpty()) {
            bookDetails = _bookDetailLocalService.searchBookDetailsByKeywords(
                    keywords, pagination.getStartPosition(), pagination.getEndPosition(), orderByComparator);
            totalItems = _bookDetailLocalService.getBookDetailsCountByKeywords(keywords);
        } else {
            bookDetails = _bookDetailLocalService.getBookDetails(
                    groupId, pagination.getStartPosition(), pagination.getEndPosition(), orderByComparator);
            totalItems = _bookDetailLocalService.getBookDetailsCount(groupId);
        }

        // Map results to DTOs
        List<guestbook.rest.dto.v1_0.BookDetail> bookDetailDTOs = bookDetails.stream()
                .map(this::toBookDetailDTO)
                .collect(Collectors.toList());

        // Create a new BookDetailPage and set its fields
        BookDetailPage bookDetailPage = new BookDetailPage();

        // Convert List to array for setting bookDetails
        guestbook.rest.dto.v1_0.BookDetail[] arrayOfBookDetails = bookDetailDTOs.toArray(
                new guestbook.rest.dto.v1_0.BookDetail[0]);

        bookDetailPage.setBookDetails(arrayOfBookDetails);
        bookDetailPage.setTotalItems(totalItems);
        bookDetailPage.setCurrentPage(pagination.getPage());
        bookDetailPage.setTotalPages((int) Math.ceil((double) totalItems / pagination.getPageSize()));

        return bookDetailPage;
    }

    @Override
    public BookDetail addBookDetail(BookDetail bookDetail) throws Exception {
        try {
            ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
            long userId = serviceContext.getUserId();

            // Create a new book detail
            _bookDetailLocalService.addBookDetail(
                    userId,
                    bookDetail.getTitle(),
                    bookDetail.getAuthor(),
                    bookDetail.getDescription(),
                    bookDetail.getIsbn(),
                    0, // Assuming 0 is a default value for groupId or other fields
                    serviceContext);

            return bookDetail; // Return the created BookDetail DTO
        } catch (Exception e) {
            Logger.getLogger(BookDetailResourceImpl.class.getName()).log(Level.SEVERE, "Error adding book detail", e);
            throw new RuntimeException("Failed to add book detail.", e); // Handle appropriately
        }
    }

    @Override
    public Response deleteBookDetail(Long bookId) throws Exception {
        try {
            ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

            // Delete the book detail
            _bookDetailLocalService.deleteBookDetail(bookId, serviceContext);
        } catch (Exception e) {
            Logger.getLogger(BookDetailResourceImpl.class.getName()).log(Level.SEVERE, "Error deleting book detail", e);
            throw new RuntimeException("Failed to delete book detail.", e); // Handle appropriately
        }
        return null;
    }

    @Override
    public BookDetail updateBookDetail(Long bookId, BookDetail bookDetail) throws Exception {
        try {
            ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
            long userId = serviceContext.getUserId();

            // Update the book detail
            _bookDetailLocalService.updateBookDetail(
                    userId,
                    bookId,
                    bookDetail.getTitle(),
                    bookDetail.getAuthor(),
                    bookDetail.getDescription(),
                    bookDetail.getIsbn(),
                    0, // Assuming 0 is a default value for groupId or other fields
                    serviceContext);

            return bookDetail; // Return the updated BookDetail DTO
        } catch (Exception e) {
            Logger.getLogger(BookDetailResourceImpl.class.getName()).log(Level.SEVERE, "Error updating book detail", e);
            throw new RuntimeException("Failed to update book detail.", e); // Handle appropriately
        }
    }

    private guestbook.rest.dto.v1_0.BookDetail toBookDetailDTO(guestbook.model.BookDetail bookDetail) {
        guestbook.rest.dto.v1_0.BookDetail dto = new guestbook.rest.dto.v1_0.BookDetail();
        dto.setId(bookDetail.getBookId());
        dto.setTitle(bookDetail.getTitle());
        dto.setAuthor(bookDetail.getAuthor());
        dto.setIsbn(bookDetail.getIsbn());
        dto.setDescription(bookDetail.getDescription());
        return dto;
    }
}
