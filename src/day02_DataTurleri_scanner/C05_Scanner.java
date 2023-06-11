package day02_DataTurleri_scanner;

import java.util.Scanner;

public class C05_Scanner {

    //kullanıcıdan ismini isteyip ismi büuük harfe çevirip kaydedein
    // sonra kullanıcıya yeni halini yazdırın

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String girilenIsim= scanner.nextLine();
        //nextLine yazılan bilginin tümünü getirir.
        // next ise ilk space ye kadar olan kısmını getirir. H Ibrahim ==> H
        girilenIsim= girilenIsim.toUpperCase();


        System.out.println("girilen ismin düzenlenmiş hali: " + girilenIsim);

    }
}
