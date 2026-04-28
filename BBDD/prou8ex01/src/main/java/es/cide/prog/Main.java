package es.cide.prog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        String url = "jdbc:sqlite:trabajo.db";

    try (Connection con = DriverManager.getConnection(url)) {
        // Para poder usar SQL
        Statement stmt = con.createStatement();
        // Tablas
        String tablaTipoPlaza = "CREATE TABLE IF NOT EXISTS TIPUS_PLACA (NOM TEXT PRIMARY KEY, FUNCIO TEXT NOT NULL);";
        String tablaPlaza = "CREATE TABLE IF NOT EXISTS PLAZA (CODI INTEGER PRIMARY KEY AUTOINCREMENT, NOM TEXT NOT NULL, SALARI REAL NOT NULL, INFORME_SUPERVISIO TEXT, CODI_PLACA_SUPERVISORA INTEGER, NOM_TIPUS_PLACA TEXT NOT NULL, FOREIGN KEY (CODI_PLACA_SUPERVISORA) REFERENCES PLACA (CODI), FOREIGN KEY (NOM_TIPUS_PLACA) REFERENCES TIPUS_PLACA (NOM));";
        String tablaEmpleado = "CREATE TABLE IF NOT EXISTS EMPLEAT (NSS INTEGER PRIMARY KEY, NOM TEXT NOT NULL, LLINATGES TEXT NOT NULL, EMAIL TEXT, IBAN TEXT UNIQUE NOT NULL CHECK (IBAN LIKE 'ES%'));";
        String tablaOcupa = "CREATE TABLE IF NOT EXISTS OCUPA (NSS_EMPLEAT INTEGER NOT NULL, CODI_PLACA INTEGER NOT NULL, DATA_INICI TEXT NOT NULL, DATA_FI TEXT, PRIMARY KEY (NSS_EMPLEAT, CODI_PLACA), FOREIGN KEY (NSS_EMPLEAT) REFERENCES EMPLEAT (NSS), FOREIGN KEY (CODI_PLACA) REFERENCES PLACA (CODI));";
        String tablaNomina = "CREATE TABLE IF NOT EXISTS NOMINA (ID_NOMINA INTEGER PRIMARY KEY AUTOINCREMENT, IBAN_PAGAMENT TEXT NOT NULL, IMPORT REAL NOT NULL, NSS_EMPLEAT INTEGER NOT NULL, CODI_PLACA INTEGER NOT NULL, FOREIGN KEY (NSS_EMPLEAT) REFERENCES EMPLEAT (NSS), FOREIGN KEY (CODI_PLACA) REFERENCES PLACA (CODI));";
        stmt.executeUpdate(tablaTipoPlaza);
        stmt.executeUpdate(tablaPlaza);
        stmt.executeUpdate(tablaEmpleado);
        stmt.executeUpdate(tablaOcupa);
        stmt.executeUpdate(tablaNomina);

    } catch (SQLException e) {
        System.err.println(e.getMessage());
    }
        SwingUtilities.invokeLater(() -> new SwingBBDD());
    }
}