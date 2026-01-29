package es.cide.prog;

import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextField;

public class Main {
    public static void main(String[] args) {
        JFrame finestra = new JFrame();
        finestra.setSize(400,400);
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        finestra.setLayout(new GridLayout(3,1));

        DefaultListModel<String> modelodelista = new DefaultListModel<>();
        JList<String> listadelacompra = new JList<>(modelodelista);
        JTextField item = new JTextField();
        JButton añadirButton = new JButton("Añadir");
        añadirButton.addActionListener(e -> {
            modelodelista.addElement(item.getText());
            item.setText("");
            
        });

        finestra.add(item);
        finestra.add(añadirButton);
        finestra.add(listadelacompra);
        finestra.setVisible(true);
    }
}