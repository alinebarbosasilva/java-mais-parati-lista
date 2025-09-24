//Exercício 7 — Generics (Repositório Genérico em Memória)
//Defina Identificavel com getId(). Crie IRepository<T extends Identificavel, ID>
//        com salvar, buscarPorId (retorna Optional<T>), listarTodos e remover.
//Implemente InMemoryRepository com Map<ID, T>, garanta que listarTodos
//devolva cópia imutável e lance EntidadeNaoEncontradaException ao remover ID
//inexistente. Use com entidades como Produto e Funcionario.

package exercicio7;

public class Main {
    public static void main(String[] args) {
        IRepository<Produto, Long> repoProdutos = new InMemoryRepository<>();
        repoProdutos.salvar(new Produto(1L, "Notebook"));
        repoProdutos.salvar(new Produto(2L, "Mouse"));

        System.out.println("Produtos: " + repoProdutos.listarTodos());
        System.out.println("Produto com ID 2: " + repoProdutos.buscarPorId(2L).orElse(null));

        try {
            repoProdutos.remover(1L);
            System.out.println("Produtos após remover o ID 1: " + repoProdutos.listarTodos());
        } catch (EntidadeNaoEncontradaException e) {
            System.out.println(e.getMessage());
        }

        IRepository<Funcionario, String> repoFuncionarios = new InMemoryRepository<>();
        repoFuncionarios.salvar(new Funcionario("F01", "Carlos"));
        System.out.println("\nFuncionários: " + repoFuncionarios.listarTodos());
    }
}

