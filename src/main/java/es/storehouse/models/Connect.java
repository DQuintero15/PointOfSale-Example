package es.storehouse.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Connect {

    // [Connection Variables]
    public Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "Ola123456";
    private static final String url = "jdbc:mysql://localhost:3306/storehosue?verifyServerCertificate=false&useSSL=true";

    // [Method to getConnection from DB]
    public Connection getConnection() {

        conn = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);

            if (conn != null) {
            }

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return conn;
    }

}
