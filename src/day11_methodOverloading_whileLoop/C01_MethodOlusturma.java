package day11_methodOverloading_whileLoop;

public class C01_MethodOlusturma {
    public static void main(String[] args) {


    /*
    Saoru-1 Kullanıcıdan input olarak verilen bir string,
            başlangıç ve bitiş indexlerine göre başlangıç index'i dahil,
            bitiş indexi hariç olacak şekilde harfleri yazdıran bir method oluşturun.
            - kullanıcıdan başlangıç değeri olarak, bitiş değerinden büyük bir sayı girerse,
              hata mesajı verin
            - kullanıcı str da olan indexlerden daha büyük bir index girerse hata mesajı verin.

     */
    substringYazdir("Java Candir",2,7);


    }

    public static void substringYazdir(String metin, int baslIndex, int bitIndex){

        if(baslIndex > bitIndex){
            System.out.println("Baslangic index'i bitis index'inden buyuk olamaz");
        } else if (bitIndex>(metin.length()-1)) {
            System.out.println("Istediginiz index metin'in disinda");
        }else{

            for (int i = baslIndex; i <bitIndex ; i++) {

                System.out.print(metin.charAt(i));
            }
        }


    }



}
