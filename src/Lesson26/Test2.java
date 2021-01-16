package Lesson26;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5); // Autoboxing int в Integer

        int a = list.get(0); // Unboxing Integer в int
        // можо и так
        Integer b = new Integer(10);
        int c = b;
        System.out.println(b);
    }
}
