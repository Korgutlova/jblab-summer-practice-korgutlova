import java.util.Random;
public class Task4 {
    public static void main(String[] args) {
        Random rn = new Random();
        int n = 10;
        int [] arr = new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = rn.nextInt(100) - 50;
        }
        int sumEven = 0;
        long multi = 1;
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0) {
                sumEven = sumEven + arr[i];
            }
            if(arr[i] > 0) {
                multi = multi * arr[i];
            }
        }
        System.out.println(sumEven);
        System.out.println(multi);
    }
}
