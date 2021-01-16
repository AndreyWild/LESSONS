package Lesson29;

import java.time.*;

public class Test9 {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.of(15, 44, 24, 123456789);
        LocalDateTime ldt = LocalDateTime.of(2021, Month.MAY, 11, 15, 27, 34, 987654321);
        System.out.println(lt.getNano()); // 123456789
        System.out.println(ldt.getNano()); // 987654321
        System.out.println(lt.getSecond()); // 24
        System.out.println(ldt.getSecond()); // 34
        System.out.println(lt.getMinute()); // 44
        System.out.println(ldt.getMinute()); // 27
        System.out.println(lt.getHour()); // 15
        System.out.println(ldt.getHour()); // 15
    }
}
