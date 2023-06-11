package day16_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_ListOlusturmsVeYazdirmaMethodu {
    public static void main(String[] args) {

        // olsuturlan bir listeyi yazdiran bir method olusturma egzersizi
        List<String> isimler = new ArrayList<>();
        isimler.add("Ahmet");
        isimler.add("Murat");
        isimler.add("Muhammed");
        isimler.add("Sefa");
        isimler.add("Erhan");
        //method call : method çağırma
        listeYazdirma(isimler);
    }

    // sadece konsola bişey yazdirilacaksa void return type kullanilir
    public static void listeYazdirma(List<String> isimler){
        System.out.println(isimler);

    }
}
