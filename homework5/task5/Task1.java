package homework5.task5;
//1)Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Task1 {

        public static HashMap<String, List<String>> phoneBook = new HashMap<>();

        public static void main(String[] args) {
            addInPhoneBook();
            Scanner scanner = new Scanner(System.in);
            System.out.print("кого вы хотите найти? ");
            String a = scanner.next();

            findPhoneBook(a);
        }

        public static void addInPhoneBook() {
            phoneBook.put("Иванов", List.of("+7(111)111-11-11", "+7(222)222-22-22"));
            phoneBook.put("Петров", List.of("+7(333)333-33-33"));
            phoneBook.put("Сидоров",List.of("+7(555)555-55-55", "+7(666)666-66-66"));

        }

        public static void findPhoneBook(String surname) {
            System.out.printf("%s: %s", surname, phoneBook.get(surname));
        }
    }

