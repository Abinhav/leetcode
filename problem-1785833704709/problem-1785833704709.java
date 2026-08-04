// Last updated: 04/08/2026, 14:25:04
1class Solution {
2    public int findNonMinOrMax(int[] nums) {
3        if(nums.length<=2) return -1;
4        //Arrays.sort(nums);
5        //int min=nums[0];
6        //int max=nums[nums.length-1];
7        int min=Integer.MAX_VALUE;
8        int max=Integer.MIN_VALUE;
9        for(int x:nums){
10            min=Math.min(x,min);
11            max=Math.max(x,max);
12        }
13        for(int i=0;i<nums.length;i++){
14            if(nums[i]!=min&&nums[i]!=max) return nums[i];
15        }
16        return -1;
17    }
18}