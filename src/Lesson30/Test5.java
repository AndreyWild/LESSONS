package Lesson30;
import java.util.ArrayList;
import java.util.function.*;

public class Test5 {
}

class Student3 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    Student3(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class Student3Info {

    void printStudent(Student3 st) {
        System.out.println("Имя студента: " + st.name + ", пол: " + st.sex +
                ", возраст: " + st.age + ", курс: " + st.course + " средний бал: "
                + st.avgGrade);
    }

    void testStudent2(ArrayList<Student3> aL, Predicate<Student3> t) {
        for (Student3 s : aL) { // перебираем элементы списка
            if (t.test(s)) { // если boolean test интерфейса из java Predicate выдает true
                printStudent(s); // то выводим значение элемента списка
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student3> list = new ArrayList<>();
        Student3 st1 = new Student3("Иван", 'm', 22, 3, 8.3);
        Student3 st2 = new Student3("Николай", 'm', 28, 2, 6.4);
        Student3 st3 = new Student3("Елена", 'f', 19, 1, 8.9);
        Student3 st4 = new Student3("Петр", 'm', 35, 4, 7);
        Student3 st5 = new Student3("Мария", 'f', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        Student3Info si = new Student3Info();
        for (Student3 s : list){System.out.println(s.name);}
        System.out.println("--------------------------------");
        list.removeIf(x->x.name.endsWith("а")); // удалить из списка если(Student3 -> Student3.name.закнчивается("а"))
        for (Student3 s : list){System.out.println(s.name);}
        // Иван
        // Николай
        // Елена
        // Петр
        // Мария
        // --------------------------------
        // Иван
        // Николай
        // Петр
        // Мария


//        si.testStudent2(list, (Student3 student) ->{return student.avgGrade > 8.5;});
//        // можно записать короче:
//        si.testStudent2(list, student -> student.avgGrade > 8.5); // вот так
//        System.out.println("-------------------------------------------------------");
//        si.testStudent2(list, (Student3 student) ->{return student.avgGrade < 9;});
//        System.out.println("-------------------------------------------------------");
//        si.testStudent2(list, (Student3 student) ->{return student.age > 25;});
//        System.out.println("-------------------------------------------------------");
//        si.testStudent2(list, (Student3 student) ->{return student.age < 27;});
//        System.out.println("-------------------------------------------------------");
//        si.testStudent2(list, (Student3 student) ->{return student.sex == 'm';});
//        System.out.println("-------------------------------------------------------");
//        si.testStudent2(list, (Student3 student) ->{return student.avgGrade > 7.2 && student.age < 23 && student.sex == 'f';});
    }
}
/**
 * Интерфейс имеющий всего один метод называется функциональным интерфейсом
 * при его помощи можно использовать лямбда выражения.
 */

