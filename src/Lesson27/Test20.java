package Lesson27;

public class Test20 {
    static String abc() {
        String s1 = ""; // создали пустой String
        String s2 = null;
        try {
            try {
                s1 += "1"; // прибавили к s1 1
                s2.charAt(3); // выбрасывается NullPointerException
                s1 += "2"; // пропускается
            } catch (NullPointerException e) { // ловит NullPointerException с 10 строки
                s1 += 3; // прибавили к s1 3
                throw new RuntimeException(); // выбросили RuntimeException, но он ничем не ловится
            } finally { // выполяем блок finally
                s1 += 4; // прибавили к s1 4
                throw new Exception(); // выбросили Exception
            }
        } catch (Exception e) { // ловит Exception с 17 строки
            s1 += 5; // // прибавили к s1 5
        }
        return s1; // вернули s1 который 1+3+4+5
    }

    public static void main(String[] args) {
        System.out.println(abc()); // 1345
    }
}
