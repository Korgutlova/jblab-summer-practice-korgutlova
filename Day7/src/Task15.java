import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x:");
        double x = sc.nextDouble();
        double eps = 0.000001;
        double a = 1;
        double fact = 1;
        double sum = a;
        double powX = 1;
        for (int i = 1; Math.abs(a) > eps; i++) {
            fact = fact * 2 * i * (2 * i - 1);
            powX = powX * x * x;
            a = -a * powX / fact;
            sum = sum + a;
        }
        System.out.println(sum);
    }
}
