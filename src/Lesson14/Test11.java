package Lesson14;

public class Test11 {

    public static void time(){
        OUTER: // Дали найзвание ЛЭЙБЛ циклу
        for(int chas = 0; chas <=23; chas++){
            System.out.println("Начало внешнего цикла");

            INNER: // Дали найзвание ЛЭЙБЛ циклу
            for( int min = 0; min <=59; min++){

                if(min == 20) {continue OUTER; // Сослались на цикл
                }
                System.out.println(chas + ":" + min);
            }
            System.out.println("Конец внешнего цикла");
        }
    }

    public static void main(String[] args) {
        time();
    }
}
/**
 * Цель лэйбла управлять внешним циклом из внутреннего.
 */