package Homework.Lesson5;

public class Employee {

    int id;
    String surname;
    int age;
    double salary;
    String department;


    Employee(int idE, String surnameE, int ageE, double salaryE, String departmentE){
        id = idE;
        surname = surnameE;
        age = ageE;
        salary = salaryE;
        department = departmentE;
    }



    double doubleSalary(){
        salary *= 2;
        return salary;

    }

}

class EmployeeTest{
    public static void main(String[] args) {
        Employee ep1 = new Employee(1, "Tornton", 25, 2000, "Manager");
        Employee ep2 = new Employee(25, "Snow", 23, 2500, "Stranger");

        ep1.doubleSalary();
        System.out.println("Новая зарплата " + ep1.surname + " : " + ep1.salary);

        // Вывод через переменную.
        double newSalary = ep2.doubleSalary();
        System.out.println("Новая зарплата " + ep2.surname + " : " + newSalary);
    }
}