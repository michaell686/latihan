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
public class DosenHonorer extends Dosen{
    
    private double honorPerSks;
    
    public DosenHonorer(int honorPerSks, String departemen, String nama, String nik, String alamat, String ttl, String telepon) {
        super(departemen, nama, nik, alamat, ttl, telepon);
        this.honorPerSks = honorPerSks;
    }

    public double getHonorPerSks() {
        return honorPerSks;
    }

    public void setHonorPerSks(double honorPerSks) {
        this.honorPerSks = honorPerSks;
    }

    @Override
    public String toString() {
        return "DosenHonorer{"+ super.toString() + "honorPerSks=" + honorPerSks + '}';
    }
    
}
