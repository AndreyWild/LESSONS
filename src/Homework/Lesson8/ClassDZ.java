package Homework.Lesson8;

public class ClassDZ {

    static int multiplication(int a, int b, int c){
                return a * b * c;
    }

    static void division(int a, int b){
        System.out.println("При делении числа "+ a + " на " + b + " получится: "
                + a/b + " с остатком равным " + a%b);
    }
}

class ClassDZTest{
    public static void main(String[] args) {
        System.out.println(ClassDZ.multiplication(3, 4, 8));
        System.out.println(ClassDZ.multiplication(2, 6, 9));

        ClassDZ.division(8, 2);
        ClassDZ.division(9, 2);
    }
}