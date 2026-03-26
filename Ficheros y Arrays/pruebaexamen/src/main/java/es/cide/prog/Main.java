package es.cide.prog;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main {
    public static void main(String[] args) {

        final File[] files = { null }; // Array para almacenar el archivo

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 2));
        frame.setSize(700, 500);
        frame.setResizable(false);

        JPanel origen = new JPanel();
        origen.setLayout(new GridLayout(1, 2));
        JTextField campoOrigen = new JTextField();
        JButton analizar = new JButton("Analizar");
        origen.add(campoOrigen);
        origen.add(analizar);

        JPanel destino = new JPanel();
        destino.setLayout(new GridLayout(1, 2));
        JTextField campoDestino = new JTextField();
        JButton guardar = new JButton("Guardar");
        destino.add(campoDestino);
        destino.add(guardar);

        JPanel areaTexto = new JPanel();
        areaTexto.setLayout(new GridLayout(2, 2));
        JScrollPane scrollPane = new JScrollPane(); // Scroll para el TextArea
        JLabel segura = new JLabel("Contraseñas seguras");
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFocusable(false);
        areaTexto.add(segura);
        scrollPane.setViewportView(textArea);
        areaTexto.add(scrollPane);
        JScrollPane scrollPane2 = new JScrollPane(); // Scroll para el TextArea
        JLabel insegura = new JLabel("Contraseñas no seguras");
        JTextArea textArea2 = new JTextArea();
        textArea2.setEditable(false);
        textArea2.setFocusable(false);
        areaTexto.add(insegura);
        scrollPane2.setViewportView(textArea2);
        areaTexto.add(scrollPane2);

        analizar.addActionListener(e -> {
            String ruta = (String) campoOrigen.getText();
            File directorio = new File(ruta);
            if (directorio.exists() && directorio.isDirectory()) {
                try (FileInputStream fis = new FileInputStream(directorio)) {
                    byte[] data = fis.readAllBytes(); // Lee el contenido del archivo como bytes
                    String content = new String(data);
                    if (content.length() >= 8 && content.contains("1") && content.contains("a")){
                        textArea.setText(content); // Muestra el contenido en el JTextArea
                    } else {
                        textArea2.setText(content); // Muestra el contenido en el JTextArea
                    }                    
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        frame.add(origen, BorderLayout.NORTH);
        frame.add(destino, BorderLayout.CENTER);
        frame.add(areaTexto, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    
}