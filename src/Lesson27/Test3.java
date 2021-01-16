package Lesson27;

import java.io.*;

public class Test3 {
    public static void main(String[] args) throws Exception {
        File f = new File("E:\\Java\\HeadFirst\\test9.txt");
        FileInputStream fis = new FileInputStream(f);
        fis.read(); // чтение файла
//        FilterOutputStream fos = new FilterOutputStream(f);
//        fos.write(100);
    }
}
/**
 *  IOException является родительским классом FileNotFoundException
 */
