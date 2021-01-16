package Lesson22;

public class Human2 {

//    public Human2(String n){
//        name = n;
//    }

    String name = "Kolya";

    public static int salary = 150;

    public void work(){
        System.out.println("Rabotat'");
    }
    public static void rest(){
        System.out.println("Otdyhat'");
    }
}

class Student extends Human2{
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        Student.rest();
    }
}