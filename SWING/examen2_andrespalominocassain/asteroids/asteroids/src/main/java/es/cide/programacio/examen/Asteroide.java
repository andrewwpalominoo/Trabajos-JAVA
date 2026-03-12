package es.cide.programacio.examen;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;

class Asteroide extends Canvas {
    private int x, y; // Posició de l'asteroide
    private int radi = 10; // Radi de l'asteroide
    private int velocitat; // Velocitat de l'asteroide
    private final Image tiefighter = Toolkit.getDefaultToolkit().getImage("src/main/resources/tie.png");
    Random aleatori = new Random(); // Random para el tamaño
    private int tamany = aleatori.nextInt(3) + 1;

    public Asteroide(int amplePanell) {
        Random aleatori = new Random();
        x = aleatori.nextInt(amplePanell - radi * 2) + radi; // Posició x aleatòria
        y = 0; // Comença a la part superior del panell
        velocitat = aleatori.nextInt(3) + 1; // Velocitat aleatòria entre 1 i 3
        
    }

    public void moure() {
        y += velocitat; // Mou l'asteroide cap avall
    }

    public void dibuixar(Graphics g) {
        g.setColor(Color.RED); // Color de l'asteroide
        if (tamany == 1){
            radi = 10;
            g.fillOval(x - radi, y - radi, 2 * radi, 2 * radi); // Dibuixa l'asteroide com un cercle
        } else if (tamany == 2){
            radi = 5;
            g.fillOval(x - radi, y - radi, 2 * radi, 2 * radi); // Dibuixa l'asteroide com un cercle
        } else if (tamany == 3){
            radi = 15;
            g.fillOval(x - radi, y - radi, 2 * radi, 2 * radi); // Dibuixa l'asteroide com un cercle
        }
        g.drawImage(tiefighter, x - radi, y - radi, 2 * radi, 2 * radi, this);
        
        
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadi() {
        return radi;
    }
}
