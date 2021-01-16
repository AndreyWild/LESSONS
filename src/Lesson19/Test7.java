package Lesson19;

public class Test7 {
    public static void main(String[] args) {
        int[][][] array = {{{3, 7 ,8},{4, 5}},{{9, 4, 4},{6, 8, 3}}};
        for (int [][] array2: array){
            for (int [] array3: array2){
                for(int a : array3){
                    System.out.print(a + " ");
                }
            }
        }
    }
}

