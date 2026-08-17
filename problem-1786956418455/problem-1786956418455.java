// Last updated: 17/08/2026, 14:16:58
1class Solution {
2    public int maximumWealth(int[][] accounts) {
3        int max=0;
4        for(int i=0;i<accounts.length;i++){
5            int sum=0;
6            for(int j=0;j<accounts[0].length;j++){
7                sum+=accounts[i][j];
8            }
9            max=Math.max(max,sum);
10        }
11        return max;
12    }
13}