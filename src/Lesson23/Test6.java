package Lesson23;

public class Test6 {
}

class Animals{

    String showName(){
        return "some Animal";
    }
    void showInfoAboutAnimal(){
        System.out.println("Name of animal: " + showName());
    }
}

class Mouses extends Animals{
   String showName(){
        return "Jerry";
    }
    void showInfoAboutMouse(){
        System.out.println("Name of mouse: " + showName());
    }

    public static void main(String[] args) {
        Mouses a = new Mouses();
        a.showInfoAboutAnimal();
        a.showInfoAboutMouse();
    }
}

//Name of animal: Jerry
//Name of mouse: Jerry