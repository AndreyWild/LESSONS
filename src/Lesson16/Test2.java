package Lesson16;

public class Test2 {
    public static void main(String[] args) {
        String s1 = new String("abcdefgabcd");

        String s10 = s1.substring(3); // присвоить s10 значение s1 начиная с индекс-3 символа
        System.out.println(s10);
        System.out.println(s1);

        String s11 = s1.substring(3, 7); // присвоить s11 значение s1 начиная с
        // индекс-3 символа по 7-й, не включая сам 7-й символ
        System.out.println(s11);

        String s12 = s1.trim();
        System.out.println(s12);
    }
}
