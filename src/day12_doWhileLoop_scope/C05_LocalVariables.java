package day12_doWhileLoop_scope;

public class C05_LocalVariables {

    //kural 1 - Local variable'lar sadece kendi scope larında geçerlidir.
    //          bir methodda oluşturulan variable vaşka methodların içerisinde kullanılamaz.
    //Kural 2 -Local bir scope'da yani bir kod bloğunun içerisinde değer atamadan
    //         variable oluşturabilirsiniz ancak değer atamadan kullanamazsınız
    //Kural 3 -Bir loop içerisinde oluşturulan variable lar sadece o loop içerisinde geçerlidr.
    //         o loop dışında kullanılamaz. Bunlara loop variable da denir.

    public static void main(String[] args) {
     int sayi =10;
     //str ="Java Candır";
     //yeterMi=false;

        String slogan ="Jva candir";
        System.out.println(slogan);
        slogan="java hayattir";

       // String s;

       // System.out.println(s);

        for (int i = 0; i <10 ; i++) {
            int sayi2=10;
            System.out.println(sayi2+i);

        }
        // for loop içerisinde i ve sayi2 isminde 2 local variable oluşturulmuştur.
        // loop dışında bunları kullanalım
        //i=20;
        //System.out.println(i);
        //sayi2=20;



    }

    public static void statikMethod(){
        String str = "Java mutluluktur";
        //System.out.println(sayi);

    }

    public void staticOlmayanMethod(){
         boolean yeterMi=true;
        //System.out.println(sayi);
    }

}
