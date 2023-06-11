package day15_MultiDemiensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C09_IstenenBirElmentinTumKullanimlariniSilme {
    public static void main(String[] args) {

        /*
        java'da
        get methodları bize bilgi getirir
        set() methodlari ise Update yapar, var olan bir elementin degerini desgistirir.

         */
        int[] sayilar = {3, 5, 6, 3, 1, 2, 5, 7, 5, 3, 4, 2, 3, 5, 6};
        List<Integer> sayilarList = new ArrayList<>();

        for (int i = 0; i <sayilar.length ; i++) {
            sayilarList.add(sayilar[i]);
        }
        System.out.println(sayilarList); //[3, 5, 6, 3, 1, 2, 5, 7, 5, 3, 4, 2, 3, 5, 6]

        Integer silinecekElement = 5;

        while (sayilarList.contains(silinecekElement)){
            sayilarList.remove(silinecekElement);
        }
        System.out.println(sayilarList); //[3, 6, 3, 1, 2, 7, 3, 4, 2, 3, 6]

        System.out.println(sayilarList.set(0, 10)); // 3 eski elemanı belki kullanmak istersin diye getirdi

        System.out.println(sayilarList); //[10, 6, 3, 1, 2, 7, 3, 4, 2, 3, 6]

        System.out.println(sayilarList.set(2, 0)); //3

        System.out.println(sayilarList); // [10, 6, 0, 1, 2, 7, 3, 4, 2, 3, 6]



    }
}
