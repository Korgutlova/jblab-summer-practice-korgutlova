import java.util.LinkedHashMap;
import java.util.Map;

public class Task8 {
    public static void main(String[] args) {
        int n = args.length;
        int[] arr = new int[n];
        int max = Integer.parseInt(args[0]);
        int maxValue = 1;
        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
                if (map.get(arr[i]) > maxValue) {
                    max = arr[i];
                    maxValue = map.get(arr[i]);
                }
            } else {
                map.put(arr[i], 1);
            }
        }
        System.out.println(max + " met " + maxValue + " times.");
    }
}
