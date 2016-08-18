import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double f = x * x;
        f = f * f * x - 4 * f * x + 2 * f - 5 * x + 10;
        System.out.println(f);
    }
}
