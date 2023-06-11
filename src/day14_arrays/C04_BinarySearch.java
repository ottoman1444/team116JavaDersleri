package day14_arrays;

import java.util.Arrays;

public class C04_BinarySearch {
    public static void main(String[] args) {

        //sort yapmadan once
        int[] arr = {2,3,4,5,2,4,43,6,6,8,8,0,5,6,7,4,1};

        System.out.println(Arrays.binarySearch(arr,6)); //8
        System.out.println(Arrays.binarySearch(arr,9)); //-18


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[0, 1, 2, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 7, 8, 8, 43]

        System.out.println(Arrays.binarySearch(arr,2)); //3
        System.out.println(Arrays.binarySearch(arr,3)); //4
        System.out.println(Arrays.binarySearch(arr,4)); //5
        System.out.println(Arrays.binarySearch(arr,5)); //8
        System.out.println(Arrays.binarySearch(arr,6)); //12

        System.out.println(Arrays.binarySearch(arr,31)); //-17
        // olmayan bir sayi arattigimiz zaman, olsaydi surada olurdu degerini eksi olarak veriyor.
        // Elemanlari saymaya birden baslıyor

    }
}
// varmı yokmu sorusuna cevap verir. Birden fazla degerde olabilir.