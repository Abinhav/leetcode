// Last updated: 25/07/2026, 13:45:03
1class Solution {
2    public int maxProduct(int n) {
3
4        int max1 = -1;
5        int max2 = -1;
6
7        while (n > 0) {
8
9            int digit = n % 10;
10
11            if (digit > max1) {
12                max2 = max1;
13                max1 = digit;
14            } else if (digit > max2) {
15                max2 = digit;
16            }
17
18            n /= 10;
19        }
20
21        return max1 * max2;
22    }
23}