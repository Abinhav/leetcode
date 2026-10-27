// Last updated: 27/10/2026, 10:08:42
1class Solution {
2    public int search(int[] nums, int target) {
3       int low=0,high=nums.length-1;
4       while(low<=high){
5        int mid=(low+high)/2;
6        if(nums[mid]==target) return mid;
7        if(nums[low]<=nums[mid]){
8            if(nums[low]<=target && target<=nums[mid]){
9                high=mid-1;
10            }
11            else{
12                low=mid+1;
13            }
14        }
15        else{
16            if(nums[mid]<=target && target<=nums[high]){
17                low=mid+1;
18            }
19            else{
20                high=mid-1;
21            }
22        }
23       }
24       return -1;
25    }
26}