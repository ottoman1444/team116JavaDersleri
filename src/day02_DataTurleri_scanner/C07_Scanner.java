package day02_DataTurleri_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        /*Soru 3 kullanicidan ismini soyismini ve yasini alip
        asşşağidaki formatta yazdirin
        Isminiz: Jhon
        SoyIsminiz: Doe
        Yasiniz: 44
        Kaydiniz basariyla tamamlanmistir.
         */

        Scanner scanner= new Scanner(System.in);

        System.out.println("Lütfen sırasıyla isminizi, soyisminizi ve yaşınızı giriniz.");

        String isim = scanner.nextLine();
        String soyisim= scanner.nextLine().toUpperCase();

        int yas = scanner.nextInt();

        /*
        System.out.println("Isminiz:" + isim);
        System.out.println("Soyisminiz:" + soyisim);
        System.out.println("Yasiniz"+ yas);
        System.out.println("Kaydiniz basariyla tamamlanmistir.");
       */

        System.out.println("Isminiz:" + isim + "\nSoyisminiz:" + soyisim + "\nYasiniz:" + yas + "\nKaydiniz basariyla tamamlanmistir.");

        // bir stringin içerisinde \n koyarsanız alt satıra geçer


    }

}
