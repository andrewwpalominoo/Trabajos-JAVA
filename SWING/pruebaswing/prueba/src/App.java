import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class App {

    private static void mostrarDialogo(JFrame parent){
            JDialog dialogo = new JDialog(parent, "Mensaje Importante", true);
            dialogo.setSize(300, 150);

            JLabel etiqueta = new JLabel("Esto es un dialogo", JLabel.CENTER);
            dialogo.add(etiqueta, BorderLayout.CENTER);

            JButton botonCerrar = new JButton("De acuerdo");
            botonCerrar.addActionListener(e -> dialogo.dispose());
            dialogo.add(botonCerrar, BorderLayout.SOUTH);

            dialogo.setLocationRelativeTo(parent);
            dialogo.setVisible(true);
        }

    public static void main(String[] args) {
        
        JFrame  frame = new JFrame("Ejemplo JDialog");
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
    
        JButton botonAbrir = new JButton("Abrir dialogo");
        frame.add(botonAbrir);
        

        botonAbrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                mostrarDialogo(frame);
            }
        });

        frame.setVisible(true);
    }
}
