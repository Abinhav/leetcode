// Last updated: 07/10/2026, 14:43:52
1class Solution {
2    public int maxArea(int[] arr) {
3       int l=0,r=arr.length-1;
4       int max=0;
5       while(l<r){
6        int area=(r-l)*Math.min(arr[r],arr[l]);
7        max=Math.max(max,area);
8        if(arr[l]<arr[r]){
9            l++;
10        }
11        else{
12            r--;
13        }
14        
15       }
16       return max;
17    }
18}