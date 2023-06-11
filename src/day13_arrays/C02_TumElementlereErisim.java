package day13_arrays;

import java.util.Arrays;

public class C02_TumElementlereErisim {

    public static void main(String[] args) {
        /*
          Bir arrayi yazdırmak ile elementleri yazdırmak farklıdır.
          bir arrayi yazdırmak istersek Arrays.toString() ile yazdırırız
          Standart olarak iki tarafında köşeli paranetz olur
          aralarındada , ve space olur

          Elementleri yazdırmak istediğimizde loop kullanırız
          ve nasıl yazdıracağımızı bize bağlı olur
         */

        int[] arr = {2,4,6,8,1,3,8,2};

        //bu arrayi yazdırın

        System.out.println(Arrays.toString(arr)); //[2, 4, 6, 8, 1, 3, 8, 2]

        //arrayin tum elementlerini yan yana aralarında - olacak sekilde yazdırın

        System.out.print(arr[0]+"-");
        System.out.print(arr[1]+"-");
        System.out.print(arr[2]+"-");
        System.out.print(arr[3]+"-");
        System.out.print(arr[4]+"-");
        System.out.print(arr[5]+"-");
        System.out.print(arr[6]+"-");
        System.out.print(arr[7]); //2-4-6-8-1-3-8-2

        System.out.println("");

        for (int i = 0; i < arr.length -1 ; i++) {
            System.out.print(arr[i]+"-");
        }
        System.out.println(arr[arr.length-1]); //2-4-6-8-1-3-8-2
    }
}
