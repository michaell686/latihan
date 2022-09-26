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
public class MatkulAjar extends MataKuliah {

    private ArrayList<PresensiStaff> presensi = new ArrayList<>();

    public MatkulAjar(String kode, int sks , String nama) {
        super(kode, sks, nama);
    }

    public ArrayList<PresensiStaff> getPresensi() {
        return presensi;
    }

    public void setPresensi(ArrayList<PresensiStaff> presensi) {
        this.presensi = presensi;
    }

    @Override
    public String toString(){
        return "Matkul Ajar{" + super.toString() + "\npresensiStaff=" + '}';
    }
}
