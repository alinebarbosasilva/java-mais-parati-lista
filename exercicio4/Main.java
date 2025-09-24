
package exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IMeioTransporte> transportes = new ArrayList<>();
        transportes.add(new Carro());
        transportes.add(new Bicicleta());
        transportes.add(new Trem());

        for (IMeioTransporte transporte : transportes) {
            try {
                transporte.acelerar();
                transporte.acelerar();
                transporte.frear();
                transporte.frear();
                transporte.frear();
            } catch (IllegalStateException e) {
                System.out.println("Erro: " + e.getMessage());
            }
            System.out.println();
        }
    }
}
