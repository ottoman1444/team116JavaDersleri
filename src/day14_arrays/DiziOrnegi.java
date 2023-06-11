package day14_arrays;

import java.util.Arrays;

public class DiziOrnegi {

    static  int[] array ={1,2,3,4,5};

    static int[]arr2 ={1,2,3,4,5};

    public static void main(String[] args) {
        // Dizinin elemanalrını yazdırınız
        // Elemenalrın karesini bulunuz
        // Çift sayıların toplamı

        System.out.println(Arrays.toString(array));

        System.out.println("Array elemanlarının karesi");

        elemanlarinKaresi(arr2);
        ciftSyailariYazdir(array);
    }


    private static void elemanlarinKaresi(int[] array) {


        for (int i = 0; i <= array.length-1 ; i++) {
            array[i]*=array[i];
        }
        System.out.println(Arrays.toString(array));
    }
    private static int ciftSyailariYazdir(int[] arr2) {


        int toplam=0;
        for (int i = 0; i <arr2.length ; i++) {
            if (arr2[i] %2 ==0){
                toplam+=arr2[i];
            }
        }
        System.out.println(toplam);
        return toplam;
    }

}

