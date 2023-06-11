package day09_StringMaipulation_forLoop;

import java.util.Scanner;

public class C04_StringManipulations {
    public static void main(String[] args) {
        /*
          Soru 6 : Kullanicidan alinan bir String alin
                   String'in uzunlugu cift sayi ise tam ortasına :) ekleyin
                   String'in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scanner.next();

        if ((kelime.length()%2) ==0 ) {
            System.out.println(kelime.substring(0, (kelime.length()/2)) + ":)" + kelime.substring(kelime.length()/2));
        }else System.out.println(kelime.substring(0, (kelime.length()/2)) + ":(" + kelime.substring(kelime.length()/2+1));

     }
}
