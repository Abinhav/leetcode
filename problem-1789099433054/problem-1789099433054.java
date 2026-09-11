// Last updated: 11/09/2026, 09:33:53
1class Solution {
2    public int minimumSwaps(int[] nums) {
3        int c=0;
4        int l=0,r=nums.length-1;
5        while(l<r){
6            if(nums[l]==0&&nums[r]!=0){
7                int temp=nums[l];
8                nums[l]=nums[r];
9                nums[r]=temp;
10                l++;
11                r--;
12                c++;
13            }
14            else if(nums[l]==0 && nums[r]==0){
15                r--;
16            }
17            else if(nums[l]!=0&&nums[r]!=0){
18                l++;
19            }
20            else{
21                l++;
22                r--;
23            }
24        }
25        return c;
26    }
27}