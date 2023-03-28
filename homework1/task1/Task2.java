package homework1.task1;

import java.util.Scanner;

public class Task2 {
    public static void simpleValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        for(int i = 2; i < n; i++){
            int count = 0;
            for(int j = 2; j <= i && count < 2; j++){
                if(i % j== 0) {
                    count++;
                }
            }
            if(count < 2)
                System.out.println(i);
        }


    }

}

