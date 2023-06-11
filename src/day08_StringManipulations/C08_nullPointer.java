package day08_StringManipulations;

public class C08_nullPointer {
    public static void main(String[] args) {

        // String str= null;
        // hic bisey yok ama olusturulacak sıkıntı yapma java demek
        // atama yapılmadıgı icin yazdırma vs islemleri yapılamıyor
        // yinede deger ataması yapılmadan kullanmak istiyorsak null pointer koyuyuoruz.

        // null bir deger degildir. bir pointerdır.
        // non-primitive datalara deger atanmadıgını isaret eder.


        String str = null;
        //str a hala bir deger atanmadı. Javaya bos oldugunu soyledik.
        System.out.println(str); // str hala bos
        // yazırma gibi islemlerde islemin hata vermemesi icin bos degere null pointer ataması yapılır.

        // str.concat("Ali"); //nullPointerException // null olan bir deger ile metodlar kullanılamaz
        //System.out.println(str.length());
        // yok olan birseyin uzunlugu olculemez

        String test = "";
        System.out.println(test.length()); //0 "" kayıt altına alınmıs. kullanılabilir.

        System.out.println(str + "Ali");


        Integer sayi = null;

        // str = null ,,,, test = "";

        // System.out.println(str.isEmpty()); null pointer exeption, olmayan bir seyin olup olmadigini kontrol edemeyiz
        System.out.println(test.isEmpty()); // True

        /*
        null ataması yapılan bir veriable hiç bir methodla kullanılamaz.
        Sadece yazdırılabilir veya + ile kullanılabilir
         */



    }
}
