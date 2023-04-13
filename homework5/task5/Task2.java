package homework5.task5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<String, Integer> nameMap = new HashMap<>();
        String people = "Иван Иванов " +
                "Светлана Петрова " +
                "Кристина Белова " +
                "Анна Мусина " +
                "Анна Крутова " +
                "Иван Юрин " +
                "Петр Лыков " +
                "Павел Чернов " +
                "Петр Чернышов " +
                "Мария Федорова " +
                "Марина Светлова " +
                "Мария Савина " +
                "Мария Рыкова " +
                "Марина Лугова " +
                "Анна Владимирова " +
                "Иван Мечников " +
                "Петр Петин " +
                "Иван Ежов ";
        String[] nameSurname = people.split(" ");
        for (int i = 0; i < nameSurname.length; i += 2) {
            if (nameMap.containsKey(nameSurname[i])) {
                nameMap.replace(nameSurname[i], nameMap.get(nameSurname[i]) + 1);
            } else {
                nameMap.put(nameSurname[i], 1);
            }
        }
//        System.out.println(nameMap);
        Map<String, Integer> sortedName = new LinkedHashMap<>();
        int max = 1;
        for (int value : nameMap.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : nameMap.entrySet()) {
                String key = entry.getKey();
                if (nameMap.get(key) == i) {
                    sortedName.put(key, nameMap.get(key));
                }
            }
        }
        System.out.println(sortedName);
    }
}
