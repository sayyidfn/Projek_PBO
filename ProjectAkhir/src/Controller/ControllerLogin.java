/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Login.DAOLogin;
import Model.Login.ModelLogin;
import view.LoginFrame;
import view.SignupFrame;
import view.HomePanel;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class ControllerLogin {
    DAOLogin daoLogin;
    LoginFrame loginFrame;
    SignupFrame signupFrame;

    public ControllerLogin(LoginFrame loginFrame) {
        this.loginFrame = loginFrame;
        this.daoLogin = new DAOLogin();
    }
    
    public ControllerLogin(SignupFrame signupFrame) {
        this.signupFrame = signupFrame;
        this.daoLogin = new DAOLogin();
    }
    

    public void ceklogin() {
        String username = loginFrame.getUsername();
        String password = loginFrame.getPassword();

        ModelLogin login = new ModelLogin();
        login.setUsername(username);
        login.setPassword(password);

        boolean isLoginSuccess = daoLogin.cekLogin(login);

        if (isLoginSuccess) {
            JOptionPane.showMessageDialog(loginFrame, "Login Berhasil!");
            
            javax.swing.JFrame homeFrame = new javax.swing.JFrame("Beranda");
            homeFrame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
            homeFrame.setContentPane(new HomePanel());
            homeFrame.pack();
            homeFrame.setLocationRelativeTo(null);
            homeFrame.setVisible(true);
            
            loginFrame.dispose();
        } else {
            JOptionPane.showMessageDialog(loginFrame, "Username atau Password salah!", "Login Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void insertLogin() {
        try {
            String username = signupFrame.getUsername();
            String password = signupFrame.getPassword();

            ModelLogin userBaru = new ModelLogin();


            if ("".equals(username) || "".equals(password)) {
                throw new Exception("Username atau Password tidak boleh kosong");
            }

            userBaru.setUsername(username);
            userBaru.setPassword(password);

            // Memasukkan "dosen baru" ke dalam database.
            daoLogin.insert(userBaru);

            // Menampilkan pop-up ketika berhasil mengedit data 
            JOptionPane.showMessageDialog(null, "User baru berhasil ditambahkan.");

            // Terakhir, program akan pindah ke halaman Table Dosen
            new LoginFrame().setVisible(true);
            signupFrame.dispose();
        } catch (Exception e) {
            // Menampilkan pop-up ketika terjadi error
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
}