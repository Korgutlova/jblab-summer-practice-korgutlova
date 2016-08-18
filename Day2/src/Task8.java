import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int[] arrOne = new int[n];
        int[] arrTwo = new int[m];
        for (int i = 0; i < args.length - 2; i++) {
            if (i < n) {
                arrOne[i] = Integer.parseInt(args[i + 2]);
            } else {
                arrTwo[i - n] = Integer.parseInt(args[i + 2]);
            }
        }
        for (int i = 0; i < Math.min(n, m); i++) {
            if (m > n) {
                arrTwo[i] = arrTwo[i] + arrOne[i];
            } else {
                arrOne[i] = arrOne[i] + arrTwo[i];
            }
        }
        System.out.println(Arrays.toString(arrOne));
        System.out.println(Arrays.toString(arrTwo));
    }
}
