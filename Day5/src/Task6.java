public class Task6 {
    public static void main(String[] args) {
        double epsilon = 0.000001;
        double sum = 0;
        double a = 1;
        int sign = 1;
        do {
            sum = sum + sign / (a * a);
            a += 2;
            sign = -sign;
        } while (1 / (a * a) > epsilon);
        System.out.println("G = " + sum);
    }
}
