package day09_StringMaipulation_forLoop;

import java.util.Scanner;

public class C02_StringMainpulations {
    public static void main(String[] args) {


        //Soru 4 : Kullanicidan bir sifre isteyin,assagidaki sartlari kontrol edin
        //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        //         -ilk harf kucuk harf olmali
        //         -son karakter rakam olmali
        //         -sifre bosluk icermemeli
        //         -uzunlugu en az 10 karakter olmali

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz:\n Sifrenizin \n1-ilk harfi kucuk harf olmali\n" +
                "2-Son karakter rakam olmali\n3-Sifre bosluk icermemeli\n4-uzunlugu en az 10 karakter olmali");

        String sifre = scanner.nextLine();

        // tum hatalari raporlamamız istendigi icin bagimsiz if cumleleri kullanmaliz
        // tum sartlari sagladigini kontrol etmek icin sayac kullanalim dedik

        int sayac = 0;
        char ilkHarf =sifre.charAt(0);
        if (!(ilkHarf>='a'&& ilkHarf<='z')) {
            System.out.println("İlk harf kucuk harf olmali");
            sayac++;
        }

        char sonKarakter = sifre.charAt(sifre.length()-1);
        if (!(sonKarakter>=0 && sonKarakter<=9)){
            System.out.println("Son karakter rakam olmalidir");
            sayac++;
        }

        if (sifre.contains(" ")) {
            System.out.println("Sifre bosluk icermemelidir");
            sayac++;
        }

        if (sifre.length()<11) {
            System.out.println("Sifre en az 10 karakter olmali");
            sayac++;
        }
        if (sayac ==0) {
            System.out.println("Sifre dogru girilmistir");
        }else System.out.println("Ben sana boylemi sifre gir dedim mk");
}

    }

