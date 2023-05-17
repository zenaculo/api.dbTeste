package banco.simulado.api.domain.Page;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PagingRequest {
    private Paging paging;
}