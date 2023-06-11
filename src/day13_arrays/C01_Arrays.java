package day13_arrays;

import java.util.Arrays;

public class C01_Arrays {

    public static void main(String[] args) {


        String[] arr1 = {"Ayten", "Sevda", "Adem"};

        //Arrayi yazdırmak istersek
        //Arrays classından toSteing() kullanmalıyız


        System.out.println(arr1); //[Ljava.lang.String;@3b6eb2ec

        //arraylerde birden fazla element barındırdığı zaman direk yazdıramayız.

        System.out.println(Arrays.toString(arr1));//[Ayten, Sevda, Adem]

        /*
           Köşeli parantez içinde elementleri yazdırır.
           elementler arasında 1 , ve 1 space bırakır. Bu bir standarttır.

         */

        // bir arrayin uzunluğuna ulaşmak istersek
        System.out.println(arr1.length);// 3 arrayin uzunuğudur. içinde kaç element olduğunu gösterir.
        //lenght method değil variable dır. method olsaydı yanında () olurdu.

        int[] arr2 = new int[6];

        System.out.println(Arrays.toString(arr2)); //[0, 0, 0, 0, 0, 0]

        arr2[0] = 5;
        arr2[3] = 9;
        arr2[4] = 1;

        System.out.println(Arrays.toString(arr2)); //[5, 0, 0, 9, 1, 0]




    }
}
