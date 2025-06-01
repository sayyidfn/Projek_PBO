/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Barang;

import Model.Connector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class DAOBarang implements InterfaceDAOBarang{
     @Override
    public void insert(ModelBarang barang) {
        try {
            // Perintah query disimpan ke dalam variabel "query"
            String query = "INSERT INTO barang (kode, nama, harga, stok, kategori) VALUES (?, ?, ?, ?, ?);";

            PreparedStatement statement;
            statement = Connector.Connect().prepareStatement(query);
            statement.setString(1, barang.getKode());
            statement.setString(2, barang.getNama());
            statement.setDouble(3, barang.getHarga());
            statement.setInt(4, barang.getStok());
            statement.setString(5, barang.getKategori());

            // Menjalankan query untuk memasukkan data barang baru
            statement.executeUpdate();

            // Menutup koneksi untuk menghemat penggunaan memory.
            statement.close();
        } catch (SQLException e) {
            // Menampilkan pesan error ketika gagal input data.
            System.out.println("Input Failed: " + e.getLocalizedMessage());
        }
    }

    @Override
    public void update(ModelBarang barang) {
        try {
            // Perintah query disimpan ke dalam variabel "query"
            String query = "UPDATE barang SET kode=?, nama=?, harga=?, stok=?, kategori=? WHERE id_barang=?;";

            PreparedStatement statement;
            statement = Connector.Connect().prepareStatement(query);
            statement.setString(1, barang.getKode());
            statement.setString(2, barang.getNama());
            statement.setDouble(3, barang.getHarga());
            statement.setInt(4, barang.getStok());
            statement.setString(5, barang.getKategori());

            // Menjalankan query untuk mengedit data barang yang dipilih
            statement.executeUpdate();

            // Menutup koneksi untuk menghemat penggunaan memory.
            statement.close();
        } catch (SQLException e) {
            // Menampilkan pesan error ketika gagal edit data.
            System.out.println("Update Failed! (" + e.getLocalizedMessage() + ")");
        }
    }

    @Override
    public void delete(int id_barang) {
        try {
            // Perintah query disimpan ke dalam variabel "query"
            String query = "DELETE FROM barang WHERE id_barang=?;";

            PreparedStatement statement;
            statement = Connector.Connect().prepareStatement(query);
            statement.setInt(1, id_barang);

            // Menjalankan query untuk menghapus data barang yang dipilih
            statement.executeUpdate();

            // Menutup koneksi untuk menghemat penggunaan memory.
            statement.close();
        } catch (SQLException e) {
            // Menampilkan pesan error ketika gagal hapus data.
            System.out.println("Delete Failed: " + e.getLocalizedMessage());
        }
    }

    @Override
    public List<ModelBarang> getAll() {
        List<ModelBarang> listBarang = null;

        try {
            listBarang = new ArrayList<>();

            // Membuat objek statement yang digunakan untuk melakukan query.
            Statement statement = Connector.Connect().createStatement();

            String query = "SELECT * FROM barang;";

            // Mengeksekusi query dan menyimpannya ke dalam variabel "resultSet".
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                // Membuat sebuah objek "barang" untuk menyimpan data tiap-tiap barang
                ModelBarang barang = new ModelBarang();

                // Memasukkan hasil query ke objek barang
                barang.setId_barang(resultSet.getInt("id_barang"));
                barang.setKode(resultSet.getString("kode"));
                barang.setNama(resultSet.getString("nama"));
                barang.setHarga(resultSet.getDouble("harga"));
                barang.setStok(resultSet.getInt("stok"));
                barang.setKategori(resultSet.getString("kategori"));

                listBarang.add(barang);
            }

            // Menutup koneksi untuk menghemat penggunaan memory.
            statement.close();
        } catch (SQLException e) {
            // Menampilkan pesan error ketika gagal mengambil data.
            System.out.println("Error: " + e.getLocalizedMessage());
        }
        return listBarang;
    }
}
