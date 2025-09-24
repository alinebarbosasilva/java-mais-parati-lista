//Exercício 8 — Padrão Strategy (Cálculo de Frete com Lambdas)
//        Modele CalculadoraFrete com calcular(Pedido): BigDecimal. Crie estratégias
//        Sedex, Pac e RetiradaNaLoja e permita injeção/troca da estratégia no Pedido.
//        Acrescente uma estratégia promocional via lambda (frete grátis acima de X). Valide
//        CEP/região e dispare exceções para CEP inválido. Mostre a troca de estratégia em
//        tempo de execução.
//
package exercicio8;

import java.math.BigDecimal;

@FunctionalInterface
public interface CalculadoraFrete {
    BigDecimal calcular(Pedido pedido) throws CepInvalidoException;
}
