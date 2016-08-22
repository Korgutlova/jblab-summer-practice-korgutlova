import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = x > 6 ? (x * x - 1) / (3 * x + 5) : Math.pow(x + 1, 3) / (x - 7) + 2;
        System.out.println("y = " + y);
    }
}
