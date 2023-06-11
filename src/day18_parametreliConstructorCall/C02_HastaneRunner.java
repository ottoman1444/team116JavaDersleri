package day18_parametreliConstructorCall;

public class C02_HastaneRunner {
    public static void main(String[] args) {
        C01_Hastane per1 = new C01_Hastane();

        System.out.println(per1);
        per1.personelIsmi="Sevda";
        per1.personelAdresi="Ankara";
        per1.personelTelefon="012565156";
        per1.personelTuru="Hemsire";

        System.out.println(per1);

        //Bir obje olusturuldugunda o objenin ozelliklerini atama yapmazsak
        //classdaki ilk degerleri alacaktır
        // eger o objenin kendine ozgu degerleri olamsini istiyorsak
        //ATAMA YAPMALIYIZ


         C01_Hastane per2 = new C01_Hastane("Adem", "Cankaya","5465216543","Doktor");


        System.out.println(per2);

        C01_Hastane per3=new C01_Hastane("Murat","Sincan","54612354","Doktor");

        System.out.println(per3);

    }


}
