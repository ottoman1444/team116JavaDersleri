package day11_methodOverloading_whileLoop;

import java.util.Scanner;

public class C07_SifreKontrolu {
    /*
       Soru 4 : Kullanicidan bir sifre isteyin,assagidaki sartlari kontrol edin
                ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
                eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
               -ilk harf kucuk harf olmali
               -son karakter rakam olmali
               -sifre bosluk icermemeli
               -uzunlugu en az 10 karakter olmali
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sifre = "";
        boolean sifreGecerlimi=false;

        while (!sifreGecerlimi){
            System.out.println("Lutfen bir sifre girin:");
            sifre=scanner.nextLine();

            sifreGecerlimi=sifreKontrolEt(sifre);
        }

        System.out.println("Sifreniz basari ile kaydedildi");

    }

    public static boolean sifreKontrolEt(String sifre) {

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
            return  true;
        }else{
            return false;
        }
    }


}
