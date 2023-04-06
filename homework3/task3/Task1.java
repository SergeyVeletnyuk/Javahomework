package homework3.task3;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class Task1 {
    public static void main(String[] args) {
        Random rd = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(rd.nextInt(1, 10));
        }
        System.out.println(list);



        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i) % 2 != 0){
                newList.add(list.get(i));

            }

        }
        System.out.printf("Список с удаленными четными числами \n%s", newList);

    }
}
