package day05_ifElseStatements;

import java.util.Scanner;

public class C05_Ifstatements {
    public static void main(String[] args) {
        //Soru4- Kullanıcıdan ucgenin 3 kenar uzunlugunu alin,
        //       ucgen eskenar ise "Eskenar ucgen" yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();



        if (kenar1 == kenar2 && kenar2 ==kenar3 && kenar1>0){
            System.out.println("Girilen degerler eskenar ucgen olusturur");
        }





    }



}
