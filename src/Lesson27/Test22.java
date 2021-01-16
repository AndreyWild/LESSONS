package Lesson27;

public class Test22 {
    void marafon(int temperaturaVozduha, int tempBega) throws PodvernutNoguException {
        if (tempBega > 12) {
            throw new PodvernutNoguException("Темп бега был слишком высоким, вы подвернули ногу!: " + tempBega);
        }
        if (temperaturaVozduha > 32) {
            // т.к. он дочерний класс RuntimeException можно не писать его в сигнатуре метода
            // и не расписывать для него try и catch.
            throw new SveloMyshcuException();
        }
        System.out.println("Вы пробежали марафон");
    }

    public static void main(String[] args) {
        Test22 t = new Test22();
        try {
            t.marafon(20, 13);
        } catch (PodvernutNoguException e) {
            System.out.println(e.getMessage()); // вывести сообщение из класса
        } finally {
            System.out.println("В любом случае вы получите грамоту");
        }
    }
}

class PodvernutNoguException extends Exception {

    PodvernutNoguException(String message) {
        super(message);
    }

    PodvernutNoguException() {
    }
}

class SveloMyshcuException extends RuntimeException {

    SveloMyshcuException(String message) {
        super(message);
    }

    SveloMyshcuException() {
    }
}