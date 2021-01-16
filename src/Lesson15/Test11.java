package Lesson15;

public class Test11 {
    public static void main(String[] args) {
        int hour = 0;
        OUTER:
        do{
            int minut =0;

            INNER:
            while (minut <60){
                if(minut ==20){
                    continue OUTER;
                }
                System.out.println(hour + ":" + minut);
                minut++;
            }
            hour++;
        }
        while (hour < 24);
    }
}
