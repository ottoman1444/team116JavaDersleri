package day07_switchStatements_StringManipulations;

public class C10_Substring {
    public static void main(String[] args) {

        String str = "Java Candir";

        // sadece Candir kismini yazdiralim

        System.out.println(str.substring(5)); // Candir

        System.out.println(str.substring(2)); // va Candir

        System.out.println(str.substring(10)); // r

        System.out.println(str.substring(11)); // boş satır

        //System.out.println(str.substring(12)); //g.StringIndexOutOfBoundsException

        // sadece Java kısımını yazdırın

        System.out.println(str.substring(0,3)); // Jav

        //Java'da baslangıc ve bitis indexleri verildiginde
        //Genellikle baslangic index'i dahil(inclusive)
        //bitis index'i haric(exclusive)olur. Yani son harf dahil degil olarak algılar.

        System.out.println(str.substring(0, 4)); // Java

        System.out.println(str.substring(3, 4)); //[3,4) a
        System.out.println(str.substring(1, 2)); //[1,2) a

        // sadece bir harf almak isterseniz subsitring(harfinIndexi, harfinIndexi+1) yazabiliriz

        System.out.println(str.substring(5,5)); // hiçlik boş satır.

        //System.out.println(str.substring(8, 5)); //.StringIndexOutOfBoundsException Range [8, 5) out of bounds for length 11
        // geriye doğru gitmek mümkün değil


        String str2 = "eSRa";
        // ilk harfini buyuk, kalanlari kucuk harf olacak sekilde duzenleyin

        str2 = str2.substring(0,1).toUpperCase() + str2.substring(1).toLowerCase();
        System.out.println(str2); //Esra

    }
}
