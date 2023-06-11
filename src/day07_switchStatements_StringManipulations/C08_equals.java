package day07_switchStatements_StringManipulations;

public class C08_equals {
    public static void main(String[] args) {

            String str1 = "Java";
            String str2 = "Java";
            String str3 = "java";
            String str4 = "JAVA";
            String str5 = "JaVa";
            String str6 = new String("Java");
            // Normalde non-primitive data turundeki objeler, new keyword'u ile olusturulur
            // String'i de new keyword'u ile olusturabiliriz
            // ancak java bizim işimizi kolaylaştırmak için
            // String'e direk geger atanmasını da saglanmıstır.

        System.out.println(str1.equals(str2)); // true  str1 str2 ye eşitmi?
        System.out.println(str1.equals(str3)); // false str1 str3 e eşit degil
        System.out.println(str4.equals(str5)); // false
        System.out.println(str2.equals(str6)); // true
        /*
        equals methodu verilen 2 stringin metin olarak aynı olup olmadigina bakar
        case sensitive'dir. Dolayisiyla buyuk kucuk harf farklarina dikkat edilmelidir.
         */

        //string icin == kullanılamazmi ?
        System.out.println(str1 == str2); // true Java == Java
        System.out.println(str1 == str3); // false
        System.out.println(str1 == str6);  // false Java == Java

        /*
        equals methodu sadece degerlere bakar.
        Metin aynı ise sonuç true. Metin farklı ise sonuc false olur.

        == ise hem metin degerine hemde referansa bakar
        ilerde anlatacagımız uzere java bazen aynı refereansları farklı objelerede verir.,
        bu konuyu ilerde detaylandıracagız.

        SIMDILIK
        iki Stringin metin olarak ayni oldugunu kontrol etmek isterseniz equals methodu kullanmalisiniz.

         */
    }
}
