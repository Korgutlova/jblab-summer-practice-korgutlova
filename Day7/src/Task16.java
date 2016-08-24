import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x (please 0 < |x| < 1) :");
        double x = sc.nextDouble();
        double eps = 0.000001;
        double fact = 1;
        double sum = 0;
        double powX = 1;
        if (Math.abs(x) > 0 && Math.abs(x) < 1) {
            for (int i = 1; Math.abs(powX * fact) > eps; i++) {
                fact = fact * (2 * i - 1) / (2 * i);
                powX = powX * x * x;
                sum = sum + powX * fact;
            }
            System.out.println(sum);
        } else {
            System.out.println("Invalid value x");
        }
    }
}
