package Lesson27;

public class Test24 {
}

class Airplan{
    String sostojanie = "В ожидании"; // В воздухе, Полет отменен
    public void letet(){
        sostojanie = "В воздухе";
        System.out.println("Самолет летит.");
    }
    public void ojidat(){
        if(sostojanie.equals("В воздухе")){throw new IllegalStateException("Самолет уже в воздухе");}
        sostojanie = "В ожидании";
        System.out.println("Самолет в ожидании полета.");
    }
    public void otmenitPolet(){
        if(sostojanie.equals("В воздухе")){throw new IllegalStateException("Самолет уже в воздухе");}
        sostojanie = "Полет отменен";
        System.out.println("Полет самолета отменен.");
    }

    public static void main(String[] args) {
        Airplan airplan = new Airplan();
        airplan.ojidat();
        // Самолет в ожидании полета.
        airplan.letet();
        // Самолет в ожидании полета.
        // Самолет летит.
        airplan.otmenitPolet();
        // Самолет в ожидании полета.
        // Самолет летит.
        // Exception in thread "main" java.lang.IllegalStateException: Самолет уже в воздухе
        // at Lesson27.Airplan.otmenitPolet(Test24.java:18)
        // at Lesson27.Airplan.main(Test24.java:30)

    }
}