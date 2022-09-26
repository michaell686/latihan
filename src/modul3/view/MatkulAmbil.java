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
public class MatkulAmbil {

    public MatkulAmbil() {
        ControllerUser user = new ControllerUser();
        String nim = JOptionPane.showInputDialog(null, "Masukkan Nim Mahasiswa");
        JOptionPane.showMessageDialog(null, user.matkulAmbil(nim));
    }
}
