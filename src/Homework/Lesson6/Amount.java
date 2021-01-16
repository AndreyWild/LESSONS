package Homework.Lesson6;

public class Amount {

    int sum(){
        int result = 0;
        System.out.println("Результат сложения чисел равен " + result);
        return result;
    }

    int sum(int a, int b){
        int result = a + b;
        System.out.println("Результат сложения чисел " + a + " и " + b + " равен " + result);
        return result;
    }

    int sum(int a, int b, int c){
        int result = a + b + c;
        System.out.println("Результат сложения чисел " + a + " и " + b + " и " + c + " равен " + result);
        return result;
    }

    int sum(int a, int b, int c, int d){
        int result = a + b + c + d;
        System.out.println("Результат сложения чисел " + a + " и " + b + " и " + c + " и " + d + " равен " + result);
        return result;
    }
}

class AmountTest{
    public static void main(String[] args) {
        Amount am = new Amount();
        am.sum();
        am.sum(4, 5);
        am.sum(4, 5, 8);
        am.sum(4, 5, 8, 1);

    }
}