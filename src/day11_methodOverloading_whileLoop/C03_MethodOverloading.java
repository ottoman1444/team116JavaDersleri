package day11_methodOverloading_whileLoop;

public class C03_MethodOverloading {
    public static void main(String[] args) {

        //Overloading : aşırı yükleme
        /*
        Bir class'da ayni isme sahip birden fazla method olmasina denir

        Java'da bir class içerisinde aynı isim, aynı sayıda ve data
        türünde parametre ile oluşturulursa Java CTE verir(Altını kırmızı çizer).
        Bunun 3 cozumu vardır
        1- paramere sayısını değiştirmek
        2- parametrelerin data türlerini değiştirebiliriz
        3- farlı data turunde parametrelerin yeri değiştirilebilir.

      Java bir method call olduğunda
      ayni isimdeki birden fazla methoddan hangisinin çalışacağını
      belirlemek için argumet - parametre uyumuna bakar


         */


        topla(5,8);
    }


    public static void topla(int sayi1, int sayi2){
        System.out.println("Iki sayinin toplami : " +(sayi1+sayi2));
    }
    public static void topla(char a, char b){
        System.out.println("Iki sayinin toplami : " +(a+b));
    }
    public static void topla(int a, double b) {
        System.out.println("Iki sayinin toplami : " + (a + b));
    }
}
