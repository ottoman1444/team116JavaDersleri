package day19_staticKeyword_passByValue;

public class C03_StaticBlok {

    static {
        System.out.println("En ustteki static blok caisti");
    }
    public static void main(String[] args) {

        System.out.println("main method calisti");
    }

    static {
        System.out.println("static blok calisti");
    }
    //static bloklar class calısmaya baslar baslamaz devereye girer. Tum diger kodlardan hatta main methoddan bile once calısırlar.

    //olurda main method calismadan omce ayarlamanız gereken bazı uyarlamalar varsa veya bazı vereable lara baslangıc degerini atamak istiyorsak static bloklar kullanılabilir.

    //birden fazla static blok varsa yukarıdan assagıya dogru sirali oalrak çalistirir.


    static {
        System.out.println("2. static method calisti");
    }
}
