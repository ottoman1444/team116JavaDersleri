package day03_DataCasting_wrapperClasses;

public class C01_Data_Casting {
    public static void main(String[] args) {

  int in1 = 10;
  short shrt =12;  //tam sayı içeren primitive data türleri
  byte byt = 15;
  long lng =28;

  float flt = 1.2f; //ondalıklı sayı içeren primitive data türleri
  double dbl = 3.2;

  boolean bl = true; // mantıksal değer içeren true yada false data türü

  char chr = 'a'; //tek karakter içeren data türleri

  String str= "Java Candir";
  /*
  Bir data türündeki variabl'a baska data turundeki deger atanabilirmi?
  bazi data turleri deger olarak baska data turundeki degerleri ASLA KABUL ETMEZ.

  Sayısal deger alan primitive data turlerinde ise daha kapsamlı olan data turundeki variable,
  daha dar kapsamli data turundeki degeri OTOMATIK olarak kabul eder.
   */
  // chr=byt;
  // chr=str;
  // chr=flt;


     //   bl = in1;
   //     bl ="true";

 //       str =bl;
//        str= chr;
//        str =shrt;

        in1=shrt;
        in1=byt;
        //in1=lng;
        //in1=dbl;
        //in1=flt;
        // kendinden bit olarak küçük olanları kabul ederken kendinden
        // büyük olanları kabul etmiyor.

        lng=byt;
        lng=shrt;
        lng=in1;
        // lng = flt;
        // lng = dbl;

        dbl = byt;
        dbl = shrt;
        dbl = in1;
        dbl = lng;
        dbl = flt;

        /*byt = shrt;
        byt = in1;
        byt = lng;
        byt = flt;
        byt = dbl;
          */







  //bir data türündeki vaeiable'a başka bir data türündeki değer atanabilirmi?



    }
}
