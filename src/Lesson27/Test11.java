package Lesson27;

import java.io.*;

public class Test11 {
    public static void main(String[] args) {
        try {
            File f = new File("taest8.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) { // Дочерний класс IOException
            System.out.println("Пойман Exception 1");
        } catch (NullPointerException e) { // Дочерний класс RuntimeException
            System.out.println("Пойман Exception 2");
        } catch (IOException e) { // Дочерний класс Exception
            System.out.println("Пойман Exception 3");
        } catch (RuntimeException e) { // Дочерний класс Exception
            System.out.println("Пойман Exception 4");
        } catch (Exception e) { // Дочерний класс Throwable
            System.out.println("Пойман Exception 5");
        } catch (Throwable e) { // Родительский класс всех Exception
            System.out.println("Пойман Exception 6");
        }
    }
}

/**
 *  Если родительский класс Exception будет стоять раньше дочернего, то компилятор будет
 *  выдавать ошибку на дочерний класс, т.к. родительский класс ловит все Exception'ы.
 */
