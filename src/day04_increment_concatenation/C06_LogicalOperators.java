package day04_increment_concatenation;

public class C06_LogicalOperators {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;

        // üçünün birbirine eşit olduğunu kontrol edelim
        // matemetikte olsa üçünü yan yana yazabilirdik ama
        // javada karşılaştırma operatörleri hep 2 taneyi karşılaştırır.

        System.out.println(a == b && b == c); // false

        // a sayısının pozitif ve 2 ile tam bölünebilir olduğunu kontrol edin.

        System.out.println(a > 0 && a%2==0); // true

        // 20 sayısının 10ile 50 arasında olduğunu kontrol edin

        System.out.println( b>10 && b<50); // true

        // b sayısının 10 ile 50 arasında olmadığını kontrol edin

        System.out.println( b<10 || 50<b); // false
    }
}
