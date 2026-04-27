package es.cide.prog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public interface Metodos {
        public default boolean insertarEmpleado(Empleado e) {
        String nuevoEmpleado = "INSERT INTO EMPLEAT VALUES (" + e.getNss() + ", '" + e.getNom() + "', '" + e.getApellidos() + "', '" + e.getEmail() + "', '" + e.getIban() + "')";
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:trabajo.db");
            Statement stmt = conn.createStatement()) {

            stmt.executeUpdate(nuevoEmpleado);
            System.out.println("Empleado insertado correctamente.");
            return true;
        } catch (SQLException ex) {
            System.err.println("Error al insertar empleado: " + ex.getMessage());
            return false;
        }
    }
}
