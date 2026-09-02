// Last updated: 02/09/2026, 15:53:55
1class Solution {
2    public int hammingDistance(int x, int y) {
3    return Integer.bitCount(x^y);
4    }
5}