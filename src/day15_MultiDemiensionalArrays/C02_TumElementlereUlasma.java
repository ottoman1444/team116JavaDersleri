package day15_MultiDemiensionalArrays;

import java.util.Arrays;

public class C02_TumElementlereUlasma {
    public static void main(String[] args) {
        int [][] arr = {{1,5,9},{3,4},{2,8,1,2},{10}};

        //tek katlı arrayde for loop oluşturuyoruz. array[i] bize tüm elemenltleri getirir
        //MDA olunca kat sayisinca ic ice loop olusturmak gerekir.
        //bizim sorumuzda ic ice 2 loop olustuacagız
        //arr[i][j] bize tum elementleri getirecek

        // tum elementleri aralarında bir bosluk bırakarak yazdıralım
        //ek olarak sort Stringlerde olur

        for (int i = 0; i < arr.length ; i++) {//outher loopu kontrol edecek    arr[0], arr[1]...
            for (int j = 0; j <arr[i].length ; j++) {

                System.out.print(arr[i][j] + " ");
            }

        }


        // tum elementlerin toplamini yazidirn
        System.out.println("");
        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) { // outher arayleri
            for (int j = 0; j <arr[i].length ; j++) { // inner arrayi

                toplam+=arr[i][j];

            }

        }
        System.out.println("Tum elementlerin toplami : " + toplam);

        // MDA'daki en buyuk elementi yazdirin
        int enBuyukSayi = arr[0][0];

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j] >enBuyukSayi ){
                    enBuyukSayi=arr[i][j];
                }

            }

        }
        System.out.println("Arraydeki en buyuk element : " + enBuyukSayi);
        // MDA'daki cift sayilari yanyana yazdirin
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j] %2==0){
                    System.out.print(arr[i][j] + " "); //4 2 8 2 10
                }

            }
        }
    }

}
