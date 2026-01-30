package es.cide.prog;

import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Main {
    public static void main(String[] args) {
        JFrame finestra = new JFrame();
        finestra.setSize(400, 400);
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        finestra.setLayout(new FlowLayout());

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Sra.");
        comboBox.addItem("Sr.");
        comboBox.addItem("Dr.");

        JLabel etiqueta = new JLabel("Introduce tu nombre:");
        JTextArea nombre = new JTextArea();
        nombre.setColumns(5);

        comboBox.addActionListener(e -> {
            String titulo = (String) comboBox.getSelectedItem();
            JOptionPane.showMessageDialog(finestra, "Buenas: " + titulo + " " + nombre.getText());
        });

        finestra.add(comboBox);
        finestra.add(etiqueta);
        finestra.add(nombre);
        finestra.setVisible(true);
    }
}