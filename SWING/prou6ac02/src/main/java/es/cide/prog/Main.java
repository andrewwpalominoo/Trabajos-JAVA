package es.cide.prog;

//Imports
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Main {

    public static void main(String[] args) {
        //Creamos el Frame principal
        JFrame finestra = new JFrame("Panel de Administracion - [Andrés]");
        finestra.setSize(800, 600);
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        finestra.setLayout(new GridLayout(2, 2, 15, 15));

        //Creacion de los 4 paneles para luego modificarlos
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();

        //Primer panel con los dos Labels de info
        panel1.setBorder(new TitledBorder("Estado del sistema"));
        panel1.setLayout(new GridLayout(2, 1));
        JPanel cpu = new JPanel(new BorderLayout()); //Centramos el texto e indicamos el Layout
        cpu.add(new JLabel("CPU: 25% Usada", JLabel.CENTER), BorderLayout.AFTER_LAST_LINE);
        JPanel ram = new JPanel(new BorderLayout()); //Centramos el texto e indicamos el Layout
        ram.add(new JLabel("RAM: 8GB/32GB", JLabel.CENTER), BorderLayout.BEFORE_FIRST_LINE);
        //Implementamos
        panel1.add(cpu, BorderLayout.CENTER);
        panel1.add(ram, BorderLayout.CENTER);

        //Panel con los 3 botones
        //Creamos CompoundBorder para alinear los botones correctamente (Emptyborder) sin perder el titulo (TitledBorder)
        panel2.setBorder(new CompoundBorder(new TitledBorder("Acciones rápidas"), new EmptyBorder(50,100,50,100)));
        panel2.setLayout(new GridLayout(3,1,0,10));
        //Botones
        JButton iniciar = new JButton("▶ Iniciar servicio");
        JButton parar = new JButton("■ Pausar servicio");
        JButton reiniciar = new JButton("↻ Reiniciar");
        //Implementamos
        panel2.add(iniciar);
        panel2.add(parar);
        panel2.add(reiniciar);

        //Panel con el slider, label y area de texto
        panel3.setBorder(new TitledBorder("Panel de configuración"));
        panel3.setLayout(new GridLayout(4, 1));
        //Creamos label
        JLabel limite = new JLabel("Límite de conexiones");
        //Slider con minimos maximos, painticks/labels y numeros
        JSlider slide = new JSlider(0, 500, 250);
        slide.setPaintTicks(true);
        slide.setPaintLabels(true);
        slide.setMajorTickSpacing(100);
        slide.setMinorTickSpacing(25);
        //Label y area de texto
        JLabel timeout = new JLabel("Timeout (segundos)");
        JTextField texto = new JTextField("60");
        //Implementamos
        panel3.add(limite);
        panel3.add(slide);
        panel3.add(timeout);
        panel3.add(texto);

        //Panel con textarea y scrollbar
        panel4.setBorder(new TitledBorder("Logs del Server en Vivo"));
        panel4.setLayout(new BorderLayout());
        JTextArea textoArea = new JTextArea(); //Text area
        textoArea.setFont(new Font("Monospaced", Font.PLAIN, 12)); //Fuente con su estilo y tamaño
        textoArea.setText("[Info] Servei iniciat... \n  [Warning] Connexió lenta IP 192... \n ..."); //Texto placeholder
        textoArea.setEditable(false); //No editable
        //Creamos el scroll e implementamos el textarea en su constructor
        JScrollPane scroll = new JScrollPane(textoArea);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        //Implementamos
        panel4.add(scroll, BorderLayout.CENTER);

        //Implementamos los 4 paneles y dejamos como visible
        finestra.add(panel1);
        finestra.add(panel2);
        finestra.add(panel3);
        finestra.add(panel4);
        finestra.setVisible(true);
    }
}