package day19_staticKeyword_passByValue;

import java.util.Arrays;

public class C07_PassbyValue {

    public static void main(String[] args) {

        int[] arr = {10,12,23};

        //verilen arrayin tum elementelerini 3 arttırıp yazidarn bir method olusturun
        elamlariArttir(arr); //[13, 15, 26]

        System.out.println("method call'dan sonra arr : " + Arrays.toString(arr));

    }



    public static void elamlariArttir(int[] arr){

        for (int i = 0; i <arr.length ; i++) {

            arr[i]= arr[i]+3;

        }
        System.out.println(Arrays.toString(arr));
    }
}
