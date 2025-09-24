package exercicio1;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Laptop", 3500.00, 10);
        System.out.println("Produto criado com sucesso: " + produto1.getNome());
        System.out.println("Preço: " + produto1.getPreco());
        System.out.println("Quantidade em estoque: " + produto1.getQuantidadeEmEstoque());

        produto1.setPreco(3800.50);
        produto1.setQuantidadeEmEstoque(8);
        System.out.println("\nValores alterados com sucesso:");
        System.out.println("Novo preço: " + produto1.getPreco());
        System.out.println("Nova quantidade em estoque: " + produto1.getQuantidadeEmEstoque());

        try {
            new Produto(null, 50.0, 5);
        } catch (IllegalArgumentException e) {
            System.out.println("\nErro ao criar produto: " + e.getMessage());
        }

        try {
            new Produto("Mouse", -10.0, 20);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar produto: " + e.getMessage());
        }

        try {
            new Produto("Teclado", 150.0, -5);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar produto: " + e.getMessage());
        }

        try {
            produto1.setNome("");
        } catch (IllegalArgumentException e) {
            System.out.println("\nErro ao alterar produto: " + e.getMessage());
        }

        try {
            produto1.setPreco(-200.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao alterar produto: " + e.getMessage());
        }

        try {
            produto1.setQuantidadeEmEstoque(-2);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao alterar produto: " + e.getMessage());
        }
    }
}