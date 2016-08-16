import java.util.Random;

public class Task5 {
    public static void main(String[] args) {

        Random rn = new Random();
        int n = 10;
        int [] arr = new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = rn.nextInt(100) - 50;

        }

        boolean flag = false;
        for(int i = 0; i < n  && !flag; i++){
            if (arr[i] == 0)
                flag = true;
        }
        System.out.println(flag);
    }
}
