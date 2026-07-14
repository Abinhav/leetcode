// Last updated: 14/07/2026, 14:00:31
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {
            int l = nums[left] * nums[left];
            int r = nums[right] * nums[right];

            if (l > r) {
                res[index] = l;
                left++;
            } else {
                res[index] = r;
                right--;
            }
            index--;
        }

        return res;
    }
}
