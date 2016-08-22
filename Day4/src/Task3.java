public class Task3 {
    public static void main(String[] args) {
        int[] arr = {1, -5, 72, 9, -6, 19, 8, -21, -3};
        int k;
        for (int x: arr){
            k = x > 0 ? 1 : -1;
            switch (k){
                case -1:
                    System.out.println(x + " -");
                    break;
                case 1:
                    System.out.println(x + " +");
                    break;
            }
        }
    }
}
