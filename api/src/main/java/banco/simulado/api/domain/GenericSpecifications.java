package banco.simulado.api.domain;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.query.sqm.ComparisonOperator;
import org.springframework.data.jpa.domain.Specification;


public class GenericSpecifications<T> {

    public static <T, V> Specification<T> fieldComparison(String field, V value, ComparisonOperator operator) {
        return (Root<T> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) -> {
            switch (operator) {
                case EQUAL:
                    return criteriaBuilder.equal(root.get(field), value);
                case NOT_EQUAL:
                    return criteriaBuilder.notEqual(root.get(field), value);
                default:
                    throw new IllegalArgumentException("Operador de comparação não suportado: " + operator);
            }
        };
    }
}