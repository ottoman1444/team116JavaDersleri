package day17_Constructors;

import day12_doWhileLoop_scope.Hastane;

public class C06_HastaneRunner {

    public static void main(String[] args) {
        C05_Hastane per1 = new C05_Hastane();

        System.out.println(per1.personelIsmi); //Isim belirtilmedi
        System.out.println(per1.personelTelefon); //Telefon belirtilmedi
        System.out.println(per1.personelAdresi); //Adres belirtilmedi
        System.out.println(per1.personelTuru); //Personel turu belirtilmedi
        System.out.println(per1.maas()); //1900

        per1.personelIsmi="Adem";
        per1.personelAdresi="Cankaya";
        per1.personelTelefon="054621687";
        per1.personelTuru="Doktor";

        System.out.println(per1.personelTuru); //Doktor
        System.out.println(per1.personelTelefon); //054621687
        System.out.println(per1.personelAdresi); //Cankaya
        System.out.println(per1.personelTuru); //Doktor
        System.out.println(per1.maas()); //5000

    }
}
