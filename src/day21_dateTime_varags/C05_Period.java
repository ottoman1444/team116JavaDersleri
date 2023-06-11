package day21_dateTime_varags;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class C05_Period {
    public static void main(String[] args) {

        LocalDate dogumTarihi = LocalDate.of(2000,7,4);
        LocalDate bugun =LocalDate.now();

        Period yasNuman = Period.between(dogumTarihi,bugun);
        System.out.println(yasNuman); //P 22Y 11M 7D 22 yasinda

        System.out.println("Numanin yasi : " + yasNuman.getYears()); //22
    }
}
