package Homework.Lesson13;

public class Month {
    int mont;

    public static void months(int mont){
        switch (mont){
            case 1:
                System.out.println("Это месяц январь 2020 года, в нем 31 день");
                break;
            case 2:
                System.out.println("Это месяц февраль 2020 года, в нем 29 дней");
                break;
            case 3:
                System.out.println("Это месяц март 2020 года, в нем 31 день");
                break;
            case 4:
                System.out.println("Это месяц апрель 2020 года, в нем 30 дней");
                break;
            case 5:
                System.out.println("Это месяц май 2020 года, в нем 31 день");
                break;
            case 6:
                System.out.println("Это месяц июнь 2020 года, в нем 30 дней");
                break;
            case 7:
                System.out.println("Это месяц июль 2020 года, в нем 31 день");
                break;
            case 8:
                System.out.println("Это месяц август 2020 года, в нем 31 день");
                break;
            case 9:
                System.out.println("Это месяц сентябрь 2020 года, в нем 30 дней");
                break;
            case 10:
                System.out.println("Это месяц октябрь 2020 года, в нем 31 день");
                break;
            case 11:
                System.out.println("Это месяц ноябрь 2020 года, в нем 30 дней");
                break;
            case 12:
                System.out.println("Это месяц январь 2020 года, в нем 31 день");
                break;
            default:
                System.out.println("Нет такого месяца");
        }
    }

    public void months2(int mont){
        this.mont = mont;
        switch (mont){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("В этом месяце 31 день");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("В этом месяце 30 дней");
                break;
            case 2:
                System.out.println("В этом месяце 29 дней");
                break;
            default:
                System.out.println("Нет такого месяца");
        }
    }

    public static void main(String[] args) {
        months(3); // Потому что метод static и находится внутри класса
        Month.months(2); // А можно и так
        Month mt = new Month();
        mt.months2(3); // Потому что не static метод
        mt.months2(2);
        mt.months2(13);
    }
}
