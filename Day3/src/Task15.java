public class Task15 {
    public static void main(String[] args) {
        int[] arr = {2, 6, -6, 10, 43, 9, 10, 7, 19};
        int sum = 0;
        long product = 1;
        for (int x : arr) {
            sum = sum + x;
            product = product * x;
        }
        System.out.println(sum);
        System.out.println(product);
    }
}
