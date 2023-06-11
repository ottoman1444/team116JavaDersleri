package day15_MultiDemiensionalArrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C11_equals {
    public static void main(String[] args) {

        List<String> isimler1 = new ArrayList<>();

        isimler1.add("Selgun");
        isimler1.add("Saida");
        isimler1.add("Sevda");

        List<String> isimler2 = new ArrayList<>();

        isimler2.add("Saida");
        isimler2.add("Selgun");
        isimler2.add("Sevda");

        System.out.println(isimler1); //[Selgun, Saida, Sevda]
        System.out.println(isimler2); //[Saida, Selgun, Sevda]

        System.out.println(isimler1.equals(isimler2)); //false

        //Array list bir Colletion oldugu icin sort methodu'nu oradan kullanir
        Collections.sort(isimler1); //[Selgun, Saida, Sevda]
        Collections.sort(isimler2);

        System.out.println(isimler1); //[Saida, Selgun, Sevda]
        System.out.println(isimler2); //[Saida, Selgun, Sevda]

        System.out.println(isimler1.equals(isimler2)); //true

    }
}
