import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter l, m, n");
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        double multiOne;
        double multiTwo = 1;
        double sum;
        for (int i = 1; i <= l; i++) {
            sum = 0;
            for (int j = 1; j <= m; j++) {
                multiOne = 1;
                for (int k = 1; k <= n; k++) {
                    multiOne = multiOne * Math.exp(i * j * k) / (Math.cos(i) + Math.sin(j) + Math.tan(k));
                }
                sum = sum + multiOne;
            }
            multiTwo = multiTwo * sum;
        }
        System.out.println("S = " + multiTwo);
    }
}
