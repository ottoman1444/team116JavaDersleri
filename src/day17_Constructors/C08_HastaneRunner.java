package day17_Constructors;

import java.util.ArrayList;
import java.util.List;

public class C08_HastaneRunner {

    public static void main(String[] args) {

        C07_Hastane per1 = new C07_Hastane();
        System.out.println("ısım : " + per1.personelIsmi +
                ", " + "adres : " + per1.personelAdresi +
                ", " + "telefon : "+ per1.personelTelefon+
                ", " + "personel turu: " + per1.personelTuru);

        System.out.println(per1);



        C07_Hastane per2 = new C07_Hastane("Selgun");
        System.out.println(per2);


        List<String> list = new ArrayList<>();
        System.out.println(list.isEmpty());

        List<Integer> list1= new ArrayList<>();
        list1.add(7);
        list1.add(8);
        list1.add(9);
        System.out.println(list1.contains(123));


    }

}
