/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Barang.ModelBarang;
import Model.Transaksi.DAOTransaksi;
import Model.Transaksi.InterfaceDAOTransaksi;
import Model.Transaksi.ModelTable;
import Model.Transaksi.ModelTransaksi;
import java.util.List;
import javax.swing.JOptionPane;
import view.TransaksiFrame;

/**
 *
 * @author HP
 */
public class ControllerTransaksi {
    TransaksiFrame transaksiFrame;
    InterfaceDAOTransaksi daoTransaksi;
    List<ModelTransaksi> daftarTransaksi;
    
    public ControllerTransaksi(TransaksiFrame transaksiFrame) {
        this.transaksiFrame = transaksiFrame;
        daoTransaksi = new DAOTransaksi();
        daftarTransaksi = daoTransaksi.getAll();
    }
    
    public void showAllTransaksi(){
        daftarTransaksi = daoTransaksi.getAll();
        ModelTable table = new ModelTable(daftarTransaksi);
    }
    
    public void insertTransaksi(){
         try {
            ModelTransaksi transaksiBaru = new ModelTransaksi();
            

            Integer jumlah = Integer.parseInt(transaksiFrame.getInputJumlah().getText());
            Integer.pa
            
            
            
            transaksiBaru.setId_barang(Integer.parseInt(transaksiFrame.getInputIdBarang().getText()));
            transaksiBaru.setJumlah(Integer.parseInt(transaksiFrame.getInputJumlah().getText()));
            transaksiBaru.setTotal_harga(Double.parseDouble(transaksiFrame.getInputTotalHarga().getText()));
            transaksiBaru.setTanggal(transaksiFrame.getInputTanggal().getText());

            daoTransaksi.insert(transaksiBaru);
            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
            showAllTransaksi();
            reset();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error saat menambahkan: " + e.getMessage());
        }
    }
    
    public void editTransaksi() {
        int selectedRow = transaksiFrame.getTableLihatTransaksi().getSelectedRow();
        if (selectedRow != -1) {
            try {
                int idTransaksi = (int) transaksiFrame.getTableLihatTransaksi().getValueAt(selectedRow, 0);
                ModelTransaksi update = new ModelTransaksi();
                update.setId_transaksi(idTransaksi);

                update.setJumlah(Integer.parseInt(transaksiFrame.getInputJumlah().getText()));
                update.setTotal_harga(Double.parseDouble(transaksiFrame.getInputTotalHarga().getText()));
                update.setTanggal(transaksiFrame.getInputTanggal().getText());

                daoTransaksi.update(update);
                JOptionPane.showMessageDialog(null, "Data berhasil diupdate");
                showAllTransaksi();
                reset();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error saat mengupdate: " + e.getMessage());
            }
        }
    }
    
     public void deleteTransaksi() {
        int selectedRow = transaksiFrame.getTableLihatTransaksi().getSelectedRow();
        if (selectedRow != -1) {
            int idTransaksi = (int) transaksiFrame.getTableLihatTransaksi().getValueAt(selectedRow, 0);
            daoTransaksi.delete(idTransaksi);
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
            showAllTransaksi();
            reset();
        }
    }

    public void reset() {
        
        transaksiFrame.getInputJumlah().setText("");
        transaksiFrame.getInputTotalHarga().setText("");
        transaksiFrame.getInputTanggal().setText("");
    }

    public void isiFieldDariTable() {
        int selectedRow = transaksiFrame.getTableLihatTransaksi().getSelectedRow();
        if (selectedRow != -1) {

            transaksiFrame.getInputJumlah().setText(transaksiFrame.getTableLihatTransaksi().getValueAt(selectedRow, 2).toString());
            transaksiFrame.getInputTotalHarga().setText(transaksiFrame.getTableLihatTransaksi().getValueAt(selectedRow, 3).toString());
            transaksiFrame.getInputTanggal().setText(transaksiFrame.getTableLihatTransaksi().getValueAt(selectedRow, 4).toString());
        }
    }
}
