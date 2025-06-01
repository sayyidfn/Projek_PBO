/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Barang;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author HP
 */
public class ModelTable extends AbstractTableModel{
    List<ModelBarang> daftarBarang;
    
    String kolom[] = {"ID", "Kode", "Nama", "Harga", "Stok", "Kategori"};
    
    public ModelTable(List<ModelBarang> daftarBarang) {
        this.daftarBarang = daftarBarang;
    }

    // Method untuk mengambil jumlah baris dari tabel
    @Override
    public int getRowCount() {
        return daftarBarang.size();
    }

    // Method untuk mengambil jumlah kolom dari tabel
    @Override
    public int getColumnCount() {
        return kolom.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex) {
            case 0 -> daftarBarang.get(rowIndex).getId_barang();
            case 1 -> daftarBarang.get(rowIndex).getKode();
            case 2 -> daftarBarang.get(rowIndex).getNama();
            case 3 -> daftarBarang.get(rowIndex).getHarga();
            case 4 -> daftarBarang.get(rowIndex).getStok();
            case 5 -> daftarBarang.get(rowIndex).getKategori();
            default -> null;
        };
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return kolom[columnIndex];
    }
}
