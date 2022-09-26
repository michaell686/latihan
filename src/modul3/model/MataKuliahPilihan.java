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
public class MataKuliahPilihan extends MataKuliah{
    
    private int jumlahMinimumMhs;
    
    public MataKuliahPilihan(int jumlahMinimumMhs, String kode, int sks ,String nama) {
        super(kode, sks, nama);
        this.jumlahMinimumMhs = jumlahMinimumMhs;
    }

    public int getJumlahMinimumMhs() {
        return jumlahMinimumMhs;
    }

    public void setJumlahMinimumMhs(int jumlahMinimumMhs) {
        this.jumlahMinimumMhs = jumlahMinimumMhs;
    }

    @Override
    public String toString() {
        return "MataKuliahPilihan{"+ super.toString() + "jumlahMinimumMhs=" + jumlahMinimumMhs + '}';
    }
    
}
