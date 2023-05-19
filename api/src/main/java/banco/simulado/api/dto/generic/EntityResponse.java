package banco.simulado.api.dto.generic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EntityResponse<T> {
    private List<T> content;
    private long totalElements;
    private int totalPages;
}
