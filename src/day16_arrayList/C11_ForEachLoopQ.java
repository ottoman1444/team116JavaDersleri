package day16_arrayList;

import java.util.Scanner;

public class C11_ForEachLoopQ {
    public static void main(String[] args) {
        /*
    Soru-4 Kullanicidan bir cumle ve bir harf alin,
    harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
    kullanilmadiysa "harf cumlede kullanilmamis" yazdirin
     */

        // 1) spil ile "" parcaiyoruz, array haline getiriyor
        // 2) forEachLoop ile harfler teker teker kontrol edilir
        // 3) istenilen harfe denk gelindiğinde sayac bir arttirilir
        // 4) sayac 0 ise "harf cumlede bulunamamis",,, sifirdan fazla ise kac kere kullanildigi yazdirilir
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz");
        String str = scan.nextLine();
        System.out.println("lütfen aranan harfi giriniz");
        String arananharf = scan.next();

        //String str = "Java ile her sey  cok kolay";
        //String arananharf="p";

        String[] arr = str.split("");


        //2)forEachLoop ile harfler teker teker kontrol edilir
        int sayac = 0;
        for (String each: arr
             ) {
        // 3) istenilen harfe denk gelindiğinde sayac bir arttirilir

        if (each.equals(arananharf))   {
            sayac++;
        }
        }
        // 4) sayac 0 ise "harf cumlede bulunamamis",,, sifirdan fazla ise kac kere kullanildigi yazdirilir
         if (sayac==0){
             System.out.println("harf cumlede hic kullanilmamis");
         }
         else {
         System.out.println("harf cumlede " + sayac + " kadar kullanilmis");
         }

    }
}
