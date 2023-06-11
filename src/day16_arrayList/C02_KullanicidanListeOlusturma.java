package day16_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_KullanicidanListeOlusturma {

    // kullanicidan alinan isimleri listeye kaydeden bir method olusturun

    public static void main (String[] args) {
        System.out.println(kullanicidanSringAlarakListeOlusturma());
    }

// method stringlerden olsuturulan bir list dondurecek
     public static List<String> kullanicidanSringAlarakListeOlusturma(){

         Scanner scan = new Scanner(System.in);

         //loop sayisi bilinmiyorsa do-while veya while loop kullanilir
         // kullanşcş şsşm yerşne 0 girerseprogram dursun
         String kullaniciGirdisi = "";
         List<String> isimler = new ArrayList<>();
         //kullaniciGirdisi "0"a esit oldugu surece loop devam etsin
         while (!kullaniciGirdisi.equalsIgnoreCase("0")){

             System.out.println("Lutfen listeye eklemek icib bir isim giriniz");
             kullaniciGirdisi = scan.next();

             //kullanici 0 girdiyse listeye ekleme
             if (!kullaniciGirdisi.equalsIgnoreCase("0")){
                 isimler.add(kullaniciGirdisi);
             }


         }

         return isimler;

     }

}
