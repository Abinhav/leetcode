// Last updated: 27/10/2026, 09:20:09
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        if(nums.length==0) return new int[]{-1,-1};
4        int low=lb(nums,0,nums.length-1,target);
5        if(low==nums.length || nums[low]!=target) return new int[]{-1,-1};
6        return new int[]{low,ub(nums,0,nums.length-1,target)-1};
7    }
8    public static int lb(int arr[],int l,int h,int tar){
9        int ans=arr.length;
10        while(l<=h){
11            int mid=(l+h)/2;
12            if(arr[mid]>=tar){
13                ans=mid;
14                h=mid-1;
15            }
16            else{
17                l=mid+1;
18            }
19        }
20        return ans;
21    }
22    public static int ub(int arr[],int l,int h,int tar){
23        int ans=arr.length;
24        while(l<=h){
25            int mid=(l+h)/2;
26            if(arr[mid]>tar){
27              ans=mid;
28              h=mid-1;
29            }
30            else{
31                l=mid+1;
32            }
33        }
34        return ans;
35    }
36}