package day11_methodOverloading_whileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {
        // kullanicidan bir sayi alip 3 ile bolunup bolunemeyecegini yazdirin
        // kullanici 3 ile bolunebilen bir sayi girinceye kadar
        // tekrar deger isteyin
        // tekrar sayisi tam oalrak bilinmeyen
        // tekrar sayısı belli bir şarta bağlı olan durumlarda WhileLoop kullanırız.

        Scanner scanner = new Scanner(System.in);


        // girilen sayı 3 e bolunene kadar tekrar et
        //While loop da () icine yazilan sar saglanmadigi muddetce
        //kod tekrar calısmaya devam eder
int sayi=2;

   while (sayi %3 != 0){
    System.out.println("Lutfen pozitif bir tam sayi girin");
    sayi = scanner.nextInt();

    if(sayi % 3 ==0){
        System.out.println("sayi 3 ile tam bolunuyor");
    }else {
        System.out.println("sayi 3 ile tam bolunmez");
    }
}

    }



}
