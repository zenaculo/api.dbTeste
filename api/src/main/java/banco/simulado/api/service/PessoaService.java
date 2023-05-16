package banco.simulado.api.service;

import banco.simulado.api.domain.Pessoa.Pessoa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PessoaService {
    Page<Pessoa> getTodasPessoas(Pageable pageable);
    Page<Pessoa> getPessoasPorIdadeESobrenome(int idade, String sobrenome, Pageable pageable);
}
