package day07_switchStatements_StringManipulations;

import java.util.Scanner;

public class C01_SwitchStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yazdirmak istediğiniz ayin ilk harfini giriniz");


        String numara = scanner.next().toUpperCase();

        switch (numara) {

            case "1":
                System.out.println("Ocak");
                break;
            case "2":
                System.out.println("Subat");
                break;
            case "3":
                System.out.println("Mart veya Mayis");
                break;
            case "4":
                System.out.println("Nisan");
                break;
            case "5":
                System.out.println("Haziran");
                break;
            case "6":
                System.out.println("Temmuz");
                break;
            case "7":
                System.out.println("Agustos veya Aralik");
                break;
            case "8":
                System.out.println("Eylul veya Ekim");
                break;
            case "9":
                System.out.println("Kasim");
                break;
            default:
                System.out.println("Gecersiz harf");
        }

    }
}
