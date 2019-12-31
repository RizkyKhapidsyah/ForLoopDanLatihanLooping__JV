package com.rizkykhapidsyah;

import java.util.Scanner;

public class LatihanLoopingSederhana {
    //Program Looping untuk menjumlahkan angka dengan rentang tertentu.

    public static void main(String[] args) {
        int nAwal, nAkhir, total;
        Scanner inputUser;

        inputUser = new Scanner(System.in);
        System.out.print("Masukkan Nilai Awal  : "); nAwal = inputUser.nextInt();
        System.out.print("Masukkan Nilai Akhir : "); nAkhir = inputUser.nextInt();

        total = 0;

        System.out.println("\n");

        while (nAwal <= nAkhir) {
            total = total + nAwal;
            System.out.println("Ditambah : " + nAwal + " menjadi = " + total);
            nAwal++;
        }

    }
}
