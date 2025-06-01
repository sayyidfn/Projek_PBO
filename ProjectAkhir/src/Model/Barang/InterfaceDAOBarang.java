/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model.Barang;

import java.util.List;

/**
 *
 * @author HP
 */
public interface InterfaceDAOBarang {
    public void insert(ModelBarang barang);

    public void update(ModelBarang barang);

    public void delete(int id_barang);

    public List<ModelBarang> getAll();
}
