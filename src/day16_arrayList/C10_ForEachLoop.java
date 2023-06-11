package day16_arrayList;

public class C10_ForEachLoop {

    /*
    bir array icindeki sayilardan 5 ten buyuk olanlari toplayalim
     */
    public static void main(String[] args) {
        int[] arr = {5,7,6,4,2,4,6,8,0,9,5,4,6,8,5,3,2,4,6,7,8,0,7,5,4,5};


        // for each loop kullandigimizda 3 unsura dikkat etmemiz gerekiyor
        // Her bir elementin data typi ( int )
        // her bir elemente ortak bir isim (each)
        // elementlerin geldigi kaynak (arr)
        int toplam =0;

        for (int each:arr
             ) {
          if (each>5){
              toplam+=each;
          }


        }

        System.out.println("Array icindeki 5 ten buyuk elamanlari toplama : " +toplam);



    }
}
