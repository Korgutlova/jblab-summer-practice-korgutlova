import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int k = Math.min(x, y);
        x = Math.max(x, y);
        y = k;
        int remainder = 1;
        while (remainder != 0) {
            remainder = x % y;
            x = y;
            if (remainder != 0) {
                y = remainder;
            }
        }
        System.out.println("NOD " + y);
    }
}
