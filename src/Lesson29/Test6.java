package Lesson29;
import java.time.*;
public class Test6 {
    public static void main(String[] args) {
        LocalDate nachalo = LocalDate.of(2021,Month.SEPTEMBER, 1);
        Period p = Period.ofDays(10);
        System.out.println(nachalo.plus(p)); // 2021-09-11
        Period p2 = Period.ofMonths(3).ofDays(10); // метод чейнинг не работает
        System.out.println(nachalo.plus(p2)); // 2021-09-11
    }
}
