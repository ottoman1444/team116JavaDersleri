package day13_arrays;

public class C06_EnUzunEnKisaKelime {

    public static void main(String[] args) {
        //Verilen string bir array'de
        //en uzun ve en kısa kelimeleri yazdiran bir method olusturun


        String[] arr= {"Saida","Isa", "Asil", "Kubra","Elif"};
enUzunVeEnKisaElemanlar(arr);

    }


    public static void enUzunVeEnKisaElemanlar(String[] arr){

        String enKisaEleman=arr[0];
        String enUzunEleman=arr[0];

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i].length() > enUzunEleman.length()){
                enUzunEleman=arr[i];
            }
            if(arr[i].length()<enKisaEleman.length()){
                enKisaEleman=arr[i];
            }


        }
        System.out.println("En uzun kelime : " +enUzunEleman);
        System.out.println("En kısa eleman : " +enKisaEleman);
    }
}
