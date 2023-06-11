package day16_arrayList;

public class C09_ForEachLoop {

    // Soru- 2 Verilen int araydeki her elementin karelerini alıp,
    // karelerin toplamini yazdiran bir method olusturun
    public static void main(String[] args) {

        int[] arr = {3,5,4,3,4};

    arrKareToplamlari(arr);



    }

    public static void arrKareToplamlari(int[] arr ){

        //arraydeki bütün elementlerre ulaşmam lazım

        // array elementleri
        int toplam=0;

        for (int each:arr
             ) {
            // elementlerin toplamini yazdirin
            toplam=toplam+each*each;

        }

        System.out.println("arrayin elemanlarinin toplami : " + toplam);
    }

}
