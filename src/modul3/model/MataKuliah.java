/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3.model;

/**
 *
 * @author Lenovo
 */
public class MataKuliah {
    
    private String kode, nama;
    private int sks;
    
    public MataKuliah(String kode, int sks, String nama){
        this.kode = kode;
        this.sks = sks;
        this.nama = nama;
    }

    public MataKuliah() {
       
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

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    @Override
    public String toString() {
        return "MataKuliah{"+ super.toString() + " kode=" + kode + ", nama=" + nama + ", sks=" + sks + '}';
    }
    
    
}
