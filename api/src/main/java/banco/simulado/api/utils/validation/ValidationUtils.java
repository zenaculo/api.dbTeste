package banco.simulado.api.utils.validation;

import banco.simulado.api.domain.Page.Paging;
import banco.simulado.api.domain.Page.PagingAndFilterRequest;
import banco.simulado.api.domain.Page.PagingRequest;

public class ValidationUtils {
    public static void validatePagingRequest(PagingAndFilterRequest paginacaoEfiltroRequest) {
        Paging paging = paginacaoEfiltroRequest.getPaging();
        if (paging == null) {
            throw new IllegalArgumentException("Solicitação de paginação inválida: o campo 'paging' é obrigatório.");
        }

        if (paging.getPage() < 0 || paging.getSize() <= 0) {
            throw new IllegalArgumentException("Solicitação de paginação inválida: 'page' deve ser não negativa e 'tamanho' deve ser positivo.");
        }
    }
}
