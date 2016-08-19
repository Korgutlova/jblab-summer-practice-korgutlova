import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        for (int i = 0; i < n; i++) {
            System.out.print(s);
            for (int j = 0; j < n; j++) {
                System.out.print("1");
            }
            s = s + " ";
            System.out.println();
        }
    }
}
