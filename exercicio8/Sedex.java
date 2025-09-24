
package exercicio8;

import java.math.BigDecimal;

public class Sedex implements CalculadoraFrete {
    @Override
    public BigDecimal calcular(Pedido pedido) throws CepInvalidoException {
        if (pedido.getCepDestino() == null || pedido.getCepDestino().length() != 8) {
            throw new CepInvalidoException("CEP de destino inválido para Sedex.");
        }

        return new BigDecimal("30.00");
    }
}
