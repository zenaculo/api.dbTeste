package banco.simulado.api.service;

import banco.simulado.api.domain.Page.Filter;
import banco.simulado.api.domain.Pessoa.PessoaRepository;
import banco.simulado.api.domain.Pessoa.Pessoa;
import banco.simulado.api.utils.domain.SpecificationUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaServiceImpl implements PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;

    @Override
    public Page<Pessoa> getTodasPessoas(Pageable pageable) {
        return pessoaRepository.findAll(pageable);
    }
    @Override
    public Page<Pessoa> filtrar(List<Filter> filtros, Pageable pageable) {
        Specification<Object> specification = SpecificationUtils.createSpecifications(filtros);
        return pessoaRepository.findAll(specification, pageable);
    }
}
