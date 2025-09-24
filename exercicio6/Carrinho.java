//Exercício 6 — Imutabilidade e Objetos de Valor (Carrinho de Compras)
//Crie o objeto de valor imutável Dinheiro (valor BigDecimal e enum Moeda) com
//equals/hashCode coerentes. Modele Produto, ItemCarrinho e um Carrinho cuja
//lista de itens seja imutável: operações de adicionar/remover/aplicar cupom retornam
//
//um novo carrinho. Valide quantidades > 0, proíba valores negativos e limite cupons
//a 30% com arredondamento bancário. Demonstre o fluxo completo em testes.

package exercicio6;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Carrinho {
    private final List<ItemCarrinho> itens;

    public Carrinho() {
        this.itens = Collections.emptyList();
    }

    private Carrinho(List<ItemCarrinho> itens) {
        this.itens = Collections.unmodifiableList(new ArrayList<>(itens));
    }

    public Carrinho adicionarItem(Produto produto, int quantidade) {
        List<ItemCarrinho> novosItens = new ArrayList<>(this.itens);
        novosItens.add(new ItemCarrinho(produto, quantidade));
        return new Carrinho(novosItens);
    }

    public Carrinho removerItem(Produto produto) {
        List<ItemCarrinho> novosItens = new ArrayList<>(this.itens);
        novosItens.removeIf(item -> item.getProduto().equals(produto));
        return new Carrinho(novosItens);
    }

    public Carrinho aplicarCupom(BigDecimal porcentagem) {
        if (porcentagem.compareTo(BigDecimal.ZERO) < 0 || porcentagem.compareTo(new BigDecimal("30")) > 0) {
            throw new IllegalArgumentException("Cupom de desconto deve estar entre 0 e 30.");
        }

        List<ItemCarrinho> itensComDesconto = new ArrayList<>();
        BigDecimal fatorDesconto = BigDecimal.ONE.subtract(porcentagem.divide(new BigDecimal("100")));

        for (ItemCarrinho item : this.itens) {
            Dinheiro precoOriginal = item.getProduto().getPreco();
            BigDecimal novoValor = precoOriginal.getValor().multiply(fatorDesconto).setScale(2, RoundingMode.HALF_EVEN);
            Dinheiro novoPreco = new Dinheiro(novoValor, precoOriginal.getMoeda());
            Produto novoProduto = new Produto(item.getProduto().getNome() + " (com desconto)", novoPreco);
            itensComDesconto.add(new ItemCarrinho(novoProduto, item.getQuantidade()));
        }

        return new Carrinho(itensComDesconto);
    }

    public List<ItemCarrinho> getItens() {
        return itens;
    }

    public Dinheiro getValorTotal() {
        BigDecimal total = BigDecimal.ZERO;
        Moeda moeda = Moeda.BRL;
        if (!itens.isEmpty()) {
            moeda = itens.get(0).getProduto().getPreco().getMoeda();
        }

        for (ItemCarrinho item : itens) {
            total = total.add(item.getProduto().getPreco().getValor().multiply(new BigDecimal(item.getQuantidade())));
        }
        return new Dinheiro(total, moeda);
    }
}
