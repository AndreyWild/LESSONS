package Lesson16;

public class Test6 {

}
class Employee{
    double salary;
    boolean isManager;

    Employee(double salary, boolean isManager){
        this.salary = salary;
        this.isManager = isManager;
    }
}

class TempEmployee{
    public static void main(String[] args) {
        Employee emp = new Employee(100.5, true);
        System.out.println("Он менеджер? " + emp.isManager +" его зарплата - "+ emp.salary);
    }
}