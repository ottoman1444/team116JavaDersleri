package day02_DataTurleri_scanner;

import java.util.Scanner;

public class C08_Scanner {
    // Soru 5 kullanıcıdan ismini, soyismini ve yasini alip
    // assağidaki formatta yazdirin
    // girilen bilgiler : J Doe,44

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Lütfen sırasıyla isminizi, soyisminizi ve yaşınızı giriniz.");

        String isimIlkHarf = scanner.nextLine().toUpperCase();
        String soyisim= scanner.nextLine();

        int yas = scanner.nextInt();

        System.out.println("girilen bilgiler"+ isimIlkHarf + " " + soyisim + ", " + yas);

    }
}
