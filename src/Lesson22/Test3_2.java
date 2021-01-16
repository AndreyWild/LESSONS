package Lesson22;

public class Test3_2 {
    void increaseSalary (Emploeey e){  // Extensibility
        e.salary = e.salary +100;
    }

    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name = "Hause";
        doc.age = 50;
        doc.experience = 25;
        doc.specialization = "surgeon";
        doc.eat();
        doc.sleep();
        doc.toHeal();
    }
}

class Emploeey{
    String name;
    double salary = 100;
    int age;
    int experience;

    void eat(){
        System.out.println("Kushat'");}
    void sleep(){
        System.out.println("Spat'");}
}

class Doctor extends Emploeey{
    String specialization;

    void toHeal(){
        System.out.println("Lechit'");}
}

class Surgeon extends Doctor{
    String skalpel;

    void operation(){
        // код
    }
}

class Dantist extends Doctor{
    // код
}



class Teacher extends Emploeey{
    int amountStudents;

    void teach(){
        System.out.println("Uchit'");}
}

class Driver extends Emploeey{
    String carBrand;

    void drive(){
        System.out.println("Vodit'");}
}