package banco.simulado.api.domain.Page;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PagingAndFilterRequest {
    private List<Filter> filters;
    private Paging paging;
}