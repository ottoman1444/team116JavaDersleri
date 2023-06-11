package day03_DataCasting_wrapperClasses;

public class C02_DataCasting {
    public static void main(String[] args) {

        int in1 =10;
        int in2 =130;
        int in3 =520;
        int in4 =1000000;


        byte byt = (byte) in1;
        System.out.println("10 byte olarak: " + byt);

        byt = (byte) in2;
        System.out.println("130 byte olarak:" + byt);
        // byte -128 ile 127 arasındaki değerleri alabilir.
        // java büyük kovayı 2 lüçük kovayı doldurmaya başlıyor. 127 ye kadar geldi.
        // Daha sonra kova doldu. En baştan başlıyor yani -128 den.,

        byt = (byte)in3;
        System.out.println("520 byte olarak:" + byt);

        byt = (byte) in4;
        System.out.println(" 1 milyon byte olarak: " + byt);

        double dbl1 = 99.99;
        double dbl2 = 14.01;
        double dbl3 = 140.32;

        int sayi= (int)dbl1;
        System.out.println("99.99 int olarak: " + sayi); //99 int de ondalıklı sayı olmaz.

        sayi = (int)dbl2;
        System.out.println("14.01 int olarak: "+ sayi); //14

        sayi = (byte)dbl3; //explicit narrowing var yani 2 kere casting yapılıyor.
        // onun için beklediğimiz 140 değeri çıkmıyor. -116 çıkıyor.
        // 1- double ı önce explicit narrowing ile byte a çeviriyoruz. //eşitliğin sağında
        // 2-byte çevriletn sayıyı outwidening ile int a cast ediyoruz. // asssignment ile
        System.out.println("140.32 int olarak:" + sayi);

    }
}
