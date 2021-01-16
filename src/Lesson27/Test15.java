package Lesson27;

import java.io.*;

public class Test15 {
    static StringBuilder abc() {
        StringBuilder a = new StringBuilder("Привет");
        try {
            File f = new File("test9.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception Пойман: " + e);
            System.out.println("Переменная а в catch блоке = " + a);
            return a;
        } finally {
            a.append("!!!");
            System.out.println("Это блок finally");
            System.out.println("Переменная а в finally блоке = " + a);
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(abc());
    }
}
