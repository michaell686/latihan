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
public class Sarjana extends Mahasiswa {
    
    private ArrayList<MatkulAmbil> matkulAmbil = new ArrayList<>();

    public Sarjana(ArrayList<MatkulAmbil> matkulAmbil ,String nim, String jurusan, String nama, String alamat, String ttl, String telepon) {
        super(nim, jurusan, nama, alamat, ttl, telepon);
        this.matkulAmbil = matkulAmbil;
    }

    public ArrayList<MatkulAmbil> getMatkulAmbil() {
        return matkulAmbil;
    }

    public void setMatkulAmbil(ArrayList<MatkulAmbil> matkulAmbil) {
        this.matkulAmbil = matkulAmbil;
    }

    @Override
    public String toString() {
        String temp = super.toString() + "\n";
        for (MatkulAmbil matkulAmbil1 : this.matkulAmbil){
            temp += this.matkulAmbil.toString() + "\n";
        }
        return temp;
    }
    
    
}
