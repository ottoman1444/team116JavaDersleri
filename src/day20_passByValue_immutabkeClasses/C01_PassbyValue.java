package day20_passByValue_immutabkeClasses;

public class C01_PassbyValue {

    public static void main(String[] args) {
        int sayi = 20;

        sayi =method2(sayi);

        System.out.println("Method2 call sonucu : " + method2(sayi));

        System.out.println("Method call sonucu : " + method1(sayi));

        System.out.println("method sonrasi sayi :" + sayi);

        System.out.println(method1(sayi));


    }



    public static int method1(int sayi){

        sayi=25;
        System.out.println("Method icinde sayi : " +sayi);

        return sayi;
    }

    public static int method2(int sayi){

        sayi=25;
        System.out.println("Method icinde sayi : " +sayi);

        return sayi;
    }
}
