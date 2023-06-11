package day07_switchStatements_StringManipulations;

public class C07_Contains {
    public static void main(String[] args) {

        String str = "Java ogren offer al 1";

        // str' da a harfi varmı?

        System.out.println(str.contains("a")); //true
        System.out.println(str.contains("1")); //true

        System.out.println(str.contains("Offer")); // false bizdeki kucuk o
        System.out.println(str.contains("offer")); // true

        //char aratabilirmiyiz?

        // System.out.println(str.contains('e')); charsequance lazım,
        // contains methodu boolean bir ifade döndürür
    }
}
