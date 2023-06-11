package day17_Constructors;

public class C04_HastaneRunner {

    public static void main(String[] args) {

        C03_Hatane per1 = new C03_Hatane();

        /*
        biz int obje olusturduhumuzda java once bu constructor'un varligini teyit eder.
        Constructor varsa istenen objeyi olusturur. İstenen obje olusturulunca instance olan
        butun variable'ların kopyasını olusturur ve objeye yeni bir atama yapmadigimiz muddetce
        objenin olusturdugu classdaki ilk degerleri kullanir

        obje uzerinden static variable'larra ulasmak istedigimizde
        java once objeye gider, o objeye iliskilendirilen bilgilerde istenen
        variable ı buylamazsa class seviyesinde static variablelara ulasır
        static variablelar classa baglıdır ve degistirilirse tum objeler
        icin degisiklik gecerli olur.
         */

        System.out.println(per1.personelIsmi);
        per1.personelTuru="Doktor";
        System.out.println(per1.maas("Doktor"));
        // burada yeni bir onje olusturdu ve intnace variablelların kopyasini olusturur.




        C03_Hatane per2 = new C03_Hatane();
        // java once bu contrsctorun var olup olmadıgını kontrol eder daha donra objeyi
        // olusturup classdaki inctanse variablelların kopyasını olusturup yapıstırır.
        System.out.println(per2.personelTuru);
        // buradada aynı sekilde yeni obje olusturularak yeniden kopyalama islemi yapılır.

        System.out.println(per1.hastaneAdi);
        per2.hastaneAdi = "Java Hastanesi";
        System.out.println(per1.hastaneAdi);


    }

}
