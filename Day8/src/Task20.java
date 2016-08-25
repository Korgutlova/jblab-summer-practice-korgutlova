import java.util.Arrays;
import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k;
        for (int i = 0; i < n / 2; i++) {
            k = arr[n - i - 1];
            arr[n - i - 1] = arr[i];
            arr[i] = k;
        }
        System.out.println(Arrays.toString(arr));
    }
}
