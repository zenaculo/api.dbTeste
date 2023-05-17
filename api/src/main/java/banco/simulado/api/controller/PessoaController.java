package banco.simulado.api.controller;
import banco.simulado.api.domain.Page.PagingAndFilterRequest;
import banco.simulado.api.domain.Pessoa.Pessoa;
import banco.simulado.api.dto.generic.EntityResponse;
import banco.simulado.api.service.PessoaService;
import banco.simulado.api.utils.paging.PageableUtils;
import banco.simulado.api.utils.validation.ValidationUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public ResponseEntity<EntityResponse<Pessoa>> listar(@RequestBody PagingAndFilterRequest paginacaoEfiltro) {
        ValidationUtils.validatePagingRequest(paginacaoEfiltro);
        Pageable paginavel = PageableUtils.buildPageable(paginacaoEfiltro.getPaging());
        Page<Pessoa> paginaPessoa = pessoaService.getTodasPessoas(paginavel);
        List<Pessoa> content = paginaPessoa.getContent();
        long totalElements = paginaPessoa.getTotalElements();
        int totalPages = paginaPessoa.getTotalPages();

        EntityResponse<Pessoa> response = new EntityResponse<>(content, totalElements, totalPages);
        return ResponseEntity.ok(response);
    }
    @GetMapping("/filtrar")
    public ResponseEntity<EntityResponse<Pessoa>> filtrar(
            @RequestBody PagingAndFilterRequest paginacaoEfiltro
    ) {
        ValidationUtils.validatePagingRequest(paginacaoEfiltro);
        Pageable paginavel = PageableUtils.buildPageable(paginacaoEfiltro.getPaging());
        Page<Pessoa> paginaPessoa = pessoaService.filtrar(paginacaoEfiltro.getFilters(), paginavel);
        List<Pessoa> content = paginaPessoa.getContent();
        long totalElements = paginaPessoa.getTotalElements();
        int totalPages = paginaPessoa.getTotalPages();

        EntityResponse<Pessoa> response = new EntityResponse<>(content, totalElements, totalPages);
        return ResponseEntity.ok(response);
    }
}
