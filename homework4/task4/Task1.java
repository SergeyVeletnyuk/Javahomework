package homework4.task4;

import java.util.LinkedList;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class Task1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("sergey");
        list.add("vadim");
        list.add("masha");
        list.add("nikita");
        System.out.println(list);

        LinkedList<String> reversList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0 ; i--) {
             reversList.add(list.get(i));
            
        }
        System.out.println(reversList);
    }
}
