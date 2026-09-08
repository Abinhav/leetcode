// Last updated: 08/09/2026, 10:04:00
1class Solution {
2    public int maxProfit(int[] prices) {
3        int min=Integer.MAX_VALUE;
4        int max=0;
5        for(int p:prices){
6          min=Math.min(p,min);
7          max=Math.max(max,p-min);
8        }
9        return max;
10    }
11}