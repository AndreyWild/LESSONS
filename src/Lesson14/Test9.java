package Lesson14;

public class Test9 {
    public static void main(String[] args) {
        for(int i=1; i<101; i++){
            if(i == 50){
                continue;
            }
            if(i % 55 == 0){
                break;
            }
            System.out.println(i);
        }
    }
}
