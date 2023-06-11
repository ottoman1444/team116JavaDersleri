package day21_dateTime_varags;

public class C06_Varags {

    public static void main(String[] args) {

        //iki tamsayiyi toplayip yazidran bir method olusturun

        topla(15,6);
        topla(15,20,25);
        topla(10,13,44,35);
        // topla(12,14,14,12,23);

    }

    private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println("sayilarin toplami :" + (sayi1+sayi2+sayi3 + sayi4));
    }

    private static void topla(int sayi1, int sayi2, int sayi3) {
        System.out.println("sayilarin toplami :" + (sayi1+sayi2+sayi3));
    }

    private static void topla(int sayi1, int sayi2) {
        System.out.println("sayilarin toplami : " + (sayi1+sayi2));
    }


}
