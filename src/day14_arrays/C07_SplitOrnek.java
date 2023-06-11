package day14_arrays;

import java.util.Arrays;

public class C07_SplitOrnek {
    public static void main(String[] args) {
        String str = "Java yilin bu zamanlarinda bir baska guzel oluyor. Java olmadan java ogrenilmez";

        // Kac tane "java" var ?

        //1 kelimeleri ayır
        //2 loop ile kontrol et
        //3 kac tane
        String[] arr = str.split(" ");// donen array kaydedilmedi
        System.out.println(Arrays.toString(arr)); //[Java, yilin, bu, zamanlarinda, bir, baska, guzel, oluyor., Java, olmadan, java, ogrenilmez]

        int sayac=0;

        // loop ile arrayin butun elemanlarına ulasıp check yaptırdık
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].equalsIgnoreCase("java")){
                sayac++;
            }

        }
        System.out.println("Java kelimesi = "+sayac);
    }
}
