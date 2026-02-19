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
        private int x = 390, y = 220;
        private int dx = 2, dy = 2;
        private final int RADI = 10;
        private final int DELAY = 10;
        private Timer timer;
        private int puntosJug1 = 0;
        private int puntosJug2 = 0;

        public CirculoRebotante() {
            setBackground(new Color(230, 131, 247));
            timer = new Timer(DELAY, this);
            timer.start();
            addKeyListener(this);
            setFocusable(true);
            requestFocusInWindow();
        }

        // Variables Jugador 1 (posicion y velocidad)
        private int jug1x = 10, jug1y = 180;
        private int jug1speedx = 5, jug1speedy = 5;

        // Variables Jugador 2 (posicion y velocidad)
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
            g2d.drawString("Jugador 1: " + puntosJug1, 150, 25);

            // Texto Jugador 2
            g2d.setColor(Color.BLACK);
            g2d.drawString("Jugador 2: " + puntosJug2, 550, 25);
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

        // Movimientos circulo
        @Override
        public void actionPerformed(ActionEvent e) {

            // Limites para los rectangulos, al llegar a su limite no puedes subir/bajar mas
            if (jug1y <= 0) {
                jug1y = 0;
            } else if (jug1y >= 360) {
                jug1y = 360;
            }

            if (jug2y <= 0) {
                jug2y = 0;
            } else if (jug2y >= 360) {
                jug2y = 360;
            }

            // Si la pelota choca con algun lado, suma un punto al contrario y resetea el
            // balon al medio
            if (x + 2 * RADI >= getWidth()) {
                dx = -dx;
                puntosJug1++;
                x = 390;
                y = 220;
            }
            if (x <= 0) {
                dx = -dx;
                puntosJug2++;
                x = 390;
                y = 220;
            }
            // Colisiones con Jugador 1
            if (x <= jug1x + 15 && x >= jug1x && y + 2 * RADI >= jug1y && y <= jug1y + 100) {
                dx = -dx;
                x = jug1x + 15;
            }
            // Colisiones con Jugador 2
            if (x + 2 * RADI >= jug2x && x + 2 * RADI <= jug2x && y + 2 * RADI >= jug2y && y <= jug2y + 100) {
                dx = -dx;
                x = jug2x - 2 * RADI;
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