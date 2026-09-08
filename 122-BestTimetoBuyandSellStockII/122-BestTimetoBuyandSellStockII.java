// Last updated: 08/09/2026, 10:16:35
1class Solution {
2    public int maxProfit(int[] prices) {
3        int max=0;
4        for(int i=0;i<prices.length-1;i++){
5            if(prices[i]<prices[i+1]){
6                max+=(prices[i+1]-prices[i]);
7            }
8        }
9        return max;
10    }
11}