package Homework.Lesson30;

import java.util.ArrayList;
import java.util.function.*;

public class Test1 {
}

class Employee {
    String name;
    String department;
    double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class TestEmployee {

    void printEmployee(Employee e) {
        System.out.println("Работник по имени: " + e.name + " из департамента: " + e.department + " получает: " + e.salary + " USD");
    }

    void filtrciyaRabotnikov(ArrayList<Employee> listEmp, Predicate<Employee> pE) {
        for (Employee emp : listEmp) {
            if (pE.test(emp)) {
                printEmployee(emp);
            }
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Кирилл", "ИТ", 1500);
        Employee emp2 = new Employee("Максим", "Бухгалтерия", 1000);
        Employee emp3 = new Employee("Дмитрий", "ИТ", 800);
        Employee emp4 = new Employee("Алла", "Маркетинг", 600);
        Employee emp5 = new Employee("Светлана", "Снабжение", 550);
        Employee emp6 = new Employee("Андрей", "ОТК", 500);
        Employee emp7 = new Employee("Евгений", "Бухгалтерия", 450);
        Employee emp8 = new Employee("Марина", "Снабжение", 400);
        Employee emp9 = new Employee("Екатерина", "ОТК", 350);
        Employee emp10 = new Employee("Маркетинг", "Маркетинг", 300);

        ArrayList<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        list.add(emp6);
        list.add(emp7);
        list.add(emp8);
        list.add(emp9);
        list.add(emp10);
        TestEmployee tEmp = new TestEmployee();

        tEmp.filtrciyaRabotnikov(list, x -> x.department.equals("ИТ") && x.salary > 200);
        System.out.println("------------------------------------------------------------");
        tEmp.filtrciyaRabotnikov(list, x -> x.name.startsWith("Е") && x.salary != 450);
        System.out.println("------------------------------------------------------------");
        tEmp.filtrciyaRabotnikov(list, x -> x.name.equals(x.department));
    }
}