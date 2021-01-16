package Lesson29;
import java.time.*;
public class Test8 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2021,Month.MAY,11);
        LocalDateTime ldt = LocalDateTime.of(2021,Month.MAY,11, 15, 27);
        System.out.println(ld.getDayOfWeek()); // MONDAY
        System.out.println(ldt.getDayOfWeek()); // MONDAY
        System.out.println(ld.getDayOfMonth()); // 11
        System.out.println(ldt.getDayOfMonth()); // 11
        System.out.println(ld.getDayOfYear()); // 131
        System.out.println(ldt.getDayOfYear()); // 131
        System.out.println(ld.getMonth()); // MAY
        System.out.println(ldt.getMonth()); // MAY
        System.out.println(ld.getMonthValue()); // 5
        System.out.println(ldt.getMonthValue()); // 5
        System.out.println(ld.getYear()); // 2021
        System.out.println(ldt.getYear()); // 2021
    }
}
