/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtility {
    private static Connection koneksi;

    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                // Untuk MySQL versi 8 ke atas gunakan com.mysql.cj.jdbc.Driver
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                // Sesuaikan nama database "db_kampus"
                String url = "jdbc:mysql://localhost:3306/db_kampus";
                String user = "root";       // default XAMPP
                String password = "374722";       
                
                koneksi = DriverManager.getConnection(url, user, password);
                if (koneksi != null) {
                    System.out.println("Koneksi berhasil!");
                }
            } catch (ClassNotFoundException cne) {
                System.out.println("Gagal load driver: " + cne.getMessage());
            } catch (SQLException sqle) {
                System.out.println("Gagal koneksi: " + sqle.getMessage());
            }
        }
        return koneksi;
    }
}