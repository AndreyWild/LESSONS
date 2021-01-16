package Lesson7;

public class Employee {
    double salary;

    void dvojnajaZP(){
        double result = salary * 2;
        System.out.println("Novaja z/p = " + result);

    }
    Employee(double salary2){
        salary = salary2;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvojnajaZP();

    }
}


class EmployeeTest{
    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvojnajaZP();
    }
}