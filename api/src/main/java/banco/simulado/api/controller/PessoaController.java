package banco.simulado.api.controller;
import banco.simulado.api.domain.Pessoa.Pessoa;
import banco.simulado.api.service.AgenciaService;
import banco.simulado.api.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public Page<Pessoa> listar(@PageableDefault(sort = "id", direction = Sort.Direction.DESC, page = 0, size = 10) Pageable paginacao) {
        return pessoaService.getTodasPessoas(paginacao);
    }
    @GetMapping("/filtrar")
    public Page<Pessoa> getPersonsByAgeAndLastName(
            @PageableDefault(sort = "id", direction = Sort.Direction.DESC, page = 0, size = 10) Pageable paginacao,
            @RequestParam int idade,
            @RequestParam String sobrenome
    ) {
        return pessoaService.getPessoasPorIdadeESobrenome(idade, sobrenome, paginacao);
    }
}
