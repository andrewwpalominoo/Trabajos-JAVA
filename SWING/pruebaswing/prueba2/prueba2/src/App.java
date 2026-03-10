import java.awt.*;
import javax.swing.*;


public class App {
    public static void main(String[] args) throws Exception {
        JFrame finestra = new JFrame("Ejemplo LayoutManager");
        finestra.setSize(500, 300);
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        finestra.setLayout(new BorderLayout());

        JPanel panelSuperior = new JPanel();
        panelSuperior.setLayout(new FlowLayout());
        panelSuperior.add(new JButton("Boton 1"));
        panelSuperior.add(new JButton("Boton 2"));
        panelSuperior.add(new JButton("Boton 3"));

        JPanel panelCentral = new JPanel();
        panelCentral.setLayout(new GridLayout(4, 1));
        panelCentral.add(new JLabel("Etiqueta 1"));
        panelCentral.add(new TextField("Texto 1"));
        panelCentral.add(new JLabel("Etiqueta 2"));
        panelCentral.add(new TextField("Texto 2"));

        finestra.add(panelSuperior, BorderLayout.NORTH);
        finestra.add(panelCentral, BorderLayout.CENTER);

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        finestra.setVisible(true);
        
    }
}
