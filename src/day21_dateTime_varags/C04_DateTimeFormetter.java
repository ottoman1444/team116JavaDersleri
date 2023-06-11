package day21_dateTime_varags;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormetter {

    public static void main(String[] args) {

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MMM/yyyy hh:mm a");

        LocalDateTime ts =LocalDateTime.now();

        System.out.println(ts); //2023-06-11T17:53:10.460519900

        System.out.println(ts.format(dtf1)); //11/Jun/2023 05:54 PM

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("d.M.yy HH:mm");

        System.out.println(ts.format(dtf2)); //11.6.23 17:56
    }
}
