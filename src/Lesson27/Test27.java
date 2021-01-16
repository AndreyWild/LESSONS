package Lesson27;

public class Test27 {
    void abc() {
        System.out.println("Метод abc");
        throw new StackOverflowError();
    }

    void def() {
        try {
            abc();
            return;
        } finally {
            System.out.println("Блок finnaly");
        }
    }

    public static void main(String[] args) {
        Test27 t = new Test27();
        t.def();
    }
}
