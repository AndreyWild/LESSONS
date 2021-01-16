package Lesson27;

import java.io.*;

public class Test13 {
    static int abc() {
        try {
            File f = new File("test9.txt");
            FileInputStream fis = new FileInputStream(f);
            return 5;
        } catch (FileNotFoundException e) {
            System.out.println("Exception пойман");
            return 6; // надо писать и в catch, потому как если ошибка выпадет до return 5,
            // то до  return 5 выполнение кода не дойдет
        } finally {
            System.out.println("Это блок finally");
            //return 7; всегда будет срабатывать последним, даже если сработал return в try или catch
        }
        //return 5; //можно вписать только если return отсутствует в catch или finally
    }

    public static void main(String[] args) {
        System.out.println(abc());
    }
}
