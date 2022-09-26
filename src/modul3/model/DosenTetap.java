/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3.model;

/**
 *
 * @author Lenovo
 */
public class DosenTetap extends Dosen{
    
    private double salary;
    
    public DosenTetap(int salary, String departemen, String nama, String nik, String alamat, String ttl, String telepon) {
        super(departemen, nama, nik, alamat, ttl, telepon);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "DosenTetap{"+ super.toString() + "salary=" + salary + '}';
    }
    
    
}
