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
public class UserData implements StatusInterface {

    ArrayList<Sarjana> sarjanaList = new ArrayList<>();
    ArrayList<Magister> magisterList = new ArrayList<>();
    ArrayList<Doktor> doktorList = new ArrayList<>();
    ArrayList<Karyawan> karyawanList = new ArrayList<>();
    ArrayList<DosenTetap> dosenTetapList = new ArrayList<>();
    ArrayList<DosenHonorer> honorerList = new ArrayList<>();
    ArrayList<MatkulAmbil> matkulAmbilList1 = new ArrayList<>();
    ArrayList<MatkulAmbil> matkulAmbilList2= new ArrayList<>();
    ArrayList<MatkulAjar> matkulAjarList = new ArrayList<>();
    ArrayList<Presensi> presensiList1 = new ArrayList<>();
    ArrayList<Presensi> presensiList2 = new ArrayList<>();
    ArrayList<PresensiStaff> presensiStaffList = new ArrayList<>();

    public void dummyData() {
        //sarjana
        Presensi presensi1 = new Presensi("31-01-2022", HADIR);
        presensiList1.add(presensi1);
        MatkulAmbil matkulAmbil = new MatkulAmbil(presensiList1, 40, 99, 100, "IF202", 1, "Prak Basdat");
        matkulAmbilList1.add(matkulAmbil);
        Sarjana sarjana = new Sarjana(matkulAmbilList1, "1121047", "Informatika", "Budi", "Kopo", "Bandung 31-01-2002", "088881231");
        sarjanaList.add(sarjana);

        //magister
        Presensi presensi2 = new Presensi("11-11-2022", ALPHA);
        presensiList2.add(presensi2);
        matkulAmbil = new MatkulAmbil(presensiList2, 90, 20, 20, "IF203", 3, "Sisber");
        matkulAmbilList2.add(matkulAmbil);
        Magister magister = new Magister(matkulAmbilList2,"DEEP LEARNING", "3331234", "MIT", "Joni", "Majalaya", "Bandung 11-01-1999", "0877771234");
        magisterList.add(magister);

        //doktor
        Doktor doktor = new Doktor("Metaverse okeyy", 40, 95, 99, "222024", "Teknik Mesin", "Cindy", "Dipatiukur", "Badung 13-04-1992", "01233345");
        doktorList.add(doktor);
        
        //Karyawan
        Karyawan karyawan = new Karyawan(3500000, "33331212334234", "Asep Sumanto", "Dago", "Bandung 12-08-1899", "0884902437526");
        karyawanList.add(karyawan);
        //Dosen tetap
        DosenTetap dosenTetap = new DosenTetap(15000000, "Informatika", "John", "333123212566", "Cibaduyut", "Bandung 31-01-1888", "08976652525");
        dosenTetapList.add(dosenTetap);
        //dosen honor
        DosenHonorer honorer = new DosenHonorer(10000000, "MIT", "Siti", "33331213445", "Cimahi", "Bandung 21-04-1899", "09088971234");
        honorerList.add(honorer);
    }

    public ArrayList<Sarjana> getSarjanaList() {
        return sarjanaList;
    }

    public ArrayList<Magister> getMagisterList() {
        return magisterList;
    }

    public ArrayList<Doktor> getDoktorList() {
        return doktorList;
    }

    public ArrayList<Karyawan> getKaryawanList() {
        return karyawanList;
    }

    public ArrayList<DosenTetap> getDosenTetapList() {
        return dosenTetapList;
    }

    public ArrayList<DosenHonorer> getHonorerList() {
        return honorerList;
    }

    public void setSarjanaList(ArrayList<Sarjana> sarjanaList) {
        this.sarjanaList = sarjanaList;
    }

    public void setMagisterList(ArrayList<Magister> magisterList) {
        this.magisterList = magisterList;
    }

    public void setDoktorList(ArrayList<Doktor> doktorList) {
        this.doktorList = doktorList;
    }

    public void setKaryawanList(ArrayList<Karyawan> karyawanList) {
        this.karyawanList = karyawanList;
    }

    public void setDosenTetapList(ArrayList<DosenTetap> dosenTetapList) {
        this.dosenTetapList = dosenTetapList;
    }

    public void setHonorerList(ArrayList<DosenHonorer> honorerList) {
        this.honorerList = honorerList;
    }

}
