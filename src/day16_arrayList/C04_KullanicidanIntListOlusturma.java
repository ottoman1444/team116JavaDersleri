package day16_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_KullanicidanIntListOlusturma {
    // kullanşidan integer list olusturup donduren bir method olusturun

    public static void main(String[] args) {
        System.out.println(kullanicidanSayiAlarakListeolusturanMethod());
    }
    public static List<Integer> kullanicidanSayiAlarakListeolusturanMethod(){

        Scanner scan = new Scanner(System.in);

        // kullanicidan sayilar loop icinde alinacak, loop sayisi bilinmediginden while kullaniriz
        // kullanici 0 a basınca loop duracak
        int girilenSati=4;
        List<Integer> sayilar = new ArrayList<>();
        //girilen sayi 0 a esit olmadigi surece loop devam etmeli

        while (girilenSati!=0){

            System.out.println("Lutfen listeye eklemek icin bir sayi ekleyiniz");
            girilenSati=scan.nextInt();

            if (girilenSati!=0){
                sayilar.add(girilenSati);
            }
        }
        return  sayilar;
    }


}
