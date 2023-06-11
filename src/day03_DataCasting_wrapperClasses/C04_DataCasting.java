package day03_DataCasting_wrapperClasses;

public class C04_DataCasting {
    public static void main(String[] args) {
        int sayi = 10;
        boolean bl= true;
        char chr= 'K';

        //String bir ifade başka türdeki variable veya değerlerle işleme girerse
        // onlarıda stringleştirir.
        String str = sayi+""; //"10"
        System.out.println(str.charAt(0)); //1

        str = bl +""; //öncesine yada sonrasına String bir ifade koyduk ve kabul etti. String kapsayıcıdır.
        System.out.println(str.charAt(1)); // r

        str = chr + "";// "K"
        System.out.println(str.toLowerCase()); //k


    }
}
