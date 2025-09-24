
package exercicio3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Aline", new BigDecimal("10000"));
        Desenvolvedor dev1 = new Desenvolvedor("Ana", new BigDecimal("5000"));
        Desenvolvedor dev2 = new Desenvolvedor("Samuel", new BigDecimal("6000"));

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(gerente);
        funcionarios.add(dev1);
        funcionarios.add(dev2);

        for (Funcionario f : funcionarios) {
            System.out.println("Bônus de " + f.getNome() + ": " + f.calcularBonus());
        }
    }
}
