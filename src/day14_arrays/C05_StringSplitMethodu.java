package day14_arrays;

import java.util.Arrays;

public class C05_StringSplitMethodu {
    public static void main(String[] args) {

        //split methodu : istedigimiz yerden bir yaziyi bolerek, parcaciklari array'a atar

        String str = "Java gercekten cok guzel";
        // kac tane "e harfi var

        //1) tane tane ayıralım
        String[] tanetane =str.split("");
        System.out.println(Arrays.toString(tanetane));

        int sayac =0;
        for (int i = 0; i < tanetane.length ; i++) {

            if(tanetane[i].equals("e")){
                System.out.println("e var");
                sayac++;

            }

        }
        System.out.println("aradıgınız e harfi sayac icerisinde " + sayac+" tane var.");

        System.out.println("Method ile k harfi arama");

        arananStringIcindeVarmi(str,"k");

    }



    public static void arananStringIcindeVarmi(String str, String aranan){

        //"Java gercekten cok guzel";
        // "e" aranan
        String[] tanetane =str.split("");

        int sayac =0;
        for (int i = 0; i <tanetane.length ; i++) {

            if(tanetane[i].equals(aranan)){

                sayac++;

            }
        }
        System.out.println("aradıgınız " +aranan+" harfi sayac icerisinde " + sayac+" tane var.");
    }
}
