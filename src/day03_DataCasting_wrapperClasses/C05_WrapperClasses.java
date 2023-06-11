package day03_DataCasting_wrapperClasses;

public class C05_WrapperClasses {
    public static void main(String[] args) {

        int sayi =10;

        //primitive data türlerinin hazır methodları YOKTUR.
        // Java primitive data turleri ile bazi methodlari kullanabilmemiz için ozel
        // Wrapper Class'lar olusrumus

        Integer sayWrap = 10;
        /*
        Byte
        Short
        Long
        Float
        Double
        Character
        Boolean
        class'ları primitive data türleri ile aynı değerleri alabilir.
        Aynı daya türündeki primitive ve Wrapper Class arasında hiç bir
        casting olmadan atama yapabiliriz
         */

        sayWrap = sayi;
        sayi =sayWrap;


        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Integer.MIN_VALUE); //-2147483648

        String str1 = "34";
        String str2 = "45";

        // bu iki String içindeki sayıların toplamını yazıdırn

        System.out.println(str1 + str2); //3445

        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2)); //79

        char chr = 'm';

        //chr yi büyük harf olarak yazıdırn

        System.out.println(Character.toUpperCase(chr)); // M

        System.out.println(Character.isAlphabetic(chr)); // true
        System.out.println(Character.isDigit(chr)); // false //digit sayı demek

        Double dbl =34.4;
        String doubleStr= "44.3";

        // doubleStr değerinin 5 eksiğini yazdırın

        System.out.println(Double.parseDouble(doubleStr) -5); // 39.3


    }
}
