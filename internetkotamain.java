package com.aaa.git;

import java.util.Scanner;

public class internetkotamain {
    public static void main(String args[]){
        Scanner tarayici=new Scanner(System.in);
        System.out.println("Bu ay kullandığınız internet miktarını giriniz : ");
        int ucret= tarayici.nextInt();
        internetkota i=new internetkota();
        int sonuc= i.internetucretihesapla(ucret);
        System.out.println("İnternet kullanım faturanız : "+sonuc+"tl");
    }
}
