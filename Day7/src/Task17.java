import java.util.Scanner;

public class Task17 {
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
        int countMin = 1;
        int countMax = 1;
        for (int i = 1; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
                countMax = 1;
            } else if (max == arr[i]) {
                countMax++;
            }
            if (min > arr[i]) {
                min = arr[i];
                countMin = 1;
            } else if (min == arr[i]) {
                countMin++;
            }
        }
        System.out.println("Min " + min + " in amount " + countMin);
        System.out.println("Max " + max + " in amount " + countMax);
    }
}
