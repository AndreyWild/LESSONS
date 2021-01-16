package Lesson25;

public class Test4 {
    public static void main(String[] args) {
        EmploeeyX emp1 = new DoctorX();
        EmploeeyX emp2 = new TeacherX();
        EmploeeyX emp3 = new DriverX();
        EmploeeyX emp4 = new EmploeeyX();
        DoctorX d1 = (DoctorX)emp1; // применили downcasting
        System.out.println(d1.specialization);
        System.out.println(((DoctorX)emp1).specialization); // можно так назначить
        d1.toHeal();
        ((DoctorX)emp1).toHeal(); // и так

        EmploeeyX [] array = {emp1, emp2, emp3, emp4};
        for(EmploeeyX e : array){
            if(e instanceof DriverX){
                System.out.println(((DriverX)e).carBrand);
                ((DriverX)e).drive();
            }
        }
    }
}

class EmploeeyX {
    double salary = 100;
    String name = "Kolja";
    int age;
    int experience;

    void eat(){
        System.out.println("Kushat'");}
    void sleep(){
        System.out.println("Spat'");}
}

class DoctorX extends EmploeeyX{
    String specialization = "Hirurg";

    void toHeal(){
        System.out.println("Lechit'");}
}

class TeacherX extends EmploeeyX{
    int amountStudents;
    void teach(){
        System.out.println("Uchit'");}
}

class DriverX extends EmploeeyX{
    String carBrand = "Mercedes";
    void drive(){
        System.out.println("Vodit'");}
}