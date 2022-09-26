/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Lenovo
 */
public class Duck extends Animals {

    public Duck(String name, int age, String food, String gender, int alive) {
        super(name, age, food, gender, alive);
    }

    @Override
    String printSound() {
        return "Suara : BWEKK BWEKK";
    }

    @Override
    String printData() {
        return super.printData()
                + "\nBebek Jenis : Kampung"
                + "\n =======================";
    }

    @Override
    void Abstract() {
        System.out.println("");
    }
}
