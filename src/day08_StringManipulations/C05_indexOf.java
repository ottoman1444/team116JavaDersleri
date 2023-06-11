package day08_StringManipulations;

public class C05_indexOf {

    public static void main(String[] args) {


        String str = "Java en en iyisi";


        System.out.println(str.indexOf("e")); //5
        System.out.println(str.indexOf("a")); // 1    iki tane olursa ilk öncekinin index numarasını getiriyor

        System.out.println(str.indexOf("en")); //5 geldi.

        System.out.println(str.indexOf("yi")); //9
        System.out.println(str.indexOf("iyisi")); //8
        System.out.println(str.indexOf("is")); //10
        System.out.println(str.indexOf("iy")); //8
        System.out.println(str.indexOf("o")); //-1 olmayan bişey icin -1 donuyor
        System.out.println(str.indexOf("en güzeli")); //-1

        System.out.println(str.indexOf("a")); //1
        System.out.println(str.indexOf("a", 1)); // 1 döndü. sağına girilen int index degeri
        // hangi indexden itibaren bakcagına bakar.
        System.out.println(str.indexOf("a", 2)); //3

        System.out.println(str.indexOf("i")); //8
        str.indexOf("i",5); //8   5den baslayincada 8. indexde olan i yi buluyor.
        System.out.println(str.indexOf("i", 9)); //10
        System.out.println(str.indexOf("i", 11)); //12

        //Verilen bir cumlede, istenen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin
        // 1- aradiginiz kelime cumlede 1 kere kullanilmis
        // 2- aradiginiz kelime cumlede 2 kere veya daha fazla kullanilmis

        // Java en iyisi icersinde "en" kelimesi icin
        // str.indexOf("en")

        if(str.indexOf("en")==-1){
            System.out.println("aradiginiz kelime cumle icerisinde yok");
        } else {
            int birinciKelimeIndex = str.indexOf("en");
            if (str.indexOf("en", birinciKelimeIndex + 1) == 1) {

            } else {
                System.out.println("bu cumlede aradiginiz kelimeden birden cok adet var");
            }
        }
/*
indexOf() methodu aranan yazı parcasını yazı icerisindeki indexini bize cevap olarak dondurur.
 */
    }
}
