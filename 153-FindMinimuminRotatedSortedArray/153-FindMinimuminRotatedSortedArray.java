// Last updated: 27/10/2026, 11:32:37
1class Solution {
2    public int findMin(int[] nums) {
3        int l=0,h=nums.length-1,ans=Integer.MAX_VALUE;
4        while(l<=h){
5            int mid=(l+h)/2;
6            if(nums[l]<=nums[mid]){
7                ans=Math.min(ans,nums[l]);
8                l=mid+1;
9            }
10            else{
11                ans=Math.min(ans,nums[mid]);
12                h=mid-1;
13            }
14        }
15        return ans;
16    }
17}