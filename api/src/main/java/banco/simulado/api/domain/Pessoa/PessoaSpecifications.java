package banco.simulado.api.domain.Pessoa;

import org.springframework.data.jpa.domain.Specification;

public class PessoaSpecifications {
    public static Specification<Pessoa> temIdade(int idade) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("idade"), idade);
    }

    public static Specification<Pessoa> temSobrenome(String sobrenome) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("sobrenome"), sobrenome);
    }
}
