// Last updated: 05/08/2026, 15:57:00
1class Solution {
2    public int[] findMissingAndRepeatedValues(int[][] grid) {
3       
4       HashSet<Integer> set=new HashSet<>();
5       int arr[]=new int[2];
6       int k=0;
7       for(int i=0;i<grid.length;i++) {
8        for(int j=0;j<grid.length;j++){
9            if(set.contains(grid[i][j])){
10                   arr[k++]=grid[i][j];
11            }
12            set.add(grid[i][j]);
13           
14        }
15       }
16       int n=grid.length;
17       for(int i=1;i<=n*n;i++){
18        if(!set.contains(i)){
19            arr[k++]=i;
20        }
21       }
22       return arr;
23    }
24}