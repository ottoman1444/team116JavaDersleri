package day09_StringMaipulation_forLoop;

import java.util.Scanner;

public class C01_StringManipulation {
    public static void main(String[] args) {
        // Sori 1 : kullanicidan bir cumle alin
        //          -cumlede ev geciyorsa, "home home sweet home" yazdirin
        //          -cumlede is geciyorsa, "calismak guzeldir"
        //          - ikisinide iceriyorsa "Hem ev lazim hem is"
        //          - hicbirini icermiyorsa "cok calisman lazim" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle girin");
        String cumle = scanner.nextLine().toLowerCase();

        //if-else kullanmaliyiz, en kisitlayici olandan balayalim

        if (cumle.contains("ev") && cumle.contains("is")){
            System.out.println("hem ev lazim hem is ");
        } else if (cumle.contains("ev")) {
            System.out.println("home home sweet home");
        }else if (cumle.contains("is")) {
            System.out.println("calismak guzel");
        }else System.out.println("cok calisman lazim");
    }
}
