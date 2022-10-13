package com.aaa.git;

import java.util.Scanner;

public class faktmain {
    public static void main(String args[]){
        Scanner tarayici=new Scanner(System.in);//kullanıcıdan veri girişi için
        System.out.println("Faktöriyelini hesaplamak istediğiniz sayiyi giriniz : ");
        int sayi= tarayici.nextInt();
        fakt f1=new fakt();//diğer sınıftaki verileri alabilmek için
        int faktoriyel=f1.faktor(sayi);
    }
}
