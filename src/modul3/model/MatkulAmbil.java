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
public class MatkulAmbil extends MataKuliah {

    private ArrayList<Presensi> presensi = new ArrayList<>();
    private int n1, n2, n3;

    public MatkulAmbil( ArrayList<Presensi> presensi,int n1, int n2, int n3, String kode, int sks, String nama) {
        super(kode, sks, nama);
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.presensi = presensi;
    }

    public ArrayList<Presensi> getPresensi() {
        return presensi;
    }

    public void setPresensi(ArrayList<Presensi> presensi) {
        this.presensi = presensi;
    }


    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    @Override
    public String toString() {
        String temp = "";
        for (Presensi presensi1 : presensi){
            temp += presensi1.toString() + "\n";
        }
        return "MatkulAmbil{" + "presensi=\n" + temp + "\n, n1=" + n1 + ", n2=" + n2 + ", n3=" + n3 + '}';
    }
    
}
