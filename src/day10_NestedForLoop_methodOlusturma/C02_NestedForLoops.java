package day10_NestedForLoop_methodOlusturma;

public class C02_NestedForLoops {
    public static void main(String[] args) {
    /*
    Verilen satır ve sütün sayısına uygun olarak aşşağıdaki şekli yazdırın
    ornek : satır 4, sutun 5

    * * * * *
    * * * * *
    * * * * *
    * * * * *

     */
// dikkaet etmemzi gereken şey formatın dikdörtgen şeklinde olması

        int satirSayisi = 4;
        int sutunSayisi = 5;

        for (int i = 1; i <=satirSayisi ; i++) {
            for (int j = 1; j <=sutunSayisi ; j++) {
                System.out.print("* ");
            }
            System.out.println("");

        }


    }
}
