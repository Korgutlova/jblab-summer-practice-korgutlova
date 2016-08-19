import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrX = new int[n];
        int[] arrY = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите x:");
            arrX[i] = sc.nextInt();
            System.out.print("Введите y:");
            arrY[i] = sc.nextInt();
        }
        boolean flag = true;
        for (int i = 0; i < n - 2 && flag; i++){
            if((arrX[i + 2] - arrX[i]) / (arrX[i + 1] - arrX[i]) != (arrY[i + 2] - arrY[i]) / (arrY[i + 1] - arrY[i])){
                flag = false;
            }
        }
        System.out.println(flag);
    }
}
