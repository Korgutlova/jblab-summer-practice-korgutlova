import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double product = 1;
        for (int k = 1; k <= n; k++) {
            product = product * (4 * k * k) / (4 * k * k - 1);
        }
        System.out.println(product);
    }
}
