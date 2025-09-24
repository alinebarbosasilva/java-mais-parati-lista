
package exercicio4;

public class Bicicleta implements IMeioTransporte {
    private int velocidade;

    @Override
    public void acelerar() {
        if (velocidade >= 30) {
            throw new IllegalStateException("A bicicleta já está na velocidade máxima.");
        }
        velocidade += 2;
        System.out.println("Bicicleta acelerando. Velocidade atual: " + velocidade + " km/h");
    }

    @Override
    public void frear() {
        if (velocidade <= 0) {
            throw new IllegalStateException("A bicicleta já está parada.");
        }
        velocidade -= 2;
        System.out.println("Bicicleta freando. Velocidade atual: " + velocidade + " km/h");
    }
}
