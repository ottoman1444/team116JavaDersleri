package day04_increment_concatenation;

public class C04_Concatenation {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Candir";
        String s3 = " ";
        String s4 = "";

        int i1 = 3;
        int i2 = 4;
        // sadece bu variable'lari kullanara aşşağıdaki metinleri yazdırın

        // Java Candır

        System.out.println( s1 +s3 + s2); // Java Candir

        // Java 34

        System.out.println(s1 + s3 + i1+i2); // 3 ve 4 ü toplayıp 7 yapmamasının sebebi işlem  önceliği
        // önce s1 ve s3 ü topladı. Sonrasında string değerleri ile int değerlerini sırasıyla toplarken stringleştirdi.

        // Java 7
        System.out.println( s1 + s3 +(i1+i2));

        // 12 Java

        System.out.println(i1*i2+s3+s1);

        // 34 Candir

        System.out.println(s4+i1+i2+ s3 + s2);
    }
}
