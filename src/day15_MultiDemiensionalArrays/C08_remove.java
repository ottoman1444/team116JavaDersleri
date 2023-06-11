package day15_MultiDemiensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C08_remove {
    public static void main(String[] args) {
/*
Eger listemiz sayilardan olusuyorsa java girilen sayi indexmi yoksa objemi diye dusunmez.Direk index olarak kabul eder.

İllada objeyi vermek isterseniz
once silmek istediginiz objeyi olusturup
sonra Integer degeri degil, obje ismini yazdirarak remove edebilirsiniz

Eger silmek istedeigimiz obje birden fazla ise ilkini siler
 */
        int[] sayilar = {3, 5, 6, 3, 1, 2, 5, 7, 5, 3, 4, 2, 3, 5, 6};
        // eğer uzun bir liste oluşturmak istiyorsak
        // bir aray olusturup loop ile tum elementleri olusturdugumuz list'e ekleyebiliriz
        List<Integer> sayilarList = new ArrayList<>();

        for (int i = 0; i <sayilar.length ; i++) {
            sayilarList.add(sayilar[i]);
        }

        System.out.println(sayilarList); //[3, 5, 6, 3, 1, 2, 5, 7, 5, 3, 4, 2, 3, 5, 6]

        System.out.println(sayilarList.remove(5)); //2

        System.out.println(sayilarList); //[3, 5, 6, 3, 1, 5, 7, 5, 3, 4, 2, 3, 5, 6]

        System.out.println(sayilarList.remove(1)); //5

        System.out.println(sayilarList); //[3, 6, 3, 1, 5, 7, 5, 3, 4, 2, 3, 5, 6]

        Integer silinecekObje = 5;

        System.out.println(sayilarList.remove(silinecekObje)); //true

        System.out.println(sayilarList);//[3, 6, 3, 1, 7, 5, 3, 4, 2, 3, 5, 6] ilk buldugu 5 i sildi
    }
}
