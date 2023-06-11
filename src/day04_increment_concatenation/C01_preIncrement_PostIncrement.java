package day04_increment_concatenation;

import java.util.Scanner;

public class C01_preIncrement_PostIncrement {
    public static void main(String[] args) {

       // kullanıcıdan bir tam sayi isteyin
        // girilen tam sayiyi yazdirip
        // sonrasinda 1 arttiirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz");
        int girilenSayi = scanner.nextInt();

        System.out.println( "Girilen sayi: " + girilenSayi);

        girilenSayi++;

        // kullanıcıdan bir sayı daha alın.
        //bu sayıyı önce arttırın
        // sonra yazdırın
        System.out.println("Lütfen bir tam sayı daha girin ");
        int girilenSayi2 = scanner.nextInt();

        girilenSayi2++;

        System.out.println("Girilen ikinci sayi : " + girilenSayi2);

        //şu halde girilenSayı 21 girilenSayı 21 olur ama kosnolda gs yi 20 gs2 yi21 görürüz.

        System.out.println("Kodun sonunda girilen GS: " + girilenSayi + ", GS2: " + girilenSayi2);

        // Java bunu tek satırda yapabileceğimiz bir yöntem geliştirmiş. Buda bi sonraki classda yapıyoruz.

    }
}
