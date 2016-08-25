public class Task4 {
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
        String min = args[0];
        String max = args[0];
        for (int i = 1; i < args.length; i++) {
            if (compare(args[i], min) == 1) {
                min = args[i];
            }
            if (compare(args[i], max) == -1) {
                max = args[i];
            }
        }
        System.out.println("Early " + "\"" + min + "\"" + " and late " + "\"" + max + "\"" + " string lexicographically");
    }
}
