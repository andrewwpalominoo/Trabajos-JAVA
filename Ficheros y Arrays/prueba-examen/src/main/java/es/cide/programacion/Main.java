package es.cide.programacion;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main {
    public static void main(String[] args) {
        //Ajuste de la ventana segun enunciado: no redimensionable
        JFrame frame = new JFrame("Filtre de Seguretat de Passwords");
        frame.setSize(750, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout(10, 10)); //Cambiado a BorderLayout para mejor organizacion
        frame.setLocationRelativeTo(null);

        // EXPLICACIÓN: Creamos los componentes de entrada/salida.
        // Usamos JTextField para las rutas y JButton para las acciones.
        JTextField caminoFicheroOrigen = new JTextField();
        JButton analizar = new JButton("Analitzar");
        
        // EXPLICACIÓN: Llamamos a un método auxiliar para organizar la fila 
        // con la etiqueta y el campo a la izquierda, y el botón a la derecha.
        JPanel panelOrigen = crearFila("Fitxer Origen:", caminoFicheroOrigen, analizar);

        JTextField caminoFicheroDestino = new JTextField();
        JButton desar = new JButton("Desar"); //Creamos el boton de Desar
        desar.setEnabled(false); //Inactivo hasta que se haga el analisis 
        
        JPanel panelDestino = crearFila("Fitxer Destí:", caminoFicheroDestino, desar);

        //Panel central para las areas de visualizacion 
        JPanel visualitzacion = new JPanel(new GridLayout(1, 2, 10, 10));

        //Area Contraseñas Seguras
        JTextArea areaSeguras = new JTextArea();
        areaSeguras.setEditable(false); // EXPLICACIÓN: Evita que el usuario escriba manualmente en el área de resultados.
        JScrollPane scrollSeguras = new JScrollPane(areaSeguras);
        JPanel pSeguras = new JPanel(new BorderLayout());
        pSeguras.add(new JLabel("Contrasenyes Segures"), BorderLayout.NORTH);
        pSeguras.add(scrollSeguras, BorderLayout.CENTER);

        //Area Contraseñas No Seguras
        JTextArea areaNoSeguras = new JTextArea();
        areaNoSeguras.setEditable(false);
        JScrollPane scrollNoSeguras = new JScrollPane(areaNoSeguras);
        JPanel pNoSeguras = new JPanel(new BorderLayout());
        pNoSeguras.add(new JLabel("Contrasenyes No Segures"), BorderLayout.NORTH);
        pNoSeguras.add(scrollNoSeguras, BorderLayout.CENTER);

        visualitzacion.add(pSeguras);
        visualitzacion.add(pNoSeguras);

        //Logica de analizar
        analizar.addActionListener(e -> {
            String ruta = caminoFicheroOrigen.getText();
            File archivoEntrada = new File(ruta);

            if (!archivoEntrada.exists()) { // 
                JOptionPane.showMessageDialog(frame, "El fitxer no existeix", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //Limpiamos areas antes de empezar
            areaSeguras.setText("");
            areaNoSeguras.setText("");

            // EXPLICACIÓN: Try-with-resources. Abre el archivo y lo cierra automáticamente al terminar.
            try (BufferedReader br = new BufferedReader(new FileReader(archivoEntrada))) {
                String linea;
                // EXPLICACIÓN: Leemos el archivo línea por línea hasta que lleguemos al final (null).
                while ((linea = br.readLine()) != null) {
                    if (esSegura(linea)) {
                        areaSeguras.append(linea + "\n");
                    } else {
                        areaNoSeguras.append(linea + "\n");
                    }
                }
                desar.setEnabled(true); //Activamos boton guardar tras análisis 
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Error llegint el fitxer", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        //Logica de guardar
        desar.addActionListener(e -> {
            String rutaDestino = caminoFicheroDestino.getText();
            if (rutaDestino.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Escriu un camí de destí", "Avís", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // EXPLICACIÓN: PrintWriter permite escribir texto en un archivo de forma sencilla.
            try (PrintWriter pw = new PrintWriter(new File(rutaDestino))) {
                pw.print(areaSeguras.getText()); // Solo guardamos las seguras
                JOptionPane.showMessageDialog(frame, "Fitxer desat correctament");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Error en desar el fitxer", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // EXPLICACIÓN: Añadimos los paneles al frame principal usando las regiones de BorderLayout.
        frame.add(panelOrigen, BorderLayout.NORTH);     // Arriba: entrada
        frame.add(visualitzacion, BorderLayout.CENTER); // Centro: resultados
        frame.add(panelDestino, BorderLayout.SOUTH);    // Abajo: salida

        frame.setVisible(true);
    }

    /**
     * EXPLICACIÓN: Este método organiza visualmente los componentes de control.
     * Usa GridBagLayout para que el JTextField sea flexible y el botón se quede a la derecha.
     */
    private static JPanel crearFila(String etiqueta, JTextField campo, javax.swing.JComponent boton) {
        JPanel p = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        // EXPLICACIÓN: Insets añade un pequeño margen (padding) alrededor de los componentes.
        gbc.insets = new Insets(5, 5, 5, 5);

        // Etiqueta (Lado izquierdo)
        gbc.gridx = 0; gbc.weightx = 0; gbc.fill = GridBagConstraints.NONE;
        p.add(new JLabel(etiqueta), gbc);

        // Campo de texto (Centro, se expande horizontalmente)
        gbc.gridx = 1; gbc.weightx = 1.0; gbc.fill = GridBagConstraints.HORIZONTAL;
        p.add(campo, gbc);

        // Botón (Lado derecho)
        gbc.gridx = 2; gbc.weightx = 0; gbc.fill = GridBagConstraints.NONE;
        p.add(boton, gbc);

        return p;
    }

    private static boolean esSegura(String pass) {
        // EXPLICACIÓN: Requisito 1 - Longitud mínima de 8 caracteres.
        if (pass.length() < 8) return false;

        boolean tieneNumero = false;
        boolean tieneMayuscula = false;

        // EXPLICACIÓN: Recorremos cada letra de la contraseña para verificar las condiciones.
        for (char c : pass.toCharArray()) {
            if (Character.isDigit(c)) tieneNumero = true;      // Requisito 2 - Al menos un número.
            if (Character.isUpperCase(c)) tieneMayuscula = true; // Requisito 3 - Al menos una mayúscula.
        }

        // EXPLICACIÓN: Solo devuelve true si ambas condiciones son verdaderas.
        return tieneNumero && tieneMayuscula;
    }
}