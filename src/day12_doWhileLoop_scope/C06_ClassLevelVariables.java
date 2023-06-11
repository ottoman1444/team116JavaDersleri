package day12_doWhileLoop_scope;

public class C06_ClassLevelVariables {

    /*
       Bir classın tamamında geçerli variablelar oluşturmak istersek
       bu variable ları class level'da olustururuz
       yani class'ın içinde ama methodun dışında oluştururuz

       bu variable'ların en üstte olması şart değildir ancak
       genel kullanımda class level variablelar class'ın
        en üst kısmında oluşturulur.

        class level variable'lar static ve static olmayan (instance) şeklinde
         iki farkli şekilde oluşturulabilir.

         static variable'lar static klubune uye olduklari icin
         tum method'lara gidebilir ve tum methodlardan kullanilabiliriler.

         instance variable'lar static olamdiklari icin karar verici
         olarak methodlar devreye girer
     */

    static int sayi = 10;//static variable --- class level
    String str = "Java"; // instance variable -- class level
    // bir variable statsic olarak isaretlenmisse static degilse instance variable'dir."

    public static void main(String[] args) {
        sayi=20;
        System.out.println(sayi); //20
        //System.out.println(str);
        // static olamayan bir variable, static alandan kullanilamaz
    }

    public static void staticMethod(){
    sayi=30;
    //str= "tava";
        // static olamayan bir variable, static alandan kullanilamaz
    }

    public void staticOlmayanMethod(){
    sayi=40;
        System.out.println("Static olmayan method da sayi : "+ sayi);
        str = "hava";
        //method static degil, variable da static degil
    }
}
