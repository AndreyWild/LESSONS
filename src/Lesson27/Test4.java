package Lesson27;
import java.io.*;
public class Test4 {
    public static void main(String[] args) {
        File f = new File("test9.txt");

        try {
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Всем хорошего дня!");
        }
        catch (FileNotFoundException e) {
            System.out.println("Был пойман Exception: " + e);
        }
        finally { // этот блок всегда срабатывает
            System.out.println("Это finaly блок");
        }
        System.out.println("Данный код не имеет отношения к исключениям");
    }
}
