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
public class GajiStaff {

    public GajiStaff() {
        ControllerUser user = new ControllerUser();
        String nik = JOptionPane.showInputDialog(null, "Masukkan NIK Staff");
        JOptionPane.showMessageDialog(null, user.gajiStaff(nik));
    }
}
