import java.util.Arrays;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 1;
        int sign = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = sign * sum;
            sum += 2;
            sign = -sign;
        }
        System.out.println(Arrays.toString(arr));
    }
}
