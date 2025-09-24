//Exercício 3 — Herança (Hierarquia de Funcionários)
//Crie a classe base Funcionario com protected String nome e protected
//BigDecimal salario (com getters). Crie Gerente e Desenvolvedor que
//sobrescrevem calcularBonus(): 20% do salário para gerente e 10% para
//desenvolvedor. Garanta que salários sejam positivos. Em um programa, coloque
//diferentes funcionários

package exercicio3;

import java.math.BigDecimal;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, BigDecimal salario) {
        super(nome, salario);
    }

    @Override
    public BigDecimal calcularBonus() {
        return salario.multiply(new BigDecimal("0.10"));
    }
}
