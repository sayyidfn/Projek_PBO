/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Transaksi;

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
public class DAOTransaksi implements InterfaceDAOTransaksi{
    @Override
    public void insert(ModelTransaksi transaksi) {
        try {
            // Perintah query disimpan ke dalam variabel "query"
            String query = "INSERT INTO transaksi (id_barang, jumlah, total_harga, tanggal) VALUES (?, ?, ?, ?);";

            PreparedStatement statement;
            statement = Connector.Connect().prepareStatement(query);
            statement.setInt(1, transaksi.getId_barang());
            statement.setInt(2, transaksi.getJumlah());
            statement.setDouble(2, transaksi.getTotal_harga());
            statement.setString(4, transaksi.getTanggal());

            // Menjalankan query untuk memasukkan data transaksi baru
            statement.executeUpdate();

            // Menutup koneksi untuk menghemat penggunaan memory.
            statement.close();
        } catch (SQLException e) {
            // Menampilkan pesan error ketika gagal input data.
            System.out.println("Input Failed: " + e.getLocalizedMessage());
        }
    }

    @Override
    public void update(ModelTransaksi transaksi) {
        try {
            // Perintah query disimpan ke dalam variabel "query"
            String query = "UPDATE transaksi SET id_barang=?, jumlah=?, total_harga=?, tanggal=? WHERE id_transaksi=?;";

            PreparedStatement statement;
            statement = Connector.Connect().prepareStatement(query);
            statement.setInt(1, transaksi.getId_barang());
            statement.setInt(2, transaksi.getJumlah());
            statement.setDouble(2, transaksi.getTotal_harga());
            statement.setString(4, transaksi.getTanggal());

            // Menjalankan query untuk mengedit data transaksi yang dipilih
            statement.executeUpdate();

            // Menutup koneksi untuk menghemat penggunaan memory.
            statement.close();
        } catch (SQLException e) {
            // Menampilkan pesan error ketika gagal edit data.
            System.out.println("Update Failed! (" + e.getLocalizedMessage() + ")");
        }
    }

    @Override
    public void delete(int id_transaksi) {
        try {
            // Perintah query disimpan ke dalam variabel "query"
            String query = "DELETE FROM transaksi WHERE id_transaksi=?;";

            PreparedStatement statement;
            statement = Connector.Connect().prepareStatement(query);
            statement.setInt(1, id_transaksi);

            // Menjalankan query untuk menghapus data transaksi yang dipilih
            statement.executeUpdate();

            // Menutup koneksi untuk menghemat penggunaan memory.
            statement.close();
        } catch (SQLException e) {
            // Menampilkan pesan error ketika gagal hapus data.
            System.out.println("Delete Failed: " + e.getLocalizedMessage());
        }
    }

    @Override
    public List<ModelTransaksi> getAll() {
        List<ModelTransaksi> listTransaksi = null;

        try {
            listTransaksi = new ArrayList<>();

            // Membuat objek statement yang digunakan untuk melakukan query.
            Statement statement = Connector.Connect().createStatement();

            String query = "SELECT FROM transaksi;";

            // Mengeksekusi query dan menyimpannya ke dalam variabel "resultSet".
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                // Membuat sebuah objek "transaksi" untuk menyimpan data tiap-tiap transaksi
                ModelTransaksi transaksi = new ModelTransaksi();

                // Memasukkan hasil query ke objek transaksi
                transaksi.setId_transaksi(resultSet.getInt("id_transaksi"));
                transaksi.setId_barang(resultSet.getInt("id_barang"));
                transaksi.setJumlah(resultSet.getInt("jumlah"));
                transaksi.setTotal_harga(resultSet.getDouble("total_harga"));
                transaksi.setTanggal(resultSet.getString("tanggal"));

                listTransaksi.add(transaksi);
            }

            // Menutup koneksi untuk menghemat penggunaan memory.
            statement.close();
        } catch (SQLException e) {
            // Menampilkan pesan error ketika gagal mengambil data.
            System.out.println("Error: " + e.getLocalizedMessage());
        }
        return listTransaksi;
    }
}
