package day21_dateTime_varags;

public class C07_Varags {
    public static void main(String[] args) {
        topla(15,6); // sayilar[] = {15,6}
        topla(15,20,25); // sayilar[] = {15,20,25}
        topla(10,13,44,35); // sayilar[] = {10,13,44,35}
        topla(12,14,14,12,23); //Verilen 5 elemntin toplami : 75
        topla(1,3,5,7,8,3,4,2);  //Verilen 8 elemntin toplami : 33
        topla(1,3,5,7,8,3,4,2);  //Verilen 8 elemntin toplami : 33
        topla(2,3,5,6,7,8,9,1,2,3,5); //Verilen 11 elemntin toplami : 51
        topla(1,2,5,6,9543,654,63543,243,65654,5435,5432135,123); //Verilen 12 elemntin toplami : 5577344
    }


    public static void topla(int... sayilar){

        /*
        javada int... , String.. gibi varaible data turunun yanina ... konursa
        uznlugu degisken olan bir array ifade eder
        buna varags denir (variety of arguments) yani argumentlerin farliligi denir
         */

        int toplam = 0;

        for (int each:sayilar
             ) {
            toplam+= each;
        }

        System.out.println("Verilen " +sayilar.length+" elemntin toplami : "+ toplam);

    }
}
