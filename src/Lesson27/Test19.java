package Lesson27;

public class Test19 {
    void abc() {
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            String s = null;
            try {
                System.out.println(s.length()); // Выдаст NullPointerException
            } catch (NullPointerException e1) {
                System.out.println("Это внутренний catch блок");
            }
        } catch (NullPointerException e) { // не поймает NullPointerException от s.length() т.к. ловит исключения из try
            System.out.println("Пойман NullPointerException");
        }
    }

    public static void main(String[] args) {
        Test19 t = new Test19();
        t.abc();
    }
}
