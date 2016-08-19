import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int k;
        int sign = 1;
        while(n != 0){
            k = n % 10;
            sum = sum + sign * k;
            sign = -sign;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
