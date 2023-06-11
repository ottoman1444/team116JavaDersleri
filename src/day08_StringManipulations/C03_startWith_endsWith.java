package day08_StringManipulations;

public class C03_startWith_endsWith {

    public static void main(String[] args) {

        /*,
        bir yaznın (str), bir yazı parçacığı ile başlayıp başlamadığını test ederek,
        true veya false cevabını verir (döndürür)
         */
        String str = "Java çok eğlenceli";

        System.out.println(str.startsWith("java")); // str java ilemi baslar? false
        System.out.println(str.startsWith("Java")); // true

        System.out.println(str.startsWith(str));// bu yazı kendisiylemi başlar? true her yazı kendisiyle başlar ve kendisiyle biter

        System.out.println(str.startsWith("")); // true hiç bişeylemi başlıyor? herşeyin başında hiçbirşey vardır

        System.out.println("===================");

        /*
        endwith methodu istenilen bir yazı parçacığı ile bi
         */
        System.out.println(str.endsWith("a")); //false
        System.out.println(str.endsWith("eğlenceli")); //true
        System.out.println(str.endsWith("celi")); //true
        System.out.println(str.endsWith("Java çok eğlenceli")); //true
        System.out.println(str.length()); //18

        System.out.println(str.substring(str.length() - 3));
        System.out.println(str.endsWith(str.substring(str.length() - 3))); //true str.substring(str.length() - 3) ----> eli
        // eliylemi başlıyor?



    }
}
