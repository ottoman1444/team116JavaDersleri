package day05_ifElseStatements;

import java.util.Scanner;

public class C11_IfElseIfStatements {
    public static void main(String[] args) {
        //Soru 3 kullanıcıdan bir sayı alın,
        // sayi 3 ile bölünebiliyorsa "uc ile bölünebilen sayi",
        // hem 3 hem 5 e bölünebiliyorsa süper sayi yazdirin

        /*
        Çoklu if else blokları
        else ile biterse tüm durumları kapsıyor demektir
        ve her durumda bir if body'si calısmayabilir.
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        int girilenSayi = scanner.nextInt();

        if (girilenSayi % 5 == 0 ) {
            System.out.println("bes ile bölünebilen sayi" );
        }else if (girilenSayi % 3 == 0) {
            System.out.println("uc ile bölünebilen sayi");
        } else if (girilenSayi % 3 ==0 && girilenSayi % 5 == 0 ) {
            System.out.println("super");
        }



    }
}
