package day05_ifElseStatements;

import java.util.Scanner;

public class C02_IfStatement {

    //Soru2- kullanıcıdan bir harf alın. Harf ile başlayan ay varsa yazdırın.
    //       not buyuk harf kucuk harf hassasiyeti olmasın
    //       kullanıcı o veya O yazdırdığında output Ocak olsun

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yazdirmak istediğiniz ayin ilk harfini giriniz");

        char ilkHarf= scanner.next().toUpperCase().charAt(0);

        if (ilkHarf == 'o' || ilkHarf == 'O') System.out.println("Ocak");
        if (ilkHarf == 's' || ilkHarf== 'S') System.out.println("Subat");
        if (ilkHarf == 'M') System.out.println("Mart veya Mayis");
        if (ilkHarf == 'N') System.out.println("Nisan");
        if (ilkHarf == 'H') System.out.println("Hziran");
        if (ilkHarf == 'T') System.out.println("Temmuz");
        if (ilkHarf == 'A') System.out.println("Agustos");
        if (ilkHarf == 'E') System.out.println("Eylul veya Ekim");
        if (ilkHarf == 'K') System.out.println("Kasim");

    }
}
