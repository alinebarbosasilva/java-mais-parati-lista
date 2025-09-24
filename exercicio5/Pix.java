//Exercício 5 — Abstração (Sistema de Pagamentos)
//        Implemente a classe abstrata FormaPagamento com validarPagamento() e
//        processarPagamento(BigDecimal valor). Crie CartaoCredito, Boleto e Pix com
//        validações específicas (ex.: número do cartão, formato de boleto, chave Pix). Simule
//        o uso de cada forma por polimorfismo e trate erros de validação com exceções
//        específicas (ex.: PagamentoInvalidoException).

package exercicio5;

import java.math.BigDecimal;

public class Pix extends FormaPagamento {
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void validarPagamento() throws PagamentoInvalidoException {
        if (chavePix == null || chavePix.trim().isEmpty()) {
            throw new PagamentoInvalidoException("Chave Pix inválida.");
        }
    }

    @Override
    public void processarPagamento(BigDecimal valor) {
        System.out.println("Pagamento de " + valor + " processado com Pix.");
    }
}
