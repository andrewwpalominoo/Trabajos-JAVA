package es.cide.prog;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame finestra = new JFrame();
        finestra.setSize(400, 400);
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        finestra.setLayout(new FlowLayout());

        JCheckBox checkBox = new JCheckBox("Activa el botón");
        JButton boton = new JButton("Botón");
        boton.setEnabled(false);
        checkBox.addActionListener(e -> {
            boton.setEnabled(checkBox.isSelected());
        });

        finestra.add(checkBox);
        finestra.add(boton);
        finestra.setVisible(true);
    }
}