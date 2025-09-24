# Java - Exercícios de Programação Orientada a Objetos  

Este repositório contém uma coleção de exercícios em **Java** com foco nos conceitos de **Programação Orientada a Objetos (POO)**, como **encapsulamento, herança, polimorfismo, abstração, imutabilidade, generics e padrões de projeto**.  

Cada exercício demonstra princípios de clean code, validações e tratamento de exceções.  

---

## 📌 Exercícios

### 1. Encapsulamento (Classe Produto)  
- Implementar a classe `Produto` com atributos privados: `nome`, `preco` e `quantidadeEmEstoque`.  
- Incluir **getters e setters com validações**.  
- Lançar `IllegalArgumentException` em casos inválidos.  
- Demonstrar instâncias válidas e inválidas.  

### 2. Encapsulamento com Regra de Negócio (Desconto)  
- Estender `Produto` com método `aplicarDesconto(double porcentagem)`.  
- Permitir apenas valores entre **0% e 50%**.  
- Lançar exceções para entradas inválidas.  

### 3. Herança (Hierarquia de Funcionários)  
- Classe base: `Funcionario`.  
- Subclasses: `Gerente` (20% bônus) e `Desenvolvedor` (10% bônus).  
- Uso de `List<Funcionario>` para exibir bônus polimorficamente.  

### 4. Polimorfismo com Interface (IMeioTransporte)  
- Interface `IMeioTransporte` com `acelerar()` e `frear()`.  
- Implementações: `Carro`, `Bicicleta`, `Trem`.  
- Demonstração polimórfica com lista de transportes.  

### 5. Abstração (Sistema de Pagamentos)  
- Classe abstrata `FormaPagamento`.  
- Implementações: `CartaoCredito`, `Boleto`, `Pix`.  
- Simulação de polimorfismo e exceções de validação.  

### 6. Imutabilidade (Carrinho de Compras)  
- Objeto de valor imutável `Dinheiro`.  
- Classes `Produto`, `ItemCarrinho` e `Carrinho` imutável.  
- Operações retornam novas instâncias.  

### 7. Generics (Repositório em Memória)  
- Interface `Identificavel`.  
- Repositório genérico `IRepository` com `InMemoryRepository`.  
- Lançar `EntidadeNaoEncontradaException` para remoções inválidas.  

### 8. Padrão Strategy (Cálculo de Frete com Lambdas)  
- Estratégias de frete: `Sedex`, `Pac`, `RetiradaNaLoja`.  
- Lambda promocional: frete grátis acima de X.  
- Demonstração de troca de estratégia em tempo de execução.  

---

> 📌 Cada exercício é independente e pode ser executado separadamente.  

---

## ▶️ Como Executar no IntelliJ IDEA  

1. Abra o projeto no **IntelliJ IDEA**.  
2. Navegue até a pasta do exercício desejado (`exercicio1`, `exercicio2`, etc.).  
3. Clique com o botão direito no arquivo `Main.java`.  
4. Selecione **Run 'Main.main()'**.  

---
