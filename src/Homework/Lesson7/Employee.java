package Homework.Lesson7;

public class Employee {

    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public void showSalary() {
        System.out.println("salary="+salary);
    }

    public void showSurname() {
        System.out.println("surname"+surname);
    }

    public void showId() {
        System.out.println("id="+id);
    }

    public Employee(int idE) {
        id = idE;
    }

    Employee(String surnameE) {
        surname = surnameE;
    }

    private Employee(double salaryE) {
        salary = salaryE;
    }

    static class EmployeeTest {
        public static void main(String[] args) {
            Employee ep1 = new Employee(21);
            ep1.showSalary();
            ep1.showId();
            ep1.showSurname();

            Employee ep2 = new Employee("Dima");
            ep2.showSalary();
            ep2.showId();
            ep2.showSurname();

            Employee ep3 = new Employee(21.3);
            ep3.showSalary();
            ep3.showId();
            ep3.showSurname();
        }
    }

}


class EmployeeTest2 {
    public static void main(String[] args) {
        Employee ep = new Employee(21);
        ep.showSalary();
        ep.showId();
        ep.showSurname();
        System.out.println(ep.id);
        System.out.println(ep.surname);
//        System.out.println(ep.salary);

        Employee ep2 = new Employee("Dima");
        ep2.showSalary();
        ep2.showId();
        ep2.showSurname();
        System.out.println(ep2.id);
        System.out.println(ep2.surname);
//        System.out.println(ep2.salary);

//        Employee ep3 = new Employee(21.3);
//        ep3.showSalary();
//        ep3.showId();
//        ep3.showSurname();
//        System.out.println(ep3.id);
//        System.out.println(ep3.surname);
//        System.out.println(ep3.salary);
    }

}



