package Lesson18;

public class Test7 {
    public static void maxMin(double [] array){
        double max = array [0];
        double min = array [0];
        for (int i = 1; i < array.length; i++){

            if(array[i]>max){
                max = array[i];
            }
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println("min = "+min+" max = "+max);
    }

    public static void main(String[] args) {
        double [] array1 = {1.05, -3.14, 8.0, 9.19, -3.0};
        maxMin(array1);
        maxMin(new double[]{-125.0, 42.0, 4.21, 5, 45 });
    }
}
