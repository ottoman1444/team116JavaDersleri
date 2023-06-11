package day02_DataTurleri_scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        //Soru 2 kullanıcıdan bir double birde int sayı alıp bunların çarpımını yazdırmak

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ondalikli bir sayi giriniz");
        double ondalikliSayi= scanner.nextDouble();
        System.out.println("Lütfen bir tam sayı giriniz");
        int tamSayi= scanner.nextInt();

        System.out.println("Girilien sayıların toplamı :" +(ondalikliSayi*tamSayi));
        System.out.println("Girilen sayıların çarpımı :" + ondalikliSayi+tamSayi);


    }
}
