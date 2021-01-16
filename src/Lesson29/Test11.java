package Lesson29;

import java.time.*;
import java.time.format.*;

public class Test11 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2021, Month.MAY, 11);
        LocalDateTime ldt = LocalDateTime.of(2014, Month.MARCH, 10, 15, 20, 30, 5555);
        LocalTime lt = LocalTime.of(15, 54);

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MM dd yyyy"); // необходим String в таком же формате
        LocalDate date1 = LocalDate.parse("01 02 2015", f1); // создал объект при помощи String и формата
        System.out.println(date1); // 2015-01-02
        LocalDate date2 = LocalDate.parse("2015-01-02"); // когда знаешь дефолтный формат можно сразу писать String в нужном формате
        System.out.println(date2); // 2015-01-02





        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(ldt); // 2014-03-10T15:20:30.000005555
        System.out.println(f.format(ldt)); // марта 10, 2014, 03:20
        System.out.println(ldt.format(f)); // марта 10, 2014, 03:20

    }
}
