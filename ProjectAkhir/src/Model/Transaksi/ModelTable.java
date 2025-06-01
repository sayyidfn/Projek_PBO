/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Transaksi;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author HP
 */
public class ModelTable extends AbstractTableModel{
    List<ModelTransaksi> daftarTransaksi;
    
    String kolom[] = {"ID", "ID Barang", "Jumlah", "Total Harga", "Tanggal"};
    
    public ModelTable(List<ModelTransaksi> daftarTransaksi) {
        this.daftarTransaksi = daftarTransaksi;
    }

    // Method untuk mengambil jumlah baris dari tabel
    @Override
    public int getRowCount() {
        return daftarTransaksi.size();
    }

    // Method untuk mengambil jumlah kolom dari tabel
    @Override
    public int getColumnCount() {
        return kolom.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex) {
            case 0 -> daftarTransaksi.get(rowIndex).getId_transaksi();
            case 1 -> daftarTransaksi.get(rowIndex).getId_barang();
            case 2 -> daftarTransaksi.get(rowIndex).getJumlah();
            case 3 -> daftarTransaksi.get(rowIndex).getTotal_harga();
            case 4 -> daftarTransaksi.get(rowIndex).getTanggal();
            default -> null;
        };
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return kolom[columnIndex];
    }
}
