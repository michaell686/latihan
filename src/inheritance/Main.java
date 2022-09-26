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
public class Main {
    
    public Main(){
        //cat
        Cat cat = new Cat("Maya", 10, "Wishkas", "jantan", 1);
        System.out.println(cat.printSound());
        System.out.println(cat.printData());
        
        //dog
        Dog dog = new Dog("Cuwi", 15, "Ayam", "betina", 0);
        System.out.println(dog.printSound());
        System.out.println(dog.printData());
        
        //duck
        Duck duck = new Duck("John", 5, "Tempe", "betina", 0);
        System.out.println(duck.printSound());
        System.out.println(duck.printData());
        
        //horse
        Horse horse = new Horse("Joni", 20, "Rumput", "Jantan", 1);
        System.out.println(horse.printSound());
        System.out.println(horse.printData());
    }
    
    public static void main(String[] args) {
        new Main();
    }
}
