package com.aaa.git;

public class fakt {
    public int faktor(int sayi){//nesne programlama
        int sonuc=1;
        if(sayi==0){
            System.out.println("Sonuc : 1");
        }
        else{
            for(int i=1;i<=sayi;i++){
                sonuc=sonuc*i;

            }
            System.out.println("Sonuc : "+sonuc);
        }
        return sonuc;//geri değer döndürmesi için
    }

}
