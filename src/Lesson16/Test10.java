package Lesson16;

public class Test10 {
    public static void main(String[] args) {
        String s1 = "Чтоб мудро жизнь прожить, знать надобно немало. Два важных правила запомни для начала:" +
                "Ты лучше голодай, чем что попало ешь, И лучше одному, чем вместе с кем попало.";
        System.out.println(s1.length());

        String s2 = s1.toUpperCase();
        char c1;
        char c2;
        // итерация от 0 до 164 шаг 1
        for(int i =0; i<s1.length(); i++){
            // приравнивает c1 к Char с индексов i
            c1 = s1.charAt(i);
            c2 = s2.charAt(i);
            // если c1 не равно "," и ":" и "." и " " и равно с2, то
            if(c1 != ','&& c1 != ':'&& c1 != '.' && c1 != ' ' && c1 == c2){
                // переход на новую строку
                System.out.println();
                // вывод значения с1
                System.out.print(c1);
                // начать новую итерацию
                continue;
            }
            // если условия if не совпали, то вывод значения c1
            System.out.print(c1);
        }
        System.out.println();
    }
}
