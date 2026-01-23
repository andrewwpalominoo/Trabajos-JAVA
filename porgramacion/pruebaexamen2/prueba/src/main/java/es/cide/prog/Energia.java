package es.cide.prog;

import java.util.Random;

public interface Energia {
    public void cargarBateria();

    public static boolean tieneCorriente() {
        Random aleatorio = new Random();

        boolean corriente = aleatorio.nextBoolean();

        if (corriente) {
            return true;
        } else {
            return false;
        }
    };
}
