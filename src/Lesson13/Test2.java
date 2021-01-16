package Lasson13;

public class Test2 {
    public static void main(String[] args) {
        switch ("Воскресенье"){
            case "Понедельник":
                System.out.println("Работа до 18:00");
                break;
            case "Вторник":
                System.out.println("Работа до 18:00");
                break;
            case "Среда":
                System.out.println("Работа до 18:00");
                break;
            case "Четверг":
                System.out.println("Работа до 18:00");
                break;
            case "Пятница":
                System.out.println("Работа до 18:00");
                break;
            case "Суббота":
                System.out.println("Работа до 14:00");
                break;
            case "Воскресенье":
                System.out.println("Выходной");
                break;
            default:
                System.out.println("Нет такого дня");
        }

//            Можно записать короче если одинаковый вывод текста
                switch ("Понедельник"){
            case "Понедельник":
            case "Вторник":
            case "Среда":
            case "Четверг":
            case "Пятница":
                System.out.println("Работа до 18:00");
                break;
            case "Суббота":
                System.out.println("Работа до 14:00");
                break;
            case "Воскресенье":
                System.out.println("Выходной");
                break;
            default:
                System.out.println("Нет такого дня");
        }
    }
}
