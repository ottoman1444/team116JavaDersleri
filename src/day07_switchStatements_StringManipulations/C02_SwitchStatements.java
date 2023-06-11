package day07_switchStatements_StringManipulations;

import java.util.Scanner;

public class C02_SwitchStatements {
    public static void main(String[] args) {

        //  Soru2-  Kullanicidan ay numarasını alin, o ayin hangi mevsimde oldugunu yazidirn
        //          o ayin hangi mevsimde oldugunu yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir ay numarasi girin");


        int ayNo= scanner.nextInt();

        switch (ayNo){

            case 12:
            case 1 :
            case 2 :
                System.out.println("Kis");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("IlkBahar");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("Yaz");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("SonBahar");
                break;
            default:
                System.out.println("Gecersiz ay numarasi");
        }
    }
}
