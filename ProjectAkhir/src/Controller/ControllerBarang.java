package Controller;

import Model.Connector;
import Model.Barang.*;
import view.DataBarang
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import view.DataBarang;

public class ControllerBarang {
    DataBarang dataBarang;
    InterfaceDAOBarang daoBarang;
    List<ModelBarang> daftarBarang;
    
<<<<<<< Updated upstream
<<<<<<< Updated upstream
    
    public ControllerBarang(DataBarang dataBarang) {
=======
    public ControllerBarang(DataBarang dataBarang){
>>>>>>> Stashed changes
=======
    public ControllerBarang(DataBarang dataBarang){
>>>>>>> Stashed changes
        this.dataBarang = dataBarang;
        daoBarang = new DAOBarang();
        daftarBarang = daoBarang.getAll();
    }
<<<<<<< Updated upstream
<<<<<<< Updated upstream

    public void showAllBarang () {
        daftarBarang = daoBarang.getAll();
        ModelTable table = new ModelTable(daftarBarang);
    }

    public void insertBarang() {
        try {
            ModelBarang modelBarang = new ModelBarang();
            
        String kode = dataBarang.getInputKode().getText();
        String nama = dataBarang.getInputNama().getText();
        Double harga = Double.parseDouble(dataBarang.getInputHarga().getText());
        Integer stok = Integer.parseInt(dataBarang.getInputStok().getText());
        String kategori = dataBarang.getInputKategori().getText();
        
        if("".equals(nama)||"".equals(kode)||"".equals(harga)||"".equals(stok)||"".equals(kategori)){
        throw new Exception("tidak boleh ada yang kosong!");
        }
        
        modelBarang.setKode(kode);
        modelBarang.setNama(nama);
        modelBarang.setHarga(harga);
        modelBarang.setStok(stok);
        modelBarang.setKategori(kategori);
        daoBarang.insert(modelBarang);
        JOptionPane.showMessageDialog(null,"Data Berhasil di Tambahkan!!");
        showAllBarang();
        reset();
        
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"Error saat menambahkan :"+e.getMessage());
        }
    }
    public void editbarang() {
            int selectedRow = dataBarang.getTableBarang().getSelectedRow();
            if (selectedRow != -1) {
                try {
                    int idTransaksi = (int) dataBarang.getTableBarang().getValueAt(selectedRow, 0);
                    ModelBarang update = new ModelBarang();
                    String kode = dataBarang.getInputKode().getText();
                    String nama = dataBarang.getInputNama().getText();
                    Double harga = Double.parseDouble(dataBarang.getInputHarga().getText());
                    Integer stok = Integer.parseInt(dataBarang.getInputStok().getText());
                    String kategori = dataBarang.getInputKategori().getText();

                    if("".equals(nama)||"".equals(kode)||"".equals(harga)||"".equals(stok)||"".equals(kategori)){
                    throw new Exception("tidak boleh ada yang kosong!");
                    }

                    update.setKode(kode);
                    update.setNama(nama);
                    update.setHarga(harga);
                    update.setStok(stok);
                    update.setKategori(kategori);
                    daoBarang.update(update);
                    JOptionPane.showMessageDialog(null, "Data berhasil diupdate");
                    showAllBarang();
                    reset();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error saat mengupdate: " + e.getMessage());
                }
            }
        }

         public void deleteTransaksi() {
            int selectedRow = dataBarang.getTableBarang().getSelectedRow();
            if (selectedRow != -1) {
                int idBarang = (int) dataBarang.getTableBarang().getValueAt(selectedRow, 0);
                daoBarang.delete(idBarang);
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                showAllBarang();
                reset();
            }
        }

        public void reset() {
            
            dataBarang.getInputKode().setText("");
            dataBarang.getInputNama().setText("");
            dataBarang.getInputHarga().setText("");
            dataBarang.getInputStok().setText("");
            dataBarang.getInputKategori().setText("");
        }

        public void isiFieldDariTable() {
            int selectedRow = dataBarang.getTableBarang().getSelectedRow();
            if (selectedRow != -1) {
        // Ambil data dari table berdasarkan baris yang dipilih
        String kode = dataBarang.getTableBarang().getValueAt(selectedRow, 0).toString();
        String nama = dataBarang.getTableBarang().getValueAt(selectedRow, 1).toString();
        String harga = dataBarang.getTableBarang().getValueAt(selectedRow, 2).toString();
        String stok = dataBarang.getTableBarang().getValueAt(selectedRow, 3).toString();
        String kategori = dataBarang.getTableBarang().getValueAt(selectedRow, 4).toString();

        // Set isi TextField di form
        dataBarang.getInputKode().setText(kode);
        dataBarang.getInputNama().setText(nama);
        dataBarang.getInputHarga().setText(harga);
        dataBarang.getInputStok().setText(stok);
=======
=======
>>>>>>> Stashed changes
    
    public void insertBarang(){
        try {
            ModelBarang barangBaru =  new ModelBarang();
            
            String kode =  dataBarang.getI
            
        } catch (Exception e) {
        }
    
<<<<<<< Updated upstream
>>>>>>> Stashed changes
    }
  
    
}
=======
    }
  
    
>>>>>>> Stashed changes
}
