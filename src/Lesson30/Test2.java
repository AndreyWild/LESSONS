package Lesson30;

import java.util.ArrayList;

public class Test2 {
}

class Student1 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    Student1(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class Student1Info {

    void printStudent(Student1 st) {
        System.out.println("Имя студента: " + st.name + ", пол: " + st.sex +
                ", возраст: " + st.age + ", курс: " + st.course + " средний бал: "
                + st.avgGrade);
    }

    void testStudents(ArrayList<Student1> aL, StudentChecks sC) {
        for (Student1 s : aL) {
            if (sC.test(s)) {
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student1> list = new ArrayList<>();
        Student1 st1 = new Student1("Иван", 'm', 22, 3, 8.3);
        Student1 st2 = new Student1("Николай", 'm', 28, 2, 6.4);
        Student1 st3 = new Student1("Елена", 'f', 19, 1, 8.9);
        Student1 st4 = new Student1("Петр", 'm', 35, 4, 7);
        Student1 st5 = new Student1("Мария", 'f', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        Student1Info si = new Student1Info();

        FindStudentsOverGrade overGrade = new FindStudentsOverGrade();
        FindStudentsUnderGrade underGrade = new FindStudentsUnderGrade();
        FindStudentsOverAge overAge = new FindStudentsOverAge();
        FindStudentsUnderAge underAge = new FindStudentsUnderAge();
        FindStudentsBySex bySex = new FindStudentsBySex();
        FindStudentsMixCondition mixCondition = new FindStudentsMixCondition();

        System.out.println("---------------- класс FindStudentsOverGrade() ----------------");
        si.testStudents(list, overGrade);
        // Имя студента: Елена, пол: f, возраст: 19, курс: 1 средний бал: 8.9
        // Имя студента: Мария, пол: f, возраст: 23, курс: 3 средний бал: 9.1
        System.out.println("---------------- класс FindStudentsUnderGrade() ----------------");
        si.testStudents(list, underGrade);
        // Имя студента: Иван, пол: m, возраст: 22, курс: 3 средний бал: 8.3
        // Имя студента: Николай, пол: m, возраст: 28, курс: 2 средний бал: 6.4
        // Имя студента: Елена, пол: f, возраст: 19, курс: 1 средний бал: 8.9
        // Имя студента: Петр, пол: m, возраст: 35, курс: 4 средний бал: 7.0
        System.out.println("---------------- класс FindStudentsOverAge() ----------------");
        si.testStudents(list, overAge);
        // Имя студента: Николай, пол: m, возраст: 28, курс: 2 средний бал: 6.4
        // Имя студента: Петр, пол: m, возраст: 35, курс: 4 средний бал: 7.0
        System.out.println("---------------- класс FindStudentsUnderAge() ----------------");
        si.testStudents(list, underAge);
        // Имя студента: Иван, пол: m, возраст: 22, курс: 3 средний бал: 8.3
        // Имя студента: Елена, пол: f, возраст: 19, курс: 1 средний бал: 8.9
        // Имя студента: Мария, пол: f, возраст: 23, курс: 3 средний бал: 9.1
        System.out.println("---------------- класс FindStudentsBySex() ----------------");
        si.testStudents(list, bySex);
        // Имя студента: Иван, пол: m, возраст: 22, курс: 3 средний бал: 8.3
        // Имя студента: Николай, пол: m, возраст: 28, курс: 2 средний бал: 6.4
        // Имя студента: Петр, пол: m, возраст: 35, курс: 4 средний бал: 7.0
        System.out.println("---------------- класс FindStudentsMixCondition() ----------------");
        si.testStudents(list, mixCondition);
        // Имя студента: Елена, пол: f, возраст: 19, курс: 1 средний бал: 8.9
    }
}

interface StudentChecks {
    boolean test(Student1 s);
}

class FindStudentsOverGrade implements StudentChecks {
    public boolean test(Student1 s) {
        return s.avgGrade > 8.5;
    }
}

class FindStudentsUnderGrade implements StudentChecks {
    public boolean test(Student1 s) {
        return s.avgGrade < 9;
    }
}

class FindStudentsOverAge implements StudentChecks {
    public boolean test(Student1 s) {
        return s.age > 25;
    }
}

class FindStudentsUnderAge implements StudentChecks {
    public boolean test(Student1 s) {
        return s.age < 27;
    }
}

class FindStudentsBySex implements StudentChecks {
    public boolean test(Student1 s) {
        return s.sex == 'm';
    }
}

class FindStudentsMixCondition implements StudentChecks {
    public boolean test(Student1 s) {
        return (s.avgGrade > 7.2 && s.age < 23 && s.sex == 'f');
    }
}