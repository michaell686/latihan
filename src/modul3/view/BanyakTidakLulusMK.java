/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3.view;

import javax.swing.JOptionPane;
import modul3.controller.*;
/**
 *
 * @author Lenovo
 */
public class BanyakTidakLulusMK {

    public BanyakTidakLulusMK() {
        ControllerUser user = new ControllerUser();
        String kodeMK = JOptionPane.showInputDialog(null, "Masukkan kode mata kuliah");
        JOptionPane.showMessageDialog(null, user.banyakTidakLulus(kodeMK));
    }

}
