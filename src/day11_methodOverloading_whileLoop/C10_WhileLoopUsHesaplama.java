package day11_methodOverloading_whileLoop;

import java.util.Scanner;

public class C10_WhileLoopUsHesaplama {
    public static void main(String[] args) {


        //Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        // While loop kullanarak verilen sayinin usuunu hesaplayip yazdiran
        //bir method olusturun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfenbir tamsayi giriniz");
        double sayi = scanner.nextDouble();

        System.out.println("Lutfen pozitif bir tam sayi olarak istenen us degerini giriniz");
        int us=scanner.nextInt();

        usHesapla(sayi,us);

    }

    public static void usHesapla(double sayi, int us) {

        int basla = 1;
        double sonuc =1;

        while (basla<=us){
            sonuc*=sayi;
            basla++;
        }
        System.out.println(sayi + " uzeri " + us + " = "+sonuc);
    }
}
