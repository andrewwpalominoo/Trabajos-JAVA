// Andrés Palomino Cassain
// DNI:
// 13/02/26 -> 

package es.cide.prog;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class Main {

    public static class CirculoRebotante extends JPanel implements ActionListener, KeyListener {
        private int x = 50, y = 50;
        private int dx = 2, dy = 2;
        private final int RADI = 10;
        private final int DELAY = 10;
        private Timer timer;

        public CirculoRebotante() {
            setBackground(Color.WHITE);
            timer = new Timer(DELAY, this);
            timer.start();
            addKeyListener(this);
            setFocusable(true);
            requestFocusInWindow();
        }

        // Variables Jugador 1
        private int jug1x = 10, jug1y = 180;
        private int jug1speedx = 5, jug1speedy = 5;

        // Variables Jugador 2
        private int jug2x = 760, jug2y = 180;
        private int jug2speedx = 5, jug2speedy = 5;

        @Override
        protected void paintComponent(Graphics g) {

            // Circulo
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.BLACK);
            g2d.fillOval(x, y, RADI * 2, RADI * 2);

            // Rectangulo 1
            g2d.setColor(Color.BLACK);
            g2d.fillRect(jug1x, jug1y, 15, 100);

            // Rectangulo 2
            g2d.setColor(Color.BLACK);
            g2d.fillRect(jug2x, jug2y, 15, 100);

            // Linea central
            g2d.drawLine(400, 0, 400, 500);

            // Texto Jugador 1
            g2d.setColor(Color.BLACK);
            g2d.drawString("Jugador 1: 0", 150, 25);

            // Texto Jugador 2
            g2d.setColor(Color.BLACK);
            g2d.drawString("Jugador 2: 0", 550, 25);
        }

        // Movimientos (Jugador 1 con W y S, Jugador 2 con flecha arriba y abajo)
        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            switch (key) {
                case KeyEvent.VK_W -> jug1y -= jug1speedy;
                case KeyEvent.VK_S -> jug1y += jug1speedy;
                case KeyEvent.VK_UP -> jug2y -= jug2speedy;
                case KeyEvent.VK_DOWN -> jug2y += jug2speedy;
            }

            repaint();
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }

        @Override
        public void keyTyped(KeyEvent e) {
        }

        // Moviimiento circulo
        @Override
        public void actionPerformed(ActionEvent e) {
            if (x + 2 * RADI >= getWidth() || x <= 0) {
                dx = -dx;
            }
            if (y + 2 * RADI >= getHeight() || y <= 0) {
                dy = -dy;
            }
            x += dx;
            y += dy;
            repaint();
        }
    }

    // Main
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame pong = new JFrame("POOng!");
            CirculoRebotante panel = new CirculoRebotante();
            pong.add(panel);
            pong.setSize(800, 500);
            pong.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            pong.setLocationRelativeTo(null);

            pong.setVisible(true);
        });
    }
}