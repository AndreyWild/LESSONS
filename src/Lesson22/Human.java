package Lesson22;

public class Human {
    final String sex;

    public Human(String sex){
        this.sex = sex;
    }
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String s){
        name = s;
    }

    private int age;

    public int getAge(){
        return age;
    }
    public void setAge(int i){
        if(i>0 && i<=150){
            age = i;
        }
    }

    private int weight;

    public int getWeight(){
        return weight;
    }

    public void setWeight(int i){
        if (i>0 && i<300){
            weight = i;
        }
    }

    private boolean clever;

    public boolean isClever() { // у boolean метод начинается с is
        return clever;
    }
    public void setClever(boolean b){
        clever = b;
    }

}

class Test{
    public static void main(String[] args) {
        Human human = new Human("male");
        human.setName("Andrey");
        human.setAge(25);
        human.setWeight(80);

        System.out.println(human.getName());
        System.out.println(human.getAge());
        System.out.println(human.getWeight());
    }
}
