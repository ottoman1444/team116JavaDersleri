package day05_ifElseStatements;

import java.util.Scanner;

public class C10_IfElseIfStatement {
    public static void main(String[] args) {
/*
   Else-if else-if... birbirine bağımlı durum sayisi
   2 den fazla ise kullanılır
   tüm durumlar birbirine bağımlı olduğundan
   Sadece bir tanesi calışır, ötekiler çalışmaz
 */

        // || veya (or) operatörü iyimserdir. herhangi bir şey 1 olursa 1 olur.
        // Sayı doğrusunda istenmeyen kümeler 2 küme olduğu için istenmeyen
        // aralıkta || veya operatörü kullanılır.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");

        double not = scanner.nextDouble();

        if (not<0 || not >100){
            System.out.println("Gecersiz not");
        } else if (not>=85) {
            System.out.println("Notunuz AA");
        } else if (not>=65) {
            System.out.println("Notunuz BB");
        } else if (not>=50) {
            System.out.println("Notnuz CC");
        } else {
            System.out.println("Notnuz DD, kaldiniz");
        }


    }
}
