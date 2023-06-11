package day16_arrayList;

import java.util.List;
import java.util.Scanner;

public class C15_ForEachLoop {

    public static void main(String[] args) {
        /*
        Stringlerden olusan bir liste icindeki kelimelerden a harfi iceren kelimeleri yazdirin
         */
        //daha onceden hazirladigimiz kullanici liste olustırma methodu ile lisdtyei olusturuyoruz
        List<String> liste = C02_KullanicidanListeOlusturma.kullanicidanSringAlarakListeOlusturma();

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen aradiginiz harfi giriniz");
        String arananHarf = scan.next();

        for (String each: liste
             ) {
            if (each.contains(arananHarf)){
                System.out.println(each);
            }
        }
    }
}
