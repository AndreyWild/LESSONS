package Lesson29;

import java.time.*;

public class Test3 {
    public static void main(String[] args) {
//        LocalDate ld1 = LocalDate.of(2021, 1, 10);
//        System.out.println(ld1); // 2021-01-10
//        ld1.plusDays(5);
//        System.out.println(ld1); // 2021-01-10 // т.к. LocalDate неизменно
//        LocalDate ld2 = ld1.plusDays(5);
//        System.out.println(ld2); // 2021-01-15 т.к. создали новый объект на основе старого
//        // или так
//        ld1 = ld1.plusDays(25);
//        System.out.println(ld1); // 2021-02-04
//        ld1 = ld1.minusDays(12);
//        System.out.println(ld1); // 2021-01-23


//        LocalTime lt1 = LocalTime.of(18, 14);
//        System.out.println(lt1); // 18:14
//        lt1.plusHours(1);
//        lt1.minusMinutes(10);
//        lt1.plusSeconds(18);
//        lt1.minusNanos(5);
//        System.out.println(lt1); // 18:14 т.к. объект неизменяемый
//        // но
//        lt1 = lt1.plusHours(1);
//        lt1 = lt1.minusMinutes(10);
//        lt1 = lt1.plusSeconds(18);
//        lt1 = lt1.minusNanos(5);
//        System.out.println(lt1); // 19:04:17.999999995
//        // или так
//        lt1 = lt1.plusHours(1).minusMinutes(10).plusSeconds(18).minusNanos(5);
//        System.out.println(lt1); // 19:54:35.999999990


        LocalDateTime ldt1 = LocalDateTime.of(2021, 1, 10, 18, 18);
        System.out.println(ldt1); // 2021-01-10T18:18
        ldt1 = ldt1.plusYears(3).minusMonths(3).minusSeconds(30);
        System.out.println(ldt1); // 2023-10-10T18:17:30

    }
}
