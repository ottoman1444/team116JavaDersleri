package day07_switchStatements_StringManipulations;

public class C09_EqualsIgnoreCase {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "JaVa";
        String str6 = new String("Java");

        System.out.println(str1.equalsIgnoreCase(str3)); // true   Java java
        //büyük küçük harfe takılmadan karşılaştır. Büyük küçük harfleri ıgnore et
        System.out.println(str4.equalsIgnoreCase(str5));// true  JAVA JaVa
        System.out.println(str6.equalsIgnoreCase(str2)); // true JaVa Java


    }
}
