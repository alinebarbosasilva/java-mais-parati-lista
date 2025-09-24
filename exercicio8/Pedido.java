
package exercicio8;

import java.math.BigDecimal;

public class Pedido {
    private CalculadoraFrete estrategiaFrete;
    private String cepDestino;
    private BigDecimal valor;

    public Pedido(BigDecimal valor, String cepDestino) {
        this.valor = valor;
        this.cepDestino = cepDestino;
    }

    public void setEstrategiaFrete(CalculadoraFrete estrategiaFrete) {
        this.estrategiaFrete = estrategiaFrete;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getCepDestino() {
        return cepDestino;
    }

    public BigDecimal calcularFrete() throws CepInvalidoException {
        if (estrategiaFrete == null) {
            throw new IllegalStateException("Estratégia de frete não definida.");
        }
        return estrategiaFrete.calcular(this);
    }
}
