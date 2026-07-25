// Last updated: 25/07/2026, 15:15:39
1class Solution {
2    public int maximumCount(int[] nums) {
3        int n=0,p=0,max=0;
4        for(int i=0;i<nums.length;i++){
5            
6            if(nums[i]<0){
7                n++;
8            }
9            if(nums[i]>0){
10                p++;
11            }
12            
13                max=Math.max(n,p);
14            
15        }
16        return max;
17    }
18}