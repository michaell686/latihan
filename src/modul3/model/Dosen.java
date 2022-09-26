/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3.model;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public abstract class Dosen extends Staff{
    
    private String departemen;
    private ArrayList<MatkulAjar> matkulAjar = new ArrayList<>();
    private ArrayList<Presensi> presensi = new ArrayList<>();
    
    public Dosen(String departemen, String nama, String nik, String alamat, String ttl, String telepon) {
        super(nama, nik,alamat, ttl, telepon);
        this.departemen = departemen;
    }

    public ArrayList<Presensi> getPresensi() {
        return presensi;
    }

    public void setPresensi(ArrayList<Presensi> presensi) {
        this.presensi = presensi;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public ArrayList<MatkulAjar> getMatkulAjar() {
        return matkulAjar;
    }

    public void setMatkulAjar(ArrayList<MatkulAjar> matkulAjar) {
        this.matkulAjar = matkulAjar;
    }

    @Override
    public String toString() {
        return "Dosen{"+ super.toString() + "departemen=" + departemen + ", matkulAjar=" + matkulAjar + '}';
    }
    
    
}
