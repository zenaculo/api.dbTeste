package banco.simulado.api.domain.Page;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SortField {
    private String field;
    private String direction;
}