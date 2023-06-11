package day11_methodOverloading_whileLoop;

import java.util.Scanner;

public class C02_MethodOlusturma {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan main method içinde bir tam sayı alın.
        // Girilen sayını pozitif tam bölenleri sayısnı
        // bulup bize döndüren bir method olusturun

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi = scanner.nextInt();

        System.out.println(pozitifBolenSayisiBul(sayi));
        // verilen sayinin asal olup olmadigini kontrol edelim

        int ptbs= pozitifBolenSayisiBul(sayi);
        if(ptbs==2){
            System.out.println("Verilen sayi asal");
        }else {
            System.out.println("verilen sayi asal değil");
        }

    }
public static int pozitifBolenSayisiBul(int sayi){

        int sayac=0;

    for (int i = 1; i <=sayi ; i++) {
        if(sayi % i ==0){
            sayac++;
        }
    }

    return sayac;
}



}
