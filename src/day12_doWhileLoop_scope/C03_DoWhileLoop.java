package day12_doWhileLoop_scope;

public class C03_DoWhileLoop {

    public static void main(String[] args) {
        // Soru 1- 'k' harfinden 't' harfine kadar harflari yazdırın


        // for loop ile yapalım

        for (int i = 'k'; i <='t' ; i++) {
            System.out.print((char) i + " "); // matematiksel işlem yaptığımız için chara  dönüştürmezsek acii tablosundaki değerleri çıkar


        }
        System.out.println("");

        //While loop ile yapalım

        char harf = 'k';
        while (harf <= 't'){
            System.out.print(harf + " ");
            harf++;

        }

        System.out.println("");

        //do while loop ile yappalım

        harf = 'k';
        do {
            System.out.print(harf + " ");
            harf++;
        }while (harf<='t');

    }






}
