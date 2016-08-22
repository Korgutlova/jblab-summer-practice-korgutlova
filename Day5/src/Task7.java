import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m:");
        int m = sc.nextInt();
        System.out.println("Enter n:");
        int n = sc.nextInt();
        double sum = 0;
        double multi = 1;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                multi = multi * (i + j) / (i * j);
            }
            sum = sum + multi;
        }
        System.out.println("sum = " + sum);
    }
}
