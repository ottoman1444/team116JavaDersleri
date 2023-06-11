package day19_staticKeyword_passByValue;

public class C06_PassByValue {

    public static void main(String[] args) {
        double fiyat = 200;

        //verilen fiayttan %10 indirim yapıp
        // yeni fiyattan bize donduren bir method olusturun
        fiyat = indiirmYap10(fiyat);
        //sadece indirimli fiyatı yazdırmak istersem
        System.out.println(indiirmYap10(fiyat));

        System.out.println("indirimli fiyat yazdırdıktan sonra fiyat : " + fiyat);

        System.out.println(indiirmYap10(500)); //450
    }

// diger methodda olan atama diger methodda kalır.
    public static double indiirmYap10(double fiyat){

        fiyat = fiyat*90/100;

        return fiyat;
        //atamayı burda yaptgımız icin bu atama methooda kalır.
        //atamayı aklıcı hale getirmek icin main method icinde atam yapmalıyım. satır 10 eklendi.





    }
}
