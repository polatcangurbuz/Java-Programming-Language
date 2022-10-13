package com.aaa.git;

import java.util.Scanner;

public class dilekcemain {
    public static void main(String args[]){
        Scanner tarayici=new Scanner(System.in);

        System.out.println("Öğrencinin adını giriniz : ");
        String ad= tarayici.next();
        System.out.println("Öğrencinin okul numarasını giriniz : ");
        int no= tarayici.nextInt();
        System.out.println("Öğrencinin kaç gün izin almak istediği miktarı giriniz : ");
        int izin= tarayici.nextInt();
        System.out.println("Dilekçeyi yazdığınız tarihi giriniz : ");
        int tarih= tarayici.nextInt();
        System.out.println("Veli adı ve soyadını giriniz : ");
        String veliad= tarayici.next();
        System.out.println("         Bursa Anadolu Lisesi Müdürlüğüne,          ");
        System.out.println(ad+" adlı "+no+" nolu öğrencinin "+izin+" gün izinli olmasını rica ediyorum.");
        System.out.println("Tarih : "+tarih);
        System.out.println("Ad-Soyad : "+veliad);
    }
}
