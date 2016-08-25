import java.util.Arrays;
import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 1; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
                indexMax = i;
            }
            if (min > arr[i]) {
                min = arr[i];
                indexMin = i;
            }
        }
        arr[indexMax] = min;
        arr[indexMin] = max;
        System.out.println(Arrays.toString(arr));
    }
}