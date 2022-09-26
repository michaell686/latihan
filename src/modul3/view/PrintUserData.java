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
public class PrintUserData {
    
    public PrintUserData() {
        ControllerUser user = new ControllerUser();
        String nama = JOptionPane.showInputDialog(null, "Masukkan nama user yang ingin di print");
        JOptionPane.showMessageDialog(null, user.printUserData(nama));
    }
}
