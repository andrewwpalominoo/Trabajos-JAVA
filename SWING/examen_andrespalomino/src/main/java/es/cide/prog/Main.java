package es.cide.prog;

import java.awt.GridLayout;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Main {
    public static void main(String[] args) {
        // Impementamos el look and feel
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalFileChooserUI");
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Establecemos el frame principal
        JFrame finestra = new JFrame("Reservas de Hotel");
        finestra.setSize(800, 500);
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        finestra.setLayout(new GridLayout(7, 1));

        // Panel del nombre
        JPanel nombre = new JPanel();
        nombre.setLayout(new GridLayout(1, 2));
        JLabel etiqueta = new JLabel("Nombre:");
        JTextArea nom = new JTextArea();
        nom.setSize(100, 10);
        nombre.add(etiqueta);
        nombre.add(nom);

        // Panel del DNI y comprobacion
        JPanel documento = new JPanel();
        documento.setLayout(new GridLayout(1, 3));
        JLabel etiqueta2 = new JLabel("DNI:");
        JTextField dnii = new JTextField();
        dnii.setSize(100, 10);
        JLabel comprobar = new JLabel();
        dnii.addActionListener(l -> { // Validamos el DNI
            String dni = (String) dnii.getText();
            if (!dni.matches("\\d{8}[A-HJ-NP-TV-Za-hj-np-tv-z]")) {
                comprobar.setText("Error");
            }
            // Conjunt de lletres possibles per a la validació del DNI.
            String lletres = "TRWAGMYFPDXBNJZSQVHLCKE";

            // Converteix els primers 8 caràcters (els dígits) a un número enter.
            int numero = Integer.parseInt(dni.substring(0, 8));

            // Converteix la lletra proporcionada a majúscula per evitar errors de
            // comparació.
            char lletraDNI = Character.toUpperCase(dni.charAt(8));

            // Comprova si la lletra calculada a partir del número coincideix amb la lletra
            // proporcionada.
            if (lletres.charAt(numero % 23) == lletraDNI) {
                comprobar.setText("OK");
            }
        });
        documento.add(etiqueta2);
        documento.add(dnii);
        documento.add(comprobar);

        // Panel de la fecha y comprobacion
        JPanel fecha = new JPanel();
        fecha.setLayout(new GridLayout(1, 2));
        JLabel etiqueta3 = new JLabel("Fecha Check-in (dd/MM/yyyy):");
        JTextField data = new JTextField();
        data.setSize(100, 10);
        data.addActionListener(l -> { // Validamos que la no sea anterior y que tenga el formato correcto
            String datarda = (String) data.getText();
            // Defineix el format de la data esperada
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            // Converteix el String a un objecte LocalDate
            LocalDate dataEntrada = LocalDate.parse(datarda, formatter);

            // Obté la data actual
            LocalDate dataActual = LocalDate.now();

            // Compara si la data entrada és anterior a la data actual
            if (dataEntrada.isBefore(dataActual)) {
                JOptionPane.showMessageDialog(finestra, "La fecha no puede ser anterior a la de hoy");
            }
        });
        data.addActionListener(l -> { // Validamos que la fecha no quede en blanco
            String datarda = (String) data.getText();
            if (datarda.length() == 0) {
                JOptionPane.showMessageDialog(finestra, "El campo no puede quedar en blanco");
            }
        });
        fecha.add(etiqueta3);
        fecha.add(data);

        // Panel de combobox con seleccion del hotel
        JPanel hotel = new JPanel();
        hotel.setLayout(new GridLayout(1, 2));
        JLabel etiqueta4 = new JLabel("Hotel:");
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Hotel Illa"); // 3 dias
        comboBox.addItem("Hotel Blau"); // 10 dias
        comboBox.addItem("Hotel Vall"); // 60 dias
        hotel.add(etiqueta4);
        hotel.add(comboBox);

        // Panel con Slider de seleccion de noches
        JPanel noches = new JPanel();
        noches.setLayout(new GridLayout(1, 1));
        // Valor principal
        JSlider slide = new JSlider(1, 3, 2);
        slide.setPaintTicks(true);
        slide.setPaintLabels(true);
        slide.setMajorTickSpacing(1);
        // Valor cambiante dependiendo del hotel
        comboBox.addActionListener(e -> {
            String comboHotel = (String) comboBox.getSelectedItem();
            if ("Hotel Illa".equals(comboHotel)) {
                slide.setMaximum(3);
            } else if ("Hotel Blau".equals(comboHotel)) {
                slide.setMaximum(10);
            } else if ("Hotel Vall".equals(comboHotel)) {
                slide.setMaximum(60);
            }
        });
        noches.add(slide);

        // Panel boton para mostrar ficha
        JPanel botoncillo = new JPanel();
        JButton boton = new JButton("Guardar Reserva");
        botoncillo.add(boton);

        // Ficha que se muestra al presionar el boton
        JPanel ficha = new JPanel();
        ficha.setLayout(new GridLayout(1, 1));
        JLabel texto = new JLabel();
        // Convierte los valores introducidos hasta ahora en un texto
        boton.addActionListener(e -> {
            //Convertimos en String
            String nombrazo = (String) nom.getText();
            String documentovich = (String) dnii.getText();
            String datarda = (String) data.getText();
            String hotelillo = (String) comboBox.getSelectedItem();
            String nochecillas = (String) String.valueOf(slide.getValue());
            //Introucimos al texto
            texto.setText("Reserva: " + nombrazo + ", " + documentovich + ", " + datarda + ", " + hotelillo + ", "
                    + nochecillas + " noches.");
        });
        ficha.add(texto);

        // Incluimos todos los paneles y hacemos el frame visible
        finestra.add(nombre);
        finestra.add(documento);
        finestra.add(fecha);
        finestra.add(hotel);
        finestra.add(noches);
        finestra.add(botoncillo);
        finestra.add(ficha);
        finestra.setVisible(true);
        
    }
}