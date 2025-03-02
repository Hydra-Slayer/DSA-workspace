class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int max = 0;
        for (int i = 0; i < piles.length; i++)
            if (piles[i] > max)
                max = piles[i];
        int r = max;
        int ans = Integer.MAX_VALUE;
        while (l <= r) {

            int k = r - (r - l) / 2;
            System.out.println(l);
            System.out.println(r);
            System.out.println(k);
            long hours = 0;
            for (int i = 0; i < piles.length; i++) {
                hours += Math.ceil(piles[i] / (float) k);
            }
            if (hours == h) {
                if (k < ans) {
                    ans = k;
                    r = k - 1;
                }
            } else if (hours > h) {
                l = k + 1;
            } else {
                r = k - 1;
            }

        }
        return ans;
    }
}