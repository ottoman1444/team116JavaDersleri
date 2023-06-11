package day15_MultiDemiensionalArrays;

import java.util.Arrays;

public class C03_MDA {
    public static void main(String[] args) {
        // Soru 2- Veilen 2 katli bir array'de ayni index'e sahip elementleri toplayip
        //         yeni olusturacağımız tek katli bir array'e bu toplamlari atayin.
        //         input  :      int[][] arr = {{3,4,5}, {2,3,6,7}};
        //         output :                       [5, 7, 11]

        // once ortak index dediği için kısa olanın uzunlugunu belirlemek lazım
        int[][] arr = {{3,4,5}, {2,3,6,7}};

        int uzunluk = arr[0].length<arr[1].length ? arr[0].length : arr[1].length ;
        
        int[] ortakElementArr = new int[uzunluk];

        for (int i = 0; i <ortakElementArr.length ; i++) {
            ortakElementArr[i] =arr[0][i]+arr[1][i];
        }

        System.out.println(Arrays.toString(ortakElementArr));
        //[5, 7, 11]
    }
}
