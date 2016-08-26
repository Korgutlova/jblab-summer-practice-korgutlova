import java.util.Arrays;

public class Task5 {
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
        int n = args.length;
        String[] arrStr = new String[n];
        for (int i = 0; i < n; i++) {
            arrStr[i] = args[i];
        }
        String str;
        int k = 0;
        boolean flag = false;
        for (int i = 0; i < n && !flag; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (compare(arrStr[j], arrStr[j + 1]) == -1) {
                    str = arrStr[j];
                    arrStr[j] = arrStr[j + 1];
                    arrStr[j + 1] = str;
                    flag = true;
                }
            }
            if (flag) {
                flag = false;
            } else {
                flag = true;
            }
        }
        System.out.println(Arrays.toString(arrStr));
    }
}
