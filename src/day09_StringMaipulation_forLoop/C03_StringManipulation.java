package day09_StringMaipulation_forLoop;

import java.util.Scanner;

public class C03_StringManipulation {
    public static void main(String[] args) {

        // Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
        //          - ismi daha uzun ise, isim ve soyisim ilk harf buyuk kalanlar kucuk seklinde yazdirin
        //          - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk,
        //            soyismi buyuk harflerle yazdiirn

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");
        String soyIsim = scanner.nextLine();

        if (isim.length()>soyIsim.length()){
            System.out.println(isim.toUpperCase().charAt(0)+ isim.toLowerCase().substring(1)+" "
                    +soyIsim.toUpperCase().charAt(0)+soyIsim.toLowerCase().substring(1) );
        }else System.out.println(isim.toUpperCase().charAt(0)+ ". "
                +soyIsim.toUpperCase() );


*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");
        String soyIsim = scanner.nextLine();

        if (isim.length()>soyIsim.length()){

            isim=isim.toUpperCase().charAt(0) + isim.substring(1).toLowerCase();
            soyIsim= soyIsim.toUpperCase().charAt(0) +soyIsim.substring(1).toLowerCase();
        }else {
            isim=isim.toUpperCase().charAt(0) + isim.substring(1).toLowerCase();
            soyIsim= soyIsim.toUpperCase();
        }

        System.out.println(isim + " " + soyIsim);

    }
}
