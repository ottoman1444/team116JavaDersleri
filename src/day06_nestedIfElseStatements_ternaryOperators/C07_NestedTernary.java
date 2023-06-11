package day06_nestedIfElseStatements_ternaryOperators;

import java.util.Scanner;

public class C07_NestedTernary {

    public static void main(String[] args) {
        // kullanicidan bir tam sayi alin
        // sayi pozitifse, cift sayi veya  cift sayi degil seceneklerinden uygun olani yazdirin
        // sayi pozitif degilse, 3 basamakli veya 3 basamakli degil secenekklerinden uygun olani yazdirim

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");

        int sayi = scanner.nextInt();

        System.out .println( sayi>0
                ?
                sayi%2 == 0 ? "Cift sayi " : "Cift sayi degil"
                :
                sayi>=-999 && sayi<=-100 ? "Syi uc basamakli" : "Uc basamakli degil"
                );

        //sayi>0 ? sayi%2 == 0 ? "Cift sayi " : "Cift sayi degil" : sayi>=-999 && sayi<=-100 ? "Syi uc basamakli" : "Uc basamakli degil" );

        //bu sekilde yazmak hem karmasik hemde anlasılır degil. Bizim kodun ne oldugunu anlamamiz lazim.
    }
}
