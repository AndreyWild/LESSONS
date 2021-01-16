package Lesson4;

public class BankAccount {
    int id;
    String name = "Andrey";
//    String name = new String("Andrey"); можно и так
    double balance;




}

class BankAccountTest{
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Andrey";
        MyAccount.balance = 12.39;

        YourAccount.id = 2;
        YourAccount.name = "Bob";
        YourAccount.balance = 10.50;

        HisAccount.id = 3;
        HisAccount.name = "Tom";
        HisAccount.balance = 11.08;

        System.out.println(HisAccount.name);
    }
}
