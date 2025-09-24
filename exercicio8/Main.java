package exercicio8;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(new BigDecimal("150.00"), "12345678");

        try {
            pedido.setEstrategiaFrete(new Sedex());
            System.out.println("Frete Sedex: " + pedido.calcularFrete());

            pedido.setEstrategiaFrete(new Pac());
            System.out.println("Frete PAC: " + pedido.calcularFrete());

            pedido.setEstrategiaFrete(new RetiradaNaLoja());
            System.out.println("Frete Retirada na Loja: " + pedido.calcularFrete());

            CalculadoraFrete fretePromocional = p -> {
                if (p.getValor().compareTo(new BigDecimal("100.00")) > 0) {
                    return BigDecimal.ZERO;
                }
                return new Pac().calcular(p);
            };

            pedido.setEstrategiaFrete(fretePromocional);
            System.out.println("Frete Promocional: " + pedido.calcularFrete());

            Pedido pedidoInvalido = new Pedido(new BigDecimal("50.00"), "123");
            pedidoInvalido.setEstrategiaFrete(new Sedex());
            pedidoInvalido.calcularFrete();

        } catch (CepInvalidoException e) {
            System.out.println("\nErro de frete: " + e.getMessage());
        }
    }
}
