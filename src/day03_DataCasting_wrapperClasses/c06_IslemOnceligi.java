package day03_DataCasting_wrapperClasses;

public class c06_IslemOnceligi {
    public static void main(String[] args) {
        System.out.println(8*5+2*(12/4)-19); //27

        System.out.println(35/5); //7
        System.out.println(20/8);// normalde 2.5 ama java 2 buldu
        // bölünen 2 sayıda int olursa sonucu int olarak yazdırır.i

        double dbl =20;
        System.out.println(dbl/8); //2.5
        // değişkenlerdewn biri double olduğu için double olarak yazdı

        int sayi1 = 20;
        int sayi2 = 8;

        //sayi1/sayi2 yi ondalikli sayi olarak yazdirin

        System.out.println( (double)sayi1/sayi2);  //2 yazdı java double yazmadan önce. şimdi 2.5
        //ondalıklı sayı olamsı için birinin double olması lazım




    }
}
