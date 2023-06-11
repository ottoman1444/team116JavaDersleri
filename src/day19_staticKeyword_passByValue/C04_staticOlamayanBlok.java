package day19_staticKeyword_passByValue;

public class C04_staticOlamayanBlok {

    public static void main(String[] args) {
        System.out.println("Main method calisti");
    }

    C04_staticOlamayanBlok obj1 = new C04_staticOlamayanBlok();
    C04_staticOlamayanBlok obj2 = new C04_staticOlamayanBlok();
    C04_staticOlamayanBlok obj3 = new C04_staticOlamayanBlok();

    static {
        System.out.println("Static blok calisti");
    }

    {
        /*
        static olmayan kod blokları objelere baglıdır
        her obje olusturuldugunda static olmayan blok tekrar calisir

        static blok ise sadece 1 kere class ilk calismaya basladiginda calisir

        obje olusturuldugunda constructor icinde yapmak istediginiz
        ama obje icin ihtiyac duydugunuz bir islem varsa
        static olmayan blok kullanilabilir
         */



        //static olmaayn kod blogu
        System.out.println("static olmayan kod blogu calisti");
    }
}
