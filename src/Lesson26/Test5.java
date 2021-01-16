package Lesson26;

public class Test5 {
    void abc(String s){ System.out.println("A");} // приоритет 1
    void abc(String ... s){ System.out.println("B");} // приоритет 3
    void abc(Object s){ System.out.println("C");} // приоритет 2
    void abc(String s1, String s2){ System.out.println("D");}

    void def(Long a){ System.out.println("E");} // приоритет 1
    void def(Long ... a){ System.out.println("F");} // приоритет 2

    void def(long a){ System.out.println("G");} // приоритет 1
    void def(Object a){ System.out.println("H");} // приоритет 3
    void def(Integer a){ System.out.println("I");} // приоритет 2


    public static void main(String[] args) {
        Test5 t = new Test5();
        t.abc("ok"); // A
        t.abc("ok", "!!!"); // D
        t.abc("ok", "!!!", "77"); // B

        t.def(50L);
    }
}
