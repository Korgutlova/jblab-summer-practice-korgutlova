public class Task12 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args[0].length(); i++) {
            if (args[0].charAt(i) == 'a') {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
