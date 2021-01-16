package Lesson17;

public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder(); // default первоначальная вместимость 16 символов
        StringBuilder sb2 = new StringBuilder("Good Day!"); // (String) 9 +16 символов
        StringBuilder sb3 = new StringBuilder(50); // (вместимость: int) 50 символов
        StringBuilder sb4 = new StringBuilder(sb2);
    }
}
