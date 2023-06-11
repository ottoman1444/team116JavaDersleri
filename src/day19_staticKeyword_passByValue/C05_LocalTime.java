package day19_staticKeyword_passByValue;

import java.time.LocalTime;
import java.time.ZoneId;

public class C05_LocalTime {

    public static void main(String[] args) {



        /*
        javada zaman ve taih ile ilgili pekcok class vardır
        biz 3 class gorecegiz
        LocalTime class'i saat ile ilgili method'lar icerir

         */

        LocalTime saatBaaslangic = LocalTime.now();
        // LocalTime.now bulundugu satir calıistiginda bilgisayarın saatini alıp kaydeder
        // saat veriable ı canli bir kronometre degil,
        // bulundugu satirin calistigi zamanı kaydeden bir variabledır.

        System.out.println(saatBaaslangic);

        int toplam =0;

        for (int i = 0; i <=50000 ; i++) {
            toplam+=i;
        }

        System.out.println(toplam);

        LocalTime saatBitis = LocalTime.now();

        System.out.println(saatBitis);


        LocalTime saat= LocalTime.now(ZoneId.of("Japan"));
        System.out.println(saat);

        LocalTime saat2 = LocalTime.of(11,20, 25);
        System.out.println(saat2);

        LocalTime saat3 = LocalTime.ofSecondOfDay(10000);
        System.out.println(saat3); //02:46:40




    }
}
