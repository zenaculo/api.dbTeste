package banco.simulado.api.service;

import banco.simulado.api.domain.Agencia.AgenciaRepository;
import banco.simulado.api.domain.Pessoa.PessoaRepository;
import banco.simulado.api.domain.Pessoa.PessoaSpecifications;
import banco.simulado.api.domain.Pessoa.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class PessoaServiceImpl implements PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;

    @Override
    public Page<Pessoa> getTodasPessoas(Pageable pageable) {
        return pessoaRepository.findAll(pageable);
    }
    @Override
    public Page<Pessoa> getPessoasPorIdadeESobrenome(int idade, String sobrenome, Pageable pageable) {
        Specification<Pessoa> spec = Specification.where(PessoaSpecifications.temIdade(idade))
                .and(PessoaSpecifications.temSobrenome(sobrenome));
        return pessoaRepository.findAll(spec, pageable);
    }
}
