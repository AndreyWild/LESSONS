package Lesson12;

public class Test {

    public void maximum (int i1, int i2, int i3){
        if (i1 > i2 && i1 > i3){
            System.out.println("Maximum - " + i1);
        }
        else if (i2 > i1 && i2 > i3){
            System.out.println("Maximum - " + i2);
        }
        else {
            System.out.println("Maximum - " + i3);
        }
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        t1.maximum(2, 3, 5);
        t1.maximum(6, 4, 3);

    }
}
