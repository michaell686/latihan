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
public class PresensiStaff extends Presensi{
    
    private String jam;
    
    public PresensiStaff(String jam, String tanggal, int status) {
        super(tanggal, status);
        this.jam = jam;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    @Override
    public String toString() {
        return "PresensiStaff{"+ super.toString() + "jam=" + jam + '}';
    }
    
}
