public class Task14 {
    public static void main(String[] args) {
        int n = 10;
        int m = 10;
        int s;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= m; k++) {
                System.out.print(k * i);
                if (k * i > 9) {
                    System.out.print("  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}
