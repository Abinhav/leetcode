// Last updated: 25/07/2026, 14:23:14
1class Solution {
2    public int arraySign(int[] nums) {
3
4        int negativeCount = 0;
5
6        for (int num : nums) {
7
8            if (num == 0) {
9                return 0;
10            }
11
12            if (num < 0) {
13                negativeCount++;
14            }
15        }
16
17        return (negativeCount % 2 == 0) ? 1 : -1;
18    }
19}