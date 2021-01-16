package Lesson18;

public class Test1 {
    public static void main(String[] args) {
        int[][] a = {
                {15, 16, 46, 47},
                {87, 88, 12, 13}
        };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);
            }
        }
    }
}



