package exercicio2;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Celular", 1200.00, 15);
        System.out.println("Preço original: " + produto.getPreco());

        try {
            produto.aplicarDesconto(10);
            System.out.println("Preço com 10% de desconto: " + produto.getPreco());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao aplicar desconto: " + e.getMessage());
        }

        try {
            produto.aplicarDesconto(60);
        } catch (IllegalArgumentException e) {
            System.out.println("\nErro ao tentar aplicar desconto de 60%: " + e.getMessage());
        }

        try {
            produto.aplicarDesconto(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao tentar aplicar desconto de -5%: " + e.getMessage());
        }

        System.out.println("\nPreço final: " + produto.getPreco());
    }
}
