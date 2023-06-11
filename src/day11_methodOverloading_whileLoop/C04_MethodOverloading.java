package day11_methodOverloading_whileLoop;
public class C04_MethodOverloading {

    public static void main(String[] args) {
topla(4,5);
    topla('a','b');

    topla(3.2f,5.1f);
    }

    public static void topla(double sayi1, double sayi2){ //2 tane casting

        System.out.println("Iki double'in toplami : " + (sayi1+sayi2));
    }

public static void toplam(int sayi1, float sayi2){ //1 tane caasting var.
    System.out.println("int ve folatın toplami : " + (sayi1+sayi2));
}
/*
Java overloading yapılmış methodlardan hangisinin çalışacağına kara verirken adım adım gider.
1- Eğer argumentler ile parametreler tamamen uyumluysa onu çalıştırır.
2 eger argument ve parametreler yuzde yuz değilse casting yapabilir miyim diye bakar
3 casting ile calıstıracagı birden fazla method bulursa,
  en az casting ile calısıtıracagını tercih eder
 */
}
