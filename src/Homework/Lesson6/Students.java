package Homework.Lesson6;



public class Students {
    Students(int id1, String firstName1, String lastName1, int yearOfStudy1, double averMarkMath1,
             double averMarkEcon1,double lingo1){
        id = id1;
        firstName = firstName1;
        lastName = lastName1;
        yearOfStudy = yearOfStudy1;
        averMarkMath = averMarkMath1;
        averMarkEcon = averMarkEcon1;
        lingo = lingo1;

    }

    Students(int id2, String firstName2, String lastName2, int yearOfStudy2){
        this(id2, firstName2, lastName2, yearOfStudy2, 0.0, 0.0, 0.0);
    }

    Students(){
    }


    int id;
    String firstName;
    String lastName;
    int yearOfStudy;
    double averMarkMath;
    double averMarkEcon;
    double lingo;
}

class StudentsTest{

    double srednArifmOcenka(Students stX) {
        double sredOcenka = (stX.averMarkMath + stX.averMarkEcon + stX.lingo) / 3;
        System.out.println("Средняя оценка студента " + stX.firstName + " " + stX.lastName + " : " + sredOcenka);
        return sredOcenka;
    }

    public static void main(String[] args) {
        Students st = new Students();


//        Students st1 = new Students(25, "Andrey", "Petrov", 2005, 8.6, 7.3, 5.4);
        Students st1 = new Students();
        st1.id = 1;
        st1.firstName = "Bob";
        st1.lastName = "Colson";
        st1.yearOfStudy = 2020;
        st1.averMarkMath = 8.3;
        st1.averMarkEcon = 9.2;
        st1.lingo = 10;


        Students st2 = new Students(12, "Ivan", "Ivanov", 2003);
        st2.averMarkMath = 7.4;
        st2.averMarkEcon = 9.5;
        st2.lingo = 9.2;


        Students st3 = new Students(14, "Andrey", "Ivanov", 2012, 7.6, 8.3, 6.4);

        StudentsTest sTest = new StudentsTest();
        sTest.srednArifmOcenka(st1);
        sTest.srednArifmOcenka(st2);
        sTest.srednArifmOcenka(st3);
    }
}