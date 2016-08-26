import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string of digits:");
        String str = sc.nextLine();
        int sign = (str.charAt(0) == '-') ? -1 : 1;
        int index = (sign == 1) ? 0 : 1;
        long sum = 0;
        for (; index < str.length(); index++) {
            sum = sum * 10 + Character.getNumericValue(str.charAt(index));
        }
        sum *= sign;
        System.out.println(sum);
    }
}
