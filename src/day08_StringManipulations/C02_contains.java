package day08_StringManipulations;

public class C02_contains {
    public static void main(String[] args) {

        /*
        Conteins methodu bir yazı parçacığının başka bir yazı içerisinde olup olmadığını kontrol eder.

        eğer içeriyorsa true icermiyorsa false cevabını verir(döndürür)
         */
        String str = "Java ile hersey cok kolay";

        System.out.println(str.contains("java")); // false //case sensitive
        System.out.println(str.contains("Java")); // true

        String arananKelime = "cok";

        System.out.println(str.contains(arananKelime)); // true sadece üstteki yapıyı dinamiklestirdik

        String olmayanKelime = "Deniz";

        System.out.println(str.contains(olmayanKelime)); //false

        System.out.println(str.contains("a")); //true

        System.out.println(str.contains(" ")); //true

        System.out.println(str.contains("")); // true hiçlikde heryerde var




    }


}
