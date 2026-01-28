package es.cide.prog;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame finestra = new JFrame();
        
        finestra.setSize(400, 400);
        finestra.setLayout(new FlowLayout());

        JButton rojo = new JButton("Rojo");
        rojo.setSize(100,50);
        JButton verde = new JButton("Verde");
        verde.setSize(100,50);
        JButton azul = new JButton("Azul");
        azul.setSize(100,50);

        rojo.addActionListener((ActionEvent e) -> {
            finestra.getContentPane().setBackground(new java.awt.Color(255,0,0));
        });

        verde.addActionListener((ActionEvent e) -> {
            finestra.getContentPane().setBackground(new java.awt.Color(0,255,0));
        });

        azul.addActionListener((ActionEvent e) -> {
            finestra.getContentPane().setBackground(new java.awt.Color(0,0,255));
        });

        finestra.add(rojo);
        finestra.add(verde);
        finestra.add(azul);

        finestra.setVisible(true);
    }
}