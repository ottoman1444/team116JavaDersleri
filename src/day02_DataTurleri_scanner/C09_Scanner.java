package day02_DataTurleri_scanner;

import java.util.Scanner;

public class C09_Scanner {
    //Soru 7 (Interview)- kullanicinin iki sayi alip
    //                   ikisinin değerlerini değiştirin(swap)
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen ilk sayıyı giriniz");
        double sayi1= scanner.nextDouble();

        System.out.println("Lütfen ikinci sayıyı giriniz");
        double sayi2= scanner.nextDouble();

        double temp=0;
        // mesela sayi1 = 10, sayi2= 20, temp=0
        temp=sayi2;
        // sayi1 =10 sayi2 = 20 temp=20
        sayi2=sayi1;
        // sayi1=10 sayi2= 10 temp = 20
        sayi1=temp;
        // sayi1=20 sayi2= 10 temp = 20
        System.out.println("Sayilarin değerlerini değistirdim" + "\nartik sayi1 : " + sayi1 + "sayi2 :" + sayi2);




    }
}
