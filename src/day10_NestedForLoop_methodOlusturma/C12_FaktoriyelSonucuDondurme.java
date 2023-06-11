package day10_NestedForLoop_methodOlusturma;

public class  C12_FaktoriyelSonucuDondurme {
    public static void main(String[] args) {
        // Verilen sayının faktoriyel değerini hesaplayıp
        // sonucu döndüren bir method oluşturun
    faltoriyelDegeriDondur(7);
int yediFaktoriyel = faltoriyelDegeriDondur(7);
    }



    public static int faltoriyelDegeriDondur(int sayi){
        int faktoriyel=1;

        for (int i = sayi; i >=1 ; i--) {
            faktoriyel*=i;


        }
        System.out.println(sayi+"! = "+ faktoriyel);
return faktoriyel;
    }

}
