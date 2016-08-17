public class Task8 {
    public static void main(String[] args) {
        int[] arrOne = new int[args[0].length()];
        int[] arrTwo = new int[args[0].length()];
        for (int i = 0; i < args[0].length(); i++) {
            arrOne[i] = Character.getNumericValue(args[0].charAt(i));
            arrTwo[i] = Character.getNumericValue(args[1].charAt(i));
            System.out.println(arrOne[i] + " " + arrTwo[i]);
        }
        for (int i = 0; i < args[0].length(); i++) {
            arrOne[i] = arrOne[i] + arrTwo[i];
            System.out.print(arrOne[i] + " ");
        }
    }
}
