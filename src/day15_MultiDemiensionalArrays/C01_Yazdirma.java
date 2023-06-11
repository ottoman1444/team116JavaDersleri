package day15_MultiDemiensionalArrays;

import java.util.Arrays;

public class C01_Yazdirma {
    public static void main(String[] args) {


        /*
        MDA'de yazzdırma  işlemi yaparken yazdırmak istediğimiz işlemin ne olduğuna bakmamız gerekir.
        -elemnt ise direk yazıdrabiliriz
        - tek aktlı bir arrayse arrays.toString methodunu kullanabiliriz.
        - MDA ise Arrays.deepToString()methodunu kullanabiliriz

         */
                           //0    1       2       3
        int [][] arr = {{1,5,9},{3,4},{2,8,1,2},{10}};

        System.out.println(arr[0][0]);
        //ystem.out.println(arr[3][2]); //.ArrayIndexOutOfBoundsException

        System.out.println(arr.length); //4
        System.out.println(arr[2].length); //4

        System.out.println(arr[3].length);

        //  arr[2][1].lenght   bir elemenetlemi bir aarraylemi uğraşıyoruz dikkat etmemiz lazım.

        System.out.println(arr[2]); //[I@3b6eb2ec bize referans yazirir
        System.out.println(Arrays.toString(arr[2])); //[2, 8, 1, 2]

        System.out.println(arr); // [[I@1e643faf  ilk 2 karakterinde iki [ olması iki katlı olduğu anlamına gelir

        System.out.println(Arrays.toString(arr)); //[[I@1e643faf, [I@6e8dacdf, [I@6a5fc7f7, [I@7a79be86]

        System.out.println(Arrays.deepToString(arr)); //[[1, 5, 9], [3, 4], [2, 8, 1, 2], [10]]  deepToString methodu alt arrayleri yazdırır





    }
}
