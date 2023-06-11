package day17_Constructors;

public class C07_Hastane {

    public C07_Hastane(String isim){
        System.out.println("isim parametreli constructor");
    }
    /*
    Biz görünür bie constructor oluşturduğumuzda Java default constructorî siler

    Biz görünür constructor oluşturduğumuzda , daha önce
    default constructor u kulanarak olusturulan objeler cte verir.

     Boyle bir soruna sebep olmamak icin gorunur bie constructor
     olusturmdugumuzda default constructorun işlevini yapan
     parametresiz bir constructor olustururuz.
     */

    public C07_Hastane(){
        System.out.println("parametresiz constructor calıstı");
    }
    // boylece c08 deki cte kayboldu
    @Override
    public String toString() {
        return "C07_Hastane Objesi ==>" +
                "personelIsmi: " + personelIsmi + '\'' +
                ", personelAdresi: '" + personelAdresi + '\'' +
                ", personelTelefon: '" + personelTelefon + '\'' +
                ", personelTuru: '" + personelTuru + '\'' +
                '}';
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
