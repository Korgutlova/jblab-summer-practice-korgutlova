public class Task8 {
    public static void main(String[] args) {
        String s1 = args[0];
        String s2 = args[1];
        boolean flag1 = false;
        boolean flag2 = true;
        if (s2.length() < s1.length()) {
            for (int i = 0; i <= s1.length() - s2.length() && !flag1; i++) {
                for (int j = 0; j < s2.length() && flag2; j++) {
                    if (s1.charAt(i + j) != s2.charAt(j))
                        flag2 = false;
                }
                if (flag2)
                    flag1 = true;
                flag2 = true;
            }
            System.out.println(flag1);
        } else {
            System.out.println("The second string isn't substring");
        }
    }
}
