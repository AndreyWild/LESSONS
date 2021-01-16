package Lesson15;

public class Test7 {
    public static void main(String[] args) {
        int money = 0;
        do{
            System.out.println("Делайте ставку");
            System.out.println("Вы проиграли");
            money -= 10;
        }
        while (money > 50);
        System.out.println(money);
    }
}
