// Last updated: 28/07/2026, 11:30:59
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int left =0;
4        int right=nums.length-1;
5        int first=-1;
6        int last=-1;
7        while(left<=right){
8            int mid=left+(right-left)/2;
9            if(nums[mid]==target){
10                first=mid;
11                right=mid-1;
12            }
13            else if(nums[mid]<target){
14                left=mid+1;
15            }
16            else{
17                right=mid-1;
18            }
19        }
20        left=0;
21        right=nums.length-1;
22        while(left<=right){
23            int mid=left+(right-left)/2;
24            if(nums[mid]==target){
25                last=mid;
26                left=mid+1;
27            }
28            else if(nums[mid]<target){
29                left=mid+1;
30            }
31            else{
32                right=mid-1;
33                        }            
34        }
35        return new int[]{first,last};
36    }
37}