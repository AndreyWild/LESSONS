package Lesson16;

public class Test12 {
    public static void main(String[] args) {
        String x = "privet";
        String y = "privet".trim();
        String z = " privet".trim();
        System.out.println(x==y); // true т.к. метод ничего не сделал с объектом
        // и в стринг пуле ссылка идет на один и тот же объект
        System.out.println(x==z); // false т.к. создался новый объект " privet",
        // потом его изменил метод и создал новый объект
    }
}
