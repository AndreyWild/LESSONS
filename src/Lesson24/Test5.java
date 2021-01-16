package Lesson24;

public class Test5 {
}

interface I1{
    default void abc(){System.out.println("eto metod abc");}
    static void def(){System.out.println("eto static metod def-1");} //static метод не наследуется
}

interface I2{
    static void def(){System.out.println("eto static metod def-2");} //static метод не наследуется
}

class R {


    public static void main(String[] args) {
        // R.def(); так метод вызвать нельзя, т.к. он не наследуется
        I1.def(); // а так можно, обращаясь на прямую к интерфейсу, даже не имплементируя его
        // главное чтобы этот интерфейс был виден класс
        I2.def();
    }
}





//class Z2 implements I1{
//    public void abc(){
//        System.out.println("eto metod abc");
//    }
//
//    public static void main(String[] args) {
//        Z2 z = new Z2();
//        z.abc();
//        z.def();
//        z.ghi();
//        }
//    // чтобы перезаписать default метод надо сделать его public
//    public void ghi(){
//            System.out.println("eto metod ghi");
//    }
//}