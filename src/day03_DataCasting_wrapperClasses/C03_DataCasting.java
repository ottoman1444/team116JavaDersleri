package day03_DataCasting_wrapperClasses;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {

        char ch1= 'a';
        char ch2= 'b';

        System.out.println(ch1+ch2); // 195 // char data türü ASCII Table ile ortak çalışır.
        // a ve b nin karşık bulduğu rakamlar vardır. Bu ikisini matematiksel olarak topladı.

        //kullanicidan  bir karakter alin
        // ascii tablosuna göre o karakterden sonraki 3 karakteri yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen Bir karakter giriniz");

        char girilenChr = scanner.nextLine().charAt(0);

        System.out.println("girilen karakterden sonraki 3 karakter :" + (char)(girilenChr+1) + ", "
                + (char)(girilenChr+2) + ", " + (char)(girilenChr + 3));
    }
}
