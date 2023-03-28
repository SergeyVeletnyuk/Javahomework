package homework1.task1;

import java.util.Scanner;

public class Task3 {
    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double value1 = scanner.nextDouble();
        System.out.print("+ - / * ? ");
        char operation = scanner.next().charAt(0);
        System.out.print("Введите второе число: ");
        double value2 = scanner.nextDouble();

        if (operation == '+') {
            System.out.println(value1 + value2);
        }
        else if (operation == '-') {
            System.out.println(value1 - value2);
        } else if (operation == '*') {
            System.out.println(value1 * value2);
        } else if (operation == '/') {
            System.out.println(value1 / value2);
        }
    }
}