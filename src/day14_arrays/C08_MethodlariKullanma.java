package day14_arrays;

import day13_arrays.C03_ArrayinElemanlariniToplama;
import day13_arrays.C05_ArraydekiEnBuyukSayiBulma;
import day13_arrays.C07_TumElemanlariArtir;

import java.util.Arrays;

public class C08_MethodlariKullanma {

    public static void main(String[] args) {

        int[] sayiArray = {2,2,7,4,2,4,5,7,3};

        // Bir arrayin bütün elemanlarına 2 ekleyin
        System.out.println(Arrays.toString(sayiArray)); //[2, 2, 7, 4, 2, 4, 5, 7, 3]

        sayiArray=C07_TumElemanlariArtir.tumElmanlariArtir(sayiArray,2);
        System.out.println(Arrays.toString(sayiArray)); //[4, 4, 9, 6, 4, 6, 7, 9, 5]

        C03_ArrayinElemanlariniToplama.elemanlarinToplaminiYazdir(sayiArray); //Arraydaki elementlerin toplami :  54

        int enBuyukSayi =C05_ArraydekiEnBuyukSayiBulma.enBuyukSayi(sayiArray);
        System.out.println(enBuyukSayi); //9

        sayiArray = C10_KullanicidanAldigimizDegeriArrayeEkleme.kullaniciArrayEkleme(sayiArray);
        System.out.println(Arrays.toString(sayiArray));
    }
}
