package Homework.Lesson29;
import java.time.*;
import java.time.format.*;

public class Test1 {

    DateTimeFormatter format1 = DateTimeFormatter.ofPattern("y, MMMM-dd !! hh:mm");
    DateTimeFormatter format2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");

    public void smena(LocalDateTime start, LocalDateTime end, Period p, Duration d){
        LocalDateTime ldt1 = start;
        int count = 0;
        while (ldt1.isBefore(end)){
            count++;
            System.out.println("----------------- " + count + "----------------- ");
            System.out.print("Работаем с: " + ldt1.format(format1)+ " ");
            ldt1 = ldt1.plus(p);
            System.out.println("До: " + ldt1.format(format1));
            System.out.print("Отдыхаем с: " + ldt1.format(format2)+ " ");
            ldt1 = ldt1.plus(d);
            System.out.println("До: " + ldt1.format(format2));}
    }

    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(2021, 1, 1, 9, 0, 0);
        LocalDateTime ldt2 = LocalDateTime.of(2021, 10, 31, 18, 0,0);
        Period p = Period.of(0,1,2);
        Duration d = Duration.ofMinutes(600);
        Test1 t = new Test1();
        t.smena(ldt1, ldt2, p, d);

    }
}
