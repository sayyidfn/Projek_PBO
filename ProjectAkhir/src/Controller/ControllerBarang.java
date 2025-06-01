package controller;

import Model.Connector;
import Model.Barang.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ControllerBarang {

    public static List<ModelBarang> getAllBarang() {
        List<ModelBarang> list = new ArrayList<>();
        try (Connection conn = Connector.Connect();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM barang")) {

            while (rs.next()) {
                ModelBarang barang = new ModelBarang();
                barang.setId_barang(rs.getInt("id"));
                barang.setKode(rs.getString("kode"));
                barang.setNama(rs.getString("nama"));
                barang.setHarga(rs.getDouble("harga"));
                barang.setStok(rs.getInt("stok"));
                barang.setKategori(rs.getString("kategori"));
                list.add(barang);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void insertBarang(ModelBarang barang) {
        String sql = "INSERT INTO barang (kode, nama, harga, stok, kategori) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = Connector.Connect();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, barang.getKode());
            ps.setString(2, barang.getNama());
            ps.setDouble(3, barang.getHarga());
            ps.setInt(4, barang.getStok());
            ps.setString(5, barang.getKategori());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Input Failed: " + e.getLocalizedMessage());
            e.printStackTrace();
        }
    }

    public static void updateBarang(ModelBarang barang) {
        String sql = "UPDATE barang SET kode=?, nama=?, harga=?, stok=?, kategori=? WHERE id=?";
        try (Connection conn = Connector.Connect();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, barang.getKode());
            ps.setString(2, barang.getNama());
            ps.setDouble(3, barang.getHarga());
            ps.setInt(4, barang.getStok());
            ps.setString(5, barang.getKategori());
            ps.setInt(6, barang.getId_barang());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Update Failed! (" + e.getLocalizedMessage() + ")");
            e.printStackTrace();
        }
    }

    public static void deleteBarang(int id_barang) {
        String sql = "DELETE FROM barang WHERE id=?";
        try (Connection conn = Connector.Connect();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id_barang);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Delete Failed: " + e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}
