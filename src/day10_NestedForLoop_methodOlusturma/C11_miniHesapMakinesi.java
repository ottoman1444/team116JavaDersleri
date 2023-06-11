package day10_NestedForLoop_methodOlusturma;

public class C11_miniHesapMakinesi {
    public static void main(String[] args) {
        /*
        kullanıcının verdiği iki sayi ve
        seçeceği işleme göre
        sonucu double bize döndüren bir method oluşturun
        örenk sayılar 3,5 islem * olduğunda method 15 döndürmeli
         */
        miniHesapMakinesi(5, 4, '+');
        //bize sonuc donduren methodlarda,
        // islem sonucunu gormek isterseniz direk yazdirabilir veya
        System.out.println(miniHesapMakinesi(5, 4, '+'));

        double sonuc = miniHesapMakinesi(5,4,'+');
    }

    public static double miniHesapMakinesi(int sayi1, int sayi2, char islemSembolu){
        // islem sembolu olarak +, -, *, / kullanılabilsin
        double sonuc = 0;
        switch (islemSembolu){
            case '+':
                sonuc= sayi1+sayi2;
                break;
            case '-':
                sonuc=sayi1-sayi2;
                break;
            case '/':
                sonuc=sayi1/sayi2;
            case '*':
                sonuc=sayi1*sayi2;
                break;
            default:
                System.out.println("islem sembolu yanlis, sonuc 0 olarak atandi");
        }
        return sonuc;
    }
}
