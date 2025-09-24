
package exercicio4;

public class Trem implements IMeioTransporte {
    private int velocidade;

    @Override
    public void acelerar() {
        if (velocidade >= 150) {
            throw new IllegalStateException("O trem já está na velocidade máxima.");
        }
        velocidade += 5;
        System.out.println("Trem acelerando. Velocidade atual: " + velocidade + " km/h");
    }

    @Override
    public void frear() {
        if (velocidade <= 0) {
            throw new IllegalStateException("O trem já está parado.");
        }
        velocidade -= 5;
        System.out.println("Trem freando. Velocidade atual: " + velocidade + " km/h");
    }
}
