package Lesson27;

import java.util.*;

public class Test23 {
    public static void main(String[] args) {
//        ArrayList <String> list = new ArrayList<>();
//        list.add("1");
//        list.add("2");
//        System.out.println(list.get(3));
//        System.out.println(5 / 0);
//        Doctor d = new Doctor();
//        Teacher t = new Teacher();
//        Teacher t3 = new Teacher();
//        Teacher [] array2 = {t, t3};
//        Employee[] array1 = {d, t};
//        Teacher t2 = (Teacher) array1[0]; // Doctor не может быть типом Teacher
//        Doctor d2 = (Doctor)array2[0]; // Teacher не может быть типом Doctor, ругается сам компилятор
        createPass("qwe");
    }

    public static void createPass(String pass) {
        if (pass.length() < 6) {
            throw new IllegalArgumentException("Пароль короче 6 символов");
        }
        if (pass.length() > 12) {
            throw new IllegalArgumentException("Пароль длиннее 12 символов");
        }
        System.out.println("Пароль принят");
    }
}

class Employee {}
class Doctor extends Employee {}
class Teacher extends Employee {}