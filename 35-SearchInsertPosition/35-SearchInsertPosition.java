// Last updated: 26/10/2026, 10:46:35
1class Solution {
2    public int searchInsert(int[] nums, int tar) {
3      int n=nums.length;
4      int l=0,r=nums.length-1;
5      while(l<=r){
6        int mid=(l+r)/2;
7        if(nums[mid]>=tar){
8            n=mid;
9            r=mid-1;
10        }
11        else{
12            l=mid+1;
13        }
14      }
15      return n;
16    }
17}