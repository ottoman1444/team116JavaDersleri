package day08_StringManipulations;

public class C10_replaceAll {
    public static void main(String[] args) {


        // str icindeki butun sayıları methodlAR İLE TEMİZLEYİN
        String str = "Jdsflksdmfl 'fsdl(&%=()/(26+1231";

        /*
        replaceAll methodu, elemantlerin ortak ozelliklerini kullanarak,
        Genel ozellikler javada regex olarak tanimlaniyor.
         */

        System.out.println(str.replaceAll("\\d", "")); //Jdsflksdmfl 'fsdl(&%=()/(+


    }
}
