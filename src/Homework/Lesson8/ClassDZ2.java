package Homework.Lesson8;

public class ClassDZ2 {
    public static final double PI = 3.14;

    public double areaCircle(double area1){
        double areacircle = PI * area1 * area1;
        return areacircle;
    }

    public static double сircumLength(double area2){
        double сircumlength = 2 * PI * area2;
        return сircumlength;
    }

    public void info(double area3){
        System.out.println("Радиус равен: " + area3);
        System.out.println("Площадь круга с радиусом: " + area3+ " равна: " + areaCircle(area3));
        System.out.println("Длинна окружности при радиусе: " + area3 + " равна: " + сircumLength(area3));
    }
}

class ClassDZ2Test{
    public static void main(String[] args) {
        ClassDZ2 dz2 =  new ClassDZ2();

        dz2.areaCircle(5);
        ClassDZ2.сircumLength(7.5);
        dz2.info(3);

    }

}