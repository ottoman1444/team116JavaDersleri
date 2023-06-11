package day12_doWhileLoop_scope;

public class Hastane {

    static String hastaneIsmi = "Yildiz hastanesi";
    static int personelSyisi;
    String perspnelIsmi;
    String personelAdresi;
    String personelTelefonu;
    /*
    Class level'da olusturulan variablelar
    - eger tum nesneler icin ortak ise static olarak
    - her bir nesne icin farklı olacaksa instance olarak
    olusturulur.

    bu hastanede 500 personel varsa 500 personel icin 500 isim, 500 adres,
    500 telefon, variable'ı olmak zorundadır.
    Java bunu su sekilde cozmus :

    bu classdan bir obje olusturuldugunda
    java tum instance variableların bir kopyasını olusturup
    o obje ile ilintilendirir

    Tum class level variable'lar icin
    deger atama mecburiyeti yoktur
    eger deger atanırsa o deger gecerlidir
    ancak deger atanmazsa java class level variablr icin
     default olarak belirledigi degerleri atama yapar

     sayısal variablelar : 0
     boolean : false
     char : hiclik
     non-primitive : null

     instance variable lar obje olusturuldugunda objeye kopyalanıp ayrı bir kutuda saklanır. static variable lar ise öyle değildir.
     hastane classına bağlıdır. olusuturulan objeler hastane classına bağlıdır.
     biz hastanenin ismini yazdırırken static variablelara direk erisebiliriz.

     */


    public static void main(String[] args) {

        System.out.println(hastaneIsmi); //Yildiz hastanesi
        //System.out.println(personelIsmi); class level personel
        // ısmi static olmadığından dolayı seçici olan methoddur.
        // methodda static olduğu için kullanamyız.

// obje olusturduk
        Hastane ayseHemsire = new Hastane();
        System.out.println(ayseHemsire.personelAdresi); // null atama yapmadan yazdirdik
        System.out.println(personelSyisi); //0
        ayseHemsire.personelAdresi  = "Cankaya";
        ayseHemsire.perspnelIsmi="Ayse";
        ayseHemsire.personelTelefonu= "3254654321";

// obje olusturduk
        Hastane fatmaHemsire = new Hastane();
        fatmaHemsire.perspnelIsmi="Fatma";
        fatmaHemsire.personelAdresi="Cankaya";
        fatmaHemsire.personelTelefonu="025654354";


        System.out.println(ayseHemsire.perspnelIsmi);//Ayse
        System.out.println(fatmaHemsire.perspnelIsmi);//Fatma

        // static variable'lara direk erismek mumkundur.
        System.out.println(hastaneIsmi); //Yildiz hastanesi
        System.out.println(personelSyisi); //"0

        // obje uzerindende static variablelara ulasılabilir ancak intellije buna gerek yok diyerek bizi uyarır.

        System.out.println(ayseHemsire.hastaneIsmi); //Yildiz hastanesi
        //static olan hastane variableına instance şeklinde ulaşıldı diye uarı veriyor ama yazıdırır.

        ayseHemsire.hastaneIsmi="Levent Hastanesi"; //Levent Hastanesi
        //hastane adı değişirse herkes için değişir. ayse gemsire üzerinden yapılsada
        System.out.println(hastaneIsmi);

        System.out.println(fatmaHemsire.hastaneIsmi);//Levent Hastanesi
    }
}
