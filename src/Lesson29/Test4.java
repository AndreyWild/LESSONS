package Lesson29;

import java.time.*;

public class Test4 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2021, 1, 10);
        LocalDate ld2 = LocalDate.of(2019, Month.JUNE, 18);
        System.out.println(ld1.isAfter(ld2)); // true
        System.out.println(ld1.isBefore(ld2)); // false

        LocalTime lt1 = LocalTime.of(18, 14);
        LocalTime lt2 = LocalTime.of(3, 5, 18, 55598);
        System.out.println(lt1.isAfter(lt2)); // true
        System.out.println(lt1.isBefore(lt2)); // false

        LocalDateTime ldt1 = LocalDateTime.of(2021, 1, 10, 18, 18);
        LocalDateTime ldt2 = LocalDateTime.of(2021, 1, 10, 18, 18, 9);
        System.out.println(ldt1.isAfter(ldt2)); // false
        System.out.println(ldt1.isBefore(ldt2)); // true
    }
}
