// Nombre: Andrés Palomino Cassain
// 45614964F
// Fecha: 9/12/25 --> 

package es.cide.prog;

import java.util.Random;

public class Illa {

    Random aleatorio = new Random();

    // Atributos de la isla
    String islaName = "Curaçao"; // Ahora con mas casinos y menos impuestos
    int numpiratas;
    Piratas[] pirates; // Objeto pirata

    // Nombres posibles para los piratas
    private final String[] nombresPiratas = {
            "Pirata Roberts",
            "Ignacio Queso",
            "Jack Sparrow",
            "Homero Simpson",
            "Goro Majima",
            "Godrick, el Injertado",
            "Pirata sin nombre"
    };

    // Constructor: genera entre 3 y 7 piratas con los nombres antes indicados
    public Illa() {
        // Generar número aleatorio de piratas (entre 3 y 7)
        numpiratas = aleatorio.nextInt(5) + 3;
        pirates = new Piratas[numpiratas];

        // Array para controlar qué nombres ya se han usado
        boolean[] nombresUsados = new boolean[nombresPiratas.length];

        // Crear cada pirata con un nombre único
        for (int i = 0; i < numpiratas; i++) {
            int indiceNombre;

            // Buscar un nombre que no se haya usado aún
            do {
                indiceNombre = aleatorio.nextInt(nombresPiratas.length);
            } while (nombresUsados[indiceNombre]);

            // Marcar el nombre como usado
            nombresUsados[indiceNombre] = true;
            // String nombrePirata = nombresPiratas[indiceNombre];

            // Crear pirata con vida aleatoria entre 1 y 3
            pirates[i] = new Piratas(nombresPiratas[i], aleatorio.nextInt(1, 3) + 1, true);
        }
    }

    // Getter del número total de piratas en la isla
    public int getNumPiratas() {
        return this.numpiratas;
    }

    // Getter del nombre de la isla
    public String getIslaName() {
        return this.islaName;
    }

    // Devuelve el pirata en la posición especificada
    public Piratas vullUnPirata(int index) {
        return pirates[index];
    }
}