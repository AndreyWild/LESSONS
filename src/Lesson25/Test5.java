package Lesson25;

public class Test5 {
//    public static void main(String[] args) {
//        String [] array1 = {"privet", "poka"};
//        Object [] array2 = array1;
//        String [] array3 = (String[]) array2;
//        //array3[0] = new StringBuilder("ok") - не дает т.к. array3 типа String
//        array2[0] = new StringBuilder("ok"); // разрешит, но потом выдаст ошибку,
//        // array2 ссылается на array1, а тот String
//    }
}

class Test10{
    int a = 5;
    void abc(){System.out.println("ok1");}
        }

class Test20 extends Test10{
    int a = 10;
    void abc(){System.out.println("ok2");}
}

class Test30 extends Test20{
    int a = 15;
    void abc(){System.out.println("ok3");}
    void abc1(){super.abc(); System.out.println("ok3");} // вызов метода из ролительского класса

    public static void main(String[] args) {
        Test30 t = new Test30();
        System.out.println(((Test10)t).a); // 5
        ((Test10)t).abc(); // ok3
        ((Test20)t).abc(); // ok3 т.к. это объект класса Test30
    }
}