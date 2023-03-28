package homework1.task1;

import java.util.Scanner;

//Вычислить n-ое треугольного число (сумма чисел от 1 до n),
public class Task1 {
    public static void getValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            }
        System.out.println("Сумма чисел от 1 до n: " + sum);
    }


    public static void factor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int a = scanner.nextInt();
        int fact = 1;

        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        System.out.println("Факториал числа: " + fact);
    }

}



