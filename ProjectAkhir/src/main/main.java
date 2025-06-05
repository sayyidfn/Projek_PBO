package main;

import view.DataBarang; // GANTI INI dari formbarang ke DataBarang

public class main {
    public static void main(String[] args) {
        // Menjalankan JFrame di thread GUI (Swing)
        javax.swing.SwingUtilities.invokeLater(() -> {
            new DataBarang().setVisible(true); // ← GANTI formbarang ke DataBarang
        });
    }
}
