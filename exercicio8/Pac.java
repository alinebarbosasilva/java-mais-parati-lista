
package exercicio8;

import java.math.BigDecimal;

public class Pac implements CalculadoraFrete {
    @Override
    public BigDecimal calcular(Pedido pedido) throws CepInvalidoException {
        if (pedido.getCepDestino() == null || pedido.getCepDestino().length() != 8) {
            throw new CepInvalidoException("CEP de destino inválido para PAC.");
        }
        return new BigDecimal("15.00");
    }
}
