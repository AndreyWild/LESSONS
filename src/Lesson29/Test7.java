package Lesson29;
import java.time.*;
public class Test7 {
    public static void main(String[] args) {
        LocalDateTime ltd = LocalDateTime.of(2021,Month.JANUARY,11, 15, 27);
        System.out.println(ltd); // 2021-01-11T15:27
        Period p = Period.ofMonths(3);
        Duration d = Duration.ofMinutes(3);
        System.out.println(ltd.plus(d).plus(p)); // 2021-04-11T15:30
    }
}
