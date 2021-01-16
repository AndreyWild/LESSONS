package Lesson30;

public class Test4 {
    static void def(Test t){
        System.out.println(t.abc("Privet", "poka"));
    }

    public static void main(String[] args) {
        def((x, y)->x.length()); // 6 длина стринга Privet
        def((x, y)->y.length()); // 4 длина стринга poka
    }
}

interface Test {
    int abc(String s1, String s2);
        }