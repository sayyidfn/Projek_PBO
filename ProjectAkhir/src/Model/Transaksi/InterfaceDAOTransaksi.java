/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model.Transaksi;

import java.util.List;

/**
 *
 * @author HP
 */
public interface InterfaceDAOTransaksi {
    public void insert(ModelTransaksi transaksi);

    public void update(ModelTransaksi transaksi);

    public void delete(int id_transaksi);

    public List<ModelTransaksi> getAll();
}
