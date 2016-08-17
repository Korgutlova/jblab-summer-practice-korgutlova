import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y;
        if (x > 2) {
            y = (x * x - 1) / (x + 2);
        } else if (x > 0) {
            y = (x * x - 1) * (x + 2);
        } else {
            y = x * x * (1 + 2 * x);
        }
        System.out.println("y = " + y);
    }
}
