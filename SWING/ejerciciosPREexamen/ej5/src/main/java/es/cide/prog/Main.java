package es.cide.prog;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main {
    public static void main(String[] args) {
        JFrame finestra = new JFrame();
        finestra.setSize(400,400);
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        finestra.setLayout(new GridLayout(4,4));
        JTextField num1 = new JTextField();
        JTextField num2 = new JTextField();
        JTextField resultado = new JTextField();

        JButton sumarButton = new JButton("Sumar");

        try {
            sumarButton.addActionListener(e -> {
                int n1 = Integer.parseInt(num1.getText());
                int n2 = Integer.parseInt(num2.getText());
                int suma = n1 + n2;
                resultado.setText(String.valueOf(suma));
            });
        } catch (NumberFormatException e) {
            resultado.setText("Error");
        }
        finestra.add(num1);
        finestra.add(num2);
        finestra.add(sumarButton);
        finestra.add(resultado);
        finestra.setVisible(true);
    }
}