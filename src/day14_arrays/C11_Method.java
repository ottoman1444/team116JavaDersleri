package day14_arrays;

public class C11_Method {
    public static void main(String[] args) {
        // toplama methodu
        // iki sayi girisi
        // bir sayi sonucu

        int yazdircam = toplamaMethodu(5,7);
        System.out.println(yazdircam);
    }

    //ne dondurecek int
    // makinenin icine ne koyulacak ()
    //
    public static int toplamaMethodu (int sayi1, int sayi2){

        int sonuc =0;

        sonuc= sayi1+sayi2;

        return sonuc;

    }
}
