package day19_staticKeyword_passByValue;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C08PassByValue {

    public static void main(String[] args) {
        int[] arr ={3,5,7};

        //verilen bir arraye dorduncu bir element olarak 10 ekleyip
        // o halini yazdiran bir method olusturun


        elemanEkle(arr); //[3, 5, 7, 10]

        System.out.println("method call'dan sonra arr : " +Arrays.toString(arr)); //method call'dan sonra arr : [3, 5, 7]

        /*
        Birden faala elman barındıran arrayList gibi java objelerinde java methoda yollarken 
         */
    }

    public static void elemanEkle(int[] arr){

        int[] yeniarr = new int[4];

        for (int i = 0; i < arr.length ; i++) {

            yeniarr[i] = arr[i];

        }
        yeniarr[yeniarr.length-1] = 10;

        arr= yeniarr;

        System.out.println(Arrays.toString(arr));

    }




    }
