import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        long fact = 1;
        while (n > 0) {
            fact = fact * n;
            n -= 2;
        }
        System.out.println("n!! = " + fact);
    }
}
