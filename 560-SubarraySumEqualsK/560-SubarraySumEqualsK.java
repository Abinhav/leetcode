// Last updated: 31/08/2026, 14:51:37
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int c=0;
4        for(int i=0;i<nums.length;i++){
5            int sum=0;
6            for(int j=i;j<nums.length;j++){
7                sum+=nums[j];
8                if(sum==k){
9                    c++;
10                }
11
12            }
13        }
14        return c;
15    }
16}