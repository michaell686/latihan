/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakpbo;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
class Pasien {

    String nama;
    JenisKamar[] rawatInap = new JenisKamar[10];
    JenisPerawatan[] perawatan = new JenisPerawatan[5];
    Boolean pakaiBPJS;

}

class JenisKamar {

    String kelas;
    int hargaPerHari;

}

class JenisPerawatan {

    String nama;
    int biaya;

}

public class modul1 {

    static Pasien[] patients = new Pasien[150];

    public static int totalBiayaPasien(String nama) {
        int totalBiaya = 0;
        int cari = 0;
        boolean cek = true;

        for (int i = 0; i < patients.length; i++) {
            if (nama.equals(patients[cari].nama)) {
                cek = false;
            } else {
                cari++;
            }
            break;
        }

        if (patients[cari].nama != null) {
            for (int j = 0; j < patients[cari].perawatan.length; j++) {
                String perawatan = patients[cari].perawatan[j].nama;
                if (perawatan != null) {
                    totalBiaya += patients[cari].perawatan[j].biaya;
                }
            }
            if (patients[cari].pakaiBPJS == false) {
                for (int j = 0; j < patients[cari].rawatInap.length; j++) {
                    String kelas = patients[cari].rawatInap[j].kelas;
                    if (kelas != null) {
                        totalBiaya += patients[cari].rawatInap[j].hargaPerHari;
                    }
                }
            }
            return totalBiaya;
        } else {
            return totalBiaya = 0;
        }
    }

    public static int totalPendapatanRS() {
        int totalPendapatan = 0;
        for (int i = 0; i < patients.length; i++) {
            if (patients[i].nama != null) {
                totalPendapatan += totalBiayaPasien(patients[i].nama);
            }
        }
        return totalPendapatan;
    }

    public static int totalPasienPerawatan(String jenisPerawatan) {
        int counter = 0;
        for (int i = 0; i < patients.length; i++) {
            for (int j = 0; j < patients[i].perawatan.length; j++) {
                if (jenisPerawatan.equals(patients[i].perawatan[j].nama)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menu = 0;
        for (int i = 0; i < patients.length; i++) {
            patients[i] = new Pasien();
            for (int j = 0; j < patients[i].perawatan.length; j++) {
                patients[i].perawatan[j] = new JenisPerawatan();
            }
            for (int j = 0; j < patients[i].rawatInap.length; j++) {
                patients[i].rawatInap[j] = new JenisKamar();
            }
        }
        //pasien 1
        patients[0].nama = "Bernad";
        patients[0].pakaiBPJS = false;
        patients[0].perawatan[0].nama = "usg";
        patients[0].perawatan[0].biaya = 100000;
        patients[0].rawatInap[0].kelas = "Vip";
        patients[0].rawatInap[0].hargaPerHari = 100000;
        patients[0].perawatan[1].nama = "operasi";
        patients[0].perawatan[1].biaya = 200000;
        patients[0].rawatInap[1].kelas = "I";
        patients[0].rawatInap[1].hargaPerHari = 50000;
        patients[0].perawatan[2].nama = "mri";
        patients[0].perawatan[2].biaya = 250000;
        patients[0].rawatInap[2].kelas = "II";
        patients[0].rawatInap[2].hargaPerHari = 40000;
        patients[0].perawatan[3].nama = "xray";
        patients[0].perawatan[3].biaya = 100000;
        patients[0].rawatInap[3].kelas = "III";
        patients[0].rawatInap[3].hargaPerHari = 30000;

        //pasien 2
        patients[1].nama = "Mike";
        patients[1].pakaiBPJS = true;
        patients[1].perawatan[0].nama = "xray";
        patients[1].perawatan[0].biaya = 100000;
        patients[1].rawatInap[0].kelas = "vip";
        patients[1].rawatInap[0].hargaPerHari = 100000;
        patients[1].perawatan[1].nama = "mri";
        patients[1].perawatan[1].biaya = 100000;
        patients[1].rawatInap[1].kelas = "II";
        patients[1].rawatInap[1].hargaPerHari = 40000;
        patients[1].perawatan[2].nama = "operasi";
        patients[1].perawatan[2].biaya = 100000;
        patients[1].rawatInap[2].kelas = "I";
        patients[1].rawatInap[2].hargaPerHari = 50000;

        do {
            System.out.println("Pilih menu \n"
                    + "1.Total Biaya Pasien \n"
                    + "2.Total Pendapatan Rumah Sakit \n"
                    + "3.Hitung pasien jenis perawatan tertentu \n"
                    + "4. Exit");
            menu = scan.nextInt();
            if (menu == 1) {
                System.out.println("Masukan nama pasien : ");
                String nama = scan.next();
                System.out.println(totalBiayaPasien(nama));
            } else if (menu == 2) {
                System.out.println("Total pendapatan Rumah Sakit : " + totalPendapatanRS());
            } else if (menu == 3) {
                System.out.println("pilih jenis perawatan usg, operasi, mri, xray");
                String jenisPerawatan = scan.next();
                System.out.println("Jumlah pasien perawatan " + jenisPerawatan);
                System.out.println(totalPasienPerawatan(jenisPerawatan));
            }
        } while (menu != 4);

    }

}
