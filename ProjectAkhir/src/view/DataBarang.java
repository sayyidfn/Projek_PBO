package view;

import Model.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DataBarang extends javax.swing.JPanel {
    private DefaultTableModel model;

    public DataBarang() {
        initComponents();
        initTable(); 
        loadTableData(); 
        setupListeners();
        setInitialState();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        LabelKode = new javax.swing.JLabel();
        LabelNama = new javax.swing.JLabel();
        LabelHarga = new javax.swing.JLabel();
        LabelStok = new javax.swing.JLabel();
        LabelKategori = new javax.swing.JLabel();
        InputKode = new javax.swing.JTextField();
        InputNama = new javax.swing.JTextField();
        InputHarga = new javax.swing.JTextField();
        InputStok = new javax.swing.JTextField();
        InputKategori = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabelBarang = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        LabelKode.setText("KODE");

        LabelNama.setText("NAMA");

        LabelHarga.setText("HARGA");

        LabelStok.setText("STOK");

        LabelKategori.setText("KATEGORI");

        btnTambah.setText("TAMBAH");

        btnEdit.setText("EDIT");

        btnHapus.setText("HAPUS");

        btnReset.setText("RESET");

        btnHome.setText("HOME");

        TabelBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "KODE", "NAMA", "HARGA", "STOK", "KATEGORI"
            }
        ));
        jScrollPane3.setViewportView(TabelBarang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LabelKode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelHarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelStok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(InputKode)
                            .addComponent(InputNama)
                            .addComponent(InputHarga)
                            .addComponent(InputStok)
                            .addComponent(InputKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnReset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelKode)
                    .addComponent(InputKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNama)
                    .addComponent(InputNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelHarga)
                    .addComponent(InputHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelStok)
                    .addComponent(InputStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelKategori)
                    .addComponent(InputKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnEdit)
                    .addComponent(btnHapus)
                    .addComponent(btnReset)
                    .addComponent(btnHome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void initTable() {
        model = new DefaultTableModel();
        model.addColumn("KODE");
        model.addColumn("NAMA");
        model.addColumn("HARGA");
        model.addColumn("STOK");
        model.addColumn("KATEGORI");
        TabelBarang.setModel(model);
    }
    
    private void loadTableData() {
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        
        try (Connection conn = koneksi.getKoneksi();
             PreparedStatement pst = conn.prepareStatement("SELECT * FROM barang ORDER BY kode ASC");
             ResultSet rs = pst.executeQuery()) {
             
            while (rs.next()) {
                Object[] row = {
                    rs.getString("Kode"),
                    rs.getString("Nama"),
                    rs.getDouble("Harga"), 
                    rs.getInt("Stok"),
                    rs.getString("Kategori")
                };
                model.addRow(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error memuat data: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    private void setInitialState() {
        InputKode.setEnabled(true); 
        btnTambah.setEnabled(true);
        btnEdit.setEnabled(false); 
        btnHapus.setEnabled(false);
        resetInputFields(); 
    }
    
     private void resetInputFields() {
        InputKode.setText("");
        InputNama.setText("");
        InputHarga.setText("");
        InputStok.setText("");
        InputKategori.setText("");
        InputKode.setEnabled(true); 
        btnTambah.setEnabled(true);
        btnEdit.setEnabled(false);
        btnHapus.setEnabled(false);
        TabelBarang.clearSelection(); 
    }
     
      private void setupListeners() {
        btnTambah.addActionListener(e -> tambahBarang());
        btnEdit.addActionListener(e -> editBarang());
        btnHapus.addActionListener(e -> hapusBarang());
        btnReset.addActionListener(e -> resetInputFields());
        btnHome.addActionListener(e -> backToHome());

        TabelBarang.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) { 
                    populateFieldsFromTable();
                }
            }
        });
    }
      
      private void populateFieldsFromTable() {
        int selectedRow = TabelBarang.getSelectedRow();
        if (selectedRow != -1) { 
            InputKode.setText(model.getValueAt(selectedRow, 0).toString());
            InputNama.setText(model.getValueAt(selectedRow, 1).toString());
            InputHarga.setText(model.getValueAt(selectedRow, 2).toString());
            InputStok.setText(model.getValueAt(selectedRow, 3).toString());
            InputKategori.setText(model.getValueAt(selectedRow, 4).toString());

            InputKode.setEnabled(false); 
            btnTambah.setEnabled(false); 
            btnEdit.setEnabled(true); 
            btnHapus.setEnabled(true); 
        }
    }
      
       private void tambahBarang() {
        String kode = InputKode.getText().trim();
        String nama = InputNama.getText().trim();
        String hargaStr = InputHarga.getText().trim();
        String stokStr = InputStok.getText().trim();
        String kategori = InputKategori.getText().trim();

        if (kode.isEmpty() || nama.isEmpty() || hargaStr.isEmpty() || stokStr.isEmpty() || kategori.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi!", "Input Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            double harga = Double.parseDouble(hargaStr);
            int stok = Integer.parseInt(stokStr);

            if (isKodeExists(kode)) {
                JOptionPane.showMessageDialog(this, "Kode barang sudah ada!", "Duplikasi Kode", JOptionPane.WARNING_MESSAGE);
                return;
            }

            String sql = "INSERT INTO barang (kode, nama, harga, stok, kategori) VALUES (?, ?, ?, ?, ?)";
            try (Connection conn = koneksi.getKoneksi();
                 PreparedStatement pst = conn.prepareStatement(sql)) {

                pst.setString(1, kode);
                pst.setString(2, nama);
                pst.setDouble(3, harga);
                pst.setInt(4, stok);
                pst.setString(5, kategori);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                loadTableData(); 
                resetInputFields(); 
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Harga dan Stok harus angka!", "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error menambahkan data: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
       
       private boolean isKodeExists(String kode) throws SQLException {
        String sql = "SELECT COUNT(*) FROM barang WHERE kode = ?";
        try (Connection conn = koneksi.getKoneksi();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, kode);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        }
        return false;
    }
       
       private void editBarang() {
        String kode = InputKode.getText().trim();
        String nama = InputNama.getText().trim();
        String hargaStr = InputHarga.getText().trim();
        String stokStr = InputStok.getText().trim();
        String kategori = InputKategori.getText().trim();

        if (kode.isEmpty() || nama.isEmpty() || hargaStr.isEmpty() || stokStr.isEmpty() || kategori.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi!", "Input Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            double harga = Double.parseDouble(hargaStr);
            int stok = Integer.parseInt(stokStr);

            String sql = "UPDATE barang SET nama = ?, harga = ?, stok = ?, kategori = ? WHERE kode = ?";
            try (Connection conn = koneksi.getKoneksi();
                 PreparedStatement pst = conn.prepareStatement(sql)) {

                pst.setString(1, nama);
                pst.setDouble(2, harga);
                pst.setInt(3, stok);
                pst.setString(4, kategori);
                pst.setString(5, kode); 

                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Data berhasil diupdate!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                    loadTableData(); 
                    resetInputFields(); 
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal mengupdate data. Kode tidak ditemukan.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Harga dan Stok harus angka!", "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error mengupdate data: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
       
        private void hapusBarang() {
        String kode = InputKode.getText().trim(); 

        if (kode.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Pilih data yang akan dihapus dari tabel!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this,
                "Apakah Anda yakin ingin menghapus data dengan kode '" + kode + "'?", "Konfirmasi Hapus",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (confirm == JOptionPane.YES_OPTION) {
            String sql = "DELETE FROM barang WHERE kode = ?";
            try (Connection conn = koneksi.getKoneksi();
                 PreparedStatement pst = conn.prepareStatement(sql)) {

                pst.setString(1, kode);
                int rowsAffected = pst.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Data berhasil dihapus!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                    loadTableData(); 
                    resetInputFields(); 
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal menghapus data. Kode tidak ditemukan.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error menghapus data: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }
         private void backToHome() {
        HomePanel home = new HomePanel();
        home.setVisible(true);
        this.dispose(); 
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InputHarga;
    private javax.swing.JTextField InputKategori;
    private javax.swing.JTextField InputKode;
    private javax.swing.JTextField InputNama;
    private javax.swing.JTextField InputStok;
    private javax.swing.JLabel LabelHarga;
    private javax.swing.JLabel LabelKategori;
    private javax.swing.JLabel LabelKode;
    private javax.swing.JLabel LabelNama;
    private javax.swing.JLabel LabelStok;
    private javax.swing.JTable TabelBarang;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTambah;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
