package Homework.Lesson22;

public class Student {

    private StringBuilder name; // создал переменную name типа StringBuilder

    public StringBuilder getName(){ // задал возвратный метод StringBuilder c именем getName (без параметров)
        StringBuilder name2 = new StringBuilder(name); // присвоил новой переменной name2 значение переменной name
        return name2; // при вызове метода вернул значение переменной name2
    }
    public void setName(StringBuilder s){ // создал метод с аргументом (StringBuilder s)
        if (s.length()> 3){ // если аргумент >3
            this.name = s; // то присвоить private StringBuilder name значение StringBuilder s
        }
    }
    private int course;

    public int getCourse(){
        return course;
    }
    public void setCourse(int i){
        if(i>0 && i<=4){
            course = i;
        }
    }

    private int grade;

    public int getGrade(){
        return grade;
    }
    public void setGrade(int i){
        if(i>0 && i<=10){
            grade = i;
        }
    }

    public void showInfo(){
        System.out.println("Имя студента:" + getName());
        System.out.println("Курс студента:" + getCourse());
        System.out.println("Оценка студента:" + getGrade());

    }

}

class TestStudent{
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.setName(new StringBuilder("Andrey"));
        student1.setCourse(4);
        student1.setGrade(10);

        student1.showInfo();
    }
}