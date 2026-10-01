// Last updated: 01/10/2026, 16:16:01
1class Solution {
2    public int maxProfit(int[] prices) {
3        int max=0,min=Integer.MAX_VALUE;
4        for(int x:prices){
5            min=Math.min(min,x);
6            max=Math.max(max,x-min);
7        }
8        return max;
9    }
10}