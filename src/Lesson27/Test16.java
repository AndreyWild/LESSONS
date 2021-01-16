package Lesson27;

import java.io.*;

public class Test16 {
    void abc() throws FileNotFoundException {
        try {
            File f = new File("test10.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception Пойман и немного обработан");
            throw e; // опять выбрасываем Exception (исключение)
        } finally {
            System.out.println("Это блок finally");
        }
    }

    void method()throws FileNotFoundException { // либо добавлять throws FileNotFoundException
        // либо помещать abc(); в try и расписывать catch
        abc();
        /**
         * try{
         *     abc();
         * } catch (FileNotFoundException e){
         *     System.out.println("Exception Пойман и полностью обработан");
         * }
         */
    }

    void def() { // не обновляем в сигнатуре ArrayIndexOutOfBoundsException т.к. это RuntimeException
        try {
            int[] array = {1, 2, 3};
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Exception Пойман и немного обработан");
            throw a;
        } finally {
            System.out.println("Это блок finally");
        }
    }
}
//25:43