package day14_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C09_KullaniciTarafindanOlusturulanArray {

    public static void main(String[] args) {

        //1) kullanıcıdan array boyutu al
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen array boyutunu giriniz");
        int arrayBoyut = scan.nextInt();
        int [] arr = new int[arrayBoyut];
        //2) arrayin boyutu kadar loop ile arrayin elemanlarını kullanıcıdan alıyoruz.
        int arrayElementi=0;

        for (int i = 0; i <arrayBoyut ; i++) {
            System.out.println("lütfen arrayin "+i+"ci elemanini giriniz");
            arrayElementi= scan.nextInt();
            arr[i]=arrayElementi;


        }
        System.out.println(Arrays.toString((arr)));

    }


    public static int[] kullaniciArratolusturma(){
        //1) kullanıcıdan array boyutu al
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen array boyutunu giriniz");
        int arrayBoyut = scan.nextInt();
        int [] arr = new int[arrayBoyut];
        //2) arrayin boyutu kadar loop ile arrayin elemanlarını kullanıcıdan alıyoruz.
        int arrayElementi=0;

        for (int i = 0; i <arrayBoyut ; i++) {
            System.out.println("lütfen arrayin "+i+"ci elemanini giriniz");
            arrayElementi= scan.nextInt();
            arr[i]=arrayElementi;
        }

        return arr;

    }

}
