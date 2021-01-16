package Homework.Lesson16;

public class Emails2 {

    public void email(String email){
        int a = 0; // позиция символа @
        int b = 0; // позиция символа .
        int c = 0; // позиция символа ;

        // email.length() -1 потому как длинна строки 40,
        // а последний индекс 39, т.к. индексы идут от 0 до 39
        while (c < email.length() -1){

            a = email.indexOf('@', c);
            b = email.indexOf('.', c);
            c = email.indexOf(';', c + 1); // +1 тобы indexOf() не находил ";" на прежнем месте
            // а сдвигался на 1 индекс от последней ";"
            System.out.println(c);
            System.out.println(email.substring(a + 1, b));
        }

    }

    public static void main(String[] args) {
        Emails2 eml = new Emails2();
        eml.email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }
}
