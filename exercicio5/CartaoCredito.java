package exercicio5;

import java.math.BigDecimal;

public class CartaoCredito extends FormaPagamento {
    private String numeroCartao;

    public CartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void validarPagamento() throws PagamentoInvalidoException {
        if (numeroCartao == null || !numeroCartao.matches("\\d{16}")) {
            throw new PagamentoInvalidoException("Número de cartão de crédito inválido.");
        }
    }

    @Override
    public void processarPagamento(BigDecimal valor) {
        System.out.println("Pagamento de " + valor + " processado com cartão de crédito.");
    }
}