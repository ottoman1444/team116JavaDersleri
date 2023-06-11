package day10_NestedForLoop_methodOlusturma;

public class C05_NestedForLoop {
    public static void main(String[] args) {
        
        /*
        Verilen bşr sayi icin assagidaki sekli olusturun
        int sayi = 5;
        * 
        * * 
        * * *
        * * * *
        * * * * *
         */
int sayi= 5;
        for (int i = 1; i <=sayi ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = sayi-1; i >0 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
