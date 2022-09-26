/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3.controller;

import java.util.ArrayList;
import modul3.model.*;

/**
 *
 * @author Lenovo
 */
public class ControllerUser {

    UserData user = new UserData();
    ControllerMatkul matkul = new ControllerMatkul();

    public String printUserData(String nama) {
        user.dummyData();
        for (int i = 0; i < user.getSarjanaList().size(); i++) {
            if (user.getSarjanaList().get(i).getNama().equals(nama)) {
                Sarjana sarjana = user.getSarjanaList().get(i);
                return "Status : Mahasiswa Sarjana" + sarjana.toString();
            }
        }
        for (int i = 0; i < user.getMagisterList().size(); i++) {
            if (user.getMagisterList().get(i).getNama().equals(nama)) {
                Magister magister = user.getMagisterList().get(i);
                return "Status : Mahasiswa Magister" + magister.toString();
            }
        }
        for (int i = 0; i < user.getDoktorList().size(); i++) {
            if (user.getDoktorList().get(i).getNama().equals(nama)) {
                Doktor doktor = user.getDoktorList().get(i);
                return "Status : Mahasiswa Magister" + doktor.toString();
            }
        }
        for (int i = 0; i < user.getDosenTetapList().size(); i++) {
            if (user.getDosenTetapList().get(i).getNama().equals(nama)) {
                DosenTetap dosenTetap = user.getDosenTetapList().get(i);
                return "Status : Dosen Tetap" + dosenTetap.toString();
            }
        }
        for (int i = 0; i < user.getHonorerList().size(); i++) {
            if (user.getHonorerList().get(i).getNama().equals(nama)) {
                DosenHonorer dosenHonorer = user.getHonorerList().get(i);
                return "Status : Dosen Honorer" + dosenHonorer.toString();
            }
        }
        for (int i = 0; i < user.getKaryawanList().size(); i++) {
            if (user.getKaryawanList().get(i).getNama().equals(nama)) {
                Karyawan karyawan = user.getKaryawanList().get(i);
                return "Status : Karyawan" + karyawan.toString();
            }
        }
        return "tidak ditemukan!";
    }

    public double hitungNA(String nim, String kodeMK) {
        user.dummyData();
        double total = 0;
        double rata = 0;
        for (int i = 0; i < user.getSarjanaList().size(); i++) {
            if (user.getSarjanaList().get(i).getNim().equals(nim)) {
                total = matkul.totalNilai(user.getSarjanaList().get(i).getMatkulAmbil(), kodeMK);
                rata = matkul.rataNilai(total);
                return rata;
            }
        }
        for (int i = 0; i < user.getMagisterList().size(); i++) {
            if (user.getMagisterList().get(i).getNim().equals(nim)) {
                total = matkul.totalNilai(user.getMagisterList().get(i).getMatkulAmbil(), kodeMK);
                total = matkul.rataNilai(total);
                return total;
            }
        }
        for (int i = 0; i < user.getDoktorList().size(); i++) {
            if (user.getDoktorList().get(i).getNim().equals(nim)) {
                Doktor doktor = user.getDoktorList().get(i);
                total = doktor.getNilaiSidang1() + doktor.getNilaiSidang2() + doktor.getNilaiSidang3();
                total = matkul.rataNilai(total);
                return total;
            }
        }
        return total;
    }

    public double rataNA(String KodeMK) {
        user.dummyData();
        double total = 0;
        for (int i = 0; i < user.getSarjanaList().size(); i++) {
            total += matkul.totalNilai(user.getSarjanaList().get(i).getMatkulAmbil(), user.getSarjanaList().get(i).getMatkulAmbil().get(i).getKode());
        }
        for (int i = 0; i < user.getMagisterList().size(); i++) {
            total += matkul.totalNilai(user.getMagisterList().get(i).getMatkulAmbil(), user.getMagisterList().get(i).getMatkulAmbil().get(i).getKode());
        }
        for (int i = 0; i < user.getDoktorList().size(); i++) {
            Doktor doktor = user.getDoktorList().get(i);
            total += doktor.getNilaiSidang1() + doktor.getNilaiSidang2() + doktor.getNilaiSidang3();
        }
        total = matkul.rataNilai(total);
        return total;
    }

    public int banyakTidakLulus(String kodeMK) {
        user.dummyData();
        int total = 0;
        double tempNilaiRata = 0;
        for (int i = 0; i < user.getSarjanaList().size(); i++) {
            tempNilaiRata = matkul.rataNilai(matkul.totalNilai(user.getSarjanaList().get(i).getMatkulAmbil(), kodeMK));
            if (!matkul.lulusCheck(tempNilaiRata)) {
                total++;
            }
        }
        for (int i = 0; i < user.getMagisterList().size(); i++) {
            tempNilaiRata = matkul.rataNilai(matkul.totalNilai(user.getMagisterList().get(i).getMatkulAmbil(), kodeMK));
            if (!matkul.lulusCheck(tempNilaiRata)) {
                total++;
            }
        }
        for (int i = 0; i < user.getDoktorList().size(); i++) {
            Doktor doktor = user.getDoktorList().get(i);
            tempNilaiRata = matkul.rataNilai(doktor.getNilaiSidang1() + doktor.getNilaiSidang2() + doktor.getNilaiSidang3());
            if (!matkul.lulusCheck(tempNilaiRata)) {
                total++;
            }
        }
        return total;
    }

    public int matkulAmbil(String nim) {
        user.dummyData();
        int counter = 0;
        ArrayList<MatkulAmbil> matkulAmbil = new ArrayList();
        for (int i = 0; i < user.getSarjanaList().size(); i++) {
            Sarjana sarjana = user.getSarjanaList().get(i);
            if (user.getSarjanaList().get(i).getNim().equals(nim)) {
                matkulAmbil = sarjana.getMatkulAmbil();
                System.out.println(matkulAmbil);
                counter++;
            }
        }
        for (int i = 0; i < user.getMagisterList().size(); i++) {
            Magister magister = user.getMagisterList().get(i);
            if (user.getSarjanaList().get(i).getNim().equals(nim)) {
                matkulAmbil = magister.getMatkulAmbil();
                counter++;
            }
        }
        return counter;
    }

    public int totalJamDosen(String nik) {
        user.dummyData();
        int counter = 0;
        for (int i = 0; i < user.getDosenTetapList().size(); i++) {
            if (user.getDosenTetapList().get(i).getNik().equals(nik)) {
                for (int j = 0; j < user.getDosenTetapList().get(i).getPresensi().size(); j++) {
                    if (user.getDosenTetapList().get(i).getPresensi().get(j).getStatus() == 1) {
                        counter++;
                    }
                }
            }
        }
        for (int i = 0; i < user.getHonorerList().size(); i++) {
            if (user.getHonorerList().get(i).getNik().equals(nik)) {
                for (int j = 0; j < user.getHonorerList().get(i).getPresensi().size(); j++) {
                    if (user.getHonorerList().get(i).getPresensi().get(j).getStatus() == 1) {
                        counter++;
                    }
                }
            }
        }
        return counter;
    }

    public double gajiStaff(String nik) {
        user.dummyData();
        double gaji = 0;
        int unit = 0;
        for (int i = 0; i < user.getKaryawanList().size(); i++) {
            if (user.getKaryawanList().get(i).getNik().equals(nik)) {
                gaji = unit / 22 * user.getKaryawanList().get(i).getSalary();
            }
        }
        for (int i = 0; i < user.getDosenTetapList().size(); i++) {
            if (user.getDosenTetapList().get(i).getNik().equals(nik)) {
                gaji = user.getDosenTetapList().get(i).getSalary() + (unit * 25000);
            }
        }
        for (int i = 0; i < user.getHonorerList().size(); i++) {
            if (user.getHonorerList().get(i).getNik().equals(nik)) {
                gaji = unit * user.getHonorerList().get(i).getHonorPerSks();
            }
        }
        return gaji;
    }

}
