package day06_nestedIfElseStatements_ternaryOperators;

import java.util.Scanner;

public class C04_NestedIfElse {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan aldigi urun adedi ve liste fiyatini alin,
        //         kullaniciya musteri karti olup olmadigini sorun.
        //         Musteri karti varsa 10 urunden fazla alirsa %20,
        //                       yoksa %15 indirim yapin,
        //         Musteri karti yoksa 10 urunden fazla alirsa %15,
        //                       yoksa %10 indirim yapin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Girdiginiz urun adedini yaziniz");
        int urunAdedi= scanner.nextInt();

        System.out.println("Urunun liste fiyatını giriniz ");
        double listeFiyati = scanner.nextDouble();

        System.out.println("Musteri kartiniz var mi? E : Evet , H : Hayir");
        char kartVarmi = scanner.next().toUpperCase().charAt(0);

        double toplamFiyat=0;

        if(kartVarmi== 'E') { // karti olanlar

            if(urunAdedi>10){
                toplamFiyat = urunAdedi * listeFiyati * 80/100 ;
                System.out.println("%20 indirimli toplam fiyat: " + toplamFiyat);
            }else {
                toplamFiyat= urunAdedi*listeFiyati*85/100;
                System.out.println("%15 indirimli toplam fiyat: " + toplamFiyat);
            }

        } else if ( kartVarmi == 'H') { // karti olmayanlar

            if(urunAdedi>10){
                toplamFiyat = urunAdedi * listeFiyati * 85/100 ;
                System.out.println("%15 indirimli toplam fiyat: " + toplamFiyat);
            }else {
                toplamFiyat= urunAdedi*listeFiyati*90/100;
                System.out.println("%10 indirimli toplam fiyat: " + toplamFiyat);
            }

        }else { // yanlis giris
            System.out.println("Kart bilgisi icin yanlis giris yaptiniz");
        }

    }
}
