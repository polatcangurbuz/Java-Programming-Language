package com.aaa.dikdortgencevre;

import java.util.Scanner;

public class dikdortgencevremain {
    public static void main(String args[]){
    Scanner tarayici = new Scanner(System.in);
        System.out.println("Dikdörtgenin kısa kenar uzunluğu : ");
        int sayi1= tarayici.nextInt();
        System.out.println("Dikdörtgenin uzun kenar uzunluğu : ");
        int sayi2= tarayici.nextInt();
        dıkdortgencevre d=new dıkdortgencevre();
        d.cevre(sayi1,sayi2);
    }
}
