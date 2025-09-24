
package exercicio4;

public class Carro implements IMeioTransporte {
    private int velocidade;

    @Override
    public void acelerar() {
        if (velocidade >= 200) {
            throw new IllegalStateException("O carro já está na velocidade máxima.");
        }
        velocidade += 10;
        System.out.println("Carro acelerando. Velocidade atual: " + velocidade + " km/h");
    }

    @Override
    public void frear() {
        if (velocidade <= 0) {
            throw new IllegalStateException("O carro já está parado.");
        }
        velocidade -= 10;
        System.out.println("Carro freando. Velocidade atual: " + velocidade + " km/h");
    }
}
