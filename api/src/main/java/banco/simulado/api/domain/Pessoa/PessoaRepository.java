package banco.simulado.api.domain.Pessoa;

import banco.simulado.api.domain.GenericoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends GenericoRepository<Pessoa, Long> {
    Page<Pessoa> findAll(Specification<Pessoa> spec, Pageable pageable);
}
