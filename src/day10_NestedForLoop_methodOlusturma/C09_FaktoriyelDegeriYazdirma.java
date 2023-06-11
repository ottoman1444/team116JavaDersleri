package day10_NestedForLoop_methodOlusturma;

public class C09_FaktoriyelDegeriYazdirma {

    public static void main(String[] args) {
        // veridigimiz bir sayinin faktoriyel degerini yazdiran
        // bir method olusturun

        faktoriyelDegeriYazdir(5); // 5! = 120
        faktoriyelDegeriYazdir(7); // 7! = 5040
    }

    public static void faktoriyelDegeriYazdir(int sayi){

        int faktoriyel =1;

        for (int i = sayi; i >=1 ; i--) {

            faktoriyel*=i;
            
        }

        System.out.println(sayi +"! = " + faktoriyel);
    }



}
