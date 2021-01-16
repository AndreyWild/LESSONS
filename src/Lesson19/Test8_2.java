package Lesson19;

public class Test8_2 {
    public static void main(String[] args) {
        String [] array = {"Privet", "Poka", "Ok", "Good"};
//        for (int i = 0; i < array.length; i++){
//            array[i] = "Bye";
//        }

        // foreach loop не может менять значения String объектов
        for (String a : array){
            a = new String("Bye");
        }

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

    }
}
