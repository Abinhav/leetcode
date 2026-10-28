// Last updated: 28/10/2026, 10:01:45
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3      int n=nums.length;
4      if(n==1) return nums[0];
5      if(nums[0]!=nums[1]) return nums[0];
6      if(nums[n-1]!=nums[n-2]) return nums[n-1];
7      int l=1,h=n-2;
8      while(l<=h){
9        int mid=(l+h)/2;
10        if(nums[mid]!=nums[mid-1]&&nums[mid]!=nums[mid+1]) return nums[mid];
11        if(mid%2==1 && nums[mid]==nums[mid-1] || mid%2==0&&nums[mid]==nums[mid+1]){
12            l=mid+1;
13        }
14        else{
15            h=mid-1;
16        }
17      }
18      return -1;
19    }
20}