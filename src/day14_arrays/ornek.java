package day14_arrays;

import java.util.Arrays;

public class ornek { public static void main(String[] args) {
    int[] dizi = {1, 2, 3, 4, 5};

    System.out.println("Dizinin elemanlari:");
    printArray(dizi);
    System.out.println(Arrays.toString(dizi));

    System.out.println("\nElemanlarin kareleri:");
    int[] kareDizi = array1(dizi);
    printArray(kareDizi);

    System.out.println("\nCift sayilarin toplami:");
    int ciftToplam = calculateEvenSum(dizi);
    System.out.println(ciftToplam);
}

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] array1(int[] array) {
        int[] kare = new int[array.length]; //boyut tanımlaması dinamik olsun diye
        for (int i = 0; i < array.length; i++) {
            kare[i] = array[i] * array[i];  //
        }
        return kare;
    }

    public static int calculateEvenSum(int[] array) {
        int ciftSayilarToplami = 0; // cift sayılar toplamı
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                ciftSayilarToplami += array[i];
            }
        }
        return ciftSayilarToplami;
    }
}
