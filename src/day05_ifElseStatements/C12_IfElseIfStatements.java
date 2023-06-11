package day05_ifElseStatements;

import java.util.Scanner;

public class C12_IfElseIfStatements {
    //Soru 3 kullanıcıdan bir sayı alın,
    // sayi 3 ile bölünebiliyorsa "uc ile bölünebilen sayi",
    // hem 3 hem 5 e bölünebiliyorsa süper sayi yazdirin
    // ikisinede bolunmeyen sayilar icin YAZİK yazdirin
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int girilenSayi = scanner.nextInt();

        if (girilenSayi % 3 ==0 && girilenSayi % 5 == 0) {
            System.out.println("super");
        }else if (girilenSayi % 3 == 0) {
            System.out.println("uc ile bölünebilen sayi");
        } else if (girilenSayi % 5 == 0 ) {
            System.out.println("bes ile bölünebilen sayi");
        } else {
            System.out.println("Yazık");
        }
    }
}
