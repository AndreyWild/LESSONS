package Lesson27;

public class Test10 {
    static void abc(){
        System.out.println("rabotaet method abc");
        abc();
    }

    public static void main(String[] args) {
        abc();
    }
}
/**
 * Error'ы не принято ловить.
 */
