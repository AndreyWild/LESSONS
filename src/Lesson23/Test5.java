package Lesson23;

public class Test5 {
    public static void main(String[] args) {
        Emploeey2 emp = new Emploeey2();
        //emp.sleep(); //нельзя вызвать метод, т.к. он внутри Emploeey2 private
        Teacher2 t = new Teacher2();
        t.sleep(); // Sleep Teacher
        Emploeey2 e = new Teacher2();
        e.sleep(); // Sleep rabotnik

    }
}

class Eda2{}
class Frukty2 extends Eda2{}

class Emploeey2{
    String name;
    double salary = 100;

    public Eda2 eat(){
        Eda2 e = new Eda2();
        System.out.println("Kushaet rabotnik");
        return e;
    }
    static void sleep(){
        System.out.println("Sleep rabotnik");}
}

class Teacher2 extends Emploeey2 {
    String salary = "dvesti";
    int amountStudents;

@Override
    public Eda2 eat(){
        Frukty2 f = new Frukty2();
        System.out.println("Kushaet Teacher");
        return f;
    }

    void teach(){
        System.out.println("Uchit'");}

    static void sleep(){ // static методы не перезаписываются

        System.out.println("Sleep Teacher");}
}