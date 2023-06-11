package day19_staticKeyword_passByValue;

public class    C01_static {

    static String staticV = "Java Cansir";
    String instanceV = "Selenium heyeceandır";


    public static void main(String[] args) {

        staticV="Java Hayattir";
        //System.out.println(instanceV);

    }

    public static void staticMethod(){
        System.out.println("static method calisti");
        System.out.println(staticV);
        //System.out.println(instanceV);
    }

    public void staticOlmayanMethod(){
        System.out.println("Static olmayan method calisti");
        System.out.println(staticV);
        staticMethod();
        System.out.println(instanceV);
    }
}



