package view;

<<<<<<< Updated upstream
<<<<<<< Updated upstream
=======
=======
>>>>>>> Stashed changes
import Model.Connector;
import Model.Barang.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
>>>>>>> Stashed changes
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import Controller.ControllerBarang;

public class DataBarang extends javax.swing.JFrame {
    ControllerBarang controller;
    public DataBarang() {
    initComponents();
    controller = new ControllerBarang(this); // koneksi controller
    setupListeners();
    controller.showAllBarang(); // tampilkan data awal
    btnEdit.setEnabled(false);
    btnHapus.setEnabled(false);
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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Barang", "KODE", "NAMA", "HARGA", "STOK", "KATEGORI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TabelBarang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnReset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
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

<<<<<<< Updated upstream
<<<<<<< Updated upstream
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
                    controller.isiFieldDariTable();
                }
            }
        });
    }
      
    public javax.swing.JTextField getInputKode() {
        return InputKode;
    }
    
    public javax.swing.JTextField getInputNama() {
        return InputNama;
    }
    
    public javax.swing.JTextField getInputHarga() {
        return InputHarga;
    }
    
    public javax.swing.JTextField getInputStok() {
        return InputStok;
    }
    
    public javax.swing.JTextField getInputKategori() {
        return InputKategori;
    }
    
    public javax.swing.JTable getTableBarang() {
        return TabelBarang; 
    }
    
         private void backToHome() {
        HomePanel home = new HomePanel();
        home.setVisible(true);
        this.dispose(); 
=======
    public javax.swing.JTextField getInputKode() {
        return InputKode;
    }
    
    public javax.swing.JTextField getInputNama() {
        return InputNama;
    }
    
    public javax.swing.JTextField getInputHarga() {
        return InputHarga;
    }
    
    public javax.swing.JTextField getInputStok() {
        return InputStok;
    }
    
    public javax.swing.JTextField getInputKategori() {
        return InputKategori;
    }
    
    public javax.swing.JTable getTableLihatTransaksi() {
        return LihatTransaksi; 
>>>>>>> Stashed changes
=======
    public javax.swing.JTextField getInputKode() {
        return InputKode;
    }
    
    public javax.swing.JTextField getInputNama() {
        return InputNama;
    }
    
    public javax.swing.JTextField getInputHarga() {
        return InputHarga;
    }
    
    public javax.swing.JTextField getInputStok() {
        return InputStok;
    }
    
    public javax.swing.JTextField getInputKategori() {
        return InputKategori;
    }
    
    public javax.swing.JTable getTableLihatTransaksi() {
        return LihatTransaksi; 
>>>>>>> Stashed changes
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
}
