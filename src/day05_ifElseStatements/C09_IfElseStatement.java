package day05_ifElseStatements;

import java.util.Scanner;

public class C09_IfElseStatement {
    public static void main(String[] args) {

        // Soru-5 Kullanıcıdan bir harf isteyin
        //        girilen karakter kucuk harf ise onun buyuk harf olarak yazdırın
        //        yoksa girilrn harfi yazdırın

        Scanner sanner = new Scanner(System.in);

        System.out.println("Lutfen bir harf giriniz");

        char karakter = sanner.next().charAt(0);

        if('a'<=karakter && karakter <= 'z'){
            System.out.println("Girilen kucuk harfin yeni hali : " + Character.toUpperCase(karakter));

        }else {
            System.out.println("girilen karakter : " + karakter);
        }

    }
}
