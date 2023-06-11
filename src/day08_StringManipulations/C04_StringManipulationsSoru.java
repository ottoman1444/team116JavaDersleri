package day08_StringManipulations;

import java.util.Scanner;

public class C04_StringManipulationsSoru {
    public static void main(String[] args) {
        // Soru: kulanıcıdan bir mail alın
        // mail @ içermiyorsa "geçersiz mail"
        // mail @gmail icermiyorsa,"mail gmail olmali"
        // mail @gmail ile bitmiyorsa, "mailde yazım hatası var" yazdırın.

/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir mail giriniz");
        String email = scanner.next();

        if (!email.contains("@")){
            System.out.println("Gecersiz mail");
        }

        if(!email.contains("@gmail")){
            System.out.println("mail gmail olmali");
        }
        if (!email.endsWith("@gmail.com"));
        System.out.println("mailde yazim hatasi var");
  */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir mail giriniz");
        String email = scanner.next();



        // eğer testlerin kademeli olarak yapılmasını istiyorsak if-else kullanılabilir
        if (!email.contains("@")){
            System.out.println("Gecersiz mail");
        }else if (!email.contains("@gmail")){
            System.out.println("mail gmail olmali");
        }else if (!email.endsWith("@gmail.com"));
        System.out.println("mailde yazim hatasi var");

        // switchCase ise durumlarda kullanılır mesela a b c d e f g h gibi durumşar olduğunda düğmeye basar gibi.
    }
}
