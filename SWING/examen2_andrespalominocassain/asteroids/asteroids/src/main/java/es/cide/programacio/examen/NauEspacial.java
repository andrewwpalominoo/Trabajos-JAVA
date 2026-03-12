package es.cide.programacio.examen;

import java.awt.Color;
import java.awt.Graphics;

class NauEspacial {
    private int x, y; // Posició de la nau espacial
    private final int ample = 20; // Ample de la nau espacial
    private final int alt = 20; // Alt de la nau espacial

    public NauEspacial(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moureEsquerra() {
        x -= 5; // Mou la nau cap a l'esquerra
    }

    public void moureDreta() {
        x += 5; // Mou la nau cap a la dreta
    }

    //Metodos para moverse arriba y abajo

    public void moureArriba() {
        y -= 5; // Mou la nau para abajo
    }

    public void moureAbajo() {
        y += 5; // Mou la nau para arriba
    }

    public void dibuixar(Graphics g) {
        g.setColor(Color.GREEN); // Color de la nau espacial
        g.fillRect(x, y, ample, alt); // Dibuixa la nau com un rectangle
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getAmple() {
        return ample;
    }

    public int getAlt() {
        return alt;
    }
}