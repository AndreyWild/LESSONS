package Lesson29;

import java.text.Format;
import java.time.*;
import java.time.format.*;

public class Test10 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2021, Month.MAY, 11);
        LocalDateTime ldt = LocalDateTime.of(2021, Month.MAY, 11, 15, 27);
        LocalTime lt = LocalTime.of(15, 54);

        DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(ld); // 2021-05-11
        System.out.println(ld.format(d1)); // 2021-05-11

        DateTimeFormatter d2 = DateTimeFormatter.ISO_LOCAL_TIME;
        System.out.println(lt); // 15:54
        System.out.println(lt.format(d2)); // 15:54:00
        System.out.println(lt.format(DateTimeFormatter.ISO_LOCAL_TIME)); // 15:54:00

        DateTimeFormatter d3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println(ldt); // 2021-05-11T15:27
        System.out.println(ldt.format(d3)); // 2021-05-11T15:27:00
        System.out.println(ldt.format(d1)); // 2021-05-11
        System.out.println(ldt.format(d2)); // 15:27:00

        DateTimeFormatter d4 = DateTimeFormatter.ISO_WEEK_DATE;
        System.out.println(ldt); // 2021-05-11T15:27
        System.out.println(ldt.format(d4)); // 2021-W19-2 год - 19 неделя - 2 день недели

        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(ld); // 2021-05-11
        System.out.println(ld.format(shortFormat)); // 11.05.2021
        System.out.println(ldt); // 2021-05-11T15:27
        System.out.println(ldt.format(shortFormat)); // 11.05.2021

        DateTimeFormatter shortFormatTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(lt); // 15:54
        System.out.println(lt.format(shortFormatTime)); // 15:54
        System.out.println(ldt); // 2021-05-11T15:27
        System.out.println(ldt.format(shortFormatTime)); // 15:27

        DateTimeFormatter shortFormatDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(ldt); // 2021-05-11T15:27
        System.out.println(ldt.format(shortFormatDateTime)); // 11.05.2021, 15:27
        // можно записать так
        System.out.println(shortFormatDateTime.format(ldt)); // 11.05.2021, 15:27

    }
}
