package day09_StringMaipulation_forLoop;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {
        // kullanicidan iki sayi alın ve bu sayilar dahil olarak
        // arasında uc ile bolunebilen sayilari yazdirin
        // ilk girilen sayi ikinci girilen sayidan buyuk ise hata mesajı yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki pozitif tam sayi girin: ");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();


        if (sayi1>sayi2) {
            System.out.println("Ilk sayi daha kucuk olmalidir");
        }else {

           /* for (int i = sayi1; i < sayi2; i++) {

                if (i%3==0){
                    System.out.print(i+" ");
                }
            }
*/
            for (int i = sayi1; i < sayi2; System.out.println((sayi1 % 3 == 0 ? i += 3 : i++)) ) {

                if (i%3==0){
                    System.out.print(i+" ");
                }
            }


         }
        }



    }

