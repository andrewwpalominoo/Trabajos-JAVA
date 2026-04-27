package es.cide.prog;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class SwingBBDD implements Metodos {
    private JTextField campNss, campNom, campApellidos, campEmail, campIban;
    private DefaultTableModel modeloEmpleados;
    public SwingBBDD() {
        ventanaBBDD();
    }

    private void ventanaBBDD() {
        JFrame ventanaPrincipal = new JFrame();
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrincipal.setSize(850, 650);
        ventanaPrincipal.setLocationRelativeTo(null);

        JTabbedPane tabsTablas = new JTabbedPane();
        tabsTablas.addTab("Empleados", seccionEmpleados());
        tabsTablas.addTab("Plazas", seccionPlazas());
        tabsTablas.addTab("Nominas", seccionNominas());

        ventanaPrincipal.add(tabsTablas);
        ventanaPrincipal.setVisible(true);
    }

    private JPanel seccionEmpleados() {
        JPanel panelContenidor = new JPanel(new GridBagLayout());
        // GBC para ordenar
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        String[] columnasEmpleados = {"NSS", "Nombre", "Apellidos", "Email", "IBAN"};
        modeloEmpleados = new DefaultTableModel(columnasEmpleados, 0);
        JTable tablaEmpleados = new JTable(modeloEmpleados);

        gbc.gridy = 0; 
        gbc.gridx = 0; 
        gbc.gridwidth = 2;
        gbc.weightx = 1.0; 
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelContenidor.add(new JScrollPane(tablaEmpleados), gbc);

        gbc.weighty = 0; 
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        campNss = new JTextField();
        campNom = new JTextField();
        campApellidos = new JTextField();
        campEmail = new JTextField();
        campIban = new JTextField();

        String[] etiquetes = {"NSS:", "Nombre:", "Apellidos:", "Email:", "IBAN:"};
        JTextField[] camps = {campNss, campNom, campApellidos, campEmail, campIban};
        for (int i = 0; i < etiquetes.length; i++) {
            gbc.gridy = i + 1; 
            gbc.gridx = 0;  
            gbc.weightx = 0.1;
            panelContenidor.add(new JLabel(etiquetes[i]), gbc);
            gbc.gridx = 1; gbc.weightx = 0.9;
            panelContenidor.add(camps[i], gbc);
        }
    
        JButton botonRegistrar = new JButton("Registrar Nuevo Empleado");
        botonRegistrar.addActionListener(e -> {
            try {
                Empleado nuevoEmpleado = new Empleado(Integer.parseInt(campNss.getText()),campNom.getText(),campApellidos.getText(), campEmail.getText(), campIban.getText());
                boolean insertado = insertarEmpleado(nuevoEmpleado);
                if (insertado) {
                modeloEmpleados.addRow(new Object[]{nuevoEmpleado.getNss(), nuevoEmpleado.getNom(), nuevoEmpleado.getApellidos(), nuevoEmpleado.getEmail(), nuevoEmpleado.getIban()});
                JOptionPane.showMessageDialog(null, "Empleado registrado correctamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "El NSS debe ser un número.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        gbc.gridy = 6; 
        gbc.gridx = 0; 
        gbc.gridwidth = 2;
        gbc.insets = new Insets(20, 10, 10, 10);
        panelContenidor.add(botonRegistrar, gbc);

        return panelContenidor;
    }

    private JPanel seccionPlazas() {
        JPanel panelContenidor = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);

        String[] columnesPlaca = {"Codigo", "Nombre", "Salario", "Supervisor", "Tipo"};
        JTable tablaEmpleados = new JTable(new DefaultTableModel(columnesPlaca, 0));

        gbc.gridy = 0; 
        gbc.gridx = 0; 
        gbc.gridwidth = 2;
        gbc.weighty = 1.0; 
        gbc.fill = GridBagConstraints.BOTH;
        panelContenidor.add(new JScrollPane(tablaEmpleados), gbc);

        gbc.weighty = 0; gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        String[] nomsCamps = {"Nombre de la Plaza:", "Salario anual:", "Tipo de Plaza:", "Codigo Supervisor:", "Informe Supervision:"};

        for (int i = 0; i < nomsCamps.length; i++) {
            gbc.gridy = i + 1; gbc.gridx = 0; gbc.weightx = 0.1;
            panelContenidor.add(new JLabel(nomsCamps[i]), gbc);
            gbc.gridx = 1; gbc.weightx = 0.9;
            panelContenidor.add(new JTextField(), gbc);
        }

        JButton botoCrear = new JButton("Registrar Nueva Plaza");
        gbc.gridy = 6; gbc.gridx = 0; gbc.gridwidth = 2;
        gbc.insets = new Insets(15, 8, 8, 8);
        panelContenidor.add(botoCrear, gbc);

        return panelContenidor;
    }

    private JPanel seccionNominas() {
        JPanel panelContenidor = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);

        String[] columnesNomina = {"ID", "IBAN Pago", "Importe", "NSS Empleado", "Codigo Plaza"};
        JTable tablaEmpleados = new JTable(new DefaultTableModel(columnesNomina, 0));

        gbc.gridy = 0; gbc.gridx = 0; gbc.gridwidth = 2;
        gbc.weighty = 1.0; gbc.fill = GridBagConstraints.BOTH;
        panelContenidor.add(new JScrollPane(tablaEmpleados), gbc);

        gbc.weighty = 0; gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        String[] nomsCamps = {"IBAN de Pago:", "Importe Bruto (Euros):", "NSS del Empleado:", "Codigo de la Plaza:"};
        for (int i = 0; i < nomsCamps.length; i++) {
            gbc.gridy = i + 1; gbc.gridx = 0; gbc.weightx = 0.1;
            panelContenidor.add(new JLabel(nomsCamps[i]), gbc);
            gbc.gridx = 1; gbc.weightx = 0.9;
            panelContenidor.add(new JTextField(), gbc);
        }

        JButton botoGenerar = new JButton("Registrar Nomina");
        gbc.gridy = 5; gbc.gridx = 0; gbc.gridwidth = 2;
        gbc.insets = new Insets(15, 8, 8, 8);
        panelContenidor.add(botoGenerar, gbc);

        return panelContenidor;
    }
}
