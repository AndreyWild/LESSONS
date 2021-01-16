package Lesson17;

public class Test3 {
    public static void main(String[] args) {
        StringBuilder sb2 = new StringBuilder("Good Day!!!");

        System.out.println(sb2.insert(4, "dd"));
        System.out.println(sb2.insert(sb2.length(), "Man!"));

        StringBuilder sb3 = new StringBuilder("Hello World");
        System.out.println(sb3.delete(5, 11));

        String a = "Hello World";
        StringBuilder sb4 = new StringBuilder(a);
        System.out.println(sb4.deleteCharAt(6));

        StringBuilder sb5 = new StringBuilder("Andrey");
        System.out.println(sb5.reverse());

        StringBuilder sb6 = new StringBuilder("Всем привет!");
        System.out.println(sb6.replace(5,11,"пока"));

        StringBuilder sb7 = new StringBuilder();
        StringBuilder sb8 = new StringBuilder("123456");

        System.out.println(sb7.capacity());
        System.out.println(sb8.capacity());
    }
}
