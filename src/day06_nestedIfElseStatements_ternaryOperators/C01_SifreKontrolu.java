package day06_nestedIfElseStatements_ternaryOperators;

import java.util.Scanner;

public class C01_SifreKontrolu {
    public static void main(String[] args) {

        /*
           Kullanicidan bir sayi girmesini isteyin
           Sayi asagidaki 4 sarti sagliyorsa "Mukemmel Sayi" yazdirin

           Saglanamayan sartlarin tamamini kullaniciya soyleyin

           1- sayi 4 basamakli olmalidir
           2- sayi 3 ile bolunebilmelidir
           3- sayi 5 ile bolunememelidir
           4- sayi birler basamagi tek sayi olmalidir
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi = scanner.nextInt();
       //flag methodunu yapmaya derste karar verdik
        boolean sayiMukemmelMi = true;

        // 1- sayi 4 basamakli olmalidir.
        if(sayi<1000 || sayi>9999){
            System.out.println("sayi 4 basamakli olmalidir");
            sayiMukemmelMi = false;
        }
        //2- sayi 3 ile bolunebilmelidir

        if (sayi % 3 != 0 ){
            System.out.println("sayi 3 ile bolunebilmelidir");
            sayiMukemmelMi = false;
        }

        //3- sayi 5 ile bolunememelidir
        if (sayi %5 == 0){
        System.out.println("3- sayi 5 ile bolunememelidir");
            sayiMukemmelMi = false;

        }
        //4- sayi birler basamagi tek sayi olmalidir
        if ((sayi % 10)%2 == 0){
            System.out.println("sayi birler basamagi tek sayi olmalidir");
            sayiMukemmelMi = false;
        }
        // sadece variable oldugu zaman deger ya true yada false oluyor.
        if (sayiMukemmelMi){
            System.out.println("Mukemmel Sayi");
        }

    }
}
// Eğer birden fazla şart varsa ve bunların hepsiyle alakalı raporlama yapmak istiyorsanız
// if else yerine basit if cümleleri kullanmalısınız. Birden fazla basit if cümleniz var ve
// hepsi sağlandımı yada hepsi sağlanmadımı istenmeyen durum oluştumu nasıl kontrol edersiniz? Ya sayaç yada flag