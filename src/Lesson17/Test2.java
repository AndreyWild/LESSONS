package Lesson17;

class Car{}

public class Test2 {
    public static void main(String[] args) {
        StringBuilder sb2 = new StringBuilder("Good Day!!!");
        System.out.println(sb2.length());

        System.out.println(sb2.charAt(5));

        System.out.println(sb2.indexOf("!!!"));
        System.out.println(sb2.indexOf("o", 2));

        System.out.println(sb2.substring(5));
        System.out.println(sb2.substring(5, 8));

        System.out.println(sb2.subSequence(5, 8));

        System.out.println(sb2.append(" Yes?"));
        System.out.println(sb2.append(sb2));
        System.out.println(sb2.append(new Car()));



    }
}
