package Lesson18;

public class Test9 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello World");
        char [] array = {'p', 'r', 'i', 'v', 'e', 't'};
//        System.out.println(sb1.append(array,2, 3));
        System.out.println(sb1.insert(1, array, 2, 3));
    }
}
