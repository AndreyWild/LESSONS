package Lesson30;
import java.util.ArrayList;
public class Test3 {
}

class Student2 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    Student2(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class Student2Info {

    void printStudent(Student2 st) {
        System.out.println("Имя студента: " + st.name + ", пол: " + st.sex +
                ", возраст: " + st.age + ", курс: " + st.course + " средний бал: "
                + st.avgGrade);
    }

    void testStudent2(ArrayList<Student2> aL, StudentCheckss sC) {
        for (Student2 s : aL) { // перебираем элементы списка
            if (sC.tests(s)) { // если boolean tests интерфейса StudentCheckss выдает true
                printStudent(s); // то выводим значение элемента списка
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student2> list = new ArrayList<>();
        Student2 st1 = new Student2("Иван", 'm', 22, 3, 8.3);
        Student2 st2 = new Student2("Николай", 'm', 28, 2, 6.4);
        Student2 st3 = new Student2("Елена", 'f', 19, 1, 8.9);
        Student2 st4 = new Student2("Петр", 'm', 35, 4, 7);
        Student2 st5 = new Student2("Мария", 'f', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        Student2Info si = new Student2Info();

        si.testStudent2(list, (Student2 student) ->{return student.avgGrade > 8.5;});
        // можно записать короче:
        si.testStudent2(list, student -> student.avgGrade > 8.5); // вот так
        System.out.println("-------------------------------------------------------");
        si.testStudent2(list, (Student2 student) ->{return student.avgGrade < 9;});
        System.out.println("-------------------------------------------------------");
        si.testStudent2(list, (Student2 student) ->{return student.age > 25;});
        System.out.println("-------------------------------------------------------");
        si.testStudent2(list, (Student2 student) ->{return student.age < 27;});
        System.out.println("-------------------------------------------------------");
        si.testStudent2(list, (Student2 student) ->{return student.sex == 'm';});
        System.out.println("-------------------------------------------------------");
        si.testStudent2(list, (Student2 student) ->{return student.avgGrade > 7.2 && student.age < 23 && student.sex == 'f';});
    }
}
/**
 * Интерфейс имеющий всего один метод называется функциональным интерфейсом
 * при его помощи можно использовать лямбда выражения.
 */
interface StudentCheckss { //
    boolean tests(Student2 s);
}