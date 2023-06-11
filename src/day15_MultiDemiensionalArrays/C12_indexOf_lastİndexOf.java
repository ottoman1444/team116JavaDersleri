package day15_MultiDemiensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C12_indexOf_lastİndexOf {
    public static void main(String[] args) {

        int[] sayilar = {3, 5, 6, 3, 1, 2, 5, 7, 5, 3, 4, 2, 3, 5, 6};
        List<Integer> sayilarList = new ArrayList<>();

        for (int i = 0; i <sayilar.length ; i++) {
            sayilarList.add(sayilar[i]);
        }
        System.out.println(sayilarList); //[3, 5, 6, 3, 1, 2, 5, 7, 5, 3, 4, 2, 3, 5, 6]

        System.out.println(sayilarList.indexOf(5)); //1 ilk buldugu 5 in indexini dondurdu

        System.out.println(sayilarList.lastIndexOf(5)); //13

        System.out.println(sayilarList.indexOf(9)); //-1

        System.out.println(sayilarList.lastIndexOf(9)); //-1 olmayan bisey dondurunce -1 donuyor.


    }
}
