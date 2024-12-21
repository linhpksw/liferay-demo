package guestbook.rest.internal.resource.v1_0;

import com.liferay.petra.function.UnsafeBiConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import guestbook.rest.dto.v1_0.BorrowEntry;
import guestbook.rest.dto.v1_0.BorrowEntryRequest;
import guestbook.rest.dto.v1_0.ReturnBookRequest;
import guestbook.rest.resource.v1_0.BorrowEntryResource;
import guestbook.service.BorrowEntryLocalService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import java.util.Collection;
import java.util.Date;

/**
 * @author linhp
 */
@Component(
        properties = "OSGI-INF/liferay/rest/v1_0/borrow-entry.properties",
        scope = ServiceScope.PROTOTYPE, service = BorrowEntryResource.class
)
public class BorrowEntryResourceImpl extends BaseBorrowEntryResourceImpl {

    @Reference
    private BorrowEntryLocalService _borrowEntryLocalService;

    @Override
    public void setContextBatchUnsafeBiConsumer(UnsafeBiConsumer<Collection<BorrowEntry>, UnsafeFunction<BorrowEntry, BorrowEntry, Exception>, Exception> contextBatchUnsafeBiConsumer) {

    }

    @Override
    public guestbook.rest.dto.v1_0.BorrowEntry borrowBook(BorrowEntryRequest borrowEntryRequest) throws Exception {
        ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
        long userId = serviceContext.getUserId();

        // Call existing addBorrowEntry method
        return toDTO(_borrowEntryLocalService.addBorrowEntry(
                userId, borrowEntryRequest.getBookId(),
                new Date(),
                borrowEntryRequest.getExpectedReturnDate(),
                serviceContext)
        );
    }

    @Override
    public BorrowEntry returnBook(ReturnBookRequest returnBookRequest) throws Exception {
        ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

        return toDTO(_borrowEntryLocalService.returnBookByBookId(
                returnBookRequest.getBookId(), serviceContext)
        );
    }

    private guestbook.rest.dto.v1_0.BorrowEntry toDTO(guestbook.model.BorrowEntry borrowEntry) {
        if (borrowEntry == null) {
            return null;
        }

        guestbook.rest.dto.v1_0.BorrowEntry dto = new guestbook.rest.dto.v1_0.BorrowEntry();
        dto.setEntryId(borrowEntry.getEntryId());
        dto.setBookId(borrowEntry.getBookId());
        dto.setUserId(borrowEntry.getUserId());
        dto.setBorrowDate(borrowEntry.getBorrowDate());
        dto.setExpectedReturnDate(borrowEntry.getExpectedReturnDate());
        dto.setActualReturnDate(borrowEntry.getActualReturnDate());

        return dto;
    }
}
