// Last updated: 14/07/2026, 13:59:27
class Solution {
    public long minimumTime(int[] time, int totalTrips) {

        long low = 1;
        long high = (long) getMin(time) * totalTrips;

        while (low < high) {

            long mid = low + (high - low) / 2;

            long trips = 0;

            for (int t : time) {
                trips += mid / t;

                // No need to calculate further if already enough
                if (trips >= totalTrips) {
                    break;
                }
            }

            if (trips >= totalTrips) {
                high = mid;      // Try smaller time
            } else {
                low = mid + 1;   // Need more time
            }
        }

        return low;
    }

    private int getMin(int[] time) {
        int min = time[0];

        for (int t : time) {
            if (t < min) {
                min = t;
            }
        }

        return min;
    }
}