package es.cide.prog;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Main {
    public static void main(String[] args) {
        JFrame finestra = new JFrame();
        finestra.setSize(400, 400);
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        finestra.setLayout(new FlowLayout());

        JLabel etiqueta = new JLabel();
        ButtonGroup grupBotons = new ButtonGroup();
        JRadioButton windows = new JRadioButton("Windows");
        JRadioButton linux = new JRadioButton("Linux");
        JRadioButton mac = new JRadioButton("Mac OS");

        ImageIcon iconWindows = new ImageIcon("ej8/src/main/resources/windows.png");
        ImageIcon scaledIconWindows = new ImageIcon(iconWindows.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        ImageIcon iconLinux = new ImageIcon("ej8/src/main/resources/linux.png");  
        ImageIcon scaledIconLinux = new ImageIcon(iconLinux.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        ImageIcon iconMac = new ImageIcon("ej8/src/main/resources/macos.png");
        ImageIcon scaledIconMac = new ImageIcon(iconMac.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));

        windows.addActionListener(e -> etiqueta.setIcon(scaledIconWindows));
        linux.addActionListener(e -> etiqueta.setIcon(scaledIconLinux));
        mac.addActionListener(e -> etiqueta.setIcon(scaledIconMac));
        grupBotons.add(windows);
        grupBotons.add(linux);
        grupBotons.add(mac);

        finestra.add(windows);
        finestra.add(linux);
        finestra.add(mac);
        finestra.add(etiqueta);
        finestra.setVisible(true);
    }
}