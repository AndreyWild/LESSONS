package Lesson14;

/**
 * Часы.
 */
public class Test10 {

    public static void time(){
        for(int chas = 0; chas <=23; chas++){
            for(int min = 0; min <=59; min++){
                switch (min) {
                    case 0,1, 2, 3, 4, 5, 6, 7, 8, 9:
                        System.out.println(chas + ":0" + min);
                        break;
                    default:
                        System.out.println(chas + ":" + min);
                }
            }
        }
    }
    public static void main(String[] args) {
        time();
    }
}
