package Lesson29;

import java.time.*;

public class Test5 {
    static void smenaDezhurnogo(LocalDate nachalo, LocalDate konec, Period p) {
        LocalDate data = nachalo;
        int count = 0;
        while (data.isBefore(konec)) {
            count++;
            System.out.println(count + ") Наступила дата " + data + ". Пора менять дежурного.");
            data = data.plus(p);
        }
    }

    public static void main(String[] args) {
        LocalDate nachalo = LocalDate.of(2021,Month.SEPTEMBER, 1);
        LocalDate konec = LocalDate.of(2025, Month.MAY, 31);
        Period p = Period.of(1, 2, 3); // период 1 год, 2 месяц, 3 дня)
        smenaDezhurnogo(nachalo, konec, p);
    }
}
