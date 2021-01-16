package Homework.Lesson14;

public class Clock {
    static void clock(){
        OUTER:
        for(int hour = 0; hour <= 6; hour++){

            MIDLE:
            for(int minute = 0; minute <= 59; minute++){
                if (hour >1 && minute % 10 == 0){ // Вписан здесь чтобы сробатывал до INTER и INTER не проверял лишние варианты.
                    break OUTER;
                }

                INTER:
                for(int second = 0; second <= 59; second++){
                    if (second * hour > minute){
                        continue MIDLE;
                    }
                    System.out.println("Время - " + hour + ":" + minute + ":" + second);
                }
            }
        }
    }

    public static void main(String[] args) {
        clock();
    }
}
