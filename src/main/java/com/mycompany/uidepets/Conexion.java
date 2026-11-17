package com.mycompany.uidepets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/** Centraliza la configuración de acceso a SQL Server. */
public final class Conexion {
    private Conexion() { }

    public static Connection establecerConexion() throws SQLException {
        String servidor = variable("UIDE_DB_SERVER", "localhost\\BDDUIDEPETS");
        String baseDatos = variable("UIDE_DB_NAME", "Info");
        String usuario = variable("UIDE_DB_USER", "sa");
        String contrasena = System.getenv("UIDE_DB_PASSWORD");
        if (contrasena == null || contrasena.isBlank()) {
            throw new SQLException("Configure la variable de entorno UIDE_DB_PASSWORD.");
        }

        String url = "jdbc:sqlserver://" + servidor
                + ";databaseName=" + baseDatos
                + ";encrypt=true;trustServerCertificate=true";
        return DriverManager.getConnection(url, usuario, contrasena);
    }

    private static String variable(String nombre, String valorPorDefecto) {
        String valor = System.getenv(nombre);
        return valor == null || valor.isBlank() ? valorPorDefecto : valor;
    }
}
