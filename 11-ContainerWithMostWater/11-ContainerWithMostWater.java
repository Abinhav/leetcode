// Last updated: 25/11/2026, 19:11:03
1class Solution {
2    public int maxArea(int[] arr) {
3      int max=0;
4      int l=0,r=arr.length-1;
5      while(l<=r){
6        int area=(r-l)*Math.min(arr[r],arr[l]);
7        max=Math.max(max,area);
8        if(arr[l]<arr[r]) l++;
9        else r--;
10      }
11      return max;
12    }
13}