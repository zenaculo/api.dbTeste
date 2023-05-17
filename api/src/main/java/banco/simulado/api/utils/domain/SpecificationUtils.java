package banco.simulado.api.utils.domain;

import banco.simulado.api.domain.Page.Filter;
import banco.simulado.api.domain.Page.Operator;
import org.springframework.data.jpa.domain.Specification;
import java.util.ArrayList;
import java.util.List;

public class SpecificationUtils {
    public static <T> Specification<T> createSpecifications(List<Filter> filters) {
        List<Specification<T>> specifications = new ArrayList<>();
        for (Filter filter : filters) {
            specifications.add(createSpecification(filter));
        }
        return specifications.stream().reduce(Specification::and).orElse(null);
    }

    public static <T> Specification<T> createSpecification(Filter filter) {
        String field = filter.getField();
        Object value = filter.getValue();
        Operator operator = filter.getOperator();

        switch (operator) {
            case EQUAL:
                return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get(field), value);
            case NOT_EQUAL:
                return (root, query, criteriaBuilder) -> criteriaBuilder.notEqual(root.get(field), value);
            default:
                throw new IllegalArgumentException("Operador não suportado: " + operator);
        }
    }
}
