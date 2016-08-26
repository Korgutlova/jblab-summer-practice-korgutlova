import java.util.LinkedHashSet;
import java.util.Set;

public class Task7 {
    public static void main(String[] args) {
        int n = args.length;
        int[] arr = new int[n];
        Set<Integer> set = new LinkedHashSet<Integer>();
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        for (int i = 0; i < n; i++) {
            if (set.contains(arr[i])) {
                set.remove(arr[i]);
            } else {
                set.add(arr[i]);
            }
        }
        int diffElement = set.size();
        System.out.println(diffElement);
    }
}
