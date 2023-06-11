package day05_ifElseStatements;

import java.util.Scanner;

public class C04_IfStatements {

    // verilen bir sayinin 2,3,5,7,11 ve 23 sayilarindan kaç tanesine kalansız olarak bölünebildigini yazdirin
    // kullanıcı 30 dediğinde output: 3

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int girilensayi = scanner.nextInt();
        int sayac=0;


        if (girilensayi%2==0) sayac++;
        if (girilensayi%3==0) sayac++;
        if (girilensayi%5==0) sayac++;
        if (girilensayi%7==0) sayac++;
        if (girilensayi%11==0) sayac++;
        if (girilensayi%23==0) sayac++;

        System.out.println("Girilen sayi, istenen sayilardan " + sayac + " tanesine tam bolunebiliyor.");



    }
}
