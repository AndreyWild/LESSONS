package Homework.Lesson5;

public class BankAccount {

    double balanse = 100;

    void popolnenieScheta(double plus){
        System.out.println("Сумма на балансе: " + balanse);
        System.out.println("Вы внесли : " + plus);
        balanse += plus;
        System.out.println("Теперь сумма на балансе: " + balanse);
        System.out.println();
    }


    void snyatieSoScheta(double minus){
        System.out.println("Сумма на балансе: " + balanse);
        System.out.println("Вы сняли : " + minus);
        balanse -= minus;
        System.out.println("Теперь сумма на балансе: " + balanse);
        System.out.println();

    }

}

class BankAccountTest{
    public static void main(String[] args) {
        BankAccount bA = new BankAccount();
        bA.popolnenieScheta(150);
        bA.snyatieSoScheta(80);
    }
}
