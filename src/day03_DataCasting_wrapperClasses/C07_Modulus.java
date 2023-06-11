package day03_DataCasting_wrapperClasses;

import java.util.Scanner;

public class C07_Modulus {
    public static void main(String[] args) {

        System.out.println(20%8);
        System.out.println(656562164%3);

        //kullanıcıdan poztif bir tamsayı alıp
        // birler basamağının karesini yazdırın

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen bir pozitif tamsayi giriniz");
        int girilenSayi = scanner.nextInt();

        System.out.println((girilenSayi%10) * (girilenSayi%10));

        //girilen sayıdan birler basamağını silip kalan sayıyı yazdırın
        // orneğin 213 girildiğinde 21 yazsın

        System.out.println(girilenSayi/10);

    }
}
