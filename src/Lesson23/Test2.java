package Lesson23;



public class Test2 {

//    public Object abc(){return new Doctor();} // Прородителем всех классов является Objekt
//    public Object abc2(){return new String("Hello");} // это все child классы Objekt
//    public Object abc3(){return new int[]{1, 3, 5, 2};}
//    public Doctor abc4(){return new Doctor();}
//    public Doctor abc5(){return new Surgeon();}
    // public Doctor abc6(){return new Emploeey();} - нельзя т.к. Emploeey родительсикй класс Doctor

    public static void main(String[] args) {
//        Doctor doc = new Doctor();
//        Teacher teacher = new Teacher();
//        Driver driver = new Driver();
//        Emploeey emploeey = new Emploeey();

        Emploeey emp1 = new Doctor(); // Доктор это работник
        System.out.println(emp1.salary);
        System.out.println(emp1.name);
        System.out.println(emp1.age);
        System.out.println(emp1.experience);
        emp1.eat();
        emp1.sleep();
        //emp1.toHeal(); нельзя т.к. у переменной emp1 тип Emploeey, а у Emploeey нет такого метода.

        Emploeey emp2 = new Teacher(); // Учитель это работник
        Emploeey emp3 = new Driver(); // Водитель это работник
        // переменная суперкласса может ссылаться на любой объект субкласса, но не наоборот

        Surgeon surgeon = new Surgeon();

        Doctor doc2 = new Surgeon(); // Хирург это доктор
        // System.out.println(doc2.operation()); нельзя т.к. у переменной doc2 тип Doctor, а у Doctor нет такого метода.

        Emploeey emp4 = new Surgeon(); // Хирург это работник
        // можем вызвать все методы и переменные класса Emploeey



        //Driver driv1 = new Emploeey(); // Работник это водитель -> нельзя

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

class Doctor extends Emploeey {
    String specialization;

    void toHeal(){
        System.out.println("Lechit'");}
}

class Surgeon extends Doctor {
    String skalpel;

    void operation(){
        // код
    }
}



class Teacher extends Emploeey {
    int amountStudents;

    void teach(){
        System.out.println("Uchit'");}
}

class Driver extends Emploeey {
    String carBrand;

    void drive(){
        System.out.println("Vodit'");}
}