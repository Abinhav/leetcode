// Last updated: 27/07/2026, 13:57:11
1class Solution {
2    public boolean checkPossibility(int[] nums) {
3        
4      int c=0;
5      for(int i=0;i<nums.length-1;i++){
6       
7        if(nums[i]>nums[i+1]){
8             if(c==1){
9            return false;
10        }
11        if(i==0||nums[i-1]<=nums[i+1]){
12            nums[i]=nums[i+1];
13        }
14        else{
15            nums[i+1]=nums[i];
16        }
17        c++;
18      }
19      }
20      return true;
21    }
22}