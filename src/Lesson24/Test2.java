package Lesson24;

public class Test2 {
    public static void main(String[] args) {
//        Figura f1 = new Kvadrat();
    }

}

abstract class Figura{ // Абстрактный класс, нельзя создать объект абстр.класса
/*
Если в классе есть abstract метод, то и сам класс должен быть abstract.
В abstract классе не обязательно наличие abstract методов.
 */
    Figura(int kolichestvoStoron){
        this.kolichestvoStoron = kolichestvoStoron;
    }

    int kolichestvoStoron = 0;
    abstract void perimetr(); // Абстрактный метод
    abstract void ploshad(); // у абстрактного метода нету тела
    void showInfo(){
        System.out.println("Eto figura!");
    }

}

class Kvadrat extends Figura{

    Kvadrat(int kolichestvoStoron){
        super(kolichestvoStoron);
        this.kolichestvoStoron = kolichestvoStoron;
    }
    int kolichestvoStoron = 4;
    int storona1 = 10;
    public void perimetr(){
        System.out.println("Perimetr kvadrata raven = " + storona1 * 4);
    }
    void ploshad(){
        System.out.println("Ploshad kvadrata ravna = " + storona1 * storona1);
    }
}

class Prjamougolnik extends Figura{

    Prjamougolnik(int kolichestvoStoron){
        super(kolichestvoStoron);
        this.kolichestvoStoron = kolichestvoStoron;
    }
    int kolichestvoStoron = 4;
    int storona1 = 8;
    int storona2 = 5;
    public void perimetr(){
        System.out.println("Perimetr Prjamougolnika raven = " + (storona1 + storona2) * 2);
    }
    void ploshad(){
        System.out.println("Ploshad Prjamougolnika ravna = " + storona1 * storona2);
    }
}

//class Okrejnost extends Figura{
//    int kolichestvoStoron = 0;
//    int radius = 3;
//    double pi = 3.14;
//    public void perimetr(){
//        System.out.println("Perimetr Okrejnosti raven = " + 2 * pi * radius);
//    }
//    void ploshad(){
//        System.out.println("Ploshad Okrejnosti ravna = " + pi * radius * radius);
//    }
//}

//abstract class Chetyrehugolnik extends Figura {
//    // У abstract родительского класса может быть abstract child класс
//    void def(){
//        System.out.println("Eto Chetyrehugolnik");
//    }
//}