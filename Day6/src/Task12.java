import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter x:");
        double x = sc.nextDouble();
        double multi = 1;
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            multi = multi * (x + i);
            sum = sum + multi;
        }
        System.out.println("S = " + sum);
    }
}
