package Lesson6;

public class Employee {

    Employee(int id2, String surname2, int age2){
        id = id2;
        surname = surname2;
        age = age2;
    }
    public Employee(String surname2, int age2){
        surname = surname2;
        age = age2;
    }

    Employee(int id2, String surname2, int age2, double salary2, String department2) {
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }



    int id;
    String surname;
    int age;
    double salary;
    String department;
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Ivanov", 25);
        System.out.println(emp1.id + " " + emp1.surname + " " + emp1.age);

        Employee emp2 = new Employee("Petrov", 23);
        System.out.println(emp2.surname + " " + emp2.age);

        Employee emp3 = new Employee(3, "Sidorov", 21, 2500.23, "Marketing");
        System.out.println(emp3.id + " " + emp3.surname + " " + emp3.age + " " + emp3.salary + " " + emp3.department);
    }
}