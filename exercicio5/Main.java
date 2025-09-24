
package exercicio5;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        FormaPagamento cartao = new CartaoCredito("1234567890123456");
        FormaPagamento boleto = new Boleto("123456789012345678901234567890123456789012345678");
        FormaPagamento pix = new Pix("meu-email@example.com");
        FormaPagamento cartaoInvalido = new CartaoCredito("1234");

        processar(cartao, new BigDecimal("100.00"));
        processar(boleto, new BigDecimal("250.50"));
        processar(pix, new BigDecimal("50.00"));
        processar(cartaoInvalido, new BigDecimal("200.00"));
    }

    private static void processar(FormaPagamento formaPagamento, BigDecimal valor) {
        try {
            formaPagamento.validarPagamento();
            formaPagamento.processarPagamento(valor);
        } catch (PagamentoInvalidoException e) {
            System.out.println("Erro no pagamento: " + e.getMessage());
        }
        System.out.println();
    }
}
