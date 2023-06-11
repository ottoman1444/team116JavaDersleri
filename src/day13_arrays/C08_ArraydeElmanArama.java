package day13_arrays;

public class C08_ArraydeElmanArama {

    public static void main(String[] args) {
        // Soru-4  Verilne bir array'de
        //         istenen bir elemanin var olup olamdigini
        //         ve varsa kac kere kullanildigini yazdiran bir method olusturun.



        String[] sinifListesi = {"Saida","Isa", "Asil", "Kubra","Elif"};
        String arananIsim = "Isa";

        arrayElemanBul(sinifListesi,arananIsim);
    }



    public static void arrayElemanBul(String[] arr, String arananIsim){

        int sayac=0;

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i].equalsIgnoreCase(arananIsim)){
                sayac++;
            }
            if (sayac==0){
                System.out.println("Aradaginiz isim sınıf listesinde yok");
            }else {
                System.out.println("Aradiginiz isim sinif listesinde " +sayac+" kadar bulunuyor");
            }


        }
    }
}
