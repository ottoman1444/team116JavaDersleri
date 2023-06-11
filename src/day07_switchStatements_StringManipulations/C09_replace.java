package day07_switchStatements_StringManipulations;

public class C09_replace {
    public static void main(String[] args) {
        String str = "Javasiz olmaz";

        System.out.println(str.replace('J', 'H')); //Havasiz olmaz
        System.out.println(str.replace("a", "")); //Jvsiz olmz
        System.out.println(str.replace("Javasiz", "X")); // X olmaz
        System.out.println(str.replace("v", "yayayayayay")); //Jayayayayayayasiz olmaz
        System.out.println(str.replace("va", "lalalalla")); //Jalalalallasiz olmaz
        System.out.println(str); //Javasiz olmaz
        //atama olmadıgı sürece yapılan degisiklikler sadece o satır iin gecerlidir. Atama yapılana kadar kalıcı olmaz.

        str = str.replace("va", "lalalalal");
        System.out.println(str); //Jalalalalalsiz olmaz

        // str1 icindeki bosluklari yok edin
        String str1 = "Java ile hayat Cok daha guzel";

        str1.replace(" ", "");
        System.out.println(str1);
        str1 = str1.replace("a", "");
        System.out.println(str1); //JavailehayatCokdahaguzel

        String str2 = "Java hayattir";
        System.out.println(str2.replace("a", "X"));

        /*
        bir yazı içerisinde belli başlı harfkeri istediğimiz karakter veya kelimlerlle değiştirmek için kullanırız.
         */

    }
}
