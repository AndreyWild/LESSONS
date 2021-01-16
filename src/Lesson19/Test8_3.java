package Lesson19;

public class Test8_3 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Privet");
        StringBuffer sb2 = new StringBuffer("Poka");
        StringBuffer sb3 = new StringBuffer("ok");
        StringBuffer [] array = {sb1, sb2, sb3};
        for (StringBuffer sb : array){
            sb.append(" Java"); //при помощи методо можно менять
            // значение объекта, но сам объект менять нельзя
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
