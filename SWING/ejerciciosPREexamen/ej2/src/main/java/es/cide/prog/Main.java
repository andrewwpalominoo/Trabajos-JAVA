package es.cide.prog;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Main {
    public static void main(String[] args) {
        JFrame finestra = new JFrame();
        finestra.setSize(400, 400);
        finestra.setLayout(new GridLayout(2,2));

        JTextField texto = new JTextField();
        texto.setSize(200,200);
        JLabel espejo = new JLabel();
        espejo.setSize(200,200);

        texto.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) { updateLabel(); }
            public void removeUpdate(DocumentEvent e) { updateLabel(); }
            public void insertUpdate(DocumentEvent e) { updateLabel(); }

            private void updateLabel() {
                espejo.setText(texto.getText());
            }
        });

        finestra.add(texto);
        finestra.add(espejo);

        finestra.setVisible(true);
    }
}