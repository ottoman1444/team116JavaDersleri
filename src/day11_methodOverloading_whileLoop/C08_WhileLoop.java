package day11_methodOverloading_whileLoop;

public class C08_WhileLoop {

    public static void main(String[] args) {


        //While loop mu for loop mu ?
        /* Bu sorunun cevabı yapacağımız işe bağlı
        döngü sayısı belli ise for loop kullanmak daha pratiktir.
        ancak başlangıç bitiş değerleri verilmemişse veya bitiş
        döngü sayıs belli değilse while loop daha avantajlı olur.

        1'den 100 e kadar olan sayıları yan yana yazdırın
        */

        for (int i = 1; i <=100 ; i++) {
            System.out.print(i+ " ");

        }
    // ayni soruyu while loop ile yapalim

        int sayi = 1;

        while (sayi<100) {
            System.out.println(sayi + " ");
            sayi++; // unutlursa sonsuz loop olusur.
        }


    }
}
