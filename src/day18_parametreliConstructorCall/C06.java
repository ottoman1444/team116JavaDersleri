package day18_parametreliConstructorCall;

public class C06 {



    C06(){
        System.out.println("parametresiz constructor");

    }


    C06(int sayi){
        //C06(); java bu sekilde yazımı method call kabul eder
        // yani constructorlar cons ismi yazılarak çağırılamaz

        this();
       // bir constructorun içinde baska bir constructoru calıstırmak istersek
        // this(istenen const.) yazariz
        System.out.println("int parametreli constructor");
    }

    C06(String str){
        this(3);
        System.out.println("String parametreli cons.");
    }

    public static void main(String[] args) {


    C06 obj = new C06("Java");


    }
}
