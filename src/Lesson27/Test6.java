package Lesson27;

import java.io.*;

public class Test6 {
    void abc() throws FileNotFoundException { // объявление Exception
        File f = new File("test9.txt");
        FileInputStream fis = new FileInputStream(f);
        System.out.println("Всем хорошего дня!");

    }

    void def() {
        System.out.println("Привет");
        try { // обработка Exception
            abc();
        } catch (FileNotFoundException e) {
            System.out.println("Был пойман Exception: " + e);
        }
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
        t.def();
    }
}
