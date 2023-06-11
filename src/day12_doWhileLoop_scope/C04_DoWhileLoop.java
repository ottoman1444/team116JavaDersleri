package day12_doWhileLoop_scope;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan bir pozitif tam sayi isteyin, sayinin tam kare olup olmadigini bulunuz.
        //         tam kare isr true degilse false yazdiriniz
        //         Ornek : input : 16, output true


        Scanner scanner =new Scanner(System.in);
        System.out.println("Pozitif bir tam sayi giriniz");
        int sayi = scanner.nextInt();

        int karekok = 2;
        boolean tamKaremi= false;

        do {
            if( sayi== karekok*karekok){
                tamKaremi = true;
                break;
            }
            karekok++;

        }while (karekok*karekok<=sayi);

        System.out.println(tamKaremi);


    }
}
