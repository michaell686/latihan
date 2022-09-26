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
public class Magister extends Mahasiswa {

    private ArrayList<MatkulAmbil> matkulAmbil = new ArrayList<>();
    private String judulTesis;

    public Magister(ArrayList<MatkulAmbil> matkulAmbil, String judulTesis, String nim, String jurusan, String nama, String alamat, String ttl, String telepon) {
        super(nim, jurusan, nama, alamat, ttl, telepon);
        this.judulTesis = judulTesis;
        this.matkulAmbil = matkulAmbil;
    }

    public ArrayList<MatkulAmbil> getMatkulAmbil() {
        return matkulAmbil;
    }

    public void setMatkulAmbil(ArrayList<MatkulAmbil> matkulAmbil) {
        this.matkulAmbil = matkulAmbil;
    }
    
    public String getJudulTesis() {
        return judulTesis;
    }

    public void setJudulTesis(String judulTesis) {
        this.judulTesis = judulTesis;
    }

    @Override
    public String toString() {
        String temp = super.toString() + "\nmatkulAmbil=\n";
        return "Magister{" + temp + "judulTesis=" + judulTesis + '}';
    }

}
