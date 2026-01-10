import java.util.HashMap;

public class arrays_medium {
    public static void maxLenSubWho(int[] arr, long t) {
        int sum = arr[0];
        int l = 0;
        int r = 0;
        int max = 0;
        int n = arr.length;
        while (r < n) {
            while (l <= r && sum > t) {
                sum -= arr[l];
                l++;
            }
            if (sum == t) {
                max = Math.max(max, r - l + 1);

            }
            r++;
            if (r < n) {
                sum += arr[r];
            }
        }
        System.out.println(max);
    }

    public static void maxLenSubInt(int[] arr, int t) {
        int max = 0;
        int sum = 0;
        HashMap<Integer, Integer> preSumMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == t) {
                max = Math.max(max, i + 1);
            }
            int rem = sum - t;

            // Calculate the length and update maxLen:
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                max = Math.max(max, len);
            }

            // Finally, update the map checking the conditions:
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] arr = { -1, 1, 1 };
        maxLenSubInt(arr, 1);
    }
}
