package Homework.Lesson17;

public class NewClass2 {
    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2){
        boolean result = true;

        // если длина StringBuilder'ов рован то..
        if (sb1.length() == sb2.length()){
            // запускаем цикл длинной количество символов в StringBuilder
            for (int i = 0; i < sb1.length(); i++){
                // если n Char sb1 не равен n Char
                if (sb1.charAt(i) != sb2.charAt(i)){
                    // результат false
                    result = false;
                    // если хоть один символ не равен то завершить цикл
                    break;
                }
            }
        } else {result = false;}
        return result;
    }

}

class NewClass2Test {
    public static void main(String[] args) {
        StringBuilder sb3 = new StringBuilder("hello");
        StringBuilder sb4 = new StringBuilder("hello");
        StringBuilder sb5 = new StringBuilder("Hello");
        boolean a = NewClass2.ravenstvo(sb3, sb4);
        System.out.println(a);
        System.out.println(NewClass2.ravenstvo(sb4, sb5));
        System.out.println(NewClass2.ravenstvo(new StringBuilder(""), new StringBuilder("")));
        System.out.println(NewClass2.ravenstvo(new StringBuilder(), new StringBuilder()));

    }
}

