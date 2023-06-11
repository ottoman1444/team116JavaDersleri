package day05_ifElseStatements;

public class C01_basitIfCumleleri {
    public static void main(String[] args) {

        // bağımsız if cümleleri kodun geriye kalanı ile ilgilenmez
        // şarta odaklanır, şart true ise body çalışır, false ise çalışmaz
        // eğer if şartından sonra süslü parantez kullanmazsak
        // java ilk ;'e kadar olan kısmı if body olarak kabul eder.
        // sonraki satırlarla ilgilenmez

        int a = 20;
        int b = 75;
        if (a>b){
            System.out.println("a b den buyuk"); // kod çalışmadı exit code 0 yazdı konsolda.
        }
        if (a % 7 == 0){
            System.out.println("a 7'ye tam bolunur");
        }

        if (b%5 == 0)


        if(a+b > 100){
            System.out.println("sayilarin toplami 100'den buyuk");
        }
        // eğer if şartını yazdığımız ()'den sonra ; yazarsak
        // if statement ;' de biter bu şarta hiç kod kalmaz.
        // birden fazla bağımsız if statement varsa değerler bağlı olarak
        // tüm if bodyleri çalışabilir. çalışabileceği gibi hiç bir if bodysinin
        // çalışmamasıda mümkündür

      /*
        if (b>0)  sadece ilk satır şarta bağlı
            System.out.println("b 0 dan buyuk");
            System.out.println("b gerecekten 0 dan buyuk" );
            System.out.println("Anam avradım olsun b 0 dan buyuk");

         if (b>0);  {    hiç bir kod şarta bvağlı değil
            System.out.println("b 0 dan buyuk");
            System.out.println("b gerecekten 0 dan buyuk" );
            System.out.println("Anam avradım olsun b 0 dan buyuk");
        }

        doğrusu ise {} kullanmak */
        if (b>0)  {
            System.out.println("b 0 dan buyuk");
            System.out.println("b gerecekten 0 dan buyuk" );
            System.out.println("Anam avradım olsun b 0 dan buyuk");
        }


        boolean c = a + 10 > b - 5; // 31 > -80 true

        if (c){
            System.out.println("ozel sart sağlandı");
        }

        if (true) {
            System.out.println("Bu yazi her zaman yazdirilir, cunku sart hep true"); //true olarak sonucu yazdıgımız için bagımsız
            // bir true olusturduk ve hep calısır


        }

        if(false){
            System.out.println("Bu kod hic calısmaz");
        }


    }
}
