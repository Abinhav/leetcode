// Last updated: 14/07/2026, 14:02:53
class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int p:prices){
            if(p<min){
                min=p;
            }else{
                int pro=p-min;
                max=Math.max(max,pro);
            }
        }
        return max;
    }
}