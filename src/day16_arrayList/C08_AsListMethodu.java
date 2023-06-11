package day16_arrayList;

import java.util.Arrays;
import java.util.List;

public class C08_AsListMethodu {
    public static void main(String[] args) {
        Integer [] arr = {1,3,5};

        // Verilen bir arr'i Liste cevirmek icin for loop olusturup liste eklemeyi tavsiye ediyoruz.

        // yinede goremk adina asList methodunu kullanalim

        List<Integer> arraydenListe = Arrays.asList(arr);
        System.out.println(arraydenListe); //[1, 3, 5]

        System.out.println("Array : " +Arrays.toString(arr));
        System.out.println("Arrayden list : " + arraydenListe);

        // olusturulan listeye ekleme cıkarma yapilabilmeli

        // arraydenListe.add(5); //UnsupportedOperationException

        // arraydenListe.remove(1); //UnsupportedOperationException

        // sadece array değiştirilirse
        arr[0] = 23;
        System.out.println("Array : " +Arrays.toString(arr));
        System.out.println("Arrayi degistirdikten sonraki listin hali : " + arraydenListe);

        /*
         1- asList methodu ile olusturulan liste, esnek bir yapıya sahip değildir. Ekleme veya çıakrma yapamayız.
         2- kaynak array değiştirildiği zamanotomatik olarak bu arrayden oluşturulan  list de değişir.
         */
    }


}
