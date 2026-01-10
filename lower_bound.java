public class lower_bound {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 8, 11, 15 };
        int target = 4;
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(ans);

    }

}