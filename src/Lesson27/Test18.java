package Lesson27;

import java.io.*;

public class Test18 {
    FileInputStream fis1, fis2;

    public void abc() {
        try {
            fis1 = new FileInputStream("test9.txt");
            try {
                fis2 = new FileInputStream("test10.txt");
            } catch (FileNotFoundException e) {
                System.out.println("Файл test10.txt не найден!");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл test9.txt не найден!");
        } finally {
            System.out.println("Это внешний finally блок.");
            try {
                fis1.close();
                fis2.close();
            } catch (IOException e) {
                System.out.println("Найдено исключение в finally блоке");
            }
        }
    }

    public static void main(String[] args) {
        Test18 t = new Test18();
        t.abc();
    }
}
