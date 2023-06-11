package day16_arrayList;

import java.util.List;

public class C03_KullanicidanAlinanIsimlerdenBelliIsimleriYazdirma {

    public static void main(String[] args) {

        // kullanicidan alinan ismlerden olusan listede 3 harften fazla olan isimleri yazdirin

        List<String> yeniIsimler = C02_KullanicidanListeOlusturma.kullanicidanSringAlarakListeOlusturma();

        // listenin elmanlarına ulasmak icin bir loop
        // listenin elemanları eger 3 harften fazlaysa yazdiran code

        for (int i = 0; i <yeniIsimler.size() ; i++) {

            if (yeniIsimler.get(i).length() >= 3){
                System.out.println(yeniIsimler.get(i));

            }

        }

    }
}
