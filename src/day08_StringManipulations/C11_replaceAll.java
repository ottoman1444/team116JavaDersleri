package day08_StringManipulations;

public class C11_replaceAll {
    public static void main(String[] args) {
        String str = "              ösdlkgnvdfisöb fdmkçbms54651654%&/()=?)%+%&/()=";


        System.out.println(str.replaceAll("\\d", "")); //              ösdlkgnvdfisöb fdmkçbms%&/()=?)%+%&/()=

        str = str.trim();
        System.out.println(str); //ösdlkgnvdfisöb fdmkçbms54651654%&/()=?)%+%&/()=

        str = str.replaceAll("\\W","");
        System.out.println(str); //sdlkgnvdfisbfdmkbms54651654



    }
}
