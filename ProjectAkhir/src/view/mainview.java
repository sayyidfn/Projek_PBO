package view;

import javax.swing.*;

public class mainview extends JFrame {

    public mainview() {
        setTitle("Aplikasi JFrame");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Halo, ini JFrame!", SwingConstants.CENTER);
        add(label);
    }
}