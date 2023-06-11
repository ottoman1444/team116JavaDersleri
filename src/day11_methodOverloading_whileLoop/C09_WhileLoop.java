package day11_methodOverloading_whileLoop;

import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {
        // kullanicidan toplanmak üzere pozitif tam sayilar isteyin
        // kullanici 0 a basana kadar işleme devam edin
        // kullanıcı sıfıra bastığında girdiği pozitif tam sayı adedeini ve toplamını yazdırın
        // kullanıcı negatif tamsayı girerse uyar verin ve o sayıyı adete eklemeyin

        Scanner scanner = new Scanner(System.in);
        int sayi = 1; // 0a basıca işlem biteceğinden burada 0 dan farklı değer kullanmak lazım.
        int sayac=0;
        int toplam=0;


        while (sayi !=0){

            System.out.println("toplanmak uzre pozitif tam sayi girin. Bitirmek icin 0 a basın.");
            sayi = scanner.nextInt();

            if (sayi>0){
                sayac++;
                toplam+=sayi;
            }else if (sayi<0){
                System.out.println("Pozitif tamsayi giriniz");
            }

        }
        System.out.println("girdiginiz " +sayac +" adet pozitif tam sayinin toplami : "+toplam);
    }
}
