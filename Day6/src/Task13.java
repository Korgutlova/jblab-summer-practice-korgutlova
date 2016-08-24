import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter x:");
        double x = sc.nextDouble();
        double a = x;
        double sum = 0;
        for (int i = n ; i >= 1; i--){
            sum =  a + i;
            a = x / (sum);
        }
        System.out.println(sum);
    }
}
