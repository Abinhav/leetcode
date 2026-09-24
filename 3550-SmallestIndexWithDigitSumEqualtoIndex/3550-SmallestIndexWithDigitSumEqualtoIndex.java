// Last updated: 24/09/2026, 14:49:41
1class Solution {
2    public int smallestIndex(int[] nums) {
3        int ans=Integer.MAX_VALUE;
4        for(int i=0;i<nums.length;i++){
5            if(i==num(nums[i])) ans=Math.min(ans,i);
6        }
7        if(ans==Integer.MAX_VALUE) return -1;
8        return ans;
9    }
10    public int num(int n){
11        if(n<10) return n;
12        int s=0;
13        while(n>0){
14            int t=n%10;
15            s+=t;
16            n/=10;
17        }
18        return s;
19    }
20}