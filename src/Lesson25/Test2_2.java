package Lesson25;

public class Test2_2 {


    public static void main(String[] args) {
        Driver1[] array1 = {new Driver1(), new Driver1()};
        Employee1[] array2 = {new Driver1(), new Driver1(), new Teacher1(), new Doctor1()};
        Help_able1[] array3 = {new Driver1(), new Driver1(), new Teacher1(), new Doctor1()};

        Employee1 emp1 = new Teacher1();
        Employee1 emp2 = new Driver1();
        Employee1 emp3 = new Doctor1();
        Help_able1 h = new Teacher1();

        System.out.println(emp1 instanceof Employee1);


    }
}

abstract class Employee1 {
    void sleep(){System.out.println("Employee sleeps");}
    abstract void work();
}

class Teacher1 extends Employee1 implements Help_able1 {
    public void help(){System.out.println("Teachr helps");}
    void work(){System.out.println("Teachr work");}
}

class Driver1 extends Employee1 implements Help_able1 {
    public void help(){System.out.println("Driver helps");}
    void work(){System.out.println("Driver work");}
}

class Doctor1 extends Employee1 implements Help_able1 {
    public void help(){System.out.println("Doctor helps");}
    void work(){System.out.println("Doctor work");}
}

interface Help_able1 {
    void help();
}