package Lesson26;

public class Test4 {
    void abc(int i){ System.out.println("int");}
    void abc(byte i){ System.out.println("byte");}
    void abc(long i){ System.out.println("long");}

    void def(Object o){ System.out.println("Objekt");}
    void def(String o){ System.out.println("String");}

    void ghi(int a, int b){ System.out.println("Hello 1");} // приоритет 1
    void ghi(long a, long b){ System.out.println("Hello 2");} // приоритет 2
    void ghi(Integer a, Integer b){ System.out.println("Hello 3");} // приоритет 3
    void ghi(int ... a){ System.out.println("Hello 4");} // приоритет 4

    public static void main(String[] args) {
        Test4 t = new Test4();
        t.abc(5); // int
        t.abc((byte) 5); // byte
        t.abc((long) 5); // long

        t.def("hello"); // String по логике, если будет только Object o, то Objekt
        t.def(new StringBuilder("hello")); // Objekt

        t.ghi(1, 2); // Hello 1, т.к. наиболее точное совпадение
    }
}
