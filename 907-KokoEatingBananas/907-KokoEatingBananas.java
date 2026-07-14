// Last updated: 14/07/2026, 14:00:46
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
         int low = 1;
        int high = 0;

        // find max pile
        for (int p : piles) {
            high = Math.max(high, p);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canEat(piles, h, mid)) {
                high = mid - 1; // try smaller speed
            } else {
                low = mid + 1;  // need more speed
            }
        }

        return low;
    }

    private boolean canEat(int[] piles, int h, int k) {
        long hours = 0;

        for (int p : piles) {
            hours += (p + k - 1) / k; // ceil division
        }

        return hours <= h;
    }
}