package view;

import controller.ControllerBarang;
import Model.Barang.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class formbarang extends javax.swing.JFrame {
    private int selectedId = -1;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtstok;
    private javax.swing.JTextField txtkategori;
    private javax.swing.JTable tblbarang;


    public formbarang() {
        loadTable();
    }

    private void loadTable() {
        List<ModelBarang> listBarang = ControllerBarang.getAllBarang();
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"ID", "Kode", "Nama", "Harga", "Stok", "Kategori"});

        for (ModelBarang barang : listBarang) {
            model.addRow(new Object[]{
                barang.getId_barang(), barang.getKode(), barang.getNama(), barang.getHarga(), barang.getStok(), barang.getKategori()
            });
        }
        tblbarang.setModel(model);
    }

    private void resetForm() {
        txtkode.setText("");
        txtnama.setText("");
        txtharga.setText("");
        txtstok.setText("");
        txtkategori.setText("");
        selectedId = -1;
    }

    private void btnTambahActionPerformed() {
        ModelBarang barang = new ModelBarang(
            Integer.parseInt(txtstok.getText()),
            txtkode.getText(),
            txtnama.getText(),
            txtkategori.getText(),
            Double.parseDouble(txtharga.getText())
        );
        ControllerBarang.insertBarang(barang);
        loadTable();
        resetForm();
    }

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {
        if (selectedId != -1) {
            ModelBarang barang = new ModelBarang(
                Integer.parseInt(txtstok.getText()),
                txtkode.getText(),
                txtnama.getText(),
                txtkategori.getText(),
                Double.parseDouble(txtharga.getText())
            );
            barang.setId_barang(selectedId);
            ControllerBarang.updateBarang(barang);
            loadTable();
            resetForm();
        }
    }

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {
        if (selectedId != -1) {
            ControllerBarang.deleteBarang(selectedId);
            loadTable();
            resetForm();
        }
    }

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {
        loadTable();
    }

    private void tblBarangMouseClicked(java.awt.event.MouseEvent evt) {
        int row = tblbarang.getSelectedRow();
        selectedId = Integer.parseInt(tblbarang.getValueAt(row, 0).toString());
        txtkode.setText(tblbarang.getValueAt(row, 1).toString());
        txtnama.setText(tblbarang.getValueAt(row, 2).toString());
        txtharga.setText(tblbarang.getValueAt(row, 3).toString());
        txtstok.setText(tblbarang.getValueAt(row, 4).toString());
        txtkategori.setText(tblbarang.getValueAt(row, 5).toString());
    }
}
