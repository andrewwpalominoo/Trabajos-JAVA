// Andrés Palomino Cassain

package es.cide.prog;

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
        // Ajuste de la ventana segun enunciado: no redimensionable
        JFrame frame = new JFrame("Buscador de Palindromos");
        frame.setSize(750, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout(10, 10));
        frame.setLocationRelativeTo(null);

        // Creamos los componentes de entrada/salida.
        // Usamos JTextField para las rutas y JButton para las acciones.
        JTextField caminoFicheroOrigen = new JTextField();
        JButton leer = new JButton("Leer");

        // Llamamos a un método auxiliar para organizar la fila
        // con la etiqueta y el campo a la izquierda, y el botón a la derecha.
        JPanel panelOrigen = crearFila("Fichero origen:", caminoFicheroOrigen, leer);

        JTextField caminoFicheroDestino = new JTextField();
        JButton guardar = new JButton("Guardar"); // Creamos el boton de Desar
        guardar.setEnabled(false); // Inactivo hasta que se haga el analisis

        JPanel panelDestino = crearFila("Fichero destino:", caminoFicheroDestino, guardar);

        // Panel central para las areas de visualizacion
        JPanel visualitzacion = new JPanel(new GridLayout(1, 2, 10, 10));

        // Area Palindromos
        JTextArea areaPalindromos = new JTextArea();
        areaPalindromos.setEditable(false); // Evita que el usuario escriba manualmente en el área de resultados.
        JScrollPane scrollPalindromos = new JScrollPane(areaPalindromos);
        JPanel pPalindromos = new JPanel(new BorderLayout());
        pPalindromos.add(new JLabel("Palindromos"), BorderLayout.NORTH);
        pPalindromos.add(scrollPalindromos, BorderLayout.CENTER);

        // Area No Palindromos
        JTextArea areaNoPalindromos = new JTextArea();
        areaNoPalindromos.setEditable(false);
        JScrollPane scrollNoPalindromos = new JScrollPane(areaNoPalindromos);
        JPanel pNoPalindromos = new JPanel(new BorderLayout());
        pNoPalindromos.add(new JLabel("No Palindromos"), BorderLayout.NORTH);
        pNoPalindromos.add(scrollNoPalindromos, BorderLayout.CENTER);

        visualitzacion.add(pPalindromos);
        visualitzacion.add(pNoPalindromos);

        // Logica de leer
        leer.addActionListener(e -> {
            String ruta = caminoFicheroOrigen.getText();
            File archivoEntrada = new File(ruta);

            if (!archivoEntrada.exists()) { //
                JOptionPane.showMessageDialog(frame, "El fichero no existe", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Limpiamos areas antes de empezar
            areaPalindromos.setText("");
            areaNoPalindromos.setText("");

            // Try-with-resources. Abre el archivo y lo cierra automáticamente al terminar.
            try (BufferedReader br = new BufferedReader(new FileReader(archivoEntrada))) {
                String linea;
                // Leemos el archivo línea por línea hasta que lleguemos al final (null).
                while ((linea = br.readLine()) != null) {
                    if (isPalindromo(linea)) {
                        areaPalindromos.append(linea + "\n");
                    } else {
                        areaNoPalindromos.append(linea + "\n");
                    }
                }
                guardar.setEnabled(true); // Activamos boton guardar tras análisis
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Error al leer el fichero", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Logica de guardar
        guardar.addActionListener(e -> {
            String rutaDestino = caminoFicheroDestino.getText();
            if (rutaDestino.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Escribe un camino de destino", "Aviso",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            // PrintWriter permite escribir texto en un archivo de forma sencilla.
            try (PrintWriter pw = new PrintWriter(new File(rutaDestino))) {
                pw.print(areaPalindromos.getText()); // Solo guardamos los palindromos
                JOptionPane.showMessageDialog(frame, "Fichero guardado correctamente");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Error al guardar el fichero", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Añadimos los paneles al frame principal usando las regiones de BorderLayout.
        frame.add(panelOrigen, BorderLayout.NORTH); // Arriba: entrada
        frame.add(visualitzacion, BorderLayout.CENTER); // Centro: resultados
        frame.add(panelDestino, BorderLayout.SOUTH); // Abajo: salida

        frame.setVisible(true);
    }

    // GirdBagLayout para organizar
    private static JPanel crearFila(String etiqueta, JTextField campo, javax.swing.JComponent boton) {
        JPanel p = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Insets añade un pequeño margen (padding) alrededor de los
        // componentes.
        gbc.insets = new Insets(5, 5, 5, 5);

        // Etiqueta (Lado izquierdo)
        gbc.gridx = 0;
        gbc.weightx = 0;
        gbc.fill = GridBagConstraints.NONE;
        p.add(new JLabel(etiqueta), gbc);

        // Campo de texto (Centro, se expande horizontalmente)
        gbc.gridx = 1;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        p.add(campo, gbc);

        // Botón (Lado derecho)
        gbc.gridx = 2;
        gbc.weightx = 0;
        gbc.fill = GridBagConstraints.NONE;
        p.add(boton, gbc);

        return p;
    }

    private static boolean isPalindromo(String pal) {
        // Si es solo 1 o menos no puede ser palindromo
        if (pal.length() < 2)
            return false;

        boolean esPalindromo = true;

        // Le el charAt y el ultimo que van aumentado y menguando respectivamente
        // No detecta espacios no se como hacerlo eso 😔
        for (int i = 0; i < pal.length() && esPalindromo; i++) {
            char letra1 = pal.charAt(i);
            char letra2 = pal.charAt(pal.length() - i - 1);
            if (letra1 == letra2){
                esPalindromo = true;
            } else {
                esPalindromo = false;
            }
        }

        // Solo devuelve true si la condicion es true
        return esPalindromo;
    }
}