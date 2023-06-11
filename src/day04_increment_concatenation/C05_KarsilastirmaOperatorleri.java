package day04_increment_concatenation;

public class C05_KarsilastirmaOperatorleri {

    public static void main(String[] args) {

        int a= 10;
        int b = 20;

        //a= b; // b nin değerini a ya atama yapar
        //System.out.println( a = b ); // burda iki işlem yaptı. b nin değeriai a ya atauıp a yı yazdırdı

        //System.out.println(a);
        //System.out.println(b);

        // karşılaştırma operatörleri
        // 2 variable i karşılaştırıp
        //istenen şart sağlanıyorsa true
        //şart sağlanmıyorsa false değerini üreten
        //operatörlerdir

        //a b'ye eşitmi ?

        System.out.println(a == b); //false

        System.out.println(2*a == b); //true

        System.out.println( a == b/2); // true

        //a b'nin eşit olmadığını kontrol edin

        System.out.println( a != b); //true

        System.out.println( a != b/2); // false

        //a beden küçükmü?

        System.out.println( a<b); // true

        System.out.println(a < b/2); //false

        // a b'den küçük değil şartını kontrol edelim
        // a büyüktür b yi kast etmiyor burda a küçük değil b lazım

        System.out.println(  !(a<b) ); //false

        // a b'den kucuk veya esitmi ?

        System.out.println( a<=b); //true

        System.out.println( 2*a <= b); //true

        //a b'den büyükmü?

        System.out.println( a>b); //false

        System.out.println(5*a > 2*b); // true

        boolean c = 2*a >= b; // matematiğe göre saçma gözüken bu ifadede atama var.
        // önce eşitliğin sağını yapmamız lazım. sağında ise bir karşılaştırma operatörü var.
        // o halde 2 a yı önce sona b yi sonra karşılaştırma yapıpı true değerini c ye atama yapacak.


        // a'nın 3 katının b'den büyük olmadığı şartını kontrol edin

        System.out.println( !(a*3>b)); //false
    }
}
