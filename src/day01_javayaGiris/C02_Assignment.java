package day01_javayaGiris;

public class C02_Assignment {

    public static void main(String[] args) {
        int sayi = 5;
        System.out.println(sayi);
        sayi = 15;
        System.out.println(sayi);
        //eğer sout içerisine variable'ın satırdaki değerini yazıdrmak isterseniz
        //sout içerisinie variable ismini yazmanız yeterlidir.
        sayi =20+ sayi + 10;
        System.out.println(sayi);
        //sayi + 10 = sayi
        // javada eşitliğin sola tarafı veriable dır ve sol tarafta işlem yapmaz
        // eşitliğin sağ tarafı değerdir, burada işlemler olabilir
        // java = görünce önce eşitliğin sağını hesaplar
        //sonra sağ tarafta bulduğu değeri veriable'a atama yapar

        sayi = 2*sayi;
        System.out.println(sayi);

        //int sayi = 50; data türü yukarıda tanımlanmıştı. Java oluşturulan bir
        // veriabe'ın data türünü değiştirilmesine izin vermez
        // onun için data türü sadece 1 kere yazılabilir
    }
}
