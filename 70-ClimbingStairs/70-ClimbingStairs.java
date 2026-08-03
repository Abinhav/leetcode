// Last updated: 03/08/2026, 09:17:07
1class Solution {
2    int[] dp;
3
4    public int climbStairs(int n) {
5        dp = new int[n + 1];
6        return solve(n);
7    }
8
9    private int solve(int n) {
10        if (n == 0 || n == 1)
11            return 1;
12
13        if (dp[n] != 0)
14            return dp[n];
15
16        dp[n] = solve(n - 1) + solve(n - 2);
17        return dp[n];
18    }
19}