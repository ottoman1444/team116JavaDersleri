package day09_StringMaipulation_forLoop;

import java.util.Scanner;

public class C07_ForLoop {
    public static void main(String[] args) {
        /*
        Verilen iki sayi ve aralarındaki tüm tam sayıları toplayıp yazdırın.
        iki sayıdan hangisinin küçük olduğu bilinmiyor
         */




        int sayi1 =30;
        int sayi2 =20;
        int toplam =0;

        if (sayi1<sayi2) {
            for (int i = sayi1; i <= sayi2; i++) {
                toplam+= i;
            }

        }else {
            for (int i = sayi2; i <=sayi1 ; i++) {
                toplam+=i;
                System.out.println(toplam);
            }
        }
        System.out.println(toplam);

        }

    }

