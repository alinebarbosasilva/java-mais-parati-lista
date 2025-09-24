package exercicio6;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", new Dinheiro(new BigDecimal("5000.00"), Moeda.BRL));
        Produto p2 = new Produto("Mouse", new Dinheiro(new BigDecimal("150.00"), Moeda.BRL));

        Carrinho carrinho = new Carrinho();
        carrinho = carrinho.adicionarItem(p1, 1);
        carrinho = carrinho.adicionarItem(p2, 2);

        System.out.println("Valor total do carrinho: " + carrinho.getValorTotal());

        Carrinho carrinhoComDesconto = carrinho.aplicarCupom(new BigDecimal("10"));
        System.out.println("Valor total com 10% de desconto: " + carrinhoComDesconto.getValorTotal());

        Carrinho carrinhoFinal = carrinhoComDesconto.removerItem(p2);
        System.out.println("Valor total após remover o mouse: " + carrinhoFinal.getValorTotal());

        // Tentando adicionar item com quantidade inválida
        try {
            carrinho.adicionarItem(p1, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("\nErro: " + e.getMessage());
        }

        // Tentando aplicar cupom inválido
        try {
            carrinho.aplicarCupom(new BigDecimal("40"));
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
