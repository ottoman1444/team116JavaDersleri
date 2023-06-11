package day17_Constructors;

public class C05_Hastane {
    /*
     Bir class'da gorunurde  contructor yoksa default constructor vardir.

     ve budysinde hic bir kod farkı bulunmaz.

     default constructoer assagida verilen constructora benzer
      C05_Hastane(){

    }
    ancak constructor görünür ise artık ona default constructor demeyiz.
    parametresi yoksa ona parametresiz constructor diyebiliriz

    biz herhangi bir constructor olusturursak
    java default constractır ı siler
    yani bir class da gorunur bir constructor varsa default
    constructor yoktur diyebiliriz
     */

    C05_Hastane(){
        System.out.println("parametresiz kod calisti");
    }

    static String hastaneAdi = "Yildiz Hastanesi";
    static String hastaneTelefonu = "00235465412";

    String personelIsmi = "Isim belirtilmedi";
    String personelAdresi = "Adres belirtilmedi";
    String personelTelefon = "Telefon belirtilmedi";
    String personelTuru = "Personel turu belirtilmedi";

    public int maas(){

        switch (personelTuru){

            case "Doktor" :
                return 5000;

            case "Hemsire":
                return 3000;

            case "Bashemsire":
                return 4000;

            default:
                return 1900;
        }

    }
}
