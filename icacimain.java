package com.aaa.git;

import java.util.Scanner;

public class icacimain {
    public static void main(String args[]){
        Scanner tarayici=new Scanner(System.in);
        System.out.println("İç açılarını toplamak istediğiniz geometrik şeklin kenar sayısını giriniz : ");
        int sayi=tarayici.nextInt();
        icaci i=new icaci();
        int icaci=i.aci(sayi);

    }
}
