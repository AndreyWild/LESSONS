package Lesson30;

import java.util.ArrayList;

public class Test1 {
}

class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo {
    void printStudent(Student st) {
        System.out.println("Имя студента: " + st.name + ", пол: " + st.sex +
                ", возраст: " + st.age + ", курс: " + st.course + " средний бал: "
                + st.avgGrade);
    }

    void printStudentsOverGrade(ArrayList<Student> arrayList, double avgGrade) {
        for (Student s : arrayList) {
            if (s.avgGrade > avgGrade) {
                printStudent(s);
            }
        }
    }

    void printStudentsUnderGrade(ArrayList<Student> arrayList, double avgGrade) {
        for (Student s : arrayList) {
            if (s.avgGrade < avgGrade) {
                printStudent(s);
            }
        }
    }

    void printStudentsOverAge(ArrayList<Student> arrayList, int age) {
        for (Student s : arrayList) {
            if (s.age > age) {
                printStudent(s);
            }
        }
    }

    void printStudentsUnderAge(ArrayList<Student> arrayList, int age) {
        for (Student s : arrayList) {
            if (s.age < age) {
                printStudent(s);
            }
        }
    }

    void printStudentsBySex(ArrayList<Student> arrayList, char sex) {
        for (Student s : arrayList) {
            if (s.sex == sex) {
                printStudent(s);
            }
        }
    }

    void printStudentsMixConditon(ArrayList<Student> arrayList, double avgGrade, int age, char sex) {
        for (Student s : arrayList) {
            if (s.avgGrade > avgGrade && s.age < age && s.sex == sex) {
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student("Иван", 'm', 22, 3, 8.3);
        Student st2 = new Student("Николай", 'm', 28, 2, 6.4);
        Student st3 = new Student("Елена", 'f', 19, 1, 8.9);
        Student st4 = new Student("Петр", 'm', 35, 4, 7);
        Student st5 = new Student("Мария", 'f', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        StudentInfo si = new StudentInfo();
        System.out.println("---------------- метод printStudentsOverGrade(8.5) ----------------");
        si.printStudentsOverGrade(list, 8.5);
        // Имя студента: Елена, пол: f, возраст: 19, курс: 1средний бал: 8.9
        // Имя студента: Мария, пол: f, возраст: 23, курс: 3средний бал: 9.1
        System.out.println("---------------- метод printStudentsUnderGrade(9) ----------------");
        si.printStudentsUnderGrade(list, 9);
        // Имя студента: Иван, пол: m, возраст: 22, курс: 3средний бал: 8.3
        // Имя студента: Николай, пол: m, возраст: 28, курс: 2средний бал: 6.4
        // Имя студента: Елена, пол: f, возраст: 19, курс: 1средний бал: 8.9
        // Имя студента: Петр, пол: m, возраст: 35, курс: 4средний бал: 7.0
        System.out.println("---------------- метод printStudentsOverAge(25) ----------------");
        si.printStudentsOverAge(list, 25);
        // Имя студента: Николай, пол: m, возраст: 28, курс: 2средний бал: 6.4
        // Имя студента: Петр, пол: m, возраст: 35, курс: 4средний бал: 7.0
        System.out.println("---------------- метод printStudentsUnderAge(27) ----------------");
        si.printStudentsUnderAge(list, 27);
        // Имя студента: Иван, пол: m, возраст: 22, курс: 3средний бал: 8.3
        // Имя студента: Елена, пол: f, возраст: 19, курс: 1средний бал: 8.9
        // Имя студента: Мария, пол: f, возраст: 23, курс: 3средний бал: 9.1
        System.out.println("---------------- printStudentsBySex(m) ----------------");
        si.printStudentsBySex(list, 'm');
        // Имя студента: Иван, пол: m, возраст: 22, курс: 3средний бал: 8.3
        // Имя студента: Николай, пол: m, возраст: 28, курс: 2средний бал: 6.4
        // Имя студента: Петр, пол: m, возраст: 35, курс: 4средний бал: 7.0
        System.out.println("---------------- printStudentsMixConditon(7.2, 23, f) ----------------");
        si.printStudentsMixConditon(list, 7.2, 23, 'f');
        // Имя студента: Елена, пол: f, возраст: 19, курс: 1средний бал: 8.9
    }
}