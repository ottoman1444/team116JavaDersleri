package day09_StringMaipulation_forLoop;

public class C05_forLoop {
    public static void main(String[] args) {

        //10 kere "Hello World" yazdirin

        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        System.out.println("============");
        String str = "\nHello World ";

        System.out.println(str.repeat(10));

        //1'den 100ê kadar(100 dahil) olan sayilari yazdirin

        // verilem bir sayinin rakamlar toplamini bulun


        //java bir for loop gördüüğnde ilk önce parantez içine bakıp i diye bir variable olusturur.
        // Daha sonra bunu kontrol etmeye baslar i sarttan kucukmu diye. 1<100 true ise for bodysi çalışır. sout 1 yazdırıp
        // yanına bosluk bırakır. SONA GELDİĞİMİZDE basa döner. basa dödüğümüzde yeni bir variable olusturmaz

        for (int i = 1; i <= 100; i++) {

            System.out.print(i+" ");

        }


        //3 basamakli cift sayilarin toplami

        int sayilarToplami=0;

        for (int i = 100; i <1000 ; i+=2) {
            sayilarToplami += i;
            System.out.println(sayilarToplami);
        }
        //şart sağlanmadıktan sonra alt kısımdaki sout çalışır
        System.out.println("\n"+sayilarToplami);

        sayilarToplami =0;
        for (int i = 100; i <1000 ; i++) {

            if (i%2==0){
                sayilarToplami +=i;

            }

        }
        System.out.println(sayilarToplami);
    }
}
