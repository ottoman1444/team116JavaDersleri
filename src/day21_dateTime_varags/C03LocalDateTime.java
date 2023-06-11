package day21_dateTime_varags;

import java.time.LocalDateTime;

public class C03LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime ts = LocalDateTime.now();

        System.out.println(ts); // 2023-06-11T17:39:04.580830

        //tarih ve saati su sekilde yazdirin 11/06/2023 5:41

        System.out.println(ts.getDayOfMonth() + "/" + ts.getMonth() +"/" + ts.getYear()+" " + ts.getHour() + ":" + ts.getMinute());

        System.out.println(ts.plusHours(100)); //2023-06-15T21:45:00.567104600
    }
}
