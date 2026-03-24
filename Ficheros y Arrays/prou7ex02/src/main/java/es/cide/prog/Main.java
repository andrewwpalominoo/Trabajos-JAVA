//Andrés Palomino Cassain

package es.cide.prog;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class Main {
    public static void main(String[] args) {
        // Look and feel
        try {
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Frame principal
        JFrame frame = new JFrame("Editor de texto");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10, 10));
        frame.setSize(700, 500);

        final File[] files = { null }; // Array para almacenar el archivo

        // Panel superior de todos los botones
        JPanel botones = new JPanel();
        botones.setLayout(new GridLayout(1, 4));
        JButton button1 = new JButton("📄 Nuevo ");
        JButton button2 = new JButton("📂 Abrir ");
        JButton button3 = new JButton("💾 Guardar ");
        JButton button4 = new JButton("💾 Guardar como ");
        botones.add(button1);
        botones.add(button2);
        botones.add(button3);
        botones.add(button4);

        // Panel central para escribir en el fichero
        JPanel areaTexto = new JPanel();
        areaTexto.setLayout(new GridLayout(1, 1));
        JScrollPane scrollPane = new JScrollPane(); // Scroll para el TextArea
        JTextArea textArea = new JTextArea();
        scrollPane.setViewportView(textArea);
        areaTexto.add(scrollPane);

        // Acciones de los botones
        // Boton Nuevo
        button1.addActionListener(e -> { // Limpia el texto y pone el archivo en null
            textArea.setText("");
            files[0] = null;
        });

        // Boton Abrir
        button2.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser(); // Abrir el JFileChooser para seleccionar un archivo
            int result = fileChooser.showOpenDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                files[0] = fileChooser.getSelectedFile(); // Guarda el archivo en el array

                try (FileInputStream fis = new FileInputStream(files[0])) {
                    byte[] data = fis.readAllBytes(); // Lee el contenido del archivo como bytes
                    String content = new String(data);
                    textArea.setText(content); // Muestra el contenido en el JTextArea
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        // Boton Guardar
        button3.addActionListener(e -> {
            if (files[0] != null) { // Si no es null guarda directamente
                writeInFile(files[0], textArea.getText(), frame);
            } else { // Si es null hace click en guardar como
                button4.doClick();
            }
        });

        // Boton Guardar como
        button4.addActionListener(e -> { // Siempre abre el JFileChooser para elegir donde guardar
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showSaveDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) { // Si el usuario aprueba la seleccion guarda el archivo
                files[0] = fileChooser.getSelectedFile(); // Guarda el archivo en el array
                writeInFile(files[0], textArea.getText(), frame); // Escribe el contenido del area en el archivo
            }
        });

        // Agregamos los paneles al frame
        frame.add(botones, BorderLayout.NORTH);
        frame.add(areaTexto, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    // Método para escribir en el archivo
    private static void writeInFile(File file, String content, JFrame frame) {
        try (FileOutputStream writer = new FileOutputStream(file)) {
            writer.write(content.getBytes());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}