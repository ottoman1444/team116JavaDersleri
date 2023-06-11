package day05_ifElseStatements;

import java.util.Scanner;

public class C06_IfStatements {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan notunu alin
        //        50 veya daha buyukse "sinifi gectin",
        //        50'den kucukse "Malesef kaldin" yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");

        double not = scanner.nextDouble();

        if(not>=50) System.out.println("sinifi gectin");

        if(not<50) System.out.println("malesef sinita kaldin");

        // önceki sorulardan farklı olarak iki if birbieine bağımlıdır.
        // iki if den sadece biri çalışır.
        // ikisinin birden çalışma durmu yoktur.
        // ikisinin birden çalışmama durumuda yoktur.

        if(not>=50) {
            System.out.println("sinifi gectin");
        }
        else {
            System.out.println("malesef sinita kaldin");
        }
        // if ve else bodyleri tek bir şarta bağımlıdır
        // iki if den sadece 1'i çalışır.
        // ikisinin birden çalışma durmu yoktur.
        // ikisinin birden çalışmama durumuda yoktur.





    }
}
