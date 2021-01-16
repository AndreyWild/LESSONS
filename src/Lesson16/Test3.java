package Lesson16;

public class Test3 {
    public static void main(String[] args) {
        String s1 = new String("Привет");

        String s2 = s1.replace('т', 'д');
        System.out.println(s2);

        String s3 = s1.replace("Привет", "Пока");
        System.out.println(s3);
    }
}
