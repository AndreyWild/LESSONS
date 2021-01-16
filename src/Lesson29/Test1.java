package Lesson29;

import java.time.*;

public class Test1 {
    public static void main(String[] args) {
//        System.out.println(LocalDate.now()); // 2021-01-10
//        System.out.println(LocalTime.now()); // 17:40:04.616472300
//        System.out.println(LocalDateTime.now()); // 2021-01-10T17:40:04.616472300
        LocalDate ld1 = LocalDate.of(2021, 1, 10);
        System.out.println(ld1); // 2021-01-10
        LocalDate ld2 = LocalDate.of(2021, Month.JANUARY, 10);
        System.out.println(ld2); // 2021-01-10
        LocalTime lt1 = LocalTime.of(18, 14);
        System.out.println(lt1); // 18:14
        LocalTime lt2 = LocalTime.of(18, 14, 12);
        System.out.println(lt2); // 18:14:12
        LocalTime lt3 = LocalTime.of(18, 14, 12, 123456789);
        System.out.println(lt3); // 18:14:12.123456789
        LocalDateTime ldt1 = LocalDateTime.of(2021, 1, 10, 18, 18);
        System.out.println(ldt1); // 2021-01-10T18:18
        LocalDateTime ldt2 = LocalDateTime.of(2021, 1, 10, 18, 21, 35);
        System.out.println(ldt2); // 2021-01-10T18:21:35
        LocalDateTime ldt3 = LocalDateTime.of(2021, 1, 10, 18, 21, 35, 123456789);
        System.out.println(ldt3); // 2021-01-10T18:21:35.123456789
        LocalDateTime ldt4 = LocalDateTime.of(2021, Month.JANUARY, 10, 18, 21, 35, 987654321);
        System.out.println(ldt4); // 2021-01-10T18:21:35.987654321
        LocalDateTime ldt5 = LocalDateTime.of(ld1, lt1);
        System.out.println(ldt5); // 2021-01-10T18:14
        LocalDate ld3 = LocalDate.of(2021, 15, 10);
        System.out.println(ld1); // 2021-01-10
    }
}
