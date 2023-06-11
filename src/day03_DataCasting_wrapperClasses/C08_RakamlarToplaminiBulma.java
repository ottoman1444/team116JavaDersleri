package day03_DataCasting_wrapperClasses;

import java.util.Scanner;

public class C08_RakamlarToplaminiBulma {
    public static void main(String[] args) {

        //Kullanıcıdan 3 basamaklı pozitif bir tamsayı alıp
        //sayının rakamları toplamını yazdırın
        // orneğin 213 girildiğinde 6 yazdırsın

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen 3 basamaklı pozitif bir sayı giriniz");

        int sayi = scanner.nextInt();
        int birlerBas=0;
        int rakamlarToplami=0;


        birlerBas = sayi%10;
        rakamlarToplami= rakamlarToplami+birlerBas;

        //sayi 213 birler basamağı 3 olarak geldi. rakamlar toplamı 3 oldu

        sayi=sayi/10;  // 213 /10 ==>21

        birlerBas = sayi%10; // 21%10 ==> 1
        rakamlarToplami= rakamlarToplami + birlerBas; // 3+1 =4

        sayi = sayi/10; //   21/10 ==>  2

        birlerBas = sayi %10; //2%10 =2
        rakamlarToplami = rakamlarToplami + birlerBas; // 4+2 =6

        System.out.println("Girilen sayinin rakamalri toplami: "+ rakamlarToplami); 



    }
}
