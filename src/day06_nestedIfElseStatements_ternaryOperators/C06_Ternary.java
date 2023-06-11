package day06_nestedIfElseStatements_ternaryOperators;

public class C06_Ternary {

    public static void main(String[] args) {

        //Verilen sayi pozitif ise değerini 2 katina cikarin.
        //Negatif ise degerini 10 arttırın

        int sayi = 10;

        sayi = sayi>0 ? 2*sayi : sayi+10 ;
        System.out.println(sayi);
        // ternary bize sonuc verir. Bu sonucu ya direkt yazdirmali yada veriable'a atamaliyiz.

        // sayi cift ise 2 katini yazdirin, tek sayi ise "tek sayi" yadirin.

        sayi ++;
        System.out.println(sayi % 2 == 0 ? 2 * sayi : "teksayi");

        //String str = sayi % 2 == 0 ? 2 * sayi : "teksayi";

        // Eğewr şartın sağlanması yada sağlanmaması durumunda calısacal kodalr
        // farkli data turunde ise atama yaptıramayız.
        // Bu durumda ternary'i sadece yadirabiliriz.

    }
}
