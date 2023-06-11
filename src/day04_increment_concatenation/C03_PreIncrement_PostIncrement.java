package day04_increment_concatenation;

public class C03_PreIncrement_PostIncrement {

    public static void main(String[] args) {

        int a =10;

        System.out.println(a++);
        // önce a veriableı oluşturur. burada hem yazıdrma hemde arttırma vardır.
        // önce yazdıracak sonra arttıracak.
        // a nın değeri şu an 10 mesela sonrasında arttıracak
        System.out.println(a); //11

        System.out.println(++a); //12
        //buradaada önce arttırma sonra yazdırma var.

        System.out.println(a);//12

        int b = a++; // atama önce sonra arttırma

        System.out.println( "a: " + a + ", b : " + b); // a : 13 , b : 12

        a = --b; // azaltma önce atama sonra

        System.out.println( "a: " + a + ", b : " + b); // a : 11 , b : 11

        int c = a++ + ++b;
        System.out.println(" a: " + a + ", b : " + b + ", c :" + c ); // a : 12 , b : 12 , c :23



        int x = 20;
        System.out.println( "x : " + --x); //19
        // önce azaltma sonra yazdırma

        System.out.println("x : " + x++); //önce yazdır yani x i 19 yaz sonra (arrtırma değişken değeri işlendikten sonra)

        System.out.println(++x); //21 önce değişkeni arttır sonra yazdır.

        int y =  ++x; // 22

        System.out.println( "x: " + x + ", y : " + y); // x : 22, y : 22

        x= --y;

        System.out.println("x : " + x + ", y : " + y); //x : 21, y : 21

        y = x++;
        System.out.println( "x: " + x + ", y : " + y); // x : 22, y : 21

        System.out.println( x++ + ++y); //xi önce yaz y yi önce topla 44


    }
}
