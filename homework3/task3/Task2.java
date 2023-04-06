package homework3.task3;

import java.util.ArrayList;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(12);
        list.add(33);
        list.add(13);
        list.add(1);
        list.add(7);
        list.add(5);


        int min = list.get(0);
        int max = list.get(0);
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {

            if (min > list.get(i)){
                min = list.get(i);
            }

            if (max < list.get(i)){
                max = list.get(i);
            }
            sum = sum + list.get(i);
        }
        double average = (double) sum / list.size();

        System.out.printf("минимальное значение из списка --> %s", min);
        System.out.println();
        System.out.printf("Максимально значение из списка --> %s", max);
        System.out.println();
        System.out.printf("среднее значение из списка --> %s" ,average );


    }
}
