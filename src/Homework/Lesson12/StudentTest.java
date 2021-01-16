package Homework.Lesson12;

import Lesson11.Student;

public class StudentTest {

    public static void equals(Student s1, Student s2){
        if (s1.name.equals(s2.name) && s1.course == s2.course && s1.grade == s2.grade){   // equals потому что name - String!
            System.out.println("Студенты одинаковые!");
        }
        else {
            System.out.println("Студенты разные!");
        }
    }
    public static void equals2(Student s1, Student s2){
        if (s1.name.equals(s2.name)){
            if (s1.course == s2.course){
                if (s1.grade == s2.grade){
                    System.out.println("Один и тот же студент!");}
                else {
                    System.out.println("Одинаковые имена, один курс, разные оценки");
                }
            }
            else {
                System.out.println("Студенты тезки, но на разных курсах");
            }
        }
        else {
            System.out.println("Имена студентов отличаются");
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Гриша", 4, 8.5);
        Student st2 = new Student("Гриша", 4, 8.5);
        Student st3 = new Student("Гриша", 4, 7.8);

        equals(st1, st2);
        equals(st1, st3);

        equals2(st1, st2);
        equals2(st1, st3);
    }
}
