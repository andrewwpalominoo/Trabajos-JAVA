package es.cide.prog;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;

public class Main {
    public static void main(String[] args) {
        JFrame finestra = new JFrame("Ficha de Película");
        finestra.setSize(400, 400);
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        finestra.setLayout(new GridLayout(9, 1));

        JPanel titulo = new JPanel();
        titulo.setLayout(new GridLayout(1, 2));
        JLabel etiqueta = new JLabel("Título de la pelicula:");
        JTextArea nombre = new JTextArea();
        nombre.setSize(100, 10);
        titulo.add(etiqueta);
        titulo.add(nombre);

        JPanel genero = new JPanel();
        genero.setLayout(new GridLayout(1, 2));
        JLabel etiqueta2 = new JLabel("Género:");
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Acción");
        comboBox.addItem("Comedia");
        comboBox.addItem("Drama");
        comboBox.addItem("Terror");
        comboBox.addItem("Ciencia Ficción");
        comboBox.addActionListener(e -> {
            String comboGenero = (String) comboBox.getSelectedItem();
            if (comboGenero == "Terror"){
                JOptionPane.showMessageDialog(finestra, "Advertencia, esta película puede quitarte el sueño");
            }
        });
        genero.add(etiqueta2);
        genero.add(comboBox);

        JPanel año = new JPanel();
        año.setLayout(new GridLayout(1, 2));
        JLabel etiqueta3 = new JLabel("Año de estreno:");
        JSlider slide = new JSlider(1900, 2025, 1960);
        slide.setPaintTicks(true);
        slide.setPaintLabels(true);
        slide.setMajorTickSpacing(25);
        slide.setMinorTickSpacing(5);
        año.add(etiqueta3);
        año.add(slide);

        JPanel añoselec = new JPanel();
        añoselec.setLayout(new GridLayout(1, 2));
        JLabel etiqueta4 = new JLabel("Año seleccionado:");
        JLabel añito = new JLabel();
        slide.addChangeListener(e -> {
            String añejo = (String) String.valueOf(slide.getValue());
            añito.setText(añejo);
        });
        añoselec.add(etiqueta4);
        añoselec.add(añito);

        JPanel botoncillo = new JPanel();
        JButton boton = new JButton("Mostrar Ficha");
        botoncillo.add(boton);

        JPanel ficha = new JPanel();
        añoselec.setLayout(new GridLayout(1, 3));
        JLabel texto1 = new JLabel();
        JLabel texto2 = new JLabel();
        JLabel texto3 = new JLabel();
        boton.addActionListener(e -> {
            String nombrazo = (String) nombre.getText();
            texto1.setText("Película: " + nombrazo + " |");
            String generaco = (String) comboBox.getSelectedItem();
            texto2.setText("Género: " + generaco + " |");
            String añejo = (String) String.valueOf(slide.getValue());
            texto3.setText("Año: " + añejo);
        });
        ficha.add(texto1);
        ficha.add(texto2);
        ficha.add(texto3);

        JPanel selectvocales = new JPanel();
        añoselec.setLayout(new GridLayout(1, 2));
        JLabel etiqueta5 = new JLabel("Selecciona una vocal:");
        JComboBox<String> cajaVocales = new JComboBox<>();
        cajaVocales.addItem("A");
        cajaVocales.addItem("E");
        cajaVocales.addItem("I");
        cajaVocales.addItem("O");
        cajaVocales.addItem("U");
        selectvocales.add(etiqueta5);
        selectvocales.add(cajaVocales);

        JPanel botonvocales = new JPanel();
        JButton boton2 = new JButton("Contar vocales");
        botonvocales.add(boton2);

        JPanel textovocales = new JPanel();
        JLabel voctext = new JLabel("Número de vocales: ");
        boton2.addActionListener((var e) -> {
            int vocales = 0;
            String vocalilla = (String) cajaVocales.getSelectedItem();
            String nombrazo = (String) nombre.getText();
            
            //Contar vocales del nombrazo
            for (int i = 0; i < nombrazo.length(); i++) {
                char letra = nombrazo.charAt(i);
                if (letra == vocalilla.charAt(0)) {
                    vocales++;
                }
            }

            voctext.setText("Número de vocales: " + vocales);
        });
        textovocales.add(voctext);

        finestra.add(titulo);
        finestra.add(genero);
        finestra.add(año);
        finestra.add(añoselec);
        finestra.add(botoncillo);
        finestra.add(ficha);
        finestra.add(selectvocales);
        finestra.add(botonvocales);
        finestra.add(textovocales);
        finestra.setVisible(true);
    }
}