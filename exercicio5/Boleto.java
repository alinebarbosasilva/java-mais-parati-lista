package exercicio5;

import java.math.BigDecimal;

public class Boleto extends FormaPagamento {
    private String codigoBarras;

    public Boleto(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void validarPagamento() throws PagamentoInvalidoException {
        if (codigoBarras == null || !codigoBarras.matches("\\d{48}")) {
            throw new PagamentoInvalidoException("Código de barras de boleto inválido.");
        }
    }

    @Override
    public void processarPagamento(BigDecimal valor) {
        System.out.println("Pagamento de " + valor + " processado com boleto.");
    }
}
