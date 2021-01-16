package Lesson8;

public class Student {
    String name;
    int course;
    static int count;
    int a;

    public Student(String name1, int course1){
        count++;
        name = name1;
        course = course1;
        System.out.println("Student #"+count+ " sozdan.");
    }

    public static void showCount(){
        System.out.println("Vsego studentov " + count);
    }

    public void showInfo(){
        System.out.println("Welcome to the Student class!!!");
    }

    void abc(){
        a++;
        count++;
    }

    static void abcd(){
        count++;
        Student std = new Student("Petr", 1);
        std.a++;

    }

    public static void main(String[] args) {
        abcd();

    }


}

class StudentTest{
    public static void main(String[] args) {
        Student st1 = new Student("Dima", 5);
        Student st2 = new Student("Ivan", 4);
        Student st3 = new Student("Masha", 1);

        System.out.println(st1.name);
        System.out.println(st2.course);
        System.out.println(Student.count);
    }
}

//public static final int a = 10;