package view;

import javax.swing.JOptionPane; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.DataBarang;
import view.InputTransaksi;
import view.TransaksiFrame;
        
public class HomePanel extends javax.swing.JFrame {

    public HomePanel() {
        initComponents();
        addListeners();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnDataBarang = new javax.swing.JButton();
        btnInputTransaksi = new javax.swing.JButton();
        btnDataTransaksi = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        jLabel1.setText("MENU UTAMA");

        btnDataBarang.setText("DATA BARANG");

        btnInputTransaksi.setText("INPUT TRANSAKSI");

        btnDataTransaksi.setText("DATA TRANSAKSI");
        btnDataTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataTransaksiActionPerformed(evt);
            }
        });

        btnLogout.setText("LOGOUT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnInputTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDataBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDataTransaksi))))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnDataBarang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInputTransaksi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDataTransaksi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogout)
                .addContainerGap(89, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDataTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataTransaksiActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnDataTransaksiActionPerformed

    private void addListeners() {
        btnDataBarang.addActionListener(new ActionListener() {
             @Override
            public void actionPerformed(ActionEvent e) {
                new DataBarang().setVisible(true);
                HomePanel.this.setVisible(false);
            }
        });
        btnInputTransaksi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new InputTransaksi().setVisible(true);
                HomePanel.this.setVisible(false);
            }
        });
        btnDataTransaksi.addActionListener(new ActionListener(){
           @Override
            public void actionPerformed(ActionEvent e) {
                javax.swing.JFrame transaksiFrame = new javax.swing.JFrame("Data Transaksi");
                transaksiFrame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
                transaksiFrame.setContentPane(new TransaksiFrame()); // pastikan ini JPanel
                transaksiFrame.pack();
                transaksiFrame.setLocationRelativeTo(null);
                transaksiFrame.setVisible(true);

                javax.swing.JFrame frame = (javax.swing.JFrame) javax.swing.SwingUtilities.getWindowAncestor(HomePanel.this);
                frame.dispose(); // Tutup home panel

            }
        });
        btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(HomePanel.this, 
                    "Apakah Anda yakin ingin logout?", "Logout", 
                    JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE);
                if (confirm == JOptionPane.YES_OPTION) {
                    new LoginFrame().setVisible(true);
                    HomePanel.this.dispose();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDataBarang;
    private javax.swing.JButton btnDataTransaksi;
    private javax.swing.JButton btnInputTransaksi;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
