package banco.simulado.api.domain.Page;

import lombok.*;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paging {
    private int page;
    private int size;
    private List<SortField> sorting;
}