package Homework.Lesson27;

public class Test1 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.eat("myaso"); // т.к. RuntimeException можно не расписывать try catch
        try {
            tiger.drink("voda");
            try {
                tiger.drink("pivo");
            } catch (NeVodaException e) { // стоит первым т.к. дочерний класс Exception
                System.out.println(e.getMessage());
            } catch (Exception e) { // стоит вторым т.к. если поставить первым не сработает NeVodaException
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Это inner finnaly блок");
            }
        } catch (RuntimeException e) { // стоит первым т.к. дочерний класс Exception
            System.out.println(e.getMessage());
        } catch (Exception e) { // стоит вторым т.к. если поставить первым не сработает NeVodaException
            System.out.println(e.getMessage());
        }
    }
}

class NeMyasoException extends RuntimeException {

    public NeMyasoException(String message) {
        super(message);
    }
}


class NeVodaException extends Exception {

    public NeVodaException(String message) {
        super(message);
    }
}

class Tiger {

    void eat(String eat) {
        if (!eat.equals("myaso")) {
            throw new NeMyasoException("Tiger не ест: " + eat);
        }
        System.out.println("Tiger ест мясо");
    }

    void drink(String drink) throws NeVodaException {
        if (!drink.equals("voda")) {
            throw new NeVodaException("Tiger не пьет: " + drink);
        }
        System.out.println("Tiger пьет воду");
    }
}
