package es.cide.prog;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class Main {
    // Variables para las operaciones
    private static String num1 = ""; // primer numero
    private static String num2 = ""; // numero actual
    private static String op = ""; // operacion a realizar
    private static boolean nuevaOperacion = false;

    // Main
    public static void main(String[] args) {
        // Look and feel
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }

        //Creamos el frame principal
        JFrame calculadora = new JFrame("Calculadora");
        calculadora.setSize(400, 550);
        calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculadora.setLayout(new BorderLayout());

        // Creamos el area del registro historico
        JTextArea registro = new JTextArea(2, 0);
        registro.setEditable(false);

        // Textfield del calculo
        JTextField calcular = new JTextField();
        calcular.setEditable(false);
        calcular.setHorizontalAlignment(JTextField.RIGHT);

        // Panel que engloba el registro y el calculo
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
        botonSuma.setBackground(new Color(255, 188, 27));
        JButton botonResta = new JButton("-");
        botonResta.setBackground(new Color(255, 188, 27));
        JButton botonMultiplica = new JButton("*");
        botonMultiplica.setBackground(new Color(255, 188, 27));
        JButton botonDivide = new JButton("/");
        botonDivide.setBackground(new Color(255, 188, 27));
        JButton botonIgual = new JButton("=");
        botonIgual.setBackground(new Color(70, 172, 255));

        // Clean
        JButton botonClear = new JButton("C");
        botonClear.setBackground(new Color(255, 70, 70));

        // ActionListener de los botones, los de numero agregan el numero al textfield y
        // reinician el campo nuevaOperacion
        boton1.addActionListener(e -> {
            if (nuevaOperacion) {
                calcular.setText("");
                nuevaOperacion = false;
            }
            calcular.setText(calcular.getText() + "1");
            num2 = calcular.getText();
        });
        boton2.addActionListener(e -> {
            if (nuevaOperacion) {
                calcular.setText("");
                nuevaOperacion = false;
            }
            calcular.setText(calcular.getText() + "2");
            num2 = calcular.getText();
        });
        boton3.addActionListener(e -> {
            if (nuevaOperacion) {
                calcular.setText("");
                nuevaOperacion = false;
            }
            calcular.setText(calcular.getText() + "3");
            num2 = calcular.getText();
        });
        boton4.addActionListener(e -> {
            if (nuevaOperacion) {
                calcular.setText("");
                nuevaOperacion = false;
            }
            calcular.setText(calcular.getText() + "4");
            num2 = calcular.getText();
        });
        boton5.addActionListener(e -> {
            if (nuevaOperacion) {
                calcular.setText("");
                nuevaOperacion = false;
            }
            calcular.setText(calcular.getText() + "5");
            num2 = calcular.getText();
        });
        boton6.addActionListener(e -> {
            if (nuevaOperacion) {
                calcular.setText("");
                nuevaOperacion = false;
            }
            calcular.setText(calcular.getText() + "6");
            num2 = calcular.getText();
        });
        boton7.addActionListener(e -> {
            if (nuevaOperacion) {
                calcular.setText("");
                nuevaOperacion = false;
            }
            calcular.setText(calcular.getText() + "7");
            num2 = calcular.getText();
        });
        boton8.addActionListener(e -> {
            if (nuevaOperacion) {
                calcular.setText("");
                nuevaOperacion = false;
            }
            calcular.setText(calcular.getText() + "8");
            num2 = calcular.getText();
        });
        boton9.addActionListener(e -> {
            if (nuevaOperacion) {
                calcular.setText("");
                nuevaOperacion = false;
            }
            calcular.setText(calcular.getText() + "9");
            num2 = calcular.getText();
        });
        boton0.addActionListener(e -> {
            if (nuevaOperacion) {
                calcular.setText("");
                nuevaOperacion = false;
            }
            calcular.setText(calcular.getText() + "0");
            num2 = calcular.getText();
        });
        // ActionListener de operaciones, si ya hay una operacion se realiza primero,
        // sino se guarda el numero introducido como num1, luego se guarda la operacion
        // y se limpia el campo de texto para introducir el siguiente numero
        botonSuma.addActionListener(e -> {
            if (!calcular.getText().isEmpty()) {
                num2 = calcular.getText();
            }
            if (!num2.isEmpty()) {
                if (!num1.isEmpty() && !op.isEmpty()) { // Si ya hay una operacion, se realiza primero
                    double dig1 = Double.parseDouble(num1);
                    double dig2 = Double.parseDouble(num2);
                    double iguala = 0;
                    // Operacion
                    switch (op) {
                        case "+" -> iguala = dig1 + dig2;
                        case "-" -> iguala = dig1 - dig2;
                        case "*" -> iguala = dig1 * dig2;
                        case "/" -> {
                            // Invalida numero 2 si este es 0
                            if (dig2 == 0) {
                                calcular.setText("Error");
                                registro.setText("No es posible hacer una división entre 0, prueba con otro numero");
                                num1 = "";
                                num2 = "";
                                op = "";
                                return;
                            }
                            iguala = dig1 / dig2;
                        }
                    }
                    num1 = String.valueOf(iguala);
                    calcular.setText(num1);
                    // Si no hay numero anterior, sera el introducido
                } else {
                    num1 = num2;
                }
                op = "+";
                registro.setText(num1 + " + ");
                num2 = "";
                nuevaOperacion = true;
            }
        });
        botonResta.addActionListener(e -> {
            if (!calcular.getText().isEmpty()) {
                num2 = calcular.getText();
            }
            if (!num2.isEmpty()) {
                if (!num1.isEmpty() && !op.isEmpty()) { // Si ya hay una operacion, se realiza primero
                    double dig1 = Double.parseDouble(num1);
                    double dig2 = Double.parseDouble(num2);
                    double iguala = 0;
                    // Operacion
                    switch (op) {
                        case "+" -> iguala = dig1 + dig2;
                        case "-" -> iguala = dig1 - dig2;
                        case "*" -> iguala = dig1 * dig2;
                        case "/" -> {
                            // Invalida numero 2 si este es 0
                            if (dig2 == 0) {
                                calcular.setText("Error");
                                registro.setText("No es posible hacer una división entre 0, prueba con otro numero");
                                num1 = "";
                                num2 = "";
                                op = "";
                                return;
                            }
                            iguala = dig1 / dig2;
                        }
                    }
                    num1 = String.valueOf(iguala);
                    calcular.setText(num1);
                } else { // Si no hay numero anterior, sera el introducido
                    num1 = num2;
                }
                op = "-";
                registro.setText(num1 + " - ");
                num2 = "";
                nuevaOperacion = true;
            }
        });
        botonMultiplica.addActionListener(e -> {
            if (!calcular.getText().isEmpty()) {
                num2 = calcular.getText();
            }
            if (!num2.isEmpty()) {
                if (!num1.isEmpty() && !op.isEmpty()) { // Si ya hay una operacion, se realiza primero
                    double dig1 = Double.parseDouble(num1);
                    double dig2 = Double.parseDouble(num2);
                    double iguala = 0;
                    // Operacion
                    switch (op) {
                        case "+" -> iguala = dig1 + dig2;
                        case "-" -> iguala = dig1 - dig2;
                        case "*" -> iguala = dig1 * dig2;
                        case "/" -> {
                            // Invalida numero 2 si este es 0
                            if (dig2 == 0) {
                                calcular.setText("Error");
                                registro.setText("No es posible hacer una división entre 0, prueba con otro numero");
                                num1 = "";
                                num2 = "";
                                op = "";
                                return;
                            }
                            iguala = dig1 / dig2;
                        }
                    }
                    num1 = String.valueOf(iguala);
                    calcular.setText(num1);
                } else { // Si no hay numero anterior, sera el introducido
                    num1 = num2;
                }
                op = "*";
                registro.setText(num1 + " * ");
                num2 = "";
                nuevaOperacion = true;
            }
        });
        botonDivide.addActionListener(e -> {
            if (!calcular.getText().isEmpty()) {
                num2 = calcular.getText();
            }
            if (!num2.isEmpty()) {
                if (!num1.isEmpty() && !op.isEmpty()) { // Si ya hay una operacion, se realiza primero
                    double dig1 = Double.parseDouble(num1);
                    double dig2 = Double.parseDouble(num2);
                    double iguala = 0;
                    // Operacion
                    switch (op) {
                        case "+" -> iguala = dig1 + dig2;
                        case "-" -> iguala = dig1 - dig2;
                        case "*" -> iguala = dig1 * dig2;
                        case "/" -> {
                            // Invalida numero 2 si este es 0
                            if (dig2 == 0) {
                                calcular.setText("Error");
                                registro.setText("No es posible hacer una división entre 0, prueba con otro numero");
                                num1 = "";
                                num2 = "";
                                op = "";
                                return;
                            }
                            iguala = dig1 / dig2;
                        }
                    }
                    num1 = String.valueOf(iguala);
                    calcular.setText(num1);
                } else { // Si no hay numero anterior, sera el introducido
                    num1 = num2;
                }
                op = "/";
                registro.setText(num1 + " / ");
                num2 = "";
                nuevaOperacion = true;
            }
        });
        botonClear.addActionListener(e -> {
            calcular.setText("");
            registro.setText("");
            num1 = "";
            num2 = "";
            op = "";
            nuevaOperacion = false;
        });
        botonIgual.addActionListener(e -> {
            if (!calcular.getText().isEmpty()) {
                num2 = calcular.getText();
            }
            if (!num1.isEmpty() && !op.isEmpty() && !num2.isEmpty()) {
                double dig1 = Double.parseDouble(num1);
                double dig2 = Double.parseDouble(num2);
                double iguala = 0;
                // Hace las operaciones
                switch (op) {
                    case "+" -> iguala = dig1 + dig2;
                    case "-" -> iguala = dig1 - dig2;
                    case "*" -> iguala = dig1 * dig2;
                    case "/" -> {
                        // Invalida numero 2 si este es 0
                        if (dig2 == 0) {
                            calcular.setText("Error");
                                registro.setText("No es posible hacer una división entre 0, prueba con otro numero");
                            num1 = "";
                            num2 = "";
                            op = "";
                            return;
                        }
                        iguala = dig1 / dig2;
                    }
                }
                registro.setText(num1 + " " + op + " " + num2 + " = " + iguala);
                num1 = String.valueOf(iguala);
                calcular.setText(num1);
                num2 = "";
                op = "";
                nuevaOperacion = true;
            }
        });

        // Acciones del teclado
        calcular.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                char teclanum = e.getKeyChar();
                // Agregar numeros
                if (Character.isDigit(teclanum)) {
                    if (nuevaOperacion) {
                        calcular.setText("");
                        nuevaOperacion = false;
                    }
                    calcular.setText(calcular.getText() + teclanum);
                    num2 = calcular.getText();
                } // Operaciones
                else if (teclanum == '+') {
                    botonSuma.doClick();
                } else if (teclanum == '-') {
                    botonResta.doClick();
                } else if (teclanum == '*') {
                    botonMultiplica.doClick();
                } else if (teclanum == '/') {
                    botonDivide.doClick();
                } else if (teclanum == '\n' || teclanum == '=') { // Enter o =
                    botonIgual.doClick();
                } else if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE || teclanum == 'c') {// Borrar con backspace o c
                    botonClear.doClick();
                }
            }
        });

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
        calcular.requestFocusInWindow(); // Asegura que el campo de texto tenga el foco para recibir las entradas del
                                         // teclado
    }
}