package es.cide.prog;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Main {
    public static void main(String[] args) {
        JFrame calculadora = new JFrame("Calculadora");
        calculadora.setSize(400, 700);
        calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculadora.setLayout(new BorderLayout());

        JPanel panelCalculo = new JPanel();
        JTextArea calcular = new JTextArea(3, 20);
        calcular.setSize(350, 200);
        panelCalculo.setSize(350, 200);
        panelCalculo.add(calcular);

        JPanel panelNumeros = new JPanel();
        panelNumeros.setSize(350, 500);
        JButton boton1 = new JButton("1");
        boton1.setSize(50, 50);
        JButton boton2 = new JButton("2");
        boton2.setSize(50, 50);
        JButton boton3 = new JButton("3");
        boton3.setSize(50, 50);
        JButton boton4 = new JButton("4");
        boton4.setSize(50, 50);
        JButton boton5 = new JButton("5");
        boton5.setSize(50, 50);
        JButton boton6 = new JButton("6");
        boton6.setSize(50, 50);
        JButton boton7 = new JButton("7");
        boton7.setSize(50, 50);
        JButton boton8 = new JButton("8");
        boton8.setSize(50, 50);
        JButton boton9 = new JButton("9");
        boton9.setSize(50, 50);
        JButton boton0 = new JButton("0");
        boton0.setSize(50, 50);
        JButton botonSuma = new JButton("+");
        botonSuma.setSize(50, 50);
        JButton botonResta = new JButton("-");
        botonResta.setSize(50, 50);
        JButton botonMultiplica = new JButton("*");
        botonMultiplica.setSize(50, 50);
        JButton botonDivide = new JButton("/");
        botonDivide.setSize(50, 50);
        JButton botonIgual = new JButton("=");
        botonIgual.setSize(50, 50);
        JButton botonClear = new JButton("C");
        botonClear.setSize(50, 50);

        panelNumeros.add(boton1);
        panelNumeros.add(boton2);
        panelNumeros.add(boton3);
        panelNumeros.add(boton4);
        panelNumeros.add(boton5);
        panelNumeros.add(boton6);
        panelNumeros.add(boton7);
        panelNumeros.add(boton8);
        panelNumeros.add(boton9);
        panelNumeros.add(boton0);
        panelNumeros.add(botonSuma);
        panelNumeros.add(botonResta);
        panelNumeros.add(botonMultiplica);
        panelNumeros.add(botonDivide);
        panelNumeros.add(botonIgual);
        panelNumeros.add(botonClear);
        
        calculadora.add(panelCalculo, BorderLayout.NORTH);
        calculadora.add(panelNumeros, BorderLayout.CENTER);
        calculadora.setVisible(true);
    }
}