package day12_doWhileLoop_scope;

import java.util.Scanner;

public class C01_doWhileLoop {

    public static void main(String[] args) {

        /*
        While loop'da kullnacağımız variablelara bastan deger atamamiz gerekir
        eger bu variable'lara yanlis deger atamasi yaparsak
        while loop body'si hic calısmayabilir

        Java bu dezavantajı ortadan kaldırmak için do while oluşturmuştur
         */

        // kullanicidan sayidegerleri alip toplayalim
        // kullanici 0 a bastıgında islem bitsin
        // ve toplami yazdirsin

        Scanner scanner = new Scanner(System.in);
        int sayi=1;
        int toplam=0;
        System.out.println("Lutfen toplamak icin bir sayi yazin \nBitirmek icin 0'a basin");
        sayi=scanner.nextInt();
        toplam+=sayi;

        while (sayi!=0){
            System.out.println("Lutfen toplamak icin bir sayi yazin \nBitirmek icin 0'a basin");
            sayi=scanner.nextInt();
            toplam+=sayi;

        }
        System.out.println(toplam);


    }





}
