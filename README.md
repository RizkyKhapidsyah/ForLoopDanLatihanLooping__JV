# ForLoopDanLatihanLooping__JV
Bahan Ajar Fundamental Pemrograman Java. Mengenal Dasar-Dasar Perulangan Dan Melakukan Perulangan (Looping) Sederhana Serta Deret Fibonacci.<br><br>
<img src="https://github.com/RizkyKhapidsyah/ForLoopDanLatihanLooping__JV/blob/master/results/001.PNG">
<img src="https://github.com/RizkyKhapidsyah/ForLoopDanLatihanLooping__JV/blob/master/results/002.PNG">
<img src="https://github.com/RizkyKhapidsyah/ForLoopDanLatihanLooping__JV/blob/master/results/003.PNG">
<img src="https://github.com/RizkyKhapidsyah/ForLoopDanLatihanLooping__JV/blob/master/results/004.PNG">
<img src="https://github.com/RizkyKhapidsyah/ForLoopDanLatihanLooping__JV/blob/master/results/005.PNG">
<img src="https://github.com/RizkyKhapidsyah/ForLoopDanLatihanLooping__JV/blob/master/results/006.PNG">
<img src="https://github.com/RizkyKhapidsyah/ForLoopDanLatihanLooping__JV/blob/master/results/006.gif">
<img src="https://github.com/RizkyKhapidsyah/ForLoopDanLatihanLooping__JV/blob/master/results/007.PNG" width="160px" height="170px"><br><br>
- Lihat <a href="https://github.com/RizkyKhapidsyah/ForLoopDanLatihanLooping__JV/tree/master/src/com/rizkykhapidsyah">Source Code.</a><br><br>


Pengulangan(looping) adalah suatu bagian yang bertugas melakukan kegiatan mengulang suatu proses sesuai dengan yang diinginkan. Banyak dari aplikasi perangkat lunak yang melakukan pekerjaan berulang sampai sebuah kondisi yang diinginkan, oleh karena itu pengulangan merupakan bagian yang penting dalam pemrograman karena dengan adanya pengulangan pembuat program tidak perlu menulis kode program sebanyak pengulangan yang diinginkan.

Pengulangan mempunyai beberapa bagian yang harus dipenuhi yaitu :

Inisialisasi adalah tahap persiapan membuat kondisi awal sel melakukan pengulangan, misalnya mengisi variabel dengan nilai awal. Tahap ini dilakukan sebelum memasuki bagian pengulangan. Proses terjadi di dalam bagian pengulangan dimana berisi semua proses yang perlu dilakukan secara berulang-ulang. Iterasi terjadi di dalam pengulangan di mana merupakan kondisi pertambahan agar pengulangan dapat terus berjalan.

Terminasi adalah kondisi berhenti dari pengulangan, kondisi berhenti sangat penting dalam pengulangan agar pengulangan dapat berhenti, tidak menjadi pengulangan yang tanpa henti. Kondisi pengulangan adalah kondisi yang dipenuhi oleh kondisi jalannya algoritma untuk masuk ke dalam blok pengulangan. Pengulangan merupakan salah satu inti dari analisis kasus pada pembuatan algoritma, sebuah kasus harus dipikirkan penyelesaiannya dengan pemikiran ada proses atau aksi yang harus dikerjakan secara berulang agar sebuah kasus terselesaikan.

## Pengulangan “for”

Struktur pengulangan for biasa digunakan untuk mengulang suatu proses yang telah diketahui jumlah pengulangannya. Dari segi penulisannya, struktur pengulangan for tampaknya lebih efisien karena susunannya lebih simpel dan sederhana. Bentuk umum pengulangan for adalah sebagai berikut :

      for(Inisialisasi; Terminasi; Iterasi){
        Proses;
      }

Contoh Kode Program Menampilkan Tulisan:

      public class PengulanganFor {
          public static void main(String[] args) {
              int x;
              for(x=1; x<=10; x++){
                  System.out.println(x+".Belajar Pengulangan for");
              }
          }
      }

Contoh Kode Program Menampilkan Bilangan Ganjil

      public class ForBilGanjil {
          public static void main(String[] args) {
              int x;
              System.out.println("Menampilkan bilangan antara 1-50");
              for(x=1;x<=50;x++){
                if(x%2==1){
                  System.out.print(x+" ");
                }
               }
          }
      }

## Pengulangan “while”

Pada pengulangan while, pengecekan terhadap pengulangan dilakukan di bagian awal (sebelum tubuh loop). Lebih jelasnya, bentuk struktur pengulangan while adalah sebagai berikut:

      Inisialisasi
      while(Terminasi){
       Proses
       Iterasi
      }

Contoh Kode Program Menampilkan Tulisan:

      public class PengulanganWhile {
          public static void main(String[] args) {
              int x;
               x=1;
               while(x<=10){
                   System.out.println(x+".Belajar Pengulangan While");
                   x++;
               }
          }
      }

Contoh Kode Program Menampilkan Bilangan Genap

      public class WhileBiGenap {
          public static void main(String[] args) {
              int x;
              x=1;
              while(x<=50){
                  if(x%2==0){
                      System.out.print(x+" ");
                  }
                  x++;
              }
          }
      }

## Pengulangan “do-while”

Perbedaan mendasar dengan pengulangan yang lain adalah pada pengulangan do-while, proses pasti akan dilakukan minimal 1 kali. Hal ini terjadi karena terminasi diletakan setelah proses. Berikut ini struktur dari pengulangan do-while:

      Inisialisasi
      do{
       Proses
       Iterasi
      }while(Terminasi)

Contoh Kode Program Menampilkan Bilangan Kelipatan 3:

      public class PengulanganDoWhile {
          public static void main(String[] args) {
              int x;
               x=1;
               do{
                 if(x%3==0){
                     System.out.print(x+" ");
                 }
               x++;
               }while(x<=100);
          }
      }

Contoh  Kode Program Mengulang Pilihan Program:

      import java.util.Scanner;
      public class PilihProgram {

          public static void main(String[] args) {
               int pilihan;
               Scanner masukan = new Scanner(System.in);
               do{
                   System.out.println("Pilihlah Menu Berikut Ini :");
                   System.out.println("t1.Cetak");
                   System.out.println("t2.Lihat");
                   System.out.println("t3.Keluar");
                   System.out.print("Pilihan Anda : ");
                   pilihan = masukan.nextInt(); 

                   if(pilihan==1){
                       System.out.println("nCetak Laporan. Siapkan Printer");
                   }else if(pilihan==2){
                       System.out.println("nTampilkan Laporan");
                  }
               }while(pilihan!=3);
          }
      }
      
      
Sebuah program mengizinkan blok pengulangan di dalam blok pengulangan lainnya, dan tidak membatasai jenis pengulangan apa yang boleh berada di dalam pengulangan lainnya, misalnya di dalam blok pengulangan for terdapat pengulangan while, atau didalam pengulangan while terdapat pengulangan for.

## Pengulangan Bersarang “For”

Bentuk umum pengulangan bersarang for adalah sebagai berikut :

       for(Inisialisasi1; Terminasi1; Iterasi1){
        Proses;
        for(Inisialisasi2; Terminasi2; Iterasi2){
         Proses;
        }
       }

Contoh Program Menampilkan Baris Kolom Bilangan:

      #include <stdio.h>
      main(){
          int i,j;
          printf("n Pengulangan Bersarang For");
          for(i=1;i<=5;i++){
              printf(" %i ",i);
              for(j=1;j<=3;j++){
                  printf(" %i ",j);
              }
          printf("n");
          }
      }

## Pengulangan Bersarang “While”

Bentuk umum pengulangan bersarang while adalah sebagai berikut :

      Inisialisasi1
      while(Terminasi1){
       Proses1
       Inisialisasi2
       while(Terminasi2){
         Proses1
         Iterasi2
       }
       Iterasi1
      }

Contoh Program Menampilkan Baris Kolom Bilangan:

      public class WhileBersarang {
          public static void main(String[] args) {
              int i,j;
              System.out.print("nPengulangan Bersarang While");
              i=0;
              while(i<=10){
                  System.out.print(i+" ");
                  j=0;
                  while(j<=5){
                      System.out.print(j+" ");
                      j++;
                  }
                  i++;
                  System.out.print("n");
              }
          }
      }

Contoh Kode Program membuat pola:

      public class Pola1 {
          public static void main(String[] args) {
              int i,j;
              System.out.print("n Pengulangan Bersarang Membentuk Pola");
              for(i=1;i<=5;i++){
                 for(j=1;j<=3;j++){
                   System.out.print(" * ");
                 }
                  System.out.print("n");
              }
          }
      }

      public class Pola2 {
          public static void main(String[] args) {
              int i,j;
              System.out.print("n Pengulangan Bersarang Membentuk Pola");
              for(i=1;i<=5;i++){
                 for(j=1;j<=5;j++){
                   if(i>=j){
                      System.out.print(" * ");
                   }
                 }
                  System.out.print("n");
              }
          }
      }

      public class Pola3 {
          public static void main(String[] args) {
              int i,j;
              System.out.print("n Pengulangan Bersarang Membentuk Pola ");
              for(i=1;i<=5;i++){
                 for(j=1;j<=5;j++){
                   if(i<=j){
                      System.out.print(" * ");
                   }
                   else
                     System.out.print("   ");
                 }
                  System.out.print("n");
              }
          }
      }

      public class Pola4 {
          public static void main(String[] args) {
              int i,j;
              System.out.print("n Pengulangan Bersarang Membentuk Pola");
              for(i=1;i<=5;i++){
                 for(j=1;j<=5;j++){
                   if(i<=j){
                      System.out.print(" * ");
                   }
                   else
                     System.out.print("   ");
                 }
                  System.out.print("n");
              }
          }
      }

-----

Referensi Artikel: <a href="http://onestringlab.com">OneStringLab</a>. Thanks to: <a href="http://onestringlab.com">OneStringLab</a> <br>
Referensi Source Code: <a href="https://www.youtube.com/user/faqihzamukhlish"> Kelas Terbuka </a> dan <a href="https://github.com/kelasterbuka"> Kelas Terbuka (Repository)</a>. Created by <a href="https://github.com/faqihza">Faqihza Mukhlish.</a> Thanks To: <a href="https://www.youtube.com/channel/UCRGHjysoCemh4y7tCJQs30w/about">Faqihza Mukhlish.</a><br>

-----
All Source Code is Modified.
