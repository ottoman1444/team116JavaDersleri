package day13_arrays;

public class C05_ArraydekiEnBuyukSayiBulma {



    public static void main(String[] args) {

        // verilen int arraydeki en buyuk sayiyi bize donduren bir method olusturun

        int[] arr = {2,4,6,8,1,3,8,2};
        int[] ayy = {8,8 ,8 ,426 ,48};

        System.out.println(enBuyukSayi(arr)); //8
        System.out.println(enBuyukSayi(ayy)); //426
    }



    public static int enBuyukSayi(int[] arr){

        int enBuyukSayi =arr[0];

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i] > enBuyukSayi){
                enBuyukSayi=arr[i];
            }

        }

        return enBuyukSayi;
    }

}
