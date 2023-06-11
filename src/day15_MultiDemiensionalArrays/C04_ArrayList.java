package day15_MultiDemiensionalArrays;

import day14_arrays.C10_KullanicidanAldigimizDegeriArrayeEkleme;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArrayList {

    public static void main(String[] args) {

        // Array unulugu degistirilemedigi icin calısma ortamında tercih edilmez
        //Java ekleme ve silme yapabilecegimiz bir yapi olusturmustur.
        //ArrayList, Array altyapisini kullanir ama uzunluk acisindan esnektir

        //assagidaki arr'e element olarak 10'u ekleyelim


        int[] arr = {3,5,6};

        arr = C10_KullanicidanAldigimizDegeriArrayeEkleme.kullaniciArrayEkleme(arr);
        arr = C10_KullanicidanAldigimizDegeriArrayeEkleme.kullaniciArrayEkleme(arr);
        arr = C10_KullanicidanAldigimizDegeriArrayeEkleme.kullaniciArrayEkleme(arr);
        arr = C10_KullanicidanAldigimizDegeriArrayeEkleme.kullaniciArrayEkleme(arr);

        System.out.println(Arrays.toString(arr));

        //Bir ArrayList olusturmak istersek
        List<Integer> sayilar = new ArrayList<>();

        // Arraylist'in tek dezavantajı elementleri tek tek eklemek zorunda olmamızdır
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        System.out.println(sayilar);


    }
}
