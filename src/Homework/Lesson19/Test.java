package Homework.Lesson19;

public class Test {
                                // двумерный массив
    public static String[] abc(String [] ...array1){
        int length = 0; // задаю переменную длина

        // Элементом двумерного массива является одномерный массив
        for (String [] array2 : array1){ //Сначала  одномер String [] array2
            length += array2.length; // узнаю размер массива

            /*
            Первая итерация: String [] array2 = {"ok", "privet", "poka"} - размер 3 - это 0 элемент введенного параметра array1
            length(0) = length(0) + array2.length(3)
            Вторая итерация: String [] array2 = {"ok","hello", "bye", "go"} - размер 4 - это 1 элемент введенного параметра array1
            length(3) = length(3) + array2.length(4) - узнали общую длину массива который надо будет заполнить
             */
        }
        // создаю новый пустой массив с размером равным размеру введенного в параметр массива
        String [] list = new String[length];
        // создаю счетчик с 0
        int count = 0;
        // одномерный массив array2 является элементом двумерного массива array1
        for (String [] array2 : array1){
            // s являтся стрингом одномерного массива array2
            for (String s : array2){
                list[count] = s;
                count++;

                /*
                1.) count = 0
                    String [] array2 = {"ok", "privet", "poka"} - 0 индекс array1
                        0 индекс = s, т.е. s = "ok"
                        list[0] = "ok"
                        count = count(0) + 1 = 1
                2.) count = 1
                    String [] array2 = {"ok", "privet", "poka"} - 0 индекс array1
                        1 индекс = s, т.е. s = "privet"
                        list[1] = "privet"
                        count = count(1) + 1 = 2
                3.) count = 2
                    String [] array2 = {"ok", "privet", "poka"} - 0 индекс array1
                        2 индекс = s, т.е. s = "poka"
                        list[2] = "poka"
                        count = count(2) + 1 = 3
                4.) count = 3
                    String [] array2 = {"ok","hello", "bye", "go"} - 1 индекс array1
                        0 индекс = s, т.е. s = "ok"
                        list[3] = "ok"
                        count = count(3) + 1 = 4
                5.) count = 4
                    String [] array2 = {"ok","hello", "bye", "go"} - 1 индекс array1
                        1 индекс = s, т.е. s = "hello"
                        list[4] = "hello"
                        count = count(4) + 1 = 5
                ...
                 */

            }
        }
        return list;

    }

    public static void main(String[] args) {
        String[] target = abc(new String[]{"ok", "privet", "poka"}, new String[]{"ok","hello", "bye", "go"});
        // Создали одномерн.массив target и присвоили ему значение двух одномерн.массивов пропущенных через параметр abc

        // сравниваем параметры массива target с параметрами command line
        for (String s : args){ // делает итерации по каждому значению массива args
            for (int i = 0; i <target.length; i++){
                if (s.equals(target[i])){
                    // если String i-index параметра args равен одному из String параметров target...

                    /*
                    s(args[0]) == target[0] ?
                    s(args[0]) == target[1] ?
                    s(args[0]) == target[2] ?
                    s(args[0]) == target[3] ?
                    s(args[0]) == target[4] ?
                    s(args[0]) == target[5] ?
                    s(args[0]) == target[6] ?

                    s(args[1]) == target[0] ?
                    s(args[1]) == target[1] ?
                    s(args[1]) == target[2] ?
                    s(args[1]) == target[3] ?
                    s(args[1]) == target[4] ?
                    s(args[1]) == target[5] ?
                    s(args[1]) == target[6] ?

                    s(args[2]) == target[0] ?
                    s(args[2]) == target[1] ?
                    s(args[2]) == target[2] ?
                    s(args[2]) == target[3] ?
                    s(args[2]) == target[4] ?
                    s(args[2]) == target[5] ?
                    s(args[2]) == target[6] ?

                    ...
                     */

                    target[i] = null;
                    //... то присвоть i-index параметру target значение null
                }
            }
        }
        // вывод массива
        for (String s : target){
            System.out.print(s + " ");
        }
        System.out.println();
    }

}
