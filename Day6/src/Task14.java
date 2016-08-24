import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long fact1 = 1;
        long fact2 = 2;
        double sum = fact1 / fact2;
        for (int m = 2; m <= n; m++) {
            fact1 = fact1 * (m - 1);
            fact2 = fact2 * 2 * m * (2 * m - 1);
            sum = sum +  (double) fact1 * fact1 / fact2;
        }
        System.out.println("S = " + sum);
    }
}
