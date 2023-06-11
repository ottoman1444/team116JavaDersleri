package day02_DataTurleri_scanner;

public class C01_DataTurleri {
    public static void main(String[] args) {
        boolean b1= true;
        boolean b2= false;
        //boolean b3 ="hello world"; yapılamaz
        //boolean b4 = 5; olmaz

        //char c1= true; olmaz char tek karakter ister
        // char c2="H"; olmaz
        char c3= 'a';
        char c4= '4';
        char c5= '*';
        char c6= ' ';
        //char c7= 'm '; olmaz. tek karakter olmlaı. Boşlukta bir karakterdir.

        String str= "v";
        String str2 ="5";



        int sayi = 5;  //32 bit hafıza
       // short sayi = 5; aynı vereable ismini 1 kere declaration edebiliriz.
        short sayi2 = 5; // 16 bit
        //byte sayi3=355; ben senden byte istiyom sen int veriyon hatası
        byte sayi3= 5;// 8 bit
        long sayi4= 5; // 64 bit hafıza kaplar


        float ond1 = 2.34563222455f; //yanında floatta f yada F yazmamız gerekiyorki java bunu anlasın.
        double ond2 = 3.5651215465158461;

        System.out.println(ond1); //2.3456323  float virgülden sonra 6 hane gösterir. Double da böyle bir sorun yoktur.
        System.out.println(ond2); // 3.565121546515846  double virgülden sonra 16 hane gösterir.

        double d1 = 20;
        double d2= 5;
        System.out.println(d1/d2); // 4.0 ===> 3.99999999 veya 4.00000001 yazabilir.




    }

}
