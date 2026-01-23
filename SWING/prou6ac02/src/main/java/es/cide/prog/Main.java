package es.cide.prog;

import java.awt.BorderLayout;
import java.awt.Dimension;
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
import javax.swing.border.TitledBorder;

public class Main {

    public static void main(String[] args) {
        JFrame finestra = new JFrame("Panel de Administracion - [Andrés]");
        finestra.setSize(800, 600);
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        finestra.setLayout(new GridLayout(2, 2, 15, 15));
        // finestra.setLayout(new EmptyBorder(null));

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();

        panel1.setBorder(new TitledBorder("Estado del sistema"));
        panel1.setLayout(new GridLayout(2, 1));
        JPanel cpu = new JPanel(new BorderLayout());
        cpu.add(new JLabel("CPU: 25% Usada", JLabel.CENTER), BorderLayout.AFTER_LAST_LINE);
        JPanel ram = new JPanel(new BorderLayout());
        ram.add(new JLabel("RAM: 8GB/32GB", JLabel.CENTER), BorderLayout.BEFORE_FIRST_LINE);
        panel1.add(cpu, BorderLayout.CENTER);
        panel1.add(ram, BorderLayout.CENTER);

        panel2.setBorder(new TitledBorder("Acciones rápidas"));
        panel2.setLayout(new GridLayout(3, 1, 0, 10));
        JButton iniciar = new JButton("▶ Iniciar servicio");
        iniciar.setPreferredSize(new Dimension(20, 2));
        JButton parar = new JButton("■ Pausar servicio");
        parar.setPreferredSize(new Dimension(20, 2));
        JButton reiniciar = new JButton("↻ Reiniciar");
        reiniciar.setPreferredSize(new Dimension(20, 2));
        panel2.add(iniciar);
        panel2.add(parar);
        panel2.add(reiniciar);

        panel3.setBorder(new TitledBorder("Panel de configuración"));
        panel3.setLayout(new GridLayout(4, 1));
        JLabel limite = new JLabel("Límite de conexiones");
        JSlider slide = new JSlider(0, 500);
        slide.setPaintTicks(true);
        slide.setPaintLabels(true);
        slide.setMajorTickSpacing(100);
        slide.setMinorTickSpacing(25);
        JLabel timeout = new JLabel("Timeout (segundos)");
        JTextField texto = new JTextField("60");
        panel3.add(limite);
        panel3.add(slide);
        panel3.add(timeout);
        panel3.add(texto);

        panel4.setBorder(new TitledBorder("Logs del Server en Vivo"));
        panel4.setLayout(new BorderLayout());
        JTextArea textoArea = new JTextArea();
        textoArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        textoArea.setText("[Info] Servei iniciat... \n  [Warning] Connexió lenta IP 192... \n ...");
        textoArea.setEditable(false);
        JScrollPane scroll = new JScrollPane(textoArea);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        panel4.add(scroll, BorderLayout.CENTER);

        finestra.add(panel1);
        finestra.add(panel2);
        finestra.add(panel3);
        finestra.add(panel4);

        finestra.setVisible(true);
    }

}