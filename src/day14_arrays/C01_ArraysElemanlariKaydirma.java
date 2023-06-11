package day14_arrays;

import java.util.Arrays;

public class C01_ArraysElemanlariKaydirma {
    public static void main(String[] args) {

        // Soru 3- Verilen bir array'deki tüm elementleri bir saga kaydırıp,
        //         sondaki elementide basa tasıyacak bir method olusturun,
        //    Orn : input : [4,5,6,7] arraydeki son hali. : [7,4,5,6]

        //              0 1 2 3
        int [] input = {4,5,6,7};

        int[] output = new int[4];

        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(output));

        // 1. adım ==> son elemanı geçici bir yere kaydet
        int geciciKayitYeri = input[3];

        // 2) Elemanlari saga kaydirdik
        output[3]=input[2];
        output[2]=input[1];
        output[1]=input[0];

        System.out.println(Arrays.toString(output)); //[0, 4, 5, 6]
        // kaydettigimiz son elemani yeni arrayin başina koyduk
        output[0] = geciciKayitYeri;

        System.out.println(Arrays.toString(output)); //[7, 4, 5, 6]

    }
}