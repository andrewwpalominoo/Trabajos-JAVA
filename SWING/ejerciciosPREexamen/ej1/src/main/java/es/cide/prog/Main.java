package es.cide.prog;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
    private static int contador=0;
    public static void main(String[] args) {
        JFrame finestra = new JFrame();
        finestra.setSize(500, 400);
        finestra.setLayout(new FlowLayout());

        JButton boton = new JButton("Click aqui");
        boton.setSize(100,50);
        JLabel etiqueta = new JLabel();

        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev){
                contador++;
                etiqueta.setText("Clicks: "+contador);
            }           
        });

        finestra.add(boton);
        finestra.add(etiqueta);

        finestra.setVisible(true);
    }
}