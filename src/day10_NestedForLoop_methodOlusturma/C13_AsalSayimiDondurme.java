package day10_NestedForLoop_methodOlusturma;

public class C13_AsalSayimiDondurme {
    public static void main(String[] args) {
        //verilen bir sayinin asal sayi olup olmaddiğini ture false olarak döndüren bir method oluşturun
        System.out.println(asalSayiMi(23)); //true

        /*
        method call sırasında parantez içerisine yazdığımız deger/variable'lara argument denir
        method() icindeki variable'lara ise parametre denir

        method'un calışması için
        argument ve parametre sayilari ve data turleri uyumlu olmalidir
         */
    }

    public static boolean asalSayiMi(int sayi){
        boolean asalMi =true;
        for (int i = 2; i <sayi ; i++) {
            System.out.println("dene "+i);

            if (sayi%i==0){
                asalMi=false;
                break;
            }

        }
return asalMi;
    }
}
