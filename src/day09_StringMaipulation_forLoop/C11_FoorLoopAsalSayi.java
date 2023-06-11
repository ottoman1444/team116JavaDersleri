package day09_StringMaipulation_forLoop;

public class C11_FoorLoopAsalSayi {
    public static void main(String[] args) {
        //verilen bir sayinin asal sayi olup olmadiğini yazdirin
        int sayi = 1;
        boolean asalmi = true;

        for (int i = 2; i <sayi ; i++) {

            if(sayi%i==0){
             asalmi=false;
             break;
            }
        }
//bir loopun içerisinde loopun çalışmasını durdurmak için
// break yazabilirsiniz

        if (asalmi==true){
            System.out.println("sayi asal");
        }else System.out.println("sayi asal degil");
    }
}
