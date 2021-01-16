package Lesson6;

public class Employee2 {
    Employee2(int id2, String surname2, int age2){
        this(id2, surname2, age2, 0.0, null);

    }
    Employee2(String surname3, int age3){
        this(0, surname3, age3, 0.0, null);

    }

    Employee2(int id4, String surname4, int age4, double salary4, String department4) {
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;

    }



    int id;
    String surname;
    int age;
    double salary;
    String department;
}

class EmployeeTest2{
    public static void main(String[] args) {
        Employee2 emp1 = new Employee2(1, "Ivanov", 25);
        System.out.println(emp1.id + " " + emp1.surname + " " + emp1.age);

        Employee2 emp2 = new Employee2("Petrov", 23);
        System.out.println(emp2.surname + " " + emp2.age);

        Employee2 emp3 = new Employee2(3, "Sidorov", 21, 2500.23, "Marketing");
        System.out.println(emp3.id + " " + emp3.surname + " " + emp3.age + " " + emp3.salary + " " + emp3.department);
    }
}