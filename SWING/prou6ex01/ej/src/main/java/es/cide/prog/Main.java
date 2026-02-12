package es.cide.prog;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main {
    // Metodos
    public static void laOperacion() {

    }

    public static void historialyEso() {

    }

    // Main
    public static void main(String[] args) {
        JFrame calculadora = new JFrame("Calculadora");
        calculadora.setSize(400, 550);
        calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculadora.setLayout(new BorderLayout());

        // Creamos el panel de calculo y el area de texto para mostrar el resultado
        JTextArea registro = new JTextArea(2, 20);
        registro.setEditable(false);

        JTextField calcular = new JTextField();
        calcular.setEditable(false);
        calcular.setHorizontalAlignment(JTextField.RIGHT);

        JPanel panelCalculo = new JPanel();
        panelCalculo.setLayout(new GridLayout(2, 1));
        panelCalculo.add(registro);
        panelCalculo.add(calcular);

        // Numeros
        JPanel panelNumeros = new JPanel();
        panelNumeros.setLayout(new GridLayout(4, 4, 5, 5));
        JButton boton1 = new JButton("1");
        JButton boton2 = new JButton("2");
        JButton boton3 = new JButton("3");
        JButton boton4 = new JButton("4");
        JButton boton5 = new JButton("5");
        JButton boton6 = new JButton("6");
        JButton boton7 = new JButton("7");
        JButton boton8 = new JButton("8");
        JButton boton9 = new JButton("9");
        JButton boton0 = new JButton("0");

        // Calculos
        JButton botonSuma = new JButton("+");
        botonSuma.setBackground(Color.YELLOW);
        JButton botonResta = new JButton("-");
        botonResta.setBackground(Color.YELLOW);
        JButton botonMultiplica = new JButton("*");
        botonMultiplica.setBackground(Color.YELLOW);
        JButton botonDivide = new JButton("/");
        botonDivide.setBackground(Color.YELLOW);
        JButton botonIgual = new JButton("=");
        botonIgual.setBackground(Color.CYAN);

        // Clean
        JButton botonClear = new JButton("C");
        botonClear.setBackground(Color.RED);

        // ActionListener de los botones
        boton1.addActionListener(e -> calcular.setText(calcular.getText() + "1"));
        boton2.addActionListener(e -> calcular.setText(calcular.getText() + "2"));
        boton3.addActionListener(e -> calcular.setText(calcular.getText() + "3"));
        boton4.addActionListener(e -> calcular.setText(calcular.getText() + "4"));
        boton5.addActionListener(e -> calcular.setText(calcular.getText() + "5"));
        boton6.addActionListener(e -> calcular.setText(calcular.getText() + "6"));
        boton7.addActionListener(e -> calcular.setText(calcular.getText() + "7"));
        boton8.addActionListener(e -> calcular.setText(calcular.getText() + "8"));
        boton9.addActionListener(e -> calcular.setText(calcular.getText() + "9"));
        boton0.addActionListener(e -> calcular.setText(calcular.getText() + "0"));
        botonSuma.addActionListener(e -> calcular.setText(calcular.getText() + "+"));
        botonResta.addActionListener(e -> calcular.setText(calcular.getText() + "-"));
        botonMultiplica.addActionListener(e -> calcular.setText(calcular.getText() + "*"));
        botonDivide.addActionListener(e -> calcular.setText(calcular.getText() + "/"));
        botonClear.addActionListener(e -> calcular.setText(""));

        // Agregamos los botones al panel
        panelNumeros.add(boton7);
        panelNumeros.add(boton8);
        panelNumeros.add(boton9);
        panelNumeros.add(botonDivide);
        panelNumeros.add(boton4);
        panelNumeros.add(boton5);
        panelNumeros.add(boton6);
        panelNumeros.add(botonMultiplica);
        panelNumeros.add(boton1);
        panelNumeros.add(boton2);
        panelNumeros.add(boton3);
        panelNumeros.add(botonResta);
        panelNumeros.add(botonClear);
        panelNumeros.add(boton0);
        panelNumeros.add(botonIgual);
        panelNumeros.add(botonSuma);

        // Agregamos los paneles a la calculadora
        calculadora.add(panelCalculo, BorderLayout.NORTH);
        calculadora.add(panelNumeros, BorderLayout.CENTER);
        calculadora.setVisible(true);
    }
}