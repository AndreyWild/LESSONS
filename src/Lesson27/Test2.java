package Lesson27;

public class Test2 {
    public static void main(String[] args) {
        int [] array = {1, 4, 0};

        System.out.println(array[5]); // выдаст ArrayIndexOutOfBoundsException и прекратит работу
        System.out.println("hello");
        // или
        String s = null;
        System.out.println(s.length()); // выдаст NullPointerException и прекратит работу
        System.out.println("hello");
    }
}
