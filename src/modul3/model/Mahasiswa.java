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
public abstract class Mahasiswa extends User{
    private String nim;
    private String jurusan;

    public Mahasiswa(String nim, String jurusan, String nama, String alamat, String ttl, String telepon) {
        super(nama, alamat, ttl, telepon);
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return "Mahasiswa{"+ super.toString() + " nim=" + nim + ", jurusan=" + jurusan + '}';
    }
    
    
}
