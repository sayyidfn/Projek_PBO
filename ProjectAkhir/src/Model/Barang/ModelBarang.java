/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Barang;

/**
 *
 * @author HP
 */
public class ModelBarang {
    private Integer id_barang, stok;
    private String kode, nama, kategori;
    private Double harga;
    
    public ModelBarang(){}

    public ModelBarang(Integer stok, String kode, String nama, String kategori, Double harga) {
        this.stok = stok;
        this.kode = kode;
        this.nama = nama;
        this.kategori = kategori;
        this.harga = harga;
    }
    
    public Integer getId_barang() {
        return id_barang;
    }

    public void setId_barang(Integer id_barang) {
        this.id_barang = id_barang;
    }

    public Integer getStok() {
        return stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }
    
}
