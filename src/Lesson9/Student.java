package Lesson9;

public class Student {
    int a = 1;
    public int b = 34;
    public static String c = "Привет";
//    static int a = 1;
}
class StudentTest{
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3;
        st1 = null;
    }
}