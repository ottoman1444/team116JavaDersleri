package day21_dateTime_varags;

public class C08_Varags {
    public static void main(String[] args) {
        //Verilen degisken sayidaki tam sayidan
        // ilkinin karesini digerlerinin toplamiyla
        // carpan ve sonucu yazdiran bir method olusturn


        islemYap(3,4,5); // (3*3)* (4+5) =81
        islemYap(2,3,4,5); // (2*2)*(3+4+5) =48
        islemYap(4,5,6,7,8,9,0); //istenen islem sonucu : 560
        islemYap(1,2); //istenen islem sonucu : 2
        islemYap(5);
        //varags degisen sayida element kabul edebilen bir array oldugundan
        //12. satirda yazilam islemde varags eleman kalmaz, varags= [] bos bir array olur.

    }


    public static void islemYap(int ilkSayi, int... geriyeKalanSayilar){

        int toplam = 0;

        for (int each:geriyeKalanSayilar
             ) {
            toplam+=each;
        }

        System.out.println("istenen islem sonucu : " + (ilkSayi*ilkSayi*toplam));
    }




}
