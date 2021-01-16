package Lesson16;

public class Test8 {
    public static void main(String[] args) {

        String s = new String("ANDREY:!8");

        // toLoweCase()->String
        String s1 = s.toLowerCase(); // переводит все символы в нижний регистр
        System.out.println(s1);

        // toUpperCase()->String
        String s2 = s1.toUpperCase(); // переводит все символы в верхний регистр
        System.out.println(s2);

        // s.contains(String str)->boolean
        boolean b = s.contains(":!"); // содержит ли String такие str
        System.out.println(b);
        System.out.println(s.contains("g"));
    }
}
