package day13_arrays;

public class C4ArraydeIstenenSartiSaglayanElementSayisi {

    public static void main(String[] args) {

        int[] arr = {2,4,6,8,1,3,8,2};

        // arrayde kac tane cift sayi oldugunu yazdirin .

        int sayac = 0;

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i] %2 ==0){
                sayac++;
            }

        }
        System.out.println("Verilen arraydaki cift sayi adedi : " + sayac);

        // arrayde 3 ile bolunebilen kac sayi oldugunu, yazdirin


        sayac = 0;

        for (int i = 0; i <arr.length ; i++) {


            if (arr[i] % 3 == 0){
                sayac++;
            }

        }
        System.out.println("Verilen arrayde 3 e tam bolunen sayi adedi : " +sayac);

        // verilen arrayde 4 ile 8 (sinşrler dahil kac sayi oldugunu yqzdirin

        sayac = 0;

        for (int i = 0; i <arr.length ; i++) {

            if ((arr[i] >4) && (arr[i] <8)){
                sayac++;
            }

        }
        System.out.println("4 ile 8 arasında " +sayac + " kadar sayı var");




    }













}
