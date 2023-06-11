package day16_arrayList;

public class C14_MethodOlusturma {
    public static void main(String[] args) {
        // iki sayiyi toplayan ve sonucu donduren bir method
        int a = 12;
        int b = 23;
        System.out.println(toplamaMethodu(1, 5));
        System.out.println(toplamaMethodu(1,9));
    }

    public static int toplamaMethodu (int a, int b){

        int sonuc = 0;

        sonuc = a+b;

        return sonuc;
    }

}
