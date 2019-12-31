package com.rizkykhapidsyah;

import java.util.Scanner;

public class DeretFibonacci {
    public static void main(String[] args) {
        int fn, fn1, fn2, n, i;
        Scanner inputUser;

        inputUser = new Scanner(System.in);

        System.out.print("Masukkan Nilai ke-n : ");
        n = inputUser.nextInt();

        fn2 = 0;
        fn1 = 1;
        fn = 1;

        System.out.println("\n");

        for (i = 1; i <= n; i++) {
            System.out.println("Nilai Ke - " + i + " adalah = " + fn);
            fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;
        }
    }
}
