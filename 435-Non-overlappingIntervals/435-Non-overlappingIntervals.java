// Last updated: 07/10/2026, 20:51:29
1class Solution {
2    public int eraseOverlapIntervals(int[][] arr) {
3        int c=0;
4        Arrays.sort(arr,(a,b)->Integer.compare(a[1],b[1]));
5        int e=arr[0][1];
6        for(int i=1;i<arr.length;i++){
7            if(arr[i][0]<e){
8                c++;
9            }
10            else{
11                e=arr[i][1];
12            }
13        }
14        return c;
15    }
16}