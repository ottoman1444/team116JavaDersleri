package day19_staticKeyword_passByValue;

public class C02 {

    static String staticV= "Java";
    String isimIns="Sevda";

    public static void main(String[] args) {

        C02 obj1 = new C02();
        // bunu yazdigimiz anda java boyle bir constructor varmı dieye kontrol ediyor.
        // Gorunurde yok ama defalut constructor devreeye girerek olusturulur.
        // Uzerindede 1 tane instance var oda sevda
        // Bu obje uzerinden static variablea ulasabiliriz. static variablelar objeye ait olmaz.
        // static variable classa yapısıktır
        // obj 1 classın uyesi oldugu icin obj1 uzerinden static variable dedigimizde once objeye gelir. bulamaz. sonra class levelda bulur.
        //obj1 uzerinden deger atanabilir.


        System.out.println(obj1.staticV);// Sevda
        System.out.println(obj1.isimIns);//Sevda
        obj1.isimIns="Akif";//Akif
        System.out.println(obj1.isimIns);//Akif

        C02 obj2=new C02();
        //Java obj2 adında yeni bir obje olusturdu. isimIns variable ını bir onceki degeri olan akif
        // degil yeni olusturuldugu icin class leveldaki sevda degerini atar
        //

        System.out.println(obj2.isimIns); //Sevda
        System.out.println(obj2.staticV); //Java
        //objede static variable yok. classdan yazdırır.

        obj2.isimIns="Ayse";
        obj2.staticV="Hava";

        //burda obje 2 ye gidecek ismi sevda yerine ayse yapacak.
        // satır 35 obj 2 ye gidsip static variable olup olmadığına bakacak.
        // Yok. Bağlı olduğu classdaki değeri bulup Hava değerini atayacak.

        System.out.println(obj1.isimIns); //Akif
        System.out.println(obj1.staticV); // Hava  // en guncel deger
        System.out.println(obj2.isimIns); //Ayse
        System.out.println(obj2.staticV); //Hava

        //kısacası herhangi bir anda farklı oblerein instance degerleri farklı olabilir ama classdaki static variablelar her obje zerinden erisildiginde aynı olacaktır.
        System.out.println(staticV); //Hava
        // obje uzerinden olmasada class level static variable tum objeler icin aynıdır.

    }
}
