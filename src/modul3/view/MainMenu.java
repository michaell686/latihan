/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class MainMenu {

    public MainMenu() {
        showMainMenu();
    }

    public void showMainMenu() {
        Boolean menu = true;
        while (menu) {
            int choosen = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Menu: "
                    + "\n1.Print User Data "
                    + "\n2.Print Nilai Akhir "
                    + "\n3.Print Rata-Rata nilai Akhir "
                    + "\n4.Print Mahasiswa Tdk Lulus "
                    + "\n5.Print Matkul Mahasiswa "
                    + "\n6.Print Total Jam Ajar"
                    + "\n7.Print Gaji"
                    + "\n8.Exit"));
            switch (choosen) {
                case 1:
                    new PrintUserData();
                    break;
                case 2:
                    new HitungNA();
                    break;
                case 3:
                    new RataNA();
                    break;
                case 4:
                    new BanyakTidakLulusMK();
                    break;
                case 5:
                    new MatkulAmbil();
                    break;
                case 6:
                    new TotalJamDosen();
                    break;
                case 7:
                    new GajiStaff();
                    break;
                case 8:
                    menu = false;
                    break;
            }
        }
    }
}
