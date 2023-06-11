package day10_NestedForLoop_methodOlusturma;

public class C10_AsalsayiSonucuYazdirma {
    public static void main(String[] args) {
        //verilen sayinin asal sayi olup olmadigini yazdiran bir method olusturun
          asalSayiMiYazdir(37);
          asalSayiMiYazdir(79);
          asalSayiMiYazdir(234567777);

    }

    public static void asalSayiMiYazdir(int sayi){


        boolean asalmi = true;

        for (int i = 2; i <sayi ; i++) {

            if(sayi%i==0){
                asalmi=false;
                break;
            }
        }//bir loopun içerisinde loopun çalışmasını durdurmak için
         // break yazabilirsiniz

        if (asalmi==true){
            System.out.println(sayi +" sayisi asal");
        }else System.out.println(sayi + " sayisi asal degil");

    }


}
