package Lesson16;



public class Test1 {
    public static void main(String[] args) {
        String s1 = new String("privet");

        int a = s1.length(); // показывает длину (объекта) массива в int length()->int
        System.out.println(a);
        //или так
        System.out.println(s1.length());

        char c1 = s1.charAt(3); // выводит char с указанным индексом charAt(int index)->char
        System.out.println(c1);
        // или так
        System.out.println(s1.charAt(3));

        int i1 = s1.indexOf('t'); // выводит int индекс указанного char'a, indexOf(char c)->int
        System.out.println(i1);
        // или так
        System.out.println(s1.indexOf('t'));

        int i2 = s1.indexOf("t"); // выводит int индекс указанного String'a indexOf(String c)->int
        System.out.println(i2);
        // или так
        System.out.println(s1.indexOf("t"));

        int i3 = s1.indexOf("vet"); // выводит int индекс указанного String'a
        System.out.println(i3);
        // или так
        System.out.println(s1.indexOf("vet"));

        int i4 = s1.indexOf("Z");   // выводит int индекс указанного не существующего String'a
                                    // его индекс будет равен -1
        System.out.println(i4);
        // или так
        System.out.println(s1.indexOf("Z"));

        String s = new String("abcdefgabcd");

        int i5 = s.indexOf('a',5);   // выводит int индекс указанного char'a начинает искать с указанного
        // индекса indexOf(char c, int fromIndex)->int
        System.out.println(i5+ "i5");
        // или так
        System.out.println(s.indexOf('a', 5));

        int i6 = s.indexOf("a",5);   // выводит int индекс указанного String'a начинает искать с указанного
        // индекса indexOf(String c, int fromIndex)->int
        System.out.println(i6);
        // или так
        System.out.println(s.indexOf("a", 5));

        boolean b1 = s.startsWith("abc"); // abc начинается с? startsWith(String prefix)-> boolean
        System.out.println(b1);

        boolean b2 = s.startsWith("abc", 7); // abc начинается с 7 индекса?
        // startsWith(String prefix, int from)-> boolean
        System.out.println(b2);

        boolean b3 = s.endsWith("bcd"); // String заканчивается bdc? endsWith(String suffix)-> boolean
        System.out.println(b3);


    }
}
