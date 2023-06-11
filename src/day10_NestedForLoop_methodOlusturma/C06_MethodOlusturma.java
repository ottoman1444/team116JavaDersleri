package day10_NestedForLoop_methodOlusturma;

public class C06_MethodOlusturma {
    public static void main(String[] args) {

        String str = "java'nin robotlari";

        str.toUpperCase();

        /* Eger bir method bize sonuc donduruyorsa
        methodu calıstırmak sonucu gormek icin YETERLİ DEGİLDİR

        sonucu gormek istiyorsak
        - methodCall'u sout icersinde yapariz
        - veya donen bilgiyi bir variable'a kaydeder
        kodumuzda istedigimiz zaman onu yazdirir veya kullaniriz


         */
        System.out.println(str.toUpperCase()); //JAVA'NİN ROBOTLARİ

        str = str.toUpperCase();
    }
}
