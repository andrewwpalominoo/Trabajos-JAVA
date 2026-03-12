package es.cide.programacio.examen;

import javax.swing.JFrame;

//puntos 1, 2, 6, 7

public class Joc {
    public static void main(String[] args) {
        // Crea la finestra principal
        JFrame finestra = new JFrame("El Corredor de Kessel"); // Nombre cambiado
        finestra.setResizable(false); // No editable
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        finestra.setSize(1900, 1060); // Mida de la finestra (modificada)
        finestra.add(new JocPanel()); // Afegeix el panell del joc
        finestra.setLocationRelativeTo(null); // Centra la finestra
        finestra.setVisible(true); // Fa que la finestra sigui visible
    }
}