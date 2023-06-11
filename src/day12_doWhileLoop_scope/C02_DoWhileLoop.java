package day12_doWhileLoop_scope;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Do while loop kontrol etmeden önce bir kere loop u çalıştırır.

        while loop da loop bodysinin hiç çalışmama ihtimali vardır
        do-while loopda loop bodysinin hiç çalışmama ihtimali YOKTUR
        loop bodysi en az 1 kere çalışır
         */

        // kullanicidan sayidegerleri alip toplayalim
        // kullanici 0 a bastıgında islem bitsin
        // ve toplami yazdirsin

        Scanner scanner = new Scanner(System.in);
        int sayi=1;
        int toplam=0;


do {
    System.out.println("Lutfen toplamak icin bir sayi yazin \nBitirmek icin 0'a basin");
    sayi=scanner.nextInt();
    toplam+=sayi;
}while (sayi!=0);

    }
}
