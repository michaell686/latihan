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
public abstract class Staff extends User {

    private String nik;

    public Staff(String nik, String nama, String alamat, String ttl, String telepon) {
        super(nama, alamat, ttl, telepon);
        this.nik = nik;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String toString() {
        return super.toString() + "NIK : " + nik;
    }
}
