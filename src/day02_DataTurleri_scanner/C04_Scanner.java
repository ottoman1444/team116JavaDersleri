package day02_DataTurleri_scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {
        //kullanıcıdan bir tam sayı isteyin.
        //Girilen sayının 2 katini yazdırın

        // adım 1 Scanner objesi oluşturmak

        Scanner scanner = new Scanner(System.in);

        // adım 2 kullanıcıya ne istediğimiz söyleyin

        System.out.println("Lütfen bir tamsayı giriniz");

        // 3 kullanıcının gireceği data türüne uygun bir variable oluşturun
        // scanner objesi ile variable a uygun hazır methodu kullanıp
        //kullanıcıdan değeri alın ve oluşturduğumuz variable ye atayın

        int girilenSayi = scanner.nextInt();

        System.out.println("Girdiğiniz sayının 2 katı = " + 2*girilenSayi);
    }
}
