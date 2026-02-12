package es.cide.prog;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Main {
    // Metodos
    public static void laOperacion(){

    }

    public static void historialyEso(){

    }

    //Main
    public static void main(String[] args) {
        JFrame calculadora = new JFrame("Calculadora");
        calculadora.setSize(400, 700);
        calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculadora.setLayout(new BorderLayout());

        // Creamos el panel de calculo y el area de texto para mostrar el resultado
        JPanel panelCalculo = new JPanel();
        JTextArea registro = new JTextArea(2, 20);
        registro.setSize(350, 200);
        JTextArea calcular = new JTextArea(2, 20);
        calcular.setSize(350, 200);
        panelCalculo.setSize(350, 200);
        panelCalculo.add(calcular);

        // Numeros
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

        // Calculos
        JButton botonSuma = new JButton("+");
        botonSuma.setSize(50, 50);
        botonSuma.setBackground(Color.YELLOW);
        JButton botonResta = new JButton("-");
        botonResta.setSize(50, 50);
        botonResta.setBackground(Color.YELLOW);
        JButton botonMultiplica = new JButton("*");
        botonMultiplica.setSize(50, 50);
        botonMultiplica.setBackground(Color.YELLOW);
        JButton botonDivide = new JButton("/");
        botonDivide.setSize(50, 50);
        botonDivide.setBackground(Color.YELLOW);
        JButton botonIgual = new JButton("=");
        botonIgual.setBackground(Color.CYAN);
        botonIgual.setSize(50, 50);

        // Clean
        JButton botonClear = new JButton("C");
        botonClear.setBackground(Color.RED);
        botonClear.setSize(50, 50);

        // ActionListener de los botones
        boton1.addActionListener(e -> calcular.append("1"));
        boton2.addActionListener(e -> calcular.append("2"));
        boton3.addActionListener(e -> calcular.append("3"));
        boton4.addActionListener(e -> calcular.append("4"));
        boton5.addActionListener(e -> calcular.append("5"));
        boton6.addActionListener(e -> calcular.append("6"));
        boton7.addActionListener(e -> calcular.append("7"));
        boton8.addActionListener(e -> calcular.append("8"));
        boton9.addActionListener(e -> calcular.append("9"));
        boton0.addActionListener(e -> calcular.append("0"));
        botonSuma.addActionListener(e -> calcular.append("+"));
        botonResta.addActionListener(e -> calcular.append("-"));
        botonMultiplica.addActionListener(e -> calcular.append("*"));
        botonDivide.addActionListener(e -> calcular.append("/"));
        botonClear.addActionListener(e -> calcular.setText(""));

        // Agregamos los botones al panel
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

        // Agregamos los paneles a la calculadora
        calculadora.add(panelCalculo, BorderLayout.NORTH);
        calculadora.add(panelNumeros, BorderLayout.CENTER);
        calculadora.setVisible(true);
    }
}