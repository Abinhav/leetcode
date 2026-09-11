// Last updated: 11/09/2026, 10:05:41
class Solution {
    public boolean consecutiveSetBits(int n) {
        return (n &= n >> 1) > 0 && (n & (n - 1)) == 0;
    }
}