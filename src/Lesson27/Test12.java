package Lesson27;

import java.io.*;

public class Test12 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("");
        try {
            File f = new File("test7.txt");
            System.out.println("Объект Файл создался");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Стрим создался");
            int counter = 0;
            while (true) {
                counter++;
                result.append(fis.read());
                System.out.println("Информация читается");
                if (counter == 3) {
                    fis.close();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Exception 1");
        } catch (IOException e) {
            System.out.println("Exception 2");
        } finally {
            System.out.println("Это finaly");
        }
    }
}
