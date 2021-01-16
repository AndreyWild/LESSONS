package Homework.Lesson15;

public class Clock {
    static void clock(){
        int hour = 0;
        OUTER:
        while (hour < 6){

            int minute = -1; // Чтобы в do while цикле она стала равна 0!!!
            // , а не 1
            MIDLE:
            do{
                minute++;
// Если поставить в конце MIDLE цикла, то цикл бы не закончился
// т.е. есть ссылка с "continue MIDLE" в INTER цикле и мы так
// бы и не дошли до строки minute++; т.е. INTER цикл посылал
// бы в начало MIDLE цикла который посылает сначала в INTER,
// (а уже потом увеличивает minute++) в свою очередь INTER
// цикл посылает обратно в начало MIDLE цикла итак до бесконечности.
                if (hour >1 && minute % 10 == 0){ // Вписан здесь чтобы сробатывал
                    // до INTER и INTER не проверял лишние варианты.
                    break OUTER;}

                int second = 0;

                INTER:
                while(second < 60){
                    if (second * hour > minute){
                        continue MIDLE; }
                    System.out.println("Время - " + hour + ":" + minute +
                            ":" + second);
                    second++;
                }
            }
            while (minute < 59); // 59 потому что при 60 в do while было бы 61

            hour ++;
        }
    }

    public static void main(String[] args) {
        clock();
    }
}
