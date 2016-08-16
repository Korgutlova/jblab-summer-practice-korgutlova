import java.util.Random;

public class Task6 {
    public static void main(String[] args) {

        Random rn = new Random();
        int n = 10;
        int [] arr = new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = rn.nextInt(100) - 50;
        }

        int min = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.println(min);
    }
}
