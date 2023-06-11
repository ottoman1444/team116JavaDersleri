package day14_arrays;

import java.util.Arrays;

public class C03_EnBuyukEnKucukElemanYazdirma {
    public static void main(String[] args) {

        /*
        Bir arrayin en buyuk ve en kucuk elamnini yazdirin
         */

        int[] arr= {3,6,8,5,4,3,4,3,4,3,4,5,6,7,7,8,9,3};
        System.out.println(Arrays.toString(arr));

        enBuyukEnkucukElemanYazdirma(arr);

        // sadece sayilar degil yazilar icin de gecerli, sort kullanabiliriz

        System.out.println(Arrays.toString(arr));
        String [] arrSTR = {"Ali","Veli","Hasan"};
        Arrays.sort(arrSTR);
        System.out.println(Arrays.toString(arrSTR)); //[Ali, Hasan, Veli] alfabetik sıralamada oluyor

    }

    public static void enBuyukEnkucukElemanYazdirma(int[] arr){
        // Arrays classında sort metodu ile elemanlari siraladik
        Arrays.sort(arr);
        // sıralandıktan sonra en kucuk eleman en sonda olacagi icin
        System.out.println("Array'n en kucuk eleman : " + arr[0]);
        // siralandiktan sonra en buyuk eleman en sonda olacagi icin
        System.out.println("Arrayin en buyuk elemani : " + arr[arr.length-1]);

    }
}
