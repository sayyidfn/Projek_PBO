package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static Connection conn;

    public static Connection getKoneksi() {
        if (conn == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/minimarket_pbo"; 
                String user = "root"; 
                String password = ""; 
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi Berhasil");
            } catch (SQLException e) {
                System.out.println("Koneksi Gagal: " + e.getMessage());
            }
        }
        return conn;
    }
}
