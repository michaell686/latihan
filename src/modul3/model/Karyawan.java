/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3.model;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Karyawan extends Staff{
    
    private double salary;
    private ArrayList<PresensiStaff> presensiStaff = new ArrayList<>();
    
    public Karyawan(int salary, String nik, String nama, String alamat, String ttl, String telepon) {
        super(nik, nama, alamat, ttl, telepon);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ArrayList<PresensiStaff> getPresensiStaff() {
        return presensiStaff;
    }

    public void setPresensiStaff(ArrayList<PresensiStaff> presensiStaff) {
        this.presensiStaff = presensiStaff;
    }

    @Override
    public String toString() {
        return "Karyawan{"+ super.toString() + "salary=" + salary + ", presensiStaff=" + presensiStaff + '}';
    }
    
    
}
