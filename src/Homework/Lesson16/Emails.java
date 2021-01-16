package Homework.Lesson16;

public class Emails {
    String email;

    public void email(String email){
        this.email = email;

        if (email.contains("yahoo.com")){
            System.out.println("yahoo");
        }
        if (email.contains("mail.ru")){
            System.out.println("mail");
        }
        if (email.contains("gmail.com")){
        System.out.println("gmail");
        }
    }

    public static void main(String[] args) {
        Emails eml = new Emails();
        eml.email("ya@yahoo.com; on@mail.ru; ona@gmail.com");
    }
}

