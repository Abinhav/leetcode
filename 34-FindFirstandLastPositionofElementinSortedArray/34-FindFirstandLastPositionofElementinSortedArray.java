// Last updated: 27/10/2026, 09:39:13
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3       int f=-1,l=-1;
4       int low=0,high=nums.length-1;
5       while(low<=high){
6        int mid=(low+high)/2;
7        if(nums[mid]==target){
8            f=mid;
9            high=mid-1;
10        }
11        else if(nums[mid]>target){
12            high=mid-1;
13        }
14        else{
15            low=mid+1;
16        }
17       }
18       low=0;
19       high=nums.length-1;
20       while(low<=high){
21        int mid=(low+high)/2;
22        if(nums[mid]==target){
23            l=mid;
24            low=mid+1;
25        }
26        else if(nums[mid]>target){
27            high=mid-1;
28        }
29        else{
30            low=mid+1;
31        }
32       }
33       return new int[]{f,l};
34    }
35}