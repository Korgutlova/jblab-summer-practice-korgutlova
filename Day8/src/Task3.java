import java.util.Scanner;

public class Task3 {
    public static int compare(String strOne, String strTwo) {
        int lenOne = strOne.length();
        int lenTwo = strTwo.length();
        int k = (lenOne >= lenTwo) ? lenTwo : lenOne;
        for (int i = 0; i < k; i++) {
            if (strOne.charAt(i) != strTwo.charAt(i)) {
                return strOne.charAt(i) < strTwo.charAt(i) ? 1 : -1;
            }
        }
        return lenOne == lenTwo ? 0 : lenOne < lenTwo ? 1 : -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter strings");
        String strOne = sc.nextLine();
        String strTwo = sc.nextLine();
        int d = compare(strOne, strTwo);
        System.out.println(d);
    }
}
