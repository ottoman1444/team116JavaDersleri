package day16_arrayList;

import java.util.List;

public class C05_OgrenciNotlari {


    public static void main(String[] args) {

        // ogretmenden alinan ogrenci notlarinin ortalamasinin ve kac ogrencinin ortalama ustunde
        // not aldıgını bize ulastiran bir method yazdirin

       List<Integer> notlarListesi = C04_KullanicidanIntListOlusturma.kullanicidanSayiAlarakListeolusturanMethod();

       NotOrtVeOrtUstOgrenciSay(notlarListesi);


    }


    public static void NotOrtVeOrtUstOgrenciSay(List<Integer> notlarListesi){
        // not ortalmasinin

        int toplamNot=0;
        int ortalamaNot =0;
        int sayac = 0;
        for (int i = 0; i <notlarListesi.size() ; i++) {
            toplamNot= toplamNot + notlarListesi.get(i);
        }

        ortalamaNot= toplamNot/notlarListesi.size(); // integer oldugu icin ortalama notun kusurati olmayacak

        // not ortalamasi uzerindeki ogrenci sayisi

        for (int i = 0; i <notlarListesi.size() ; i++) {
            if (notlarListesi.get(i)>ortalamaNot){
                sayac++;
            }

        }
        System.out.println("siniftaki ogrenci sayisi :" + notlarListesi);
        System.out.println("sinifin ortalama not : " + ortalamaNot);
        System.out.println("sinifta ortalama not ustu ogrenci sayisi :" + sayac);


    }



}
