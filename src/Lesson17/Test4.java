package Lesson17;

public class Test4 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("123");
        StringBuilder s2 = s1.append("45");
        s2 = s2.append("6").append("7");
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        StringBuilder s3 = new StringBuilder("Hello");
        StringBuilder s4 = new StringBuilder("Hello");
        StringBuilder s5 = s3;

        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        System.out.println(s3 == s5);
        System.out.println(s3.equals(s5));
    }
}
