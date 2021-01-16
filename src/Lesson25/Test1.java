package Lesson25;

public class Test1 {
    public static void main(String[] args) {
        Driver1[] array1 = {new Driver1(), new Driver1()};
        Employee1[] array2 = {new Driver1(), new Driver1(), new Teacher1(), new Doctor1()};
        Help_able1[] array3 = {new Driver1(), new Driver1(), new Teacher1(), new Doctor1()};

        Employee1 emp1 = new Teacher1();
        Employee1 emp2 = new Driver1();
        Employee1 emp3 = new Doctor1();
        Help_able1 h = new Teacher1();

        Employee1[] array4 = {emp1, emp2, emp3};
        for(Employee1 emp : array4){
            emp.work();
        }

        h.help();

        emp1.work();
        emp2.work();
        emp3.work();
    }
}

abstract class Employee {
    void sleep(){System.out.println("Employee sleeps");}
    abstract void work();
}

class Teacher extends Employee1 implements Help_able1 {
    public void help(){System.out.println("Teachr helps");}
    void work(){System.out.println("Teachr work");}
}

class Driver extends Employee1 implements Help_able1 {
    public void help(){System.out.println("Driver helps");}
    void work(){System.out.println("Driver work");}
}

class Doctor extends Employee1 implements Help_able1 {
    public void help(){System.out.println("Doctor helps");}
    void work(){System.out.println("Doctor work");}
}

interface Help_able{
    void help();
}