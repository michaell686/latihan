/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3.controller;
import java.util.ArrayList;
import modul3.model.*;

/**
 *
 * @author Lenovo
 */
public class ControllerMatkul {
    
    public double totalNilai(ArrayList<MatkulAmbil> matkul, String kodeMK) {
        for (int i = 0; i < matkul.size(); i++) {
            System.out.println("test");
            if (matkul.get(i).getKode().equals(kodeMK)) {
                System.out.println("test2");
                return matkul.get(i).getN1() + matkul.get(i).getN2() + matkul.get(i).getN3();
            }
        }
        return 0;
    }
    public double rataNilai(double total) {
        return total/3;
    }
    
    public boolean lulusCheck(double nilai) {
        return nilai > 56;
    }
}
