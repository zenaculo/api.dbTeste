package banco.simulado.api.utils.paging;

import banco.simulado.api.domain.Page.Paging;
import banco.simulado.api.domain.Page.SortField;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;

public class PageableUtils {
    public static Pageable buildPageable(Paging paging) {
        int page = paging.getPage();
        int size = paging.getSize();

        List<Sort.Order> sortOrders = createSortOrders(paging.getSorting());

        return PageRequest.of(page, size, Sort.by(sortOrders));
    }

    private static List<Sort.Order> createSortOrders(List<SortField> sortingFields) {
        List<Sort.Order> sortOrders = new ArrayList<>();

        if (sortingFields != null) {
            for (SortField sortField : sortingFields) {
                String field = sortField.getField();
                String direction = sortField.getDirection();
                Sort.Order sortOrder = Sort.Order.by(field).with(Sort.Direction.fromString(direction));
                sortOrders.add(sortOrder);
            }
        }

        return sortOrders;
    }
}
