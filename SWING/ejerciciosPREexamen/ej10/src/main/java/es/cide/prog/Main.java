package es.cide.prog;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
        JFrame finestra = new JFrame();
        finestra.setSize(500, 500);
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        finestra.setLayout(new GridLayout(1, 1));
        JPanel panel = new JPanel();
        panel.setSize(500, 500);
        JLabel coordenadasraton = new JLabel("Coordenadas ratón: ");
        panel.addMouseMotionListener(new MouseAdapter() {
            public void mouseMoved(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                coordenadasraton.setText("Coordenadas ratón: X=" + x + " Y=" + y);
            }
        });

        panel.add(coordenadasraton);

        finestra.add(panel);
        finestra.setVisible(true);
    }
}