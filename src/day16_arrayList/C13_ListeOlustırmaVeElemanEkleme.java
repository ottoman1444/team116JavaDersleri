package day16_arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C13_ListeOlustırmaVeElemanEkleme {
    public static void main(String[] args) {

        // Liste + data type + isim = new LinkedList<>();
        List<String> isimListesi = new LinkedList<>();

        isimListesi.add("Hasan");
        isimListesi.add("Mehmet");
        isimListesi.add("Mustafa");
        isimListesi.add("Ali");
        isimListesi.add("Osman");
        System.out.println(isimListesi);


    }
}
