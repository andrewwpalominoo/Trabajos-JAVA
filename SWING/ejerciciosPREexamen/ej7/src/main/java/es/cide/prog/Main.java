package es.cide.prog;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Application");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JSlider tamaño = new JSlider(JSlider.HORIZONTAL);
        tamaño.setMinimum(10);
        tamaño.setMaximum(50);

        JLabel texto = new JLabel("Holas");
        tamaño.addChangeListener(e -> {
            texto.setFont(texto.getFont().deriveFont((float) tamaño.getValue()));
        });

        frame.add(tamaño);
        frame.add(texto);
        frame.setVisible(true);
    }
}