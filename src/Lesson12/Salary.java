package Lesson12;

public class Salary {
    public static void main(String[] args) {
        int salary = 1500;
        boolean b = true;

        if (salary < 200){
            System.out.println("Zp ochen' malren'kaja");
        } else if (salary < 400 && b == false || true){
            System.out.println("Zp srednegp razmera");
        } else if (b == true) {
            System.out.println("Zp vysokaja");
        }
    }
}
