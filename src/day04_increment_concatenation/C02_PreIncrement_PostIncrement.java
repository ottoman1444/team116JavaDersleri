package day04_increment_concatenation;

import java.util.Scanner;

public class C02_PreIncrement_PostIncrement {
    public static void main(String[] args) {

        // kullanıcıdan bir tam sayi isteyin
        // girilen tam sayiyi yazdirip
        // sonrasinda 1 arttiirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz");
        int girilenSayi = scanner.nextInt();

        System.out.println("Girilen Sayı: " + girilenSayi++ );
        // bir önceki classda önce sout diyip girilen sayıyı yazdırmış sonra bir arttırmıştık.
        // önce yazıdırırm
        // sonra arttırırım.



        // kullanıcıdan bir sayı daha alın.
        //bu sayıyı önce arttırın
        // sonra yazdırın
        System.out.println("Lütfen bir tam sayı daha girin ");
        int girilenSayi2 = scanner.nextInt();

        System.out.println("Girilen Sayı2: " + ++girilenSayi2);
        //bir önceki classda önce arttırmış sonra yazdırmıştık
        // bu işlemler için iki satır yazmamıza gerek yok.
        // burada hem yazdırma hemde arttırma var.
        // sonra yazdırırım
        // önce arttırıtım

        System.out.println("Kodun sonunda girilen GS: " + girilenSayi + ", GS2: " + girilenSayi2);

    }
}
