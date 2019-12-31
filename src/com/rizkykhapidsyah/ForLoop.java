package com.rizkykhapidsyah;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("--------------------------");
        System.out.println("CONTOH 1: Perulangan - For");
        System.out.println("--------------------------");

        for (int i = 0; i <= 10; i++) {
            System.out.println("Perulangan Ke : " + i);
        }

        System.out.println("Akhir Dari For.\n");

        System.out.println("--------------------------");
        System.out.println("CONTOH 2: Perulangan - For");
        System.out.println("--------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.println("Perulangan Ke : " + i);
        }

        System.out.println("Akhir Dari For.\n");

        System.out.println("--------------------------");
        System.out.println("CONTOH 3: Perulangan - For");
        System.out.println("--------------------------");

        for (int i = 7; i < 10; i++) {
            System.out.println("Perulangan Ke : " + i);
        }

        System.out.println("Akhir Dari For.\n");

        System.out.println("--------------------------");
        System.out.println("CONTOH 4: Perulangan - For");
        System.out.println("--------------------------");

        for (int i = 10; i >= 0; i--) {
            System.out.println("Perulangan Ke : " + i);
        }

        System.out.println("Akhir Dari For.\n");

        System.out.println("--------------------------");
        System.out.println("CONTOH 5: Perulangan - For");
        System.out.println("--------------------------");

        for (int i = 10; i >= 0; i--) {
            System.out.println("Perulangan Ke : " + i);
            i *= 2;
        }

        System.out.println("Akhir Dari For.\n");

        System.out.println("--------------------------");
        System.out.println("CONTOH 6: Perulangan - For");
        System.out.println("--------------------------");

        for (int i = 10; i >= 0; i++) {
            System.out.println("Perulangan Ke : " + i);

            if (i == 1000){
                System.out.println("Perulangan Berhenti karena nilai sudah mencapai 10000");
                break;
            } else {
                i += 2;
            }
        }

        System.out.println("Akhir Dari For.\n");

    }
}
