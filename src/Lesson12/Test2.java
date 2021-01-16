package Lesson12;

public class Test2 {

    void abc(int a){
        String str;

        if (a >= 10) {
            str = "Hello";
        }
        else if (a < 10){
            str = "Bye";
        }
        else {
            str = null;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        Test2 t = new Test2();
        t.abc(10);

    }
}
