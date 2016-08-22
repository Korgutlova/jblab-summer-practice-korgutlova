import java.util.Arrays;

public class Task20 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] arrOne = new int[n];
        int[] arrTwo = new int[n];
        for (int i = 0; i < n; i++) {
            arrOne[i] = Integer.parseInt(args[i + 1]);
            arrTwo[i] = Integer.parseInt(args[i + n + 1]);
        }
        for (int i = 0; i < n; i++) {
            arrOne[i] = arrTwo[arrOne[i]];
        }
        System.out.println(Arrays.toString(arrOne));
    }
}
