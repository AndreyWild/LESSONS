package Lesson21;

public class Test1 {
    public static void main(String[] args) {
        int a1 = 3;
        System.out.println((a1 < 4? 7 : "privet")); // если а1<4, то печатай 7, если нет, то privet

        int a = 5;
        int b = 5;
        int c = (a < 6)?a++:b++; //если а меньше 6 то увеличить а, если больше, то b
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

//class Test{
//    public Test(){
//        this();
//    }
//}
