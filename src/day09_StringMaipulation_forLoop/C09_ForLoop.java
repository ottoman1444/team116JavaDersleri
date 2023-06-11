package day09_StringMaipulation_forLoop;

public class C09_ForLoop {
    public static void main(String[] args) {
        
    
    /*
    verilen bir metindeki büyük harf küçük harf ve space sayılarını bulun
    space sayısını göz önüne alarak kaç kelime olduğunu,
    kaç tane küçük ve büyük harf olduğunu yazdirin
     */

        String str = "Java ogrenen isi kapar";

        int buyukHarfSayisi=0;
        int kucukHarfSayisi=0;
        int spaceSayisi=0;

        for (int i = 0; i < str.length() ; i++) {
            char karakter = str.charAt(i);

            if (karakter>='a' && karakter<='z') {
               kucukHarfSayisi++;
            }else if (karakter>='A' && karakter<='Z'){
                buyukHarfSayisi++;
            } else if (str.contains(" ") ) {
                spaceSayisi++;

            }
        }
        System.out.println("Space sayisi :" + (spaceSayisi +1) +
                           "\n kucuk harf sayisi: " + kucukHarfSayisi+
                           "\nbuyuk harf sayisi: " + buyukHarfSayisi);
    }
    

}
