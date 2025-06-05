/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Login;

import Model.Connector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class DAOLogin implements InterfaceDAOLogin{
    @Override
    public void insert(ModelLogin login) {
        try {
            // Perintah query disimpan ke dalam variabel "query"
            String query = "INSERT INTO user (username, password) VALUES (?, ?);";


            PreparedStatement statement;
            statement = Connector.Connect().prepareStatement(query);
            statement.setString(1, login.getUsername());
            statement.setString(2, login.getPassword());

            // Menjalankan query untuk memasukkan data dosen baru
            statement.executeUpdate();

            // Menutup koneksi untuk menghemat penggunaan memory.
            statement.close();
        } catch (SQLException e) {
            // Menampilkan pesan error ketika gagal input data.
            System.out.println("Input Failed: " + e.getLocalizedMessage());
        }
    }
    
    @Override
    public boolean cekLogin(ModelLogin login){
        try {
             String query = "SELECT * FROM user WHERE username = ? AND password = ?";
            
            PreparedStatement statement = Connector.Connect().prepareStatement(query);
            statement.setString(1, login.getUsername());
            statement.setString(2, login.getPassword());
            
            ResultSet resultSet = statement.executeQuery();
            
            return resultSet.next();
            
        } catch (Exception e) {
            System.out.println("Eror saat login: " + e.getLocalizedMessage());
            return false;
        }
    }
}
