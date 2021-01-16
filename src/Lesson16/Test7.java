package Lesson16;

public class Test7 {
    public static void main(String[] args) {
        String s = null;
        s += "ok";
        System.out.println(s); // можно конкатенировать null и String
        System.out.println(s + false); // а с boolean конкатенировать нельзя
    }
}
