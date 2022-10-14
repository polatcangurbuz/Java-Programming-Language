package com.aaa.git;

import java.util.Scanner;

public class maashesaplamain {
    public static void main(String args[]){
        Scanner tarayici=new Scanner(System.in);
        System.out.println("Çalıştığınız gün sayısını giriniz : ");
        int gun = tarayici.nextInt();
        maashesapla m=new maashesapla();
        int sonuc = m.maashesapla(gun);
        System.out.println("Maaş : "+sonuc+"tl");

    }
}
