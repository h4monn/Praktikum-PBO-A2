/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

public class MysqlMahasiswaService {
    Connection koneksi = null;

    // Constructor
    public MysqlMahasiswaService() {
        koneksi = MysqlUtility.getConnection();
    }

    // Membuat objek mahasiswa dari ResultSet
    public Mahasiswa makeMhsObject(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String nama = rs.getString("nama");
        return new Mahasiswa(id, nama);
    }

    // Menambahkan data mahasiswa (Create)
    public void add(Mahasiswa mhs) {
        String query = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
        try {
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());
            ps.executeUpdate();
            System.out.println("Berhasil insert: " + mhs.toString());
        } catch (SQLException e) {
            System.out.println("Gagal insert: " + e.getMessage());
        }
    }

    // Update data mahasiswa
    public void update(Mahasiswa mhs) {
        String query = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try {
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            ps.executeUpdate();
            System.out.println("Berhasil update");
        } catch (SQLException e) {
            System.out.println("Gagal update: " + e.getMessage());
        }
    }

    // Delete data mahasiswa sesuai id
    public void delete(int id) {
        String query = "DELETE FROM mahasiswa WHERE id = ?";
        try {
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Berhasil delete");
        } catch (SQLException e) {
            System.out.println("Gagal delete: " + e.getMessage());
        }
    }

    // Ambil mahasiswa sesuai id
    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;
        String query = "SELECT * FROM mahasiswa WHERE id = ?";
        try {
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mhs = makeMhsObject(rs);
            }
        } catch (SQLException e) {
            System.out.println("Gagal getById: " + e.getMessage());
        }
        return mhs;
    }

    // Ambil semua isi tabel mahasiswa
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> listMhs = new ArrayList<>();
        String query = "SELECT * FROM mahasiswa";
        try {
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                listMhs.add(makeMhsObject(rs));
            }
        } catch (SQLException e) {
            System.out.println("Gagal getAll: " + e.getMessage());
        }
        return listMhs;
    }
}