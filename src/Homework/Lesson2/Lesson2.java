package Homework.Lesson2;

public class Lesson2 {
    public static void main(String [] args){
        byte b1 = 0b1100; // Двоичная
        byte b2 = 0_14; // Восьмиричная
        byte b3 = 12; // Десятиричная
        byte b4 = 0xC; // Шеснадцатиричная

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

//        short s1 = (short) 0b1111101011101100; // Двоичная
//        short s2 = (short) 0_175354; // Восьмиричная
//        short s3 = -1300; // Десятиричная
//        short s4 = (short) 0xFAEC; // Шеснадцатиричная

        short s1 = -0b10100010100; // Двоичная
        short s2 = -0_2424; // Восьмиричная
        short s3 = -1300; // Десятиричная
        short s4 = -0x514; // Шеснадцатиричная

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        int i1 = 0b0; // Двоичная
        int i2 = 0_0; // Восьмиричная
        int i3 = 0; // Десятиричная
        int i4 = 0x0; // Шеснадцатиричная

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        long l1 = 0b111010110111100110100010101L; // Двоичная
        long l2 = 0726746425L; // Восьмиричная
        long l3 = 123456789L; // Десятиричная
        long l4 = 0x75BCD15L; // Шеснадцатиричная

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);

        float f1 = 3.142654F;
        float f2 = 2.554854534f;

        System.out.println(f1);
        System.out.println(f2);

        double d1 = 5456.5546;
        double d2 = 84567.64565D;

        System.out.println(d1);
        System.out.println(d2);

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println(bool1);
        System.out.println(bool2);

        char c1 = 'A';
        char c2 = 65; // Десятиричная
        char c3 = '\u0041'; // Шеснадцатиричная

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }
}
