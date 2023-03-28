package homework2.task2;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.io.IOException;


public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 1, 4, 2, 31, 5, 21, 3};
        for (int k = 0; k < arr.length - 1; k++) {

            for (int i = 0; i < arr.length - k - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i] + ",");
        }
        System.out.println(sb);


        String str = String.valueOf(sb);
        try (FileWriter in = new FileWriter("test.txt")) {
            in.append(str);
            System.out.println("Recorded");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
