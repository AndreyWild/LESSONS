package Lesson11;

public class Emplooye {
    public  String name;
    public double salary;

    Emplooye(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public double uvelichitel(double a){
        a = a * 2;
        return a;
    }
    public double zp2(){
        salary = salary *2;
        return salary;
    }
}

class EmplooyeTest{
    public static void main(String[] args) {
        Emplooye emp1 = new Emplooye("Ivan", 100.55);
        double d = emp1.uvelichitel(emp1.salary);
        System.out.println(d);
        System.out.println(emp1.salary);
        emp1.zp2();
        System.out.println(emp1.salary);

    }
}