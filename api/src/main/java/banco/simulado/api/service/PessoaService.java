package banco.simulado.api.service;

import banco.simulado.api.domain.Page.Filter;
import banco.simulado.api.domain.Pessoa.Pessoa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PessoaService {
    Page<Pessoa> getTodasPessoas(Pageable pageable);
    Page<Pessoa> filtrar(List<Filter> filtros, Pageable pageable);
}
