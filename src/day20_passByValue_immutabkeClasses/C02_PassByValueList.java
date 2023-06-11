package day20_passByValue_immutabkeClasses;

import java.util.ArrayList;
import java.util.List;

public class C02_PassByValueList {
    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>();
        harfler.add("A");
        harfler.add("K");
        harfler.add("Z");


        System.out.println(harfler);

        System.out.println("Method Calldan donen List: " + method1(harfler));

        System.out.println("method calldan sonra List : " + harfler);

        System.out.println("Method2 calldan doenen list : "+method2(harfler));
        System.out.println("Method 2 sonrasında main method icindeki list"+ harfler);


    }



    public static List<String> method1(List<String> harler){

        harler.set(0,"T");
        harler.set(1,"C");
        System.out.println("Method1 iicnde list : " + harler);

        return harler;

    }

    public static List<String> method2(List<String> harfler){

        harfler=new ArrayList<>();
        harfler.add("P");
        System.out.println("Method2 icinde harfler listesi : " + harfler);

        return harfler;

    }
}
