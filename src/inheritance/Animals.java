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
public abstract class Animals implements HewanInterface {

    String name;
    int age;
    String food;
    String gender;
    int alive;

    public Animals() {

    }

    public Animals(String name, int age, String food, String gender, int alive) {
        this.name = name;
        this.age = age;
        this.food = food;
        this.gender = gender;
        this.alive = alive;
    }

    abstract String printSound();

    public boolean isAlive() {
        if (alive == ALIVE) {
            return true;
        } else {
            return false;
        }
    }

    String printData() {
        return "nama : " + this.name
                + "\nage : " + this.age
                + "\nfood : " + this.food
                + "\ngender : " + this.gender
                + "\nalive : " + this.isAlive();
    }

    abstract void Abstract();
}
