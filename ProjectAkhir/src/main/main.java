ackage main;

import view.formbarang;

public class main {
    public static void main(String[] args) {
        // Menjalankan JFrame di thread GUI (Swing)
        javax.swing.SwingUtilities.invokeLater(() -> {
            new formbarang().setVisible(true);
        });
    }
}
