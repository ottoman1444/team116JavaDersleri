package day11_methodOverloading_whileLoop;

import java.util.Scanner;

public class C06_WhileLoop {

    // kullanicidan toplanmak üzere sayılar alın.
    // Toplam 500 ve üzeri olursa değer almayı durdurup
    // kaç sayı girildiğini ve toplamın kaç olduğunu yazdırın
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sayac = 0;
        int toplam= 0;
        int  sayi= 0;
        while (toplam<500){

            System.out.println("Toplamak icin tam sayi girniz:");
            sayi =scanner.nextInt();
            sayac++;
            toplam+=sayi;

        }
        System.out.println(sayac+" adet sayinin toplami : "+ toplam);
    }

}
