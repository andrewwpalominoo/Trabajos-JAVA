//Andrés Palomino Cassain

package es.cide.prog;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Editor de texto");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10, 10));
        frame.setSize(700, 500);

        final File[] files = { null };

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

        JPanel areaTexto = new JPanel();
        areaTexto.setLayout(new GridLayout(1, 1));
        JScrollPane scrollPane = new JScrollPane();
        JTextArea textArea = new JTextArea();
        scrollPane.setViewportView(textArea);
        areaTexto.add(scrollPane);

        //Acciones de los botones
        //Botón Nuevo
        button1.addActionListener(e -> {
            textArea.setText("");
            files[0] = null;
        });

        //Botón Abrir
        button2.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                files[0] = fileChooser.getSelectedFile();

                try (FileInputStream fis = new FileInputStream(files[0])) {
                    byte[] data = fis.readAllBytes();
                    String content = new String(data);
                    textArea.setText(content);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        //Botón Guardar
        button3.addActionListener(e -> {
            if (files[0] != null) {
                writeInFile(files[0], textArea.getText(), frame);
            }
        });

        frame.add(botones, BorderLayout.NORTH);
        frame.add(areaTexto, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private static void writeInFile(File file, String content, JFrame frame) {
        try (FileOutputStream writer = new FileOutputStream(file)) {
            writer.write(content.getBytes());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}