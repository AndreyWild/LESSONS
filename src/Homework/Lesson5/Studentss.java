package Homework.Lesson5;



public class Studentss {
    int id;
    int studentCard;
    String firstName;
    String lastName;
    short yearOfStudy;
    double averMarkMath;
    double averMarkEcon;
    double lingo;

}

class StudentsTest{

    double srednArifmOcenka(Studentss stX){
        double sredOcenka = (stX.averMarkMath + stX.averMarkEcon + stX.lingo) /3;
        System.out.println("Средняя оценка студента " + stX.firstName + " " + stX.lastName + " : " + sredOcenka);
        return sredOcenka;
    }

    public static void main(String[] args) {

        Studentss st1 = new Studentss();
        st1.studentCard = 1;
        st1.firstName = "Bob";
        st1.lastName = "Colson";
        st1.yearOfStudy = 2020;
        st1.averMarkMath = 8.3;
        st1.averMarkEcon = 9.2;
        st1.lingo = 10;
        double averRat1 = (st1.averMarkMath + st1.averMarkEcon + st1.lingo) / 3;

        System.out.println("Студент № "+ st1.studentCard+ " " + st1.firstName + " " + st1.lastName +
                " " + st1.yearOfStudy + " года обучения, имеет средний балл: " + averRat1);

        Studentss st2 = new Studentss();
        st2.studentCard = 15;
        st2.firstName = "Tom";
        st2.lastName = "Wilson";
        st2.yearOfStudy = 2019;
        st2.averMarkMath = 8.1;
        st2.averMarkEcon = 6.9;
        st2.lingo = 7.4;
        double averRat2 = (st2.averMarkMath + st2.averMarkEcon + st2.lingo) / 3;

        System.out.println("Студент № "+ st2.studentCard+ " " + st2.lastName +
                " " + st2.yearOfStudy + " года обучения, имеет средний балл: " + averRat2);

        Studentss st3 = new Studentss();
        st3.studentCard = 45;
        st3.firstName = "Roj";
        st3.lastName = "Jonson";
        st3.yearOfStudy = 2017;
        st3.averMarkMath = 8.6;
        st3.averMarkEcon = 9.2;
        st3.lingo = 10.0;
        double averRat3 = (st3.averMarkMath + st3.averMarkEcon + st3.lingo) / 3;

        System.out.println("Студент № "+ st3.studentCard+ " " + st3.lastName +
                " " + st3.yearOfStudy + " года обучения, имеет средний балл: " + averRat3);

        StudentsTest sTest = new StudentsTest();
        sTest.srednArifmOcenka(st1);
        sTest.srednArifmOcenka(st2);
        sTest.srednArifmOcenka(st3);

    }
}

