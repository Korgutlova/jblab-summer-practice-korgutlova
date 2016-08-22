public class Task2 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 72, 9, 6, 19, 8, 21, 3};
        int k;
        for (int x : arr) {
            k = x % 2;
            switch (k) {
                case 0:
                    System.out.println(x + " c");
                    break;
                case 1:
                    System.out.println(x + " n");
                    break;
            }
        }
    }
}
