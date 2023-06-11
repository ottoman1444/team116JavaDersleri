package day05_ifElseStatements;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {


        // Soru 3 kullanıcıdan bir sayı alın,
        // sayi 3 ile bölünebiliyorsa "uc ile bölünebilen sayi",
        // 5 ile bölünebiliyorsa "Bes ile bolunebilen sayı" yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        int girilenSayi = scanner.nextInt();

        if (girilenSayi % 3 == 0 ) System.out.println("3 ile bolunebilen sayi");
        if (girilenSayi % 5 == 0 ) System.out.println("5 ile bolunebilen sayi");

    }
}
