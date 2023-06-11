package day17_Constructors;

public class C02_ConstructorRunner {

    public static void main(String[] args) {
        // Bu classdan C01 classındaki variable ve methodlara ulasmak istiyorum
        // Variable ve methodlara ulasmak istiyorum

        // Baska class'daki static class uyelerine
        //ulasmak icin

        System.out.println(C01_Constructors.isHappy);
        C01_Constructors.staticMethod();


        // staitc olmayan class uyelerine ulasmak icin o classdan obje olusturmamiz lazim

        C01_Constructors obje = new C01_Constructors();

        // bastaki C01_Constructors ==> class adi ve objenin data turudur.
        // obje ==> objenin adi
        // new ==> yeni obje olusturmak icin keyword
        // C01_Constructors() ==> Constructor
        /*
        Bir objenin olusturulmasi ve ilk deger atamasinin buna (initialize)
        yapilmasi icin mutlaka constructor calismalidir

        Java bir class olusturuldugunda
        o classdan obje olusturulabilmesi icn
        her class a otomatik oalrak
        default bir constructor yerleştirir

        bu default constructor'lar gorunmez
         */


        System.out.println(obje.str);
        obje.sayi = 20;
        obje.staticOlmayanMethod();

    }

}
