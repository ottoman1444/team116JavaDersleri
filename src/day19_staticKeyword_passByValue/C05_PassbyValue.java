package day19_staticKeyword_passByValue;

public class C05_PassbyValue {

    public static void main(String[] args) {
        double fiyat = 200;

        // fiyat uzerinde %10 indirim yapıp yeni fiyatı yazdıran bir method olusturun



        indirimYap10(fiyat); // 180

        System.out.println("indirimli fiyat yazdirildiktan sponra " + fiyat); // 180 yazmasını bekledik ama 200 yazdı
        //local variableları baska scopeda kullanamayız. guncellenen deger localde kalır.

    }



    public static void indirimYap10(double fiyat){
        //21. satırdaki fiyatı aaaa yazıp local fiyat variablelarının isminide aaa yaparsak kod calısmaya devam eder.
        // methoda ayzdigimiz  parametre isimi main methoddaki variable ile ayni olamak zorunda DEĞİLDİR
        //ama kodun daha anlaşılarbilir olamsı için biz aynı ismi vermeyi tercih ederiz. bu genel convention dur. Camle case gibi
        // java hiç bir zaman methoddan methoda gecişte variableın kendisini gondermez. onun yerine degerini gonderir orada degidiklik
        // yapılır. yapılan degisiklikte mthodda kalır.  dolayısıyla methodda yapılan degisiklik methodda kalacagından ust tarafta herhangi bir degisiklik olmaz
        // pekiya degistirmek istersek? yeni clasa bak

        fiyat = fiyat*90/100;
        System.out.println("%10 indirimli fiyat : "+fiyat);
    }
}
