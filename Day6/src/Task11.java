import java.util.Random;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int max = 6;
        int min = -3;
        for (int i = 0; i < n; i++) {
            System.out.println(rn.nextInt(max - min + 1) + min);
        }
    }
}
