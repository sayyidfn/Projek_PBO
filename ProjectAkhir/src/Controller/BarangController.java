package controller;

import Model.koneksi;
import model.barang;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BarangController {

    public static List<barang> getAllBarang() {
        List<barang> list = new ArrayList<>();
        try (Connection conn = koneksi.getKoneksi();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM barang")) {

            while (rs.next()) {
                barang b = new barang();
                b.setId(rs.getInt("id"));
                b.setKode(rs.getString("kode"));
                b.setNama(rs.getString("nama"));
                b.setHarga(rs.getDouble("harga"));
                b.setStok(rs.getInt("stok"));
                b.setKategori(rs.getString("kategori"));
                list.add(b);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void insertBarang(barang b) {
        String sql = "INSERT INTO barang (kode, nama, harga, stok, kategori) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = koneksi.getKoneksi();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, b.getKode());
            ps.setString(2, b.getNama());
            ps.setDouble(3, b.getHarga());
            ps.setInt(4, b.getStok());
            ps.setString(5, b.getKategori());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateBarang(barang b) {
        String sql = "UPDATE barang SET kode=?, nama=?, harga=?, stok=?, kategori=? WHERE id=?";
        try (Connection conn = koneksi.getKoneksi();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, b.getKode());
            ps.setString(2, b.getNama());
            ps.setDouble(3, b.getHarga());
            ps.setInt(4, b.getStok());
            ps.setString(5, b.getKategori());
            ps.setInt(6, b.getId());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteBarang(int id) {
        String sql = "DELETE FROM barang WHERE id=?";
        try (Connection conn = koneksi.getKoneksi();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
