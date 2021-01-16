package Lesson27;

import java.io.*;

public class Test21 {
    static FileInputStream fis1, fis2;

    public static void main(String[] args) {
        try {
            fis1 = new FileInputStream("test9.txt");
            System.out.println("Файл test9 существует в системе и найден");
            try {
                fis2.close();
            } catch (IOException e){
                System.out.println("Проблемы со стримом fis2");
            }
        } catch (FileNotFoundException e){
            System.out.println("Файл test9 не найден");
        } catch (NullPointerException e) {
            System.out.println("Сработал NullPointerException");
        }
    }
}
