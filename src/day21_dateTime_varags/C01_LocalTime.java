package day21_dateTime_varags;

import java.time.LocalTime;
import java.time.temporal.TemporalUnit;

public class C01_LocalTime {

    public static void main(String[] args) {
        LocalTime saat = LocalTime.now();
        //calistigi anda sistemde var olan zamanı alip saat variable'ına kaydeder
        //kronometre gibi calisamaz. sadece 10. sairdaki zamanı kaydeder.
        // eger farkli satirlarin calisma zamanlarini gormek istersek
        // o satirlardda yeni local time objeleri olusturmaliyiz

        System.out.println(saat);//16:35:31.717621
        //zamani saat, dakika, saniye ve nanao saniye olarak kaydeder.

        System.out.println(saat.getNano()); //717621000
        System.out.println(saat.getSecond()); //17
        //get methodlari bize saatin istedigimiz bolumunu getirir.

        System.out.println(saat.withHour(13)); //13:37:27.474049500 sadece saatini benim istedigim haliyle degistirdi
        //with methodlari saatin istedigimiz bolumunu istedigimiz yeni bir deger ile degistirerek zamani verir.

        System.out.println(saat.withHour(11).withSecond(0).withNano(0)); //11:39 sadece saat ve dk yi istiyorsak boyle yapabiliriz.

        System.out.println(saat.plusHours(100)); //20:42:09.269131900 100 saat sonra saat kac olur
        System.out.println(saat.minusHours(37).minusMinutes(22)); //03:21:45.710085300
        // plus methodalri ve minus methodlari saati istedigimiz miktarda ileri veya geri goturur.


        // istedigimiz saat dakika saniye ve nano saniye ile zaman variable ı olusturmak istersek

        LocalTime istenenZaman = LocalTime.of(12,23,15,10); //12:23:15.000000010
        System.out.println(istenenZaman);

        //iki zamani birbiriyle karsilastirmak istersek
        System.out.println(istenenZaman.isAfter(saat)); // false
        System.out.println(istenenZaman.isBefore(saat)); //true

        System.out.println(saat.compareTo(istenenZaman)); //1
        System.out.println(istenenZaman.compareTo(saat)); //-1
        // iki zamani karsilastirir. kucukse negatif buyukse pozitif deger doner.


    }
}
