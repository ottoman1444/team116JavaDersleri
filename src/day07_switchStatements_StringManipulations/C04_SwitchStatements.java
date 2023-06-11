package day07_switchStatements_StringManipulations;

import java.util.Scanner;

public class C04_SwitchStatements {
    public static void main(String[] args) {
        // KULLANİCİDAN 2 BASAMAKLİ BİR SAYİ ALİP, GİRİLEN SAYİYİ YAZİ İLE YAZDİRİN.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen yaziyla goruntulemek istediginiz tam sayiyi girini: ");

        int girilenSayi = scanner.nextInt();

        if (girilenSayi<99 || ( girilenSayi>-10 && girilenSayi<10) || girilenSayi>100)
            System.out.println("Iki bsamakli bir tam sayi girmedeiniz. ");
        else {
            if (girilenSayi<0){
                System.out.println("Eksi");
                girilenSayi*=-1;
            }
            switch (girilenSayi/10) {
                case 1:
                    System.out.println("on");
            }
        }
        System.out.println("Lutfen bir sayi yaziniz");
        int rakam= scanner.nextInt();

        switch (rakam) {

            case 0:
                System.out.println("sifir");
                break;
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("İki");
                break;
            case 3:
                System.out.println("Uc");
                break;
            case 4:
                System.out.println("Dort");
                break;
            case 5:
                System.out.println("Bes");
                break;
            case 6:
                System.out.println("Alti");
                break;
            case 7:
                System.out.println("Yedi");
                break;
            case 8:
                System.out.println("Sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
            default:
                System.out.println("Gecerli bir rakam girinz \n rakamlar 0, 1, 2,3 4, 5, 6, 8, 9 dur");

        }
    }
}


