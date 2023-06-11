package day16_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C09_ForEachLoopQ {

    /*
    Soru-3 Verilen String bir array'deki her bir elementi kontrol edip,
          -Kelimenin uzunlugu cift sayi ise yarisini
          -Kelimenin unulugu tek sayi ise ortadaki harf dahil ikinci yarısını
          yeni bir listeye ekleyip yazdirin.
     */

    public static void main(String[] args) {

     String[] arr = {"araba","kalem", "hasan", "kitaplık"};

     isimManipulasyonuMethodu(arr);


    }



   public static void isimManipulasyonuMethodu(String[] arr){

        //Manipule edilen kelimeleri eklemek icin
       List<String> manipuleKelimeler = new ArrayList<>();
        //arr icindeki butun kelimelere tek tek ulasmak
       for (String each:arr
            ) {
           //mehmet // kelimenin uzunlugu cift sayi ise
           if (each.length() %2==0){
               //ilk yarisi icin 0 ve uzunlugun yarisi kadar
               manipuleKelimeler.add(each.substring(0,each.length()/2));
           }else {
               manipuleKelimeler.add( each.substring((each.length()-1)/2));
               }
           }
       System.out.println(manipuleKelimeler);

       }

   }




