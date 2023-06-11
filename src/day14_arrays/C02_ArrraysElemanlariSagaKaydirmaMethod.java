package day14_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C02_ArrraysElemanlariSagaKaydirmaMethod {

    public static void main(String[] args) {
        // Soru 3- Verilen bir array'deki tüm elementleri bir saga kaydırıp,
        //         sondaki elementide basa tasıyacak bir method olusturun,
        //    Orn : input : [4,5,6,7] arraydeki son hali. : [7,4,5,6]

        // 1) Son elemanı geçici bir yere kaydet
        // 2) Elemanlari saga kaydirdik
        // 3) Son elemani basa koy

        int[] input = {4,5,6,7};
        System.out.println(Arrays.toString(input)); //[4, 5, 6, 7]

        input = elemlariSagaKydir(input); //methodu kullanmak cagirdik

        System.out.println(Arrays.toString(input)); //[7, 4, 5, 6]


    }
    // methodun (makinenin) kendisi
    public static int[] elemlariSagaKydir(int[] input){
        // 0 1 2 3
        //[4,5,6,7]

        //1) arary'in son elemani kaydet. Lenght kullanarak dinamik yapalim
        int gecici = input[input.length-1]; // son eleman index lenght -1

        // 2) dinamik olarak elemanlari saga kaydir

        for (int i = input.length-2; i >=0 ; i--) {
            input[i+1] =input[i];

        }
        // 3)kaydedilen geçici elemani basa koy

        input[0]=gecici;

        return input; // updated(degistirilen) array methodun cagırıldigi yere dondurulur
    }
}
