// Last updated: 01/10/2026, 16:34:18
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> threeSum(int[] nums) {
5
6        List<List<Integer>> ans = new ArrayList<>();
7
8        Arrays.sort(nums);
9
10        for(int i=0;i<nums.length-2;i++){
11            if(i>0&&nums[i]==nums[i-1]) continue;
12            int l=i+1;
13            int r=nums.length-1;
14            while(l<r){
15                int sum=nums[i]+nums[l]+nums[r];
16                if(sum==0){
17                List<Integer> cur=new ArrayList<>();
18                cur.add(nums[i]);
19                cur.add(nums[l]);
20                cur.add(nums[r]);
21                 ans.add(new ArrayList(cur));
22                 while(l<r && nums[l]==nums[l+1]) l++;
23                 while(l<r && nums[r]==nums[r-1]) r--;
24                 l++;
25                 r--;
26                }
27                else if(sum>0) r--;
28                else l++;
29            }
30        }
31        return ans;
32        }
33}