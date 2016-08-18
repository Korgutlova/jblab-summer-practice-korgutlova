public class Task8 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int [] arrOne = new int[n];
        int [] arrTwo = new int[n];
        for (int i = 0; i < n; i++) {
            arrOne[i] = Integer.parseInt(args[i + 1]);
            arrTwo[i] = Integer.parseInt(args[i + n + 1]);
            System.out.println(arrOne[i] + " " + arrTwo[i]);
        }
        for (int i = 0; i < n; i++) {
            arrOne[i] = arrOne[i] + arrTwo[i];
            System.out.print(arrOne[i] + " ");
        }
    }
}
