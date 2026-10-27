// Last updated: 27/10/2026, 10:24:51
1class Solution {
2    public boolean search(int[] nums, int target) {
3        int l=0,h=nums.length-1;
4        while(l<=h){
5            int mid=(l+h)/2;
6            if(nums[mid]==target) return true;
7            if(nums[l]==nums[mid] && nums[mid]==nums[h]){
8                l++;
9                h--;
10                continue;
11            }
12            if(nums[l]<=nums[mid]){
13                if(nums[l]<=target&&target<=nums[mid]){
14                    h=mid-1;
15                }
16                else{
17                    l=mid+1;
18                }
19            }
20            else{
21                if(nums[mid]<=target && target<=nums[h]){
22                    l=mid+1;
23                }
24                else{
25                    h=mid-1;
26                }
27            }
28        }
29        return false;
30    }
31}